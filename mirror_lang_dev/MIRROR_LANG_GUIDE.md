# Mirror Language Parser Guide

This guide explains how to use the Mirror Language parser implementation. It covers setting up the parser, testing example programs, and understanding the syntax of the Mirror Language.

## Files in this Project

1. **Grammar Files**:
   - `mirror_lang.ebnf` - Formal EBNF grammar for the Mirror Language
   - `MirrorLang.g4` - ANTLR4 grammar file

2. **Example Programs**:
   - `test_mirror.txt` - Basic example program
   - `valid_examples.txt` - Examples of valid Mirror Language programs
   - `invalid_examples.txt` - Examples of invalid Mirror Language programs

3. **Java Implementation**:
   - `MirrorLangValidator.java` - Java program to validate Mirror Language code

4. **Shell Scripts**:
   - `setup_and_test.sh` - Sets up ANTLR and tests the basic example
   - `test_examples.sh` - Tests both valid and invalid examples

5. **Documentation**:
   - `README_MIRROR_LANG.md` - Overview of the Mirror Language and parser
   - `ANTLR_SETUP.md` - Detailed instructions for setting up ANTLR
   - `TESTING_EXAMPLES.md` - Explanation of the example programs and how to test them
   - `MIRROR_LANG_GUIDE.md` - This guide

## Getting Started

### Prerequisites

- Java JDK (version 8 or later)
- Bash shell (for running the scripts)

### Setup Steps

1. **Clone or download this project**

2. **Run the setup script**:
   ```bash
   ./setup_and_test.sh
   ```
   This will:
   - Download ANTLR4 if needed
   - Generate the parser from the grammar file
   - Compile the Java files
   - Test the parser on the basic example

## Testing Mirror Language Programs

### Testing the Example Programs

To test both valid and invalid examples:
```bash
./test_examples.sh
```

This script will:
- Test the complete valid examples file
- Test the complete invalid examples file
- Extract individual examples and test them separately

### Testing Your Own Programs

1. Create a file with your Mirror Language code
2. Run the validator:
   ```bash
   java MirrorLangValidator your_file.txt
   ```
3. To see the parse tree (if valid):
   ```bash
   java org.antlr.v4.gui.TestRig MirrorLang program -gui your_file.txt
   ```

## Mirror Language Syntax

### Basic Structure

- Keywords are written in uppercase
- Keywords start with '(' and end with the keyword reversed + ')'
- Keywords are separated by newlines
- Variables start with '$', are written in lowercase, and can use '_'

### Keywords

1. **SET** - Assigns a value to a variable
   ```
   (SET $variable = value TES)
   ```

2. **LOOPIF** - A while loop
   ```
   (LOOPIF condition
       program
   FIPOOL)
   ```

3. **IF** - A conditional statement
   ```
   (IF condition
       program
   FI)
   ```

4. **LOG** - Prints a value
   ```
   (LOG $variable GOL)
   (LOG "string" GOL)
   ```

5. **IGNORE** - Multi-line comment
   ```
   (IGNORE
       comment text
   ERONGI)
   ```

### Variables

- Start with '$'
- Written in lowercase
- Can use letters, numbers, and underscores
- Example: `$variable_name`

### Operators

- Arithmetic: `+`, `-`, `*`, `/`, `^`, `%`
- Comparison: `==`, `>=`, `>`, `<=`, `<`, `!=`

### Comments

- Single-line comments start with `//`
- Multi-line comments use the IGNORE keyword

## Common Errors and How to Fix Them

### 1. Incorrect Keyword Format

**Error**: Missing opening/closing parenthesis or incorrect keyword reversal

**Example**:
```
SET $x = 10 TES)  // Missing opening parenthesis
(SET $y = 20 TES  // Missing closing parenthesis
(SET $z = 30 SET) // Incorrect reversal (should be TES))
```

**Fix**: Ensure keywords start with '(' and end with the keyword reversed + ')'

### 2. Invalid Variable Names

**Error**: Variables not starting with '$' or using uppercase letters

**Example**:
```
(SET counter = 15 TES)  // Missing $
(SET $Counter = 5 TES)  // Using uppercase
```

**Fix**: Make sure variables start with '$' and use only lowercase letters, numbers, and underscores

### 3. Mismatched Nested Structures

**Error**: Incorrect closing keywords for nested structures

**Example**:
```
(IF $a > $b
    (LOOPIF $i < 10
        (LOG "Inside loop" GOL)
    FI)  // Should be FIPOOL)
FIPOOL)  // Should be FI)
```

**Fix**: Make sure opening and closing keywords match correctly

### 4. Invalid Operators

**Error**: Using unsupported operators

**Example**:
```
(IF $x === $y  // Triple equals not supported
    (LOG "Equal" GOL)
FI)
```

**Fix**: Use only supported operators (==, >=, >, <=, <, !=, +, -, *, /, ^, %)

## Advanced Usage

### Modifying the Grammar

If you want to extend the Mirror Language with new features:

1. Modify the `MirrorLang.g4` file
2. Regenerate the parser:
   ```bash
   java -jar antlr-4.13.1-complete.jar MirrorLang.g4
   ```
3. Recompile the Java files:
   ```bash
   javac MirrorLang*.java
   ```

### Integrating with Your Application

To use the parser in your own application:

1. Include the generated Java files in your project
2. Create a lexer and parser:
   ```java
   CharStream input = CharStreams.fromString(code);
   MirrorLangLexer lexer = new MirrorLangLexer(input);
   CommonTokenStream tokens = new CommonTokenStream(lexer);
   MirrorLangParser parser = new MirrorLangParser(tokens);
   ```
3. Parse the input:
   ```java
   parser.program();
   ```

## Troubleshooting

If you encounter issues:

1. **Parser generation fails**:
   - Check the grammar file for syntax errors
   - Make sure ANTLR is in your CLASSPATH

2. **Compilation errors**:
   - Make sure Java is installed and in your PATH
   - Check for syntax errors in the Java files

3. **Runtime errors**:
   - Make sure your CLASSPATH includes the current directory and the ANTLR runtime

4. **Parse errors**:
   - Check your Mirror Language code against the syntax rules
   - Look at the error message to identify the issue
