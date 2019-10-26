grammar Scanner;

MAIN: KEYWORD IDENTIFIER;

KEYWORD : 'boolin' | 'cease' | 'option' | 'kachow' | 'fiber' | 'megaman' | 'perform' | 'otherwise' | 'ultimate' | 'coke'
        | 'repeat' | 'upon' | 'techies' | 'respond' | 'choices' | 'faceless' | 'during' | 'String' | 'outputf' | 'inputf' ;

IDENTIFIER: Letter LetterOrDigit*;

SEPARATOR : '(' | ')' | '{' | '}' | '[' | ']' | ';' | ',' | '.';

OPERATOR:  '=' | '>' | '<' | '!' | ':' | '==' | '<=' | '>=' | '!=' | '&&' | '||' | '++' | '--' | '+' | '-' | '*' | '/'
        | '%' | '+=' | '-=' | '*=' | '/=';

variableModifier : 'FINAL';

typeBound: typeType ('&' typeType)*;

typeParameters : '<' typeParameter (',' typeParameter)* '>';

typeParameter:  IDENTIFIER;

methodDeclaration : typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')*
      methodBody;

methodBody : block | ';';

genericMethodDeclaration : typeParameters methodDeclaration;

fieldDeclaration : typeType variableDeclarators ';';

memberDeclaration : methodDeclaration | genericMethodDeclaration| fieldDeclaration;

typeTypeOrVoid : typeType | 'faceless';

typeType
    : (primitiveType) ('[' ']')*
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    : variableModifier* typeType '...' variableDeclaratorId
    ;

qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*;

qualifiedNameList : qualifiedName (',' qualifiedName)*;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;

variableInitializer : arrayInitializer | expression ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | statement
    ;

localVariableDeclaration
    : variableModifier* typeType variableDeclarators
    ;

statement
    : blockLabel=block
    | 'upon' parExpression statement ('otherwise' statement)?
    | 'repeat' '(' forControl ')' statement
    | 'during' parExpression statement
    | 'perform' statement 'during' parExpression ';'
    | 'choices' parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    | 'respond' expression? ';'
    | 'cease' IDENTIFIER? ';'
    | statementExpression=expression ';'
    | identifierLabel=IDENTIFIER ':' statement
    | outputStatement
    | inputStatement
    ;

switchBlockStatementGroup : switchLabel+ blockStatement+;

switchLabel : 'option' (constantExpression=expression | enumConstantName=IDENTIFIER) ':' | 'basic' ':';

forControl : enhancedForControl | forInit? ';' expression? ';' forUpdate=expressionList?;

forInit : localVariableDeclaration | expressionList;

enhancedForControl : variableModifier* typeType variableDeclaratorId ':' expression;

parExpression : '(' expression ')';

expressionList : expression (',' expression)*;

methodCall : IDENTIFIER '(' expressionList? ')';

expression
    : expression bop='.'
      ( IDENTIFIER
      | methodCall
      )
    | expression '[' expression ']'
    | methodCall
    | '(' typeType ')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('!') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | <assoc=right> expression bop='?' expression ':' expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression;

inputStatement  : 'inputf(' (expression | LetterOrDigit*)
                (('+') (expression | LetterOrDigit*))* ')';

outputStatement : 'outputf(' (expression | LetterOrDigit)
                (('+') (expression | LetterOrDigit))* ')';

primitiveType : 'boolin' | 'kachow' | 'techies' | 'coke';

DECIMAL_LITERAL : ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;

FLOAT_LITERAL:    (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
        | Digits (ExponentPart [fFdD]? | [fFdD]);

BOOL_LITERAL : 'true' | 'false';

CHAR_LITERAL : '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL : '"' (~["\\\r\n] | EscapeSequence)* '"';

NULL_LITERAL : 'null';

EscapeSequence : '\\' [btnfr"'\\] | '\\' ([0-3]? [0-7])? [0-7];

ExponentPart : [eE] [+-]? Digits;

LetterOrDigit : Letter | [0-9];

Digits : [0-9] ([0-9_]* [0-9])?;

Letter :  [a-zA-Z$_];

WS : [ \t\r\n\u000C]+ -> channel(HIDDEN);

COMMENT:    ('/*' .*? '*/' | '//' ~[\r\n]*) -> channel(HIDDEN);

//WS : [ \t\r\n]+ -> skip ;
//COMMENT : '//' ~[\r\n]* '\r'? '\n' -> skip ;
