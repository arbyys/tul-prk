# Simple Makefile for Mirror Language tests

# Variables
JAVA = java
# Use a fixed path for ANTLR_JAR to simplify
ANTLR_JAR = lib/antlr-4.13.1-complete.jar
MAIN_CLASS = Main
BIN_DIR = bin
VALID_DIR = test/valid
INVALID_DIR = test/invalid
RESULTS_DIR = test/results

# Default target
.PHONY: all
all: test

# Create results directory
$(RESULTS_DIR):
	@mkdir -p $(RESULTS_DIR)

# Run a single test and save result
$(RESULTS_DIR)/%.result: $(VALID_DIR)/%.mirror $(RESULTS_DIR)
	@echo "Testing $<..."
	@$(JAVA) -cp ".;$(ANTLR_JAR);$(BIN_DIR)" $(MAIN_CLASS) $< > $@ 2>&1 || echo "Test failed with exit code $$?" >> $@
	@echo "Result saved to $@"

$(RESULTS_DIR)/%.result: $(INVALID_DIR)/%.mirror $(RESULTS_DIR)
	@echo "Testing $<..."
	@$(JAVA) -cp ".;$(ANTLR_JAR);$(BIN_DIR)" $(MAIN_CLASS) $< > $@ 2>&1 || echo "Test failed with exit code $$?" >> $@
	@echo "Result saved to $@"

# Get all test files
VALID_TESTS = $(wildcard $(VALID_DIR)/*.mirror)
INVALID_TESTS = $(wildcard $(INVALID_DIR)/*.mirror)

# Convert test paths to result paths
VALID_RESULTS = $(patsubst $(VALID_DIR)/%.mirror,$(RESULTS_DIR)/%.result,$(VALID_TESTS))
INVALID_RESULTS = $(patsubst $(INVALID_DIR)/%.mirror,$(RESULTS_DIR)/%.result,$(INVALID_TESTS))

# Run all tests
.PHONY: test
test: test-valid test-invalid

# Run valid tests
.PHONY: test-valid
test-valid: $(VALID_RESULTS)
	@echo "All valid tests completed."

# Run invalid tests
.PHONY: test-invalid
test-invalid: $(INVALID_RESULTS)
	@echo "All invalid tests completed."

# Clean up results
.PHONY: clean
clean:
	@echo "Cleaning up..."
	@rm -rf $(RESULTS_DIR)
	@echo "Clean completed."
