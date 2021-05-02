lexer grammar FlareLexer;

// Types

BOOLEAN:            'boolean';
BYTE:               'byte';
CHAR:               'char';
DOUBLE:             'double';
INT:                'int';
LONG:               'long';
SHORT:              'short';
STRING:             'string';
VOID:               'void';

// Visibility Modifiers

PRIVATE:            'private';
PROTECTED:          'protected';
PUBLIC:             'public';

// Keyword Modifiers

ABSTRACT:           'abstract';
FINAL:              'final';
OVERRIDE:           'override';
INTERFACE:          'interface';
STATIC:             'static';
SYNCHRONIZED:       'synchronized';

// Keywords

AS:                 'as';
ASSERT:             'assert';
BREAK:              'break';
CASE:               'case';
CATCH:              'catch';
COLD:               'cold';
COMPONENT:          'component';
CONST:              'const';
CONTINUE:           'continue';
DEFAULT:            'default';
DO:                 'do';
ELSE:               'else';
ENTITY:             'entity';
ENUM:               'enum';
EXTENDS:            'extends';
FINALLY:            'finally';
FLOAT:              'float';
FOR:                'for';
HOT:                'hot';
IF:                 'if';
IMPLEMENTS:         'implements';
IMPORT:             'import';
ITER:               'iter';
MAIN:               'main';
PACKAGE:            'package';
PRINT:              'print';
RETURN:             'return';
SUPER:              'super';
SWITCH:             'switch';
THIS:               'this';
THROW:              'throw';
THROWS:             'throws';
TRY:                'try';
WHILE:              'while';

// Literals

INTEGER_LITERAL:    '0' | ([1-9] Digits*);

//DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
//HEX_LITERAL:        '0' [xX] HexDigits (HexDigits* HexDigits)? [lL]?;
//OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
//BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

FLOAT_LITERAL:      (Digits (DOT Digits) | DOT Digits) ExponentPart? [fF]?;
LONG_LITERAL:      (Digits (DOT Digits) | DOT Digits) ExponentPart? [lL]?;

//HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits DOT? | HexDigits? DOT HexDigits) [pP] [+-]? Digits [fFdD]?;

BOOL_LITERAL:       'true'
            |       'false'
            ;

CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';
STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';

// Separators

LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';

// Operators

ASSIGN:             '=';
GREATER:            '>';
LESSER:             '<';
EXCLAMATION:        '!';
TILDE:              '~';
QUESTION:           '?';
COLON:              ':';
EQUAL:              '==';
LESSEREQUAL:        '<=';
GREATEREQUAL:       '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
INCREMENT:          '++';
DECREMENT:          '--';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
BITAND:             '&';
BITOR:              '|';
CARET:              '^';
MOD:                '%';
LSHIFT:             '<<';
RSHIFT:             '>>';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
MUL_ASSIGN:         '*=';
DIV_ASSIGN:         '/=';
AND_ASSIGN:         '&=';
OR_ASSIGN:          '|=';
XOR_ASSIGN:         '^=';
MOD_ASSIGN:         '%=';
LSHIFT_ASSIGN:      '<<=';
RSHIFT_ASSIGN:      '>>=';
URSHIFT_ASSIGN:     '>>>=';

Whitespace:                 [ \t\r\n]+ -> channel(HIDDEN);
MULTI_COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

// Identifiers

IDENTIFIER:         Letter LetterOrDigit*;

// Fragment rules

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9_]
    ;
fragment Letter
    : [a-zA-Z]
    ;