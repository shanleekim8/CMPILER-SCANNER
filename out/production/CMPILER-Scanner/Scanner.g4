lexer grammar Scanner;

KEYWORD : 'boolin' | 'cease' | 'option' | 'kachow' | 'fiber' | 'megaman' | 'perform' | 'otherwise' | 'ultimate' | 'coke'
        | 'repeat' | 'upon' | 'techies' | 'respond' | 'choices' | 'faceless' | 'during' | 'String' | 'outputf' | 'inputf' ;

IDENTIFIER: Letter LetterOrDigit*;

SEPARATOR : '(' | ')' | '{' | '}' | '[' | ']' | ';' | ',' | '.';

OPERATOR:  '=' | '>' | '<' | '!' | ':' | '==' | '<=' | '>=' | '!=' | '&&' | '||' | '++' | '--' | '+' | '-' | '*' | '/'
        | '%' | '+=' | '-=' | '*=' | '/=';

DECIMAL_LITERAL : ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;

FLOAT_LITERAL:    (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
        | Digits (ExponentPart [fFdD]? | [fFdD]);

BOOL_LITERAL: 'true' | 'false';

CHAR_LITERAL : '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL : '"' (~["\\\r\n] | EscapeSequence)* '"';

NULL_LITERAL : 'null';

LetterOrDigit : Letter | [0-9];

EscapeSequence : '\\' [btnfr"'\\] | '\\' ([0-3]? [0-7])? [0-7];

ExponentPart : [eE] [+-]? Digits;

Digits : [0-9] ([0-9_]* [0-9])?;

Letter :  [a-zA-Z$_];

WS : [ \t\r\n\u000C]+ -> channel(HIDDEN);

COMMENT:    ('/*' .*? '*/' | '//' ~[\r\n]*) -> channel(HIDDEN);

//WS : [ \t\r\n]+ -> skip ;
//COMMENT : '//' ~[\r\n]* '\r'? '\n' -> skip ;
