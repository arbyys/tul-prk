#!/bin/bash

# Check if ANTLR jar exists, if not download it
if [ ! -f "antlr-4.13.1-complete.jar" ]; then
    echo "Downloading ANTLR4..."
    curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
fi

# Set up CLASSPATH
export CLASSPATH=".:antlr-4.13.1-complete.jar:$CLASSPATH"

# Generate parser from grammar
echo "Generating parser from grammar..."
java -jar antlr-4.13.1-complete.jar MirrorLang.g4

# Compile Java files
echo "Compiling Java files..."
javac MirrorLang*.java
javac MirrorLangValidator.java

# Test the parser
echo "Testing the parser on test_mirror.txt..."
java org.antlr.v4.gui.TestRig MirrorLang program -gui test_mirror.txt

# Validate the code using our validator
echo "Validating the code using MirrorLangValidator..."
java MirrorLangValidator test_mirror.txt
