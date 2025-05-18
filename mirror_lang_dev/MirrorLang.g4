grammar MirrorLang;

/** LEXER RULES **/

// Whitespace
WS: [ \t\r\n]+ -> skip;

// Variables
VARIABLE: '$' [a-z][a-z0-9_]*;

// Operators
ARITHMETIC_OPERATOR: '+' | '-' | '*' | '/' | '^' | '%';
COMPARE_OPERATOR: '==' | '>=' | '>' | '<=' | '<' | '!=';

// Values
INT_VALUE: [0-9]+;
STRING_VALUE: '"' .*? '"';

// Keywords - each keyword starts with '(' and ends with the keyword reversed + ')'
SET_START: '(SET';
SET_END: 'TES)';
LOOPIF_START: '(LOOPIF';
LOOPIF_END: 'FIPOOL)';
IF_START: '(IF';
IF_END: 'FI)';
LOG_START: '(LOG';
LOG_END: 'GOL)';
IGNORE_START: '(IGNORE';
IGNORE_END: 'ERONGI)';

// Comment
SINGLE_LINE_COMMENT: '//' .*? '\r'? '\n' -> skip;

// Symbols
EQUALS: '=';
NEWLINE: '\r'? '\n';

/** PARSER RULES **/

// Program structure
program: statement* EOF;

statement: setStatement
         | loopIfStatement
         | ifStatement
         | logStatement
         | ignoreStatement
         ;

// Set statement
setStatement: SET_START WS? VARIABLE WS? EQUALS WS? value WS? SET_END NEWLINE?;

// LoopIf statement
loopIfStatement: LOOPIF_START WS? condition WS? NEWLINE program LOOPIF_END NEWLINE?;

// If statement
ifStatement: IF_START WS? condition WS? NEWLINE program IF_END NEWLINE?;

// Log statement
logStatement: LOG_START WS? (VARIABLE | STRING_VALUE) WS? LOG_END NEWLINE?;

// Ignore statement (multi-line comment)
ignoreStatement: IGNORE_START WS? program WS? IGNORE_END NEWLINE?;

// Condition
condition: expression COMPARE_OPERATOR expression;

// Expression
expression: VARIABLE (ARITHMETIC_OPERATOR VARIABLE)?;

// Value
value: INT_VALUE | STRING_VALUE | VARIABLE;
