lexer grammar JSFMLexer;

//
//KEYWORD : 'boolin' | 'cease' | 'option' | 'kachow' | 'fiber' | 'megaman' | 'perform' | 'otherwise' | 'ultimate' | 'coke'
//        | 'repeat' | 'upon' | 'techies' | 'respond' | 'choices' | 'faceless' | 'during' | 'thread' | 'outputf' | 'inputf' ;

BOOLEAN: 'boolin';

BREAK: 'cease';

CASE: 'option';

CHAR: 'kachow';

CONST: 'fiber';

CONTINUE : 'megaman';

DEFAULT: 'basic';

DO : 'perform';

ELSE : 'otherwise';

FINAL : 'ultimate';

FLOAT : 'coke';

FOR : 'repeat';

IF : 'upon';

INT : 'techies';

MAIN : 'main';

RETURN : 'respond';

STRING : 'thread';

SWITCH : 'choices';

VOID : 'faceless';

WHILE : 'during';

INPUT: 'inputf';

OUTPUT: 'outputf';

BOOL_LITERAL : 'true' | 'false';

NULL_LITERAL : 'null';

IDENTIFIER: Letter LetterOrDigit*;

//SEPARATOR : '(' | ')' | '{' | '}' | '[' | ']' | ';' | ',' | '.';

LPAREN : '(';

RPAREN : ')';

LBRACE : '{';

RBRACE : '}';

LBRACK : '[';

RBRACK : ']';

SEMI: ';';

COMMA: ',';

DOT: '.';

QUOTE: '"';

//OPERATOR:  '=' | '>' | '<' | '!' | ':' | '==' | '<=' | '>=' | '!=' | '&&' | '||' | '++' | '--' | '+' | '-' | '*' | '/'
//        | '%' | '+=' | '-=' | '*=' | '/=';

ASSIGN : '=';

GT : '>';

LT : '<';

BANG : '!';

QUESTION : '?';

COLON: ':';

EQUAL : '==';

GEQ : '>=';

LEQ : '<=';

NEQ : '!=';

AND : '&&';

OR : '||';

INC : '++';

DEC : '--';

ADD : '+';

SUB : '-';

MUL : '*';

DIV : '/';

MOD : '%';

ADD_ASSIGN : '+=';

SUB_ASSIGN : '-=';

MUL_ASSIGN : '*=';

DIV_ASSIGN : '/=';

ELLIPSIS: '...';

DECIMAL_LITERAL : ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;

FLOAT_LITERAL:    (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
        | Digits (ExponentPart [fFdD]? | [fFdD]);


CHAR_LITERAL : '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL : '"' (~["\\\r\n] | EscapeSequence)* '"';

fragment EscapeSequence : '\\' [btnfr"'\\] | '\\' ([0-3]? [0-7])? [0-7];

fragment ExponentPart : [eE] [+-]? Digits;

fragment LetterOrDigit : Letter | [0-9];

fragment Digits : [0-9] ([0-9_]* [0-9])?;

fragment Letter :  [a-zA-Z$_];

WS : [ \t\r\n\u000C]+ -> channel(HIDDEN);

COMMENT:    ('/*' .*? '*/' | '//' ~[\r\n]*) -> channel(HIDDEN);

//WS : [ \t\r\n]+ -> skip ;
//COMMENT : '//' ~[\r\n]* '\r'? '\n' -> skip ;
