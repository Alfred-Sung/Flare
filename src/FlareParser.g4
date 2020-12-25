parser grammar FlareParser;

options { tokenVocab=FlareLexer; }

file
    : importLine* packageHeader*
    ;

importLine
    : IMPORT identifierSpecifier (AS IDENTIFIER)? SEMI
    ;

packageHeader
    : PACKAGE IDENTIFIER LBRACE entityHeader+ RBRACE
    | entityHeader
    ;

entityHeader
    : entityModifier? classOrInterface IDENTIFIER extensions? LBRACE entityBody RBRACE
    ;

extensions
    : EXTENDS identifierSpecifier+
    | IMPLEMENTS identifierSpecifier+
    ;

entityBody
    : declarationHeader? (entityMethods)*
    ;

declarationHeader
    : STRUCT LBRACE (declarationLine)* RBRACE
    ;

declarationLine
    : declarationStatement SEMI
    | declarationTag
    ;

declarationTag
    : COLD COLON
    | HOT COLON
    ;

entityMethods
    : definedFunctionHeaders declarationParameters body
    ;

definedFunctionHeaders
    : constructorHeader
    | deconstructorHeader
    | methodHeader
    ;

constructorHeader
    : visibilityModifier? IDENTIFIER
    ;

deconstructorHeader
    : visibilityModifier? TILDE IDENTIFIER
    ;

methodHeader
    : visibilityModifier? methodModifier? methodType castSpecifier? IDENTIFIER
    ;

declarationParameters
    : LPAREN (declarationStatementSingular (COMMA declarationStatementSingular)*)? RPAREN
    ;

body
    : LBRACE line* RBRACE
    ;
    
line
    : statement SEMI
    | builtinFunctions
    ;

statement
    : declarationStatement
    | assignment
    | functionCall
    ;

builtinFunctions
    : ifStatement
    | forStatement
    | foreachStatement
    | whileStatement
    | doStatement
    | switchStatement
    | ASSERT
    ;

iteratorBlock
    : arraySpecifier body
    ;

newLine
    : NEW functionCall
    ;

//lookahead issue
ifStatement
    : IF conditionAndBlock elseIfStatement* elseStatement?
    ;

elseIfStatement
    : ELSE IF conditionAndBlock
    ;

elseStatement
    : ELSE singleLineOrBlockBody
    ;

forStatement
    : FOR LPAREN SEMI SEMI SEMI RPAREN singleLineOrBlockBody
    ;

foreachStatement
    : FOR LPAREN declarationStatement SEMI identifierSpecifier RPAREN singleLineOrBlockBody
    ;

whileStatement
    : WHILE conditionAndBlock
    ;

doStatement
    : DO singleLineOrBlockBody WHILE LPAREN condition RPAREN
    ;

switchStatement
    : SWITCH LPAREN identifierSpecifier RPAREN LBRACE caseStatement* RBRACE
    ;

caseStatement
    : CASE literal COLON line*
    | DEFAULT COLON line*
    ;

conditionAndBlock
    : LPAREN condition RPAREN singleLineOrBlockBody
    ;

singleLineOrBlockBody
    : body
    | line
    ;

assignment
    : declarationStatementSingular assign expression
    //| declarationStatement assign expression
    | passByReference assign expression
    | unaryExpression
    ;

assign
    : ASSIGN
    | ADD_ASSIGN
    | SUB_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    | AND_ASSIGN
    | OR_ASSIGN
    | XOR_ASSIGN
    | MOD_ASSIGN
    | LSHIFT_ASSIGN
    | RSHIFT_ASSIGN
    | URSHIFT_ASSIGN
    ;

functionCall
    : identifierSpecifier castSpecifier? callParameter
    ;

callParameter
    : LPAREN (expression (COMMA expression)*)? RPAREN
    ;

condition
    : comparator ((AND | OR) comparator)*
    | BOOL_LITERAL
    ;

comparator
    : expression comparison expression
    | LPAREN condition RPAREN
    ;

comparison
    : EQUAL
    | NOTEQUAL
    | GREATER
    | LESSER
    | GREATEREQUAL
    | LESSEREQUAL
    ;

expression
    : additiveExpression
    | iteratorBlock
    | newLine
    | ternaryExpression
    | unaryExpression
    ;

additiveExpression
    : multiplicativeExpression ((ADD | SUB) multiplicativeExpression)*
    ;

multiplicativeExpression
    : term ((MUL | DIV | MOD) term)*
    ;

unaryExpression
    : preUnaryExpression
    | postUnaryExpression
    ;

preUnaryExpression
    : INCREMENT identifierSpecifier
    | DECREMENT identifierSpecifier
    ;

postUnaryExpression
    : identifierSpecifier INCREMENT
    | identifierSpecifier DECREMENT
    ;

term
    : literal
    | functionCall
    | passByReference
    | passByValue
    | LPAREN expression RPAREN
    ;

passByReference
    : identifierSpecifier
    ;

passByValue
    : BITAND identifierSpecifier
    | BITAND ITER
    ;

ternaryExpression
    : LPAREN condition RPAREN QUESTION expression COLON expression
    |// condition QUESTION expression COLON expression
    ;

declarationStatement
    : variableType castSpecifier? arraySpecifier* identifierList
    ;

declarationStatementSingular
    : variableType arraySpecifier* IDENTIFIER
    ;

identifierList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

castSpecifier
    : LESSER variableType GREATER
    ;

arraySpecifier
    : LBRACK INTEGER_LITERAL RBRACK
    | LBRACK COMMA INTEGER_LITERAL RBRACK
    | LBRACK INTEGER_LITERAL COMMA INTEGER_LITERAL RBRACK
    ;

identifierSpecifier
    : IDENTIFIER (DOT IDENTIFIER)*
    | THIS (DOT identifierSpecifier)?
    | SUPER (DOT identifierSpecifier)?
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    | INTEGER_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;

variableType
    : primitiveType
    | IDENTIFIER
    | STRING
    ;

entityModifier
    : ABSTRACT
    | FINAL
    | STATIC
    ;

classOrInterface
    : CLASS
    | INTERFACE
    ;

visibilityModifier
    : PRIVATE
    | PROTECTED
    | PUBLIC
    ;

methodModifier
    : ABSTRACT
    | OVERRIDE
    | STATIC
    | SYNCHRONIZED
    ;

methodType
    : variableType
    | VOID
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | BYTE
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    ;