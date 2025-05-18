grammar MirrorLang;

WS: [ \t\r\n]+ -> skip;

VARIABLE: '$' [a-z][a-z0-9_]*;

ARITHMETIC_OPERATOR: '+' | '-' | '*' | '/' | '^' | '%';
COMPARE_OPERATOR: '==' | '>=' | '>' | '<=' | '<' | '!=';

INT_VALUE: [0-9]+;
STRING_VALUE: '"' .*? '"';

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

SINGLE_LINE_COMMENT: '//' .*? '\r'? '\n' -> skip;

EQUALS: '=';
NEWLINE: '\r'? '\n';

program: statement* EOF;

statement: setStatement
         | loopIfStatement
         | ifStatement
         | logStatement
         | ignoreStatement
         ;

setStatement: SET_START WS? VARIABLE WS? EQUALS WS? value WS? SET_END NEWLINE?;

loopIfStatement: LOOPIF_START WS? condition WS? NEWLINE program LOOPIF_END NEWLINE?;

ifStatement: IF_START WS? condition WS? NEWLINE program IF_END NEWLINE?;

logStatement: LOG_START WS? (VARIABLE | STRING_VALUE) WS? LOG_END NEWLINE?;

ignoreStatement: IGNORE_START WS? program WS? IGNORE_END NEWLINE?;

condition: expression COMPARE_OPERATOR expression;

expression: VARIABLE (ARITHMETIC_OPERATOR VARIABLE)?;

value: INT_VALUE | STRING_VALUE | VARIABLE;
