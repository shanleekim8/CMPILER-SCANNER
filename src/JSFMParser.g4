parser grammar JSFMParser;

options { tokenVocab=JSFMLexer; }

compilationUnit :  mainStatement EOF;

mainStatement : (methodDeclaration)* MAIN block;

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

integerLiteral : (SUB)? DECIMAL_LITERAL;

floatLiteral : (SUB)? FLOAT_LITERAL;

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
    : LBRACE blockStatement*  RBRACE
    ;

blockStatement
    : localVariableDeclaration SEMI blockStatement?
    | statement blockStatement?
    ;

localVariableDeclaration
    : variableModifier? typeType variableDeclarators
    ;

statement
    : blockLabel=block  #blockStmt
    | IF parExpression statement (ELSE statement)?  #ifElseStmt
    | FOR LPAREN forControl RPAREN statement    #forLoopStmt
    | WHILE parExpression statement     #whileLoopStmt
    | DO statement WHILE parExpression SEMI     #doWhileLoopStmt
    | SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE        #switchStmt
    | RETURN expression? SEMI #returnStmt
    | BREAK IDENTIFIER? SEMI    #breakStmt
    | expression SEMI       #exprStmt
    | identifierLabel=IDENTIFIER COLON statement    #identifierStmt
    | outputStatement   #outputStmt
    | outputStatementErrors #outputStmtErrors
    | inputStatementErrors  #inputStmtErrors
    | inputStatement    #inputStmt
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
    | methodCallErrors
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

methodCallErrors: IDENTIFIER expressionList? RPAREN #missingLParenMethodCall
                  |IDENTIFIER LPAREN expressionList? #missingRParenMethodCall
                  ;

primary
    : LPAREN expression RPAREN
    | literal
    | IDENTIFIER
    | typeTypeOrVoid
    ;

inputStatement  : INPUT LPAREN STRING_LITERAL
                COMMA IDENTIFIER RPAREN SEMI;

inputStatementErrors: INPUT STRING_LITERAL COMMA IDENTIFIER RPAREN SEMI #missingLParenInput
                    | INPUT LPAREN STRING_LITERAL COMMA IDENTIFIER SEMI #missingRParenInput
                    | INPUT LPAREN STRING_LITERAL IDENTIFIER RPAREN SEMI #missingCommaInput
                    | INPUT LPAREN STRING_LITERAL COMMA RPAREN SEMI #missingIdenInput
                    | INPUT LPAREN COMMA IDENTIFIER RPAREN SEMI #missingStrLitInput
                    | INPUT LPAREN STRING_LITERAL COMMA IDENTIFIER RPAREN #missingSemiInput
                    ;

outputStatement : OUTPUT LPAREN (IDENTIFIER | FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL | BOOL_LITERAL
                | IDENTIFIER LBRACK (DECIMAL_LITERAL | IDENTIFIER) RBRACK| (methodCall | methodCallErrors))
                ((ADD) (IDENTIFIER | FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL | BOOL_LITERAL
                | IDENTIFIER LBRACK (DECIMAL_LITERAL | IDENTIFIER) RBRACK| (methodCall | methodCallErrors)))* RPAREN SEMI;

outputStatementErrors: OUTPUT  (IDENTIFIER | FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL | BOOL_LITERAL
                       | IDENTIFIER LBRACK (DECIMAL_LITERAL | IDENTIFIER) RBRACK| (methodCall | methodCallErrors))
                       ((ADD) (IDENTIFIER | FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL | BOOL_LITERAL
                       | IDENTIFIER LBRACK (DECIMAL_LITERAL | IDENTIFIER) RBRACK| (methodCall | methodCallErrors)))* RPAREN SEMI #missingLParenOutput
                       |OUTPUT LPAREN (IDENTIFIER | FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL | BOOL_LITERAL
                       | IDENTIFIER LBRACK (DECIMAL_LITERAL | IDENTIFIER) RBRACK| (methodCall | methodCallErrors))
                       ((ADD) (IDENTIFIER | FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL | BOOL_LITERAL
                       | IDENTIFIER LBRACK (DECIMAL_LITERAL | IDENTIFIER) RBRACK| (methodCall | methodCallErrors)))* SEMI #missingRParenOutput
                       |OUTPUT LPAREN (IDENTIFIER | FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL | BOOL_LITERAL
                       | IDENTIFIER LBRACK (DECIMAL_LITERAL | IDENTIFIER) RBRACK| (methodCall | methodCallErrors))
                       ((ADD) (IDENTIFIER | FLOAT_LITERAL | DECIMAL_LITERAL | STRING_LITERAL | CHAR_LITERAL | BOOL_LITERAL
                       | IDENTIFIER LBRACK (DECIMAL_LITERAL | IDENTIFIER) RBRACK| (methodCall | methodCallErrors)))* RPAREN #missingSemiOutput
                       ;

primitiveType : BOOLEAN | CHAR | INT | FLOAT;