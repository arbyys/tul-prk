#!/bin/bash

# Make sure ANTLR is set up
if [ ! -f "antlr-4.13.1-complete.jar" ]; then
    echo "Downloading ANTLR4..."
    curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
fi

# Set up CLASSPATH
export CLASSPATH=".:antlr-4.13.1-complete.jar:$CLASSPATH"

# Make sure parser is generated and compiled
if [ ! -f "MirrorLangLexer.class" ] || [ ! -f "MirrorLangParser.class" ]; then
    echo "Generating parser from grammar..."
    java -jar antlr-4.13.1-complete.jar MirrorLang.g4
    
    echo "Compiling Java files..."
    javac MirrorLang*.java
    javac MirrorLangValidator.java
fi

# Function to test a file and report results
test_file() {
    local file=$1
    local expected=$2
    
    echo "Testing $file..."
    result=$(java MirrorLangValidator "$file")
    
    if [[ "$result" == *"$expected"* ]]; then
        echo "✅ Test passed: $result"
    else
        echo "❌ Test failed: Expected '$expected' but got '$result'"
    fi
    echo ""
}

# Test valid examples
echo "=== Testing Valid Examples ==="
test_file "valid_examples.txt" "valid"

# Test invalid examples
echo "=== Testing Invalid Examples ==="
test_file "invalid_examples.txt" "syntax errors"

# Extract and test individual examples
echo "=== Testing Individual Examples ==="

# Create directory for individual examples if it doesn't exist
mkdir -p examples

# Extract and test valid examples
echo "--- Valid Examples ---"
csplit -f examples/valid_ valid_examples.txt '/^\/\/ Example/' '{*}' > /dev/null 2>&1
for file in examples/valid_*; do
    if [ -s "$file" ]; then  # Check if file is not empty
        test_file "$file" "valid"
    fi
done

# Extract and test invalid examples
echo "--- Invalid Examples ---"
csplit -f examples/invalid_ invalid_examples.txt '/^\/\/ Example/' '{*}' > /dev/null 2>&1
for file in examples/invalid_*; do
    if [ -s "$file" ]; then  # Check if file is not empty
        test_file "$file" "syntax errors"
    fi
done

echo "All tests completed!"
