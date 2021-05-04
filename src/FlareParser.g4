parser grammar FlareParser;

options { tokenVocab=FlareLexer; }

file
    : importLine* (packageHeader | mainMethod)+
    ;

importLine
    : IMPORT identifierSpecifier (AS IDENTIFIER)? SEMI
    ;


packageHeader
    : PACKAGE IDENTIFIER LBRACE entityHeader+ RBRACE
    | entityHeader
    | entityMethods
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
    : COMPONENT LBRACE (declarationLine)* RBRACE
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
    : visibilityModifier? definedFunctionHeaders declarationParameters body
    ;

definedFunctionHeaders
    : constructorHeader
    | destructorHeader
    | methodHeader
    ;

constructorHeader
    : IDENTIFIER
    ;

destructorHeader
    : TILDE IDENTIFIER
    ;

methodHeader
    : methodModifier? methodType IDENTIFIER
    ;

mainMethod
    : VOID MAIN LPAREN RPAREN body
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
    : newStatement
    | returnStatement
    | assignment
    | functionCall
    ;

newStatement
    : variableType arraySpecifier* IDENTIFIER callParameter (COMMA IDENTIFIER callParameter)*
    ;

returnStatement
    : RETURN identifierSpecifier
    //: RETURN expression
    ;

builtinFunctions
    : ifStatement
    | forStatement
    //| foreachStatement
    | whileStatement
    | doStatement
    //| switchStatement
    //| assertStatement
    | printStatement
    ;

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
    : FOR LPAREN (newStatement | identifierSpecifier) SEMI condition SEMI assignment RPAREN singleLineOrBlockBody
    ;

foreachStatement
    : FOR LPAREN declarationStatement COLON identifierSpecifier RPAREN singleLineOrBlockBody
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

assertStatement
    : ASSERT expression
    ;

printStatement
    : (PRINT | PRINTLN) LPAREN expression (COMMA expression)* RPAREN SEMI
    ;

conditionAndBlock
    : LPAREN condition RPAREN singleLineOrBlockBody
    ;

singleLineOrBlockBody
    : body
    | line
    ;

assignment
    : identifierSpecifier assign expression
    //| unaryExpression
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
    : identifierSpecifier callParameter
    ;

callParameter
    : LPAREN (parameterExpression (COMMA parameterExpression)*)? RPAREN
    ;

parameterExpression
    : parameterAdditiveExpression
    //: castSpecifier? parameterAdditiveExpression
    //| parameterTernaryExpression
    ;

parameterAdditiveExpression
    : parameterMultiplicativeExpression ((ADD | SUB) parameterMultiplicativeExpression)*
    ;

parameterMultiplicativeExpression
    : parameterTerm ((MUL | DIV | MOD) parameterTerm)*
    ;

parameterTerm
    : literal
    | functionCall
    | identifierSpecifier
    | ITER
    | LPAREN parameterExpression RPAREN
    ;

parameterTernaryExpression
    : LPAREN condition RPAREN QUESTION parameterExpression COLON parameterExpression
    | condition QUESTION expression COLON expression
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
    //: castSpecifier? additiveExpression
    //| ternaryExpression
    ;

additiveExpression
    : multiplicativeExpression ((ADD | SUB) multiplicativeExpression)*
    ;

multiplicativeExpression
    : term ((MUL | DIV | MOD) term)*
    ;

term
    : literal
    | functionCall
    | identifierSpecifier
    | LPAREN expression RPAREN
    ;

ternaryExpression
    : comparison QUESTION expression COLON expression
    //| condition QUESTION expression COLON expression
    ;

declarationStatement
    : variableType arraySpecifier* identifierList
    ;

declarationStatementSingular
    : variableType arraySpecifier* IDENTIFIER
    ;

identifierList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

arraySpecifier
    : COLON COLON LESSER INTEGER_LITERAL GREATER
    | COLON COLON LESSER  COMMA INTEGER_LITERAL GREATER
    //| LBRACK INTEGER_LITERAL COMMA INTEGER_LITERAL RBRACK
    ;

castSpecifier
    : LPAREN primitiveType arraySpecifier? RPAREN
    ;

identifierSpecifier
    : IDENTIFIER (DOT IDENTIFIER)*
    | THIS (DOT IDENTIFIER)+
    | SUPER (DOT IDENTIFIER)+
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    ;

integerLiteral
    : INTEGER_LITERAL
    | SUB INTEGER_LITERAL
//    | HEX_LITERAL
//    | OCT_LITERAL
//    | BINARY_LITERAL
//    | DECIMAL_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | LONG_LITERAL
//    | HEX_FLOAT_LITERAL
    ;

variableType
    : primitiveType
    | IDENTIFIER
    ;

entityModifier
    : ABSTRACT
    | FINAL
    | STATIC
    ;

classOrInterface
    : ENTITY
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
    | STRING
    ;