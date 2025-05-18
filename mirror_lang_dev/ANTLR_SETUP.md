# Setting up ANTLR4 for Mirror Language

This document explains how to set up ANTLR4 to parse and validate Mirror Language code.

## Prerequisites

1. Java JDK (version 8 or later)
2. ANTLR4 tool

## Installation Steps

### 1. Install Java JDK

Download and install Java JDK from the official Oracle website or use OpenJDK.

### 2. Install ANTLR4

Download the ANTLR4 tool:

```bash
curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
```

Add ANTLR to your CLASSPATH (add this to your .bashrc or .zshrc file):

```bash
export CLASSPATH=".:/path/to/antlr-4.13.1-complete.jar:$CLASSPATH"
alias antlr4='java -jar /path/to/antlr-4.13.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

## Generating Parser from Grammar

1. Generate the parser from the grammar file:

```bash
antlr4 MirrorLang.g4
```

2. Compile the generated Java files:

```bash
javac MirrorLang*.java
```

## Testing the Parser

To test if your Mirror Language code is valid:

```bash
grun MirrorLang program -gui test_mirror.txt
```

This will parse the file and show a parse tree if the code is valid. If there are syntax errors, they will be displayed.

## Using the Parser in Your Application

To use the generated parser in your application:

1. Include the generated Java files in your project
2. Create a lexer and parser:

```java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MirrorLangValidator {
    public static boolean validateCode(String code) {
        try {
            // Create a CharStream from the input code
            CharStream input = CharStreams.fromString(code);
            
            // Create a lexer
            MirrorLangLexer lexer = new MirrorLangLexer(input);
            
            // Create a token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Create a parser
            MirrorLangParser parser = new MirrorLangParser(tokens);
            
            // Remove default error listeners
            parser.removeErrorListeners();
            
            // Add a custom error listener
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                                       int line, int charPositionInLine, 
                                       String msg, RecognitionException e) {
                    throw new RuntimeException("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
                }
            });
            
            // Parse the input
            parser.program();
            
            // If we get here, the code is valid
            return true;
        } catch (Exception e) {
            // If an exception is thrown, the code is invalid
            System.err.println("Invalid code: " + e.getMessage());
            return false;
        }
    }
}
```

## Common Issues and Troubleshooting

1. **Lexer/Parser Errors**: If you encounter errors in the generated lexer or parser, check your grammar file for syntax errors.

2. **Runtime Errors**: Make sure your CLASSPATH is set correctly and includes the ANTLR runtime.

3. **Parse Errors**: If your code doesn't parse correctly, check it against the grammar rules to ensure it follows the Mirror Language syntax.
