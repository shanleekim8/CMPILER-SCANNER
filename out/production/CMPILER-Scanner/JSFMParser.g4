parser grammar JSFMParser;

options { tokenVocab=JSFMLexer; }

compilationUnit :  mainStatement EOF;

mainStatement : (methodDeclaration)* MAIN block (methodDeclaration)*;

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
    : (primitiveType) (LBRACK (IDENTIFIER | integerLiteral)? RBRACK)* |
    (STRING) (LBRACK (IDENTIFIER | integerLiteral)? RBRACK)*
    ;

formalParameters
    : LPAREN formalParameterList? RPAREN
    ;

formalParameterList
    : formalParameter (COMMA formalParameter)* (COMMA lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : variableModifier? typeType variableDeclaratorId
    ;

lastFormalParameter
    : variableModifier? typeType ELLIPSIS variableDeclaratorId
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
    : LBRACE blockStatement* returnStatement? RBRACE
    ;

blockStatement
    : localVariableDeclaration SEMI blockStatement?
    | statement blockStatement?
    ;

localVariableDeclaration
    : variableModifier? typeType variableDeclarators
    ;

returnStatement :  RETURN returnExpression SEMI;

returnExpression: literal
                    | IDENTIFIER
                    | methodCall
                    | LPAREN typeType RPAREN returnExpression
                    | returnExpression bop=(MUL|DIV|MOD) returnExpression
                    | returnExpression bop=(ADD|SUB) returnExpression
                    | returnExpression (LT LT | GT GT GT | GT GT) returnExpression
                    | returnExpression bop=(LEQ | GEQ | GT | LT) returnExpression
                    | returnExpression bop=(EQUAL | NEQ) returnExpression
                    | returnExpression bop=AND returnExpression
                    | returnExpression bop=OR returnExpression
                    | <assoc=right> returnExpression bop=QUESTION returnExpression COLON returnExpression
                    | <assoc=right> returnExpression
                      bop=(ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN)
                      returnExpression;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | FOR LPAREN forControl RPAREN statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression SEMI
    | SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE
    | BREAK IDENTIFIER? SEMI
    | expression SEMI
    | identifierLabel=IDENTIFIER COLON statement
    | outputStatement
    | inputStatement
    ;

switchBlockStatementGroup : switchLabel+ blockStatement+;

switchLabel : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) COLON | DEFAULT COLON;

forControl : enhancedForControl | forInit? SEMI expression? SEMI (expressionList? | prepostFix);

forInit : localVariableDeclaration | expressionList;

enhancedForControl : variableModifier? typeType variableDeclaratorId COLON expression;

parExpression : LPAREN expression RPAREN;

expressionList : expression (COMMA expression)*;

methodCall : IDENTIFIER LPAREN expressionList? RPAREN;

prepostFix :  IDENTIFIER(INC | DEC)
            |  (INC | DEC) IDENTIFIER;

expression
    : primary
    | expression bop=DOT
      ( IDENTIFIER
      | methodCall
      )
    | expression LBRACK expression RBRACK
    | methodCall
    | LPAREN typeType RPAREN expression
    | BANG expression
    | expression bop=(MUL|DIV|MOD) expression
    | expression bop=(ADD|SUB) expression
    | expression (LT LT | GT GT GT | GT GT) expression
    | expression bop=(LEQ | GEQ | GT | LT) expression
    | expression bop=(EQUAL | NEQ) expression
    | expression bop=AND expression
    | expression bop=OR expression
    | prepostFix
    | <assoc=right> expression bop=QUESTION expression COLON expression
    | <assoc=right> expression
      bop=(ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN)
      expression;

primary
    : LPAREN expression RPAREN
    | literal
    | IDENTIFIER
    | typeTypeOrVoid
    ;

inputStatement  : INPUT LPAREN ( FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL)
                COMMA IDENTIFIER RPAREN SEMI;

outputStatement : OUTPUT LPAREN (IDENTIFIER | STRING_LITERAL)
                ((ADD) (IDENTIFIER | STRING_LITERAL))* RPAREN SEMI;

primitiveType : BOOLEAN | CHAR | INT | FLOAT;