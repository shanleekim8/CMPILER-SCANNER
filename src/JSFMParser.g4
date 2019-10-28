parser grammar JSFMParser;

options { tokenVocab=JSFMLexer; }

compilationUnit :  mainStatement EOF;

mainStatement : (memberDeclaration)* MAIN block (memberDeclaration)*;

variableModifier : FINAL;

typeParameters : LT typeParameter (COMMA typeParameter)* GT;

typeParameter:  IDENTIFIER;

methodDeclaration : typeTypeOrVoid IDENTIFIER formalParameters (LBRACK RBRACK)*
      methodBody;

methodBody : block | SEMI;

genericMethodDeclaration : typeParameters methodDeclaration;

fieldDeclaration : typeType variableDeclarators SEMI;

memberDeclaration : methodDeclaration | genericMethodDeclaration| fieldDeclaration;

typeTypeOrVoid : typeType | VOID;

typeType
    : (primitiveType) (LBRACK RBRACK)*
    ;

formalParameters
    : LPAREN formalParameterList? RPAREN
    ;

formalParameterList
    : formalParameter (COMMA formalParameter)* (COMMA lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    : variableModifier* typeType ELLIPSIS variableDeclaratorId
    ;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral : DECIMAL_LITERAL;

floatLiteral : FLOAT_LITERAL;

qualifiedNameList : qualifiedName (COMMA qualifiedName)*;

variableDeclarators
    : variableDeclarator (COMMA variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId (ASSIGN variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER (LBRACK RBRACK)*
    ;

variableInitializer : arrayInitializer | expression ;

arrayInitializer
    : LBRACE (variableInitializer (COMMA variableInitializer)* (COMMA)? )? RBRACE
    ;

block
    : LBRACE blockStatement* RBRACE
    ;

blockStatement
    : localVariableDeclaration SEMI
    | statement
    ;

localVariableDeclaration
    : variableModifier* typeType variableDeclarators
    ;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | FOR LPAREN forControl RPAREN statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression SEMI
    | SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE
    | RETURN expression? SEMI
    | BREAK IDENTIFIER? SEMI
    | statementExpression=expression SEMI
    | identifierLabel=IDENTIFIER COLON statement
    | outputStatement
    | inputStatement
    ;

switchBlockStatementGroup : switchLabel+ blockStatement+;

switchLabel : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) COLON | DEFAULT COLON;

forControl : enhancedForControl | forInit? SEMI expression? SEMI forUpdate=expressionList?;

forInit : localVariableDeclaration | expressionList;

enhancedForControl : variableModifier* typeType variableDeclaratorId COLON expression;

parExpression : LPAREN expression RPAREN;

expressionList : expression (COMMA expression)*;

methodCall : IDENTIFIER LPAREN expressionList? RPAREN;

expression
    : primary
    | expression bop=DOT
      ( IDENTIFIER
      | methodCall
      )
    | expression LBRACK expression RBRACK
    | methodCall
    | LPAREN typeType RPAREN expression
    | expression postfix=(INC | DEC)
    | prefix=(ADD|SUB|INC|DEC) expression
    | BANG expression
    | expression bop=(MUL|DIV|MOD) expression
    | expression bop=(ADD|SUB) expression
    | expression (LT LT | GT GT GT | GT GT) expression
    | expression bop=(LEQ | GEQ | GT | LT) expression
    | expression bop=(EQUAL | NEQ) expression
    | expression bop=AND expression
    | expression bop=OR expression
    | <assoc=right> expression bop=QUESTION expression COLON expression
    | <assoc=right> expression
      bop=(ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN)
      expression;

primary
    : '(' expression ')'
    | literal
    | IDENTIFIER
    | typeTypeOrVoid '.' CLASS
    ;

inputStatement  : INPUT LPAREN (expression | QUOTE LetterOrDigit* QUOTE)
                COMMA IDENTIFIER RPAREN SEMI;

outputStatement : OUTPUT LPAREN (expression | QUOTE LetterOrDigit* QUOTE)
                ((ADD) (expression | QUOTE LetterOrDigit* QUOTE))* RPAREN SEMI;

primitiveType : BOOLEAN | CHAR | INT | FLOAT;