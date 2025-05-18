# Mirror Language Parser

This project implements a parser for the Mirror Language using ANTLR4. The Mirror Language is a simple programming language with the following characteristics:

- Keywords are written in uppercase
- Keywords start with '(' and end with the keyword reversed + ')'
- Keywords are separated by newlines
- Variables start with '$', are written in lowercase, and can use '_'

## Files in this Project

1. `mirror_lang.ebnf` - The formal EBNF grammar for the Mirror Language
2. `MirrorLang.g4` - The ANTLR4 grammar file
3. `test_mirror.txt` - A sample Mirror Language program for testing
4. `MirrorLangValidator.java` - A Java program to validate Mirror Language code
5. `setup_and_test.sh` - A shell script to set up ANTLR and test the parser
6. `ANTLR_SETUP.md` - Detailed instructions for setting up ANTLR

## Mirror Language Syntax

### Variables
- Start with '$'
- Written in lowercase
- Can use letters, numbers, and underscores
- Example: `$variable_name`

### Keywords

1. **SET** - Assigns a value to a variable
   ```
   (SET $variable = value TES)
   ```

2. **LOOPIF** - A while loop
   ```
   (LOOPIF $condition
       program
   FIPOOL)
   ```

3. **IF** - A conditional statement
   ```
   (IF $condition
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

### Comments
- Single-line comments start with `//`
- Multi-line comments use the IGNORE keyword

### Operators
- Arithmetic: `+`, `-`, `*`, `/`, `^`, `%`
- Comparison: `==`, `>=`, `>`, `<=`, `<`, `!=`

## How to Use

### Setting Up ANTLR

1. Install Java JDK (version 8 or later)
2. Download ANTLR4:
   ```bash
   curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
   ```
3. Set up your CLASSPATH:
   ```bash
   export CLASSPATH=".:antlr-4.13.1-complete.jar:$CLASSPATH"
   ```

### Generating the Parser

1. Generate the parser from the grammar file:
   ```bash
   java -jar antlr-4.13.1-complete.jar MirrorLang.g4
   ```

2. Compile the generated Java files:
   ```bash
   javac MirrorLang*.java
   ```

### Testing a Mirror Language Program

1. Create a Mirror Language program (or use the provided `test_mirror.txt`)
2. Run the TestRig to visualize the parse tree:
   ```bash
   java org.antlr.v4.gui.TestRig MirrorLang program -gui test_mirror.txt
   ```

3. Or use the provided validator:
   ```bash
   javac MirrorLangValidator.java
   java MirrorLangValidator test_mirror.txt
   ```

### Using the Shell Script

For convenience, you can use the provided shell script:
```bash
chmod +x setup_and_test.sh
./setup_and_test.sh
```

This will download ANTLR (if needed), generate the parser, compile the Java files, and test the parser on the sample program.

## Example Program

```
// example program

(SET $a = 15 TES)
(SET $b = 105 TES)

(IF $b % $a == 0 
    (LOOPIF $b > 0
        (LOG "aktuální hodnota $b:" GOL)
        (LOG $b GOL)
        (SET $b = $b - $a TES)
    FIPOOL)
FI)

(IGNORE 
    multi line
    comment
ERONGI)
```

## Troubleshooting

If you encounter issues:

1. Make sure Java is installed and in your PATH
2. Check that ANTLR is downloaded and in your CLASSPATH
3. Verify that your Mirror Language code follows the syntax rules
4. Look for syntax errors in the grammar file

For more detailed instructions, see `ANTLR_SETUP.md`.
