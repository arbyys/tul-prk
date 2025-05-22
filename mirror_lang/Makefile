VALID_DIR = test/valid
INVALID_DIR = test/invalid
RESULTS_DIR = test/results
# Either set ANTLR_JAR as enviromental variable (recommended) or uncomment below with your path
# ANTLR_JAR = /mnt/c/antlr/antlr-4.13.2-complete.jar
ifndef ANTLR_JAR
	@echo "Downloading ANTLR JAR..."
	@mkdir -p lib
	@curl -o lib/antlr-4.13.2-complete.jar https://www.antlr.org/download/antlr-4.13.2-complete.jar
	@echo "ANTLR JAR downloaded to lib/antlr-4.13.2-complete.jar"
    ANTLR_JAR = lib/antlr-4.13.2-complete.jar
endif

.PHONY: all
all: test

$(RESULTS_DIR):
	@mkdir -p $(RESULTS_DIR)

.PHONY: test
test: test-valid test-invalid

.PHONY: test-valid
test-valid: $(RESULTS_DIR)
	@for file in $(VALID_DIR)/*.mirror; do \
		echo "Testing $$file"; \
		basename=$$(basename $$file .mirror); \
		java -cp ".:$(ANTLR_JAR):bin" Main $$file > $(RESULTS_DIR)/$$basename.result 2>&1 || echo "Test failed with exit code $$?" >> $(RESULTS_DIR)/$$basename.result; \
	done

.PHONY: test-invalid
test-invalid: $(RESULTS_DIR)
	@for file in $(INVALID_DIR)/*.mirror; do \
		echo "Testing $$file"; \
		basename=$$(basename $$file .mirror); \
		java -cp ".:$(ANTLR_JAR):bin" Main $$file > $(RESULTS_DIR)/$$basename.result 2>&1 || echo "Test failed with exit code $$?" >> $(RESULTS_DIR)/$$basename.result; \
	done

.PHONY: clean
clean:
	@rm -rf $(RESULTS_DIR)
	@echo "Clean completed"
