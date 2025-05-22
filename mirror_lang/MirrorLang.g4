grammar MirrorLang;

WS: [ \t]+ -> skip;

NEWLINE: '\r'? '\n';

VARIABLE: '$' [a-z][a-z0-9_]*;

ARITHMETIC_OPERATOR: '+' | '-' | '*' | '/' | '^' | '%';
COMPARE_OPERATOR: '==' | '>=' | '>' | '<=' | '<' | '!=';

INT_VALUE: [0-9]+;
STRING_VALUE: '"' (~["\r\n])* '"';

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

program: (statement (NEWLINE+ | EOF))+ EOF;

statement: setStatement
         | loopIfStatement
         | ifStatement
         | logStatement
         | ignoreStatement
         | NEWLINE
         ;

setStatement: SET_START WS? VARIABLE WS? EQUALS WS? expression WS? SET_END;

loopIfStatement: LOOPIF_START WS? condition NEWLINE? innerStatement+ LOOPIF_END;

ifStatement: IF_START WS? condition NEWLINE? innerStatement+ IF_END;

logStatement: LOG_START WS? (expression | STRING_VALUE) WS? LOG_END;

ignoreStatement: IGNORE_START program IGNORE_END;

innerStatement: WS? statement NEWLINE?;

condition: expression WS? COMPARE_OPERATOR WS? expression;

expression: term (WS? ARITHMETIC_OPERATOR WS? term)*;

term: VARIABLE | INT_VALUE | '(' expression ')';
