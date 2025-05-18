# Testing Mirror Language Programs

This document explains how to test Mirror Language programs using the ANTLR4 parser we've created. It includes examples of valid and invalid programs and explains how to test them.

## Setup

Before testing, make sure you have:

1. Java JDK installed
2. ANTLR4 downloaded and in your CLASSPATH
3. Generated the parser from the grammar file
4. Compiled the Java files

You can use the provided `setup_and_test.sh` script to set up everything automatically.

## Testing Valid Programs

The file `valid_examples.txt` contains several examples of valid Mirror Language programs. These programs should parse without any errors.

### How to Test Valid Programs

1. **Using TestRig (grun)**:
   ```bash
   java org.antlr.v4.gui.TestRig MirrorLang program -gui valid_examples.txt
   ```
   This will display a parse tree visualization if the program is valid.

2. **Using the Validator**:
   ```bash
   java MirrorLangValidator valid_examples.txt
   ```
   This should output: "The code is valid Mirror Language code."

### Valid Examples Explained

1. **Basic variable assignment and logging**:
   - Assigns a value to a variable
   - Logs the variable value

2. **Arithmetic operations**:
   - Uses arithmetic operators in conditions
   - Compares results of expressions

3. **Loops and conditions**:
   - Uses a LOOPIF structure to iterate
   - Increments a counter variable

4. **Nested structures**:
   - Nests a LOOPIF inside an IF statement
   - Shows proper nesting of keywords

5. **Comments**:
   - Shows both single-line and multi-line comments
   - Demonstrates proper comment syntax

## Testing Invalid Programs

The file `invalid_examples.txt` contains several examples of invalid Mirror Language programs. These programs should cause the parser to report syntax errors.

### How to Test Invalid Programs

1. **Using TestRig (grun)**:
   ```bash
   java org.antlr.v4.gui.TestRig MirrorLang program -gui invalid_examples.txt
   ```
   This will display error messages for the syntax errors.

2. **Using the Validator**:
   ```bash
   java MirrorLangValidator invalid_examples.txt
   ```
   This should output: "The code contains syntax errors."

### Invalid Examples Explained

1. **Missing closing keyword**:
   - `(SET $counter = 10 TS)` - Missing 'E' in 'TES)'
   - Error: Mismatched input 'TS' expecting 'TES)'

2. **Incorrect variable naming**:
   - `(SET $Counter = 5 TES)` - Variables must be lowercase
   - Error: Token recognition error at '$Counter'

3. **Missing $ in variable name**:
   - `(SET counter = 15 TES)` - Variables must start with $
   - Error: No viable alternative at input 'counter'

4. **Incorrect keyword format**:
   - `SET $x = 10 TES)` - Missing opening parenthesis
   - `(SET $y = 20 TES` - Missing closing parenthesis
   - Error: Missing '(' at 'SET' or missing ')' at end of input

5. **Incorrect keyword reversal**:
   - `(SET $z = 30 SET)` - Should be 'TES)' not 'SET)'
   - Error: Mismatched input 'SET' expecting 'TES)'

6. **Mismatched nested structures**:
   - Incorrect closing keywords for nested structures
   - Error: Mismatched input 'FI' expecting 'FIPOOL'

7. **Invalid operators**:
   - `$x === $y` - Triple equals not supported
   - Error: No viable alternative at input '==='

8. **Missing condition in IF**:
   - No condition provided for IF statement
   - Error: Missing condition at 'IF'

9. **Invalid comment format**:
   - `/// This is not a valid comment format`
   - Error: Token recognition error at '///'

10. **Incorrect multi-line comment format**:
    - `IGNORE)` instead of `ERONGI)`
    - Error: Mismatched input 'IGNORE' expecting 'ERONGI'

## Testing Individual Examples

To test individual examples, you can extract them into separate files and test them one by one:

```bash
# Extract the first valid example to a file
sed -n '1,5p' valid_examples.txt > valid_example1.txt

# Test it
java MirrorLangValidator valid_example1.txt

# Extract the first invalid example to a file
sed -n '1,2p' invalid_examples.txt > invalid_example1.txt

# Test it
java MirrorLangValidator invalid_example1.txt
```

## Testing with Custom Input

You can also test custom Mirror Language code by creating a new file with your code and running:

```bash
java MirrorLangValidator your_file.txt
```

Or to see the parse tree:

```bash
java org.antlr.v4.gui.TestRig MirrorLang program -gui your_file.txt
```

## Common Errors and Their Meanings

1. **Token recognition error**:
   - The lexer couldn't recognize a token
   - Usually due to invalid characters or incorrect variable names

2. **No viable alternative**:
   - The parser couldn't find a valid rule to match the input
   - Often due to missing or incorrect syntax elements

3. **Mismatched input**:
   - The parser expected a different token
   - Usually due to incorrect keyword format or missing elements

4. **Extraneous input**:
   - Extra tokens that don't belong in the current context
   - Often due to extra characters or incorrect syntax

## Debugging Tips

1. **Check the line and position** in the error message to locate the issue
2. **Look at the expected tokens** mentioned in the error message
3. **Verify keyword formats** - remember they start with '(' and end with the keyword reversed + ')'
4. **Check variable names** - they must start with '$' and be lowercase
5. **Verify nested structures** - make sure opening and closing keywords match
