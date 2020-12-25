// Generated from E:/Documents/IntelliJ/Project Flare/src\FlareParser.g4 by ANTLR 4.9
package Flare;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlareParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, CHAR=3, DOUBLE=4, INT=5, LONG=6, SHORT=7, STRING=8, 
		VOID=9, PRIVATE=10, PROTECTED=11, PUBLIC=12, ABSTRACT=13, FINAL=14, OVERRIDE=15, 
		INTERFACE=16, STATIC=17, SYNCHRONIZED=18, AS=19, ASSERT=20, BREAK=21, 
		CASE=22, CATCH=23, CLASS=24, COLD=25, CONST=26, CONTINUE=27, DEFAULT=28, 
		DO=29, ELSE=30, ENUM=31, EXTENDS=32, FINALLY=33, FLOAT=34, FOR=35, HOT=36, 
		IF=37, IMPLEMENTS=38, IMPORT=39, ITER=40, NEW=41, PACKAGE=42, RETURN=43, 
		STRUCT=44, SUPER=45, SWITCH=46, THIS=47, THROW=48, THROWS=49, TRY=50, 
		WHILE=51, INTEGER_LITERAL=52, DECIMAL_LITERAL=53, HEX_LITERAL=54, OCT_LITERAL=55, 
		BINARY_LITERAL=56, FLOAT_LITERAL=57, HEX_FLOAT_LITERAL=58, BOOL_LITERAL=59, 
		CHAR_LITERAL=60, STRING_LITERAL=61, NULL_LITERAL=62, LPAREN=63, RPAREN=64, 
		LBRACE=65, RBRACE=66, LBRACK=67, RBRACK=68, SEMI=69, COMMA=70, DOT=71, 
		ASSIGN=72, GREATER=73, LESSER=74, EXCLAMATION=75, TILDE=76, QUESTION=77, 
		COLON=78, EQUAL=79, LESSEREQUAL=80, GREATEREQUAL=81, NOTEQUAL=82, AND=83, 
		OR=84, INCREMENT=85, DECREMENT=86, ADD=87, SUB=88, MUL=89, DIV=90, BITAND=91, 
		BITOR=92, CARET=93, MOD=94, LSHIFT=95, RSHIFT=96, ADD_ASSIGN=97, SUB_ASSIGN=98, 
		MUL_ASSIGN=99, DIV_ASSIGN=100, AND_ASSIGN=101, OR_ASSIGN=102, XOR_ASSIGN=103, 
		MOD_ASSIGN=104, LSHIFT_ASSIGN=105, RSHIFT_ASSIGN=106, URSHIFT_ASSIGN=107, 
		Whitespace=108, MULTI_COMMENT=109, LINE_COMMENT=110, IDENTIFIER=111;
	public static final int
		RULE_file = 0, RULE_importLine = 1, RULE_packageHeader = 2, RULE_entityHeader = 3, 
		RULE_extensions = 4, RULE_entityBody = 5, RULE_declarationHeader = 6, 
		RULE_declarationLine = 7, RULE_declarationTag = 8, RULE_entityMethods = 9, 
		RULE_definedFunctionHeaders = 10, RULE_constructorHeader = 11, RULE_deconstructorHeader = 12, 
		RULE_methodHeader = 13, RULE_declarationParameters = 14, RULE_body = 15, 
		RULE_line = 16, RULE_statement = 17, RULE_builtinFunctions = 18, RULE_iteratorBlock = 19, 
		RULE_newLine = 20, RULE_ifStatement = 21, RULE_elseIfStatement = 22, RULE_elseStatement = 23, 
		RULE_forStatement = 24, RULE_foreachStatement = 25, RULE_whileStatement = 26, 
		RULE_doStatement = 27, RULE_switchStatement = 28, RULE_caseStatement = 29, 
		RULE_conditionAndBlock = 30, RULE_singleLineOrBlockBody = 31, RULE_assignment = 32, 
		RULE_assign = 33, RULE_functionCall = 34, RULE_callParameter = 35, RULE_condition = 36, 
		RULE_comparator = 37, RULE_comparison = 38, RULE_expression = 39, RULE_additiveExpression = 40, 
		RULE_multiplicativeExpression = 41, RULE_unaryExpression = 42, RULE_preUnaryExpression = 43, 
		RULE_postUnaryExpression = 44, RULE_term = 45, RULE_passByReference = 46, 
		RULE_passByValue = 47, RULE_ternaryExpression = 48, RULE_declarationStatement = 49, 
		RULE_declarationStatementSingular = 50, RULE_identifierList = 51, RULE_castSpecifier = 52, 
		RULE_arraySpecifier = 53, RULE_identifierSpecifier = 54, RULE_literal = 55, 
		RULE_integerLiteral = 56, RULE_floatLiteral = 57, RULE_variableType = 58, 
		RULE_entityModifier = 59, RULE_classOrInterface = 60, RULE_visibilityModifier = 61, 
		RULE_methodModifier = 62, RULE_methodType = 63, RULE_primitiveType = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "importLine", "packageHeader", "entityHeader", "extensions", 
			"entityBody", "declarationHeader", "declarationLine", "declarationTag", 
			"entityMethods", "definedFunctionHeaders", "constructorHeader", "deconstructorHeader", 
			"methodHeader", "declarationParameters", "body", "line", "statement", 
			"builtinFunctions", "iteratorBlock", "newLine", "ifStatement", "elseIfStatement", 
			"elseStatement", "forStatement", "foreachStatement", "whileStatement", 
			"doStatement", "switchStatement", "caseStatement", "conditionAndBlock", 
			"singleLineOrBlockBody", "assignment", "assign", "functionCall", "callParameter", 
			"condition", "comparator", "comparison", "expression", "additiveExpression", 
			"multiplicativeExpression", "unaryExpression", "preUnaryExpression", 
			"postUnaryExpression", "term", "passByReference", "passByValue", "ternaryExpression", 
			"declarationStatement", "declarationStatementSingular", "identifierList", 
			"castSpecifier", "arraySpecifier", "identifierSpecifier", "literal", 
			"integerLiteral", "floatLiteral", "variableType", "entityModifier", "classOrInterface", 
			"visibilityModifier", "methodModifier", "methodType", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'byte'", "'char'", "'double'", "'int'", "'long'", 
			"'short'", "'string'", "'void'", "'private'", "'protected'", "'public'", 
			"'abstract'", "'final'", "'override'", "'interface'", "'static'", "'synchronized'", 
			"'as'", "'assert'", "'break'", "'case'", "'catch'", "'class'", "'cold'", 
			"'const'", "'continue'", "'default'", "'do'", "'else'", "'enum'", "'extends'", 
			"'finally'", "'float'", "'for'", "'hot'", "'if'", "'implements'", "'import'", 
			"'iter'", "'new'", "'package'", "'return'", "'struct'", "'super'", "'switch'", 
			"'this'", "'throw'", "'throws'", "'try'", "'while'", null, null, null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'<<'", "'>>'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "INT", "LONG", "SHORT", "STRING", 
			"VOID", "PRIVATE", "PROTECTED", "PUBLIC", "ABSTRACT", "FINAL", "OVERRIDE", 
			"INTERFACE", "STATIC", "SYNCHRONIZED", "AS", "ASSERT", "BREAK", "CASE", 
			"CATCH", "CLASS", "COLD", "CONST", "CONTINUE", "DEFAULT", "DO", "ELSE", 
			"ENUM", "EXTENDS", "FINALLY", "FLOAT", "FOR", "HOT", "IF", "IMPLEMENTS", 
			"IMPORT", "ITER", "NEW", "PACKAGE", "RETURN", "STRUCT", "SUPER", "SWITCH", 
			"THIS", "THROW", "THROWS", "TRY", "WHILE", "INTEGER_LITERAL", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GREATER", "LESSER", "EXCLAMATION", "TILDE", "QUESTION", "COLON", 
			"EQUAL", "LESSEREQUAL", "GREATEREQUAL", "NOTEQUAL", "AND", "OR", "INCREMENT", 
			"DECREMENT", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "LSHIFT", "RSHIFT", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
			"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Whitespace", "MULTI_COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FlareParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlareParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<ImportLineContext> importLine() {
			return getRuleContexts(ImportLineContext.class);
		}
		public ImportLineContext importLine(int i) {
			return getRuleContext(ImportLineContext.class,i);
		}
		public List<PackageHeaderContext> packageHeader() {
			return getRuleContexts(PackageHeaderContext.class);
		}
		public PackageHeaderContext packageHeader(int i) {
			return getRuleContext(PackageHeaderContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(130);
				importLine();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << INTERFACE) | (1L << STATIC) | (1L << CLASS) | (1L << PACKAGE))) != 0)) {
				{
				{
				setState(136);
				packageHeader();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportLineContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(FlareParser.IMPORT, 0); }
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FlareParser.SEMI, 0); }
		public TerminalNode AS() { return getToken(FlareParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public ImportLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitImportLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportLineContext importLine() throws RecognitionException {
		ImportLineContext _localctx = new ImportLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IMPORT);
			setState(143);
			identifierSpecifier();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(144);
				match(AS);
				setState(145);
				match(IDENTIFIER);
				}
			}

			setState(148);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageHeaderContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(FlareParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(FlareParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FlareParser.RBRACE, 0); }
		public List<EntityHeaderContext> entityHeader() {
			return getRuleContexts(EntityHeaderContext.class);
		}
		public EntityHeaderContext entityHeader(int i) {
			return getRuleContext(EntityHeaderContext.class,i);
		}
		public PackageHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitPackageHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageHeaderContext packageHeader() throws RecognitionException {
		PackageHeaderContext _localctx = new PackageHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageHeader);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(PACKAGE);
				setState(151);
				match(IDENTIFIER);
				setState(152);
				match(LBRACE);
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					entityHeader();
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << INTERFACE) | (1L << STATIC) | (1L << CLASS))) != 0) );
				setState(158);
				match(RBRACE);
				}
				break;
			case ABSTRACT:
			case FINAL:
			case INTERFACE:
			case STATIC:
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				entityHeader();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityHeaderContext extends ParserRuleContext {
		public ClassOrInterfaceContext classOrInterface() {
			return getRuleContext(ClassOrInterfaceContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(FlareParser.LBRACE, 0); }
		public EntityBodyContext entityBody() {
			return getRuleContext(EntityBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FlareParser.RBRACE, 0); }
		public EntityModifierContext entityModifier() {
			return getRuleContext(EntityModifierContext.class,0);
		}
		public ExtensionsContext extensions() {
			return getRuleContext(ExtensionsContext.class,0);
		}
		public EntityHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitEntityHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityHeaderContext entityHeader() throws RecognitionException {
		EntityHeaderContext _localctx = new EntityHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entityHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << STATIC))) != 0)) {
				{
				setState(163);
				entityModifier();
				}
			}

			setState(166);
			classOrInterface();
			setState(167);
			match(IDENTIFIER);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==IMPLEMENTS) {
				{
				setState(168);
				extensions();
				}
			}

			setState(171);
			match(LBRACE);
			setState(172);
			entityBody();
			setState(173);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(FlareParser.EXTENDS, 0); }
		public List<IdentifierSpecifierContext> identifierSpecifier() {
			return getRuleContexts(IdentifierSpecifierContext.class);
		}
		public IdentifierSpecifierContext identifierSpecifier(int i) {
			return getRuleContext(IdentifierSpecifierContext.class,i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(FlareParser.IMPLEMENTS, 0); }
		public ExtensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitExtensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionsContext extensions() throws RecognitionException {
		ExtensionsContext _localctx = new ExtensionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_extensions);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(EXTENDS);
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					identifierSpecifier();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SUPER || _la==THIS || _la==IDENTIFIER );
				}
				break;
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(IMPLEMENTS);
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					identifierSpecifier();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SUPER || _la==THIS || _la==IDENTIFIER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityBodyContext extends ParserRuleContext {
		public DeclarationHeaderContext declarationHeader() {
			return getRuleContext(DeclarationHeaderContext.class,0);
		}
		public List<EntityMethodsContext> entityMethods() {
			return getRuleContexts(EntityMethodsContext.class);
		}
		public EntityMethodsContext entityMethods(int i) {
			return getRuleContext(EntityMethodsContext.class,i);
		}
		public EntityBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitEntityBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityBodyContext entityBody() throws RecognitionException {
		EntityBodyContext _localctx = new EntityBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entityBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRUCT) {
				{
				setState(189);
				declarationHeader();
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << VOID) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << OVERRIDE) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << FLOAT))) != 0) || _la==TILDE || _la==IDENTIFIER) {
				{
				{
				setState(192);
				entityMethods();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationHeaderContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(FlareParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(FlareParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FlareParser.RBRACE, 0); }
		public List<DeclarationLineContext> declarationLine() {
			return getRuleContexts(DeclarationLineContext.class);
		}
		public DeclarationLineContext declarationLine(int i) {
			return getRuleContext(DeclarationLineContext.class,i);
		}
		public DeclarationHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDeclarationHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationHeaderContext declarationHeader() throws RecognitionException {
		DeclarationHeaderContext _localctx = new DeclarationHeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(STRUCT);
			setState(199);
			match(LBRACE);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << COLD) | (1L << FLOAT) | (1L << HOT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(200);
				declarationLine();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationLineContext extends ParserRuleContext {
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FlareParser.SEMI, 0); }
		public DeclarationTagContext declarationTag() {
			return getRuleContext(DeclarationTagContext.class,0);
		}
		public DeclarationLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDeclarationLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationLineContext declarationLine() throws RecognitionException {
		DeclarationLineContext _localctx = new DeclarationLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarationLine);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case FLOAT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				declarationStatement();
				setState(209);
				match(SEMI);
				}
				break;
			case COLD:
			case HOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				declarationTag();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationTagContext extends ParserRuleContext {
		public TerminalNode COLD() { return getToken(FlareParser.COLD, 0); }
		public TerminalNode COLON() { return getToken(FlareParser.COLON, 0); }
		public TerminalNode HOT() { return getToken(FlareParser.HOT, 0); }
		public DeclarationTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDeclarationTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTagContext declarationTag() throws RecognitionException {
		DeclarationTagContext _localctx = new DeclarationTagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarationTag);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(COLD);
				setState(215);
				match(COLON);
				}
				break;
			case HOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(HOT);
				setState(217);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityMethodsContext extends ParserRuleContext {
		public DefinedFunctionHeadersContext definedFunctionHeaders() {
			return getRuleContext(DefinedFunctionHeadersContext.class,0);
		}
		public DeclarationParametersContext declarationParameters() {
			return getRuleContext(DeclarationParametersContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public EntityMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityMethods; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitEntityMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityMethodsContext entityMethods() throws RecognitionException {
		EntityMethodsContext _localctx = new EntityMethodsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entityMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			definedFunctionHeaders();
			setState(221);
			declarationParameters();
			setState(222);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinedFunctionHeadersContext extends ParserRuleContext {
		public ConstructorHeaderContext constructorHeader() {
			return getRuleContext(ConstructorHeaderContext.class,0);
		}
		public DeconstructorHeaderContext deconstructorHeader() {
			return getRuleContext(DeconstructorHeaderContext.class,0);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public DefinedFunctionHeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedFunctionHeaders; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDefinedFunctionHeaders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinedFunctionHeadersContext definedFunctionHeaders() throws RecognitionException {
		DefinedFunctionHeadersContext _localctx = new DefinedFunctionHeadersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_definedFunctionHeaders);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				constructorHeader();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				deconstructorHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				methodHeader();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorHeaderContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public ConstructorHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitConstructorHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorHeaderContext constructorHeader() throws RecognitionException {
		ConstructorHeaderContext _localctx = new ConstructorHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(229);
				visibilityModifier();
				}
			}

			setState(232);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeconstructorHeaderContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(FlareParser.TILDE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public DeconstructorHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deconstructorHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDeconstructorHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeconstructorHeaderContext deconstructorHeader() throws RecognitionException {
		DeconstructorHeaderContext _localctx = new DeconstructorHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_deconstructorHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(234);
				visibilityModifier();
				}
			}

			setState(237);
			match(TILDE);
			setState(238);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public MethodModifierContext methodModifier() {
			return getRuleContext(MethodModifierContext.class,0);
		}
		public CastSpecifierContext castSpecifier() {
			return getRuleContext(CastSpecifierContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(240);
				visibilityModifier();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << OVERRIDE) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(243);
				methodModifier();
				}
			}

			setState(246);
			methodType();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSER) {
				{
				setState(247);
				castSpecifier();
				}
			}

			setState(250);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public List<DeclarationStatementSingularContext> declarationStatementSingular() {
			return getRuleContexts(DeclarationStatementSingularContext.class);
		}
		public DeclarationStatementSingularContext declarationStatementSingular(int i) {
			return getRuleContext(DeclarationStatementSingularContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlareParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlareParser.COMMA, i);
		}
		public DeclarationParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDeclarationParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationParametersContext declarationParameters() throws RecognitionException {
		DeclarationParametersContext _localctx = new DeclarationParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declarationParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LPAREN);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << FLOAT))) != 0) || _la==IDENTIFIER) {
				{
				setState(253);
				declarationStatementSingular();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(254);
					match(COMMA);
					setState(255);
					declarationStatementSingular();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(263);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FlareParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FlareParser.RBRACE, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LBRACE);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << ASSERT) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << WHILE))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (INCREMENT - 85)) | (1L << (DECREMENT - 85)) | (1L << (IDENTIFIER - 85)))) != 0)) {
				{
				{
				setState(266);
				line();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FlareParser.SEMI, 0); }
		public BuiltinFunctionsContext builtinFunctions() {
			return getRuleContext(BuiltinFunctionsContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_line);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case FLOAT:
			case SUPER:
			case THIS:
			case INCREMENT:
			case DECREMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				statement();
				setState(275);
				match(SEMI);
				}
				break;
			case ASSERT:
			case DO:
			case FOR:
			case IF:
			case SWITCH:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				builtinFunctions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				declarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltinFunctionsContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(FlareParser.ASSERT, 0); }
		public BuiltinFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinFunctions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitBuiltinFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltinFunctionsContext builtinFunctions() throws RecognitionException {
		BuiltinFunctionsContext _localctx = new BuiltinFunctionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_builtinFunctions);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				forStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				foreachStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				doStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				switchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				match(ASSERT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratorBlockContext extends ParserRuleContext {
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public IteratorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitIteratorBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorBlockContext iteratorBlock() throws RecognitionException {
		IteratorBlockContext _localctx = new IteratorBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iteratorBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			arraySpecifier();
			setState(295);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewLineContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FlareParser.NEW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_newLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(NEW);
			setState(298);
			functionCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FlareParser.IF, 0); }
		public ConditionAndBlockContext conditionAndBlock() {
			return getRuleContext(ConditionAndBlockContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IF);
			setState(301);
			conditionAndBlock();
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					elseIfStatement();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(308);
				elseStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FlareParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(FlareParser.IF, 0); }
		public ConditionAndBlockContext conditionAndBlock() {
			return getRuleContext(ConditionAndBlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(ELSE);
			setState(312);
			match(IF);
			setState(313);
			conditionAndBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FlareParser.ELSE, 0); }
		public SingleLineOrBlockBodyContext singleLineOrBlockBody() {
			return getRuleContext(SingleLineOrBlockBodyContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ELSE);
			setState(316);
			singleLineOrBlockBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FlareParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(FlareParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(FlareParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public SingleLineOrBlockBodyContext singleLineOrBlockBody() {
			return getRuleContext(SingleLineOrBlockBodyContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(FOR);
			setState(319);
			match(LPAREN);
			setState(320);
			match(SEMI);
			setState(321);
			match(SEMI);
			setState(322);
			match(SEMI);
			setState(323);
			match(RPAREN);
			setState(324);
			singleLineOrBlockBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FlareParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FlareParser.SEMI, 0); }
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public SingleLineOrBlockBodyContext singleLineOrBlockBody() {
			return getRuleContext(SingleLineOrBlockBodyContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FOR);
			setState(327);
			match(LPAREN);
			setState(328);
			declarationStatement();
			setState(329);
			match(SEMI);
			setState(330);
			identifierSpecifier();
			setState(331);
			match(RPAREN);
			setState(332);
			singleLineOrBlockBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FlareParser.WHILE, 0); }
		public ConditionAndBlockContext conditionAndBlock() {
			return getRuleContext(ConditionAndBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(WHILE);
			setState(335);
			conditionAndBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(FlareParser.DO, 0); }
		public SingleLineOrBlockBodyContext singleLineOrBlockBody() {
			return getRuleContext(SingleLineOrBlockBodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(FlareParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(DO);
			setState(338);
			singleLineOrBlockBody();
			setState(339);
			match(WHILE);
			setState(340);
			match(LPAREN);
			setState(341);
			condition();
			setState(342);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(FlareParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(FlareParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FlareParser.RBRACE, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(SWITCH);
			setState(345);
			match(LPAREN);
			setState(346);
			identifierSpecifier();
			setState(347);
			match(RPAREN);
			setState(348);
			match(LBRACE);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(349);
				caseStatement();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FlareParser.CASE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FlareParser.COLON, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(FlareParser.DEFAULT, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseStatement);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(CASE);
				setState(358);
				literal();
				setState(359);
				match(COLON);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << ASSERT) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << WHILE))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (INCREMENT - 85)) | (1L << (DECREMENT - 85)) | (1L << (IDENTIFIER - 85)))) != 0)) {
					{
					{
					setState(360);
					line();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(DEFAULT);
				setState(367);
				match(COLON);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << ASSERT) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << WHILE))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (INCREMENT - 85)) | (1L << (DECREMENT - 85)) | (1L << (IDENTIFIER - 85)))) != 0)) {
					{
					{
					setState(368);
					line();
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionAndBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public SingleLineOrBlockBodyContext singleLineOrBlockBody() {
			return getRuleContext(SingleLineOrBlockBodyContext.class,0);
		}
		public ConditionAndBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionAndBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitConditionAndBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionAndBlockContext conditionAndBlock() throws RecognitionException {
		ConditionAndBlockContext _localctx = new ConditionAndBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditionAndBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(LPAREN);
			setState(377);
			condition();
			setState(378);
			match(RPAREN);
			setState(379);
			singleLineOrBlockBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLineOrBlockBodyContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public SingleLineOrBlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineOrBlockBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitSingleLineOrBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLineOrBlockBodyContext singleLineOrBlockBody() throws RecognitionException {
		SingleLineOrBlockBodyContext _localctx = new SingleLineOrBlockBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_singleLineOrBlockBody);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				body();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case ASSERT:
			case DO:
			case FLOAT:
			case FOR:
			case IF:
			case SUPER:
			case SWITCH:
			case THIS:
			case WHILE:
			case INCREMENT:
			case DECREMENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public DeclarationStatementSingularContext declarationStatementSingular() {
			return getRuleContext(DeclarationStatementSingularContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PassByReferenceContext passByReference() {
			return getRuleContext(PassByReferenceContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				declarationStatementSingular();
				setState(386);
				assign();
				setState(387);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				passByReference();
				setState(390);
				assign();
				setState(391);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				unaryExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(FlareParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(FlareParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(FlareParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(FlareParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(FlareParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(FlareParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(FlareParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(FlareParser.XOR_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FlareParser.MOD_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(FlareParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(FlareParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(FlareParser.URSHIFT_ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ASSIGN - 72)) | (1L << (ADD_ASSIGN - 72)) | (1L << (SUB_ASSIGN - 72)) | (1L << (MUL_ASSIGN - 72)) | (1L << (DIV_ASSIGN - 72)) | (1L << (AND_ASSIGN - 72)) | (1L << (OR_ASSIGN - 72)) | (1L << (XOR_ASSIGN - 72)) | (1L << (MOD_ASSIGN - 72)) | (1L << (LSHIFT_ASSIGN - 72)) | (1L << (RSHIFT_ASSIGN - 72)) | (1L << (URSHIFT_ASSIGN - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public CallParameterContext callParameter() {
			return getRuleContext(CallParameterContext.class,0);
		}
		public CastSpecifierContext castSpecifier() {
			return getRuleContext(CastSpecifierContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			identifierSpecifier();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSER) {
				{
				setState(399);
				castSpecifier();
				}
			}

			setState(402);
			callParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallParameterContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlareParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlareParser.COMMA, i);
		}
		public CallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitCallParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParameterContext callParameter() throws RecognitionException {
		CallParameterContext _localctx = new CallParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_callParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(LPAREN);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(405);
				expression();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(406);
					match(COMMA);
					setState(407);
					expression();
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(415);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ComparatorContext> comparator() {
			return getRuleContexts(ComparatorContext.class);
		}
		public ComparatorContext comparator(int i) {
			return getRuleContext(ComparatorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FlareParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FlareParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(FlareParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FlareParser.OR, i);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(FlareParser.BOOL_LITERAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_condition);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				comparator();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(418);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(419);
					comparator();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(BOOL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comparator);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				expression();
				setState(429);
				comparison();
				setState(430);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(LPAREN);
				setState(433);
				condition();
				setState(434);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(FlareParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(FlareParser.NOTEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(FlareParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(FlareParser.LESSER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(FlareParser.GREATEREQUAL, 0); }
		public TerminalNode LESSEREQUAL() { return getToken(FlareParser.LESSEREQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (GREATER - 73)) | (1L << (LESSER - 73)) | (1L << (EQUAL - 73)) | (1L << (LESSEREQUAL - 73)) | (1L << (GREATEREQUAL - 73)) | (1L << (NOTEQUAL - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public IteratorBlockContext iteratorBlock() {
			return getRuleContext(IteratorBlockContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expression);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				additiveExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				iteratorBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				newLine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
				ternaryExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				unaryExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(FlareParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(FlareParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(FlareParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(FlareParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			multiplicativeExpression();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(448);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(449);
				multiplicativeExpression();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(FlareParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(FlareParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(FlareParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(FlareParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(FlareParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(FlareParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			term();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) {
				{
				{
				setState(456);
				_la = _input.LA(1);
				if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				term();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unaryExpression);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				preUnaryExpression();
				}
				break;
			case SUPER:
			case THIS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				postUnaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(FlareParser.INCREMENT, 0); }
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(FlareParser.DECREMENT, 0); }
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_preUnaryExpression);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(INCREMENT);
				setState(468);
				identifierSpecifier();
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(DECREMENT);
				setState(470);
				identifierSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(FlareParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(FlareParser.DECREMENT, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_postUnaryExpression);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				identifierSpecifier();
				setState(474);
				match(INCREMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				identifierSpecifier();
				setState(477);
				match(DECREMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PassByReferenceContext passByReference() {
			return getRuleContext(PassByReferenceContext.class,0);
		}
		public PassByValueContext passByValue() {
			return getRuleContext(PassByValueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_term);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				passByReference();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				passByValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				match(LPAREN);
				setState(486);
				expression();
				setState(487);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassByReferenceContext extends ParserRuleContext {
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public PassByReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passByReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitPassByReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassByReferenceContext passByReference() throws RecognitionException {
		PassByReferenceContext _localctx = new PassByReferenceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_passByReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			identifierSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassByValueContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(FlareParser.BITAND, 0); }
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public TerminalNode ITER() { return getToken(FlareParser.ITER, 0); }
		public PassByValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passByValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitPassByValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassByValueContext passByValue() throws RecognitionException {
		PassByValueContext _localctx = new PassByValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_passByValue);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(BITAND);
				setState(494);
				identifierSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(BITAND);
				setState(496);
				match(ITER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public TerminalNode QUESTION() { return getToken(FlareParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FlareParser.COLON, 0); }
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ternaryExpression);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(LPAREN);
				setState(500);
				condition();
				setState(501);
				match(RPAREN);
				setState(502);
				match(QUESTION);
				setState(503);
				expression();
				setState(504);
				match(COLON);
				setState(505);
				expression();
				}
				break;
			case RPAREN:
			case SEMI:
			case COMMA:
			case GREATER:
			case LESSER:
			case COLON:
			case EQUAL:
			case LESSEREQUAL:
			case GREATEREQUAL:
			case NOTEQUAL:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public CastSpecifierContext castSpecifier() {
			return getRuleContext(CastSpecifierContext.class,0);
		}
		public List<ArraySpecifierContext> arraySpecifier() {
			return getRuleContexts(ArraySpecifierContext.class);
		}
		public ArraySpecifierContext arraySpecifier(int i) {
			return getRuleContext(ArraySpecifierContext.class,i);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			variableType();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSER) {
				{
				setState(511);
				castSpecifier();
				}
			}

			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(514);
				arraySpecifier();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementSingularContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public List<ArraySpecifierContext> arraySpecifier() {
			return getRuleContexts(ArraySpecifierContext.class);
		}
		public ArraySpecifierContext arraySpecifier(int i) {
			return getRuleContext(ArraySpecifierContext.class,i);
		}
		public DeclarationStatementSingularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatementSingular; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDeclarationStatementSingular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementSingularContext declarationStatementSingular() throws RecognitionException {
		DeclarationStatementSingularContext _localctx = new DeclarationStatementSingularContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declarationStatementSingular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			variableType();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(523);
				arraySpecifier();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FlareParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FlareParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlareParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlareParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(IDENTIFIER);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(532);
				match(COMMA);
				setState(533);
				match(IDENTIFIER);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastSpecifierContext extends ParserRuleContext {
		public TerminalNode LESSER() { return getToken(FlareParser.LESSER, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(FlareParser.GREATER, 0); }
		public CastSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitCastSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastSpecifierContext castSpecifier() throws RecognitionException {
		CastSpecifierContext _localctx = new CastSpecifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_castSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(LESSER);
			setState(540);
			variableType();
			setState(541);
			match(GREATER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraySpecifierContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FlareParser.LBRACK, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(FlareParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(FlareParser.INTEGER_LITERAL, i);
		}
		public TerminalNode RBRACK() { return getToken(FlareParser.RBRACK, 0); }
		public TerminalNode COMMA() { return getToken(FlareParser.COMMA, 0); }
		public ArraySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitArraySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySpecifierContext arraySpecifier() throws RecognitionException {
		ArraySpecifierContext _localctx = new ArraySpecifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_arraySpecifier);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(LBRACK);
				setState(544);
				match(INTEGER_LITERAL);
				setState(545);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(LBRACK);
				setState(547);
				match(COMMA);
				setState(548);
				match(INTEGER_LITERAL);
				setState(549);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				match(LBRACK);
				setState(551);
				match(INTEGER_LITERAL);
				setState(552);
				match(COMMA);
				setState(553);
				match(INTEGER_LITERAL);
				setState(554);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FlareParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FlareParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(FlareParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FlareParser.DOT, i);
		}
		public TerminalNode THIS() { return getToken(FlareParser.THIS, 0); }
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(FlareParser.SUPER, 0); }
		public IdentifierSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitIdentifierSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSpecifierContext identifierSpecifier() throws RecognitionException {
		IdentifierSpecifierContext _localctx = new IdentifierSpecifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_identifierSpecifier);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(IDENTIFIER);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(558);
					match(DOT);
					setState(559);
					match(IDENTIFIER);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(THIS);
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(566);
					match(DOT);
					setState(567);
					identifierSpecifier();
					}
				}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(SUPER);
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(571);
					match(DOT);
					setState(572);
					identifierSpecifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(FlareParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FlareParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(FlareParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(FlareParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(FlareParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(FlareParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(FlareParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(FlareParser.BINARY_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(FlareParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(FlareParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(FlareParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(FlareParser.STRING, 0); }
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableType);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case INT:
			case LONG:
			case SHORT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(FlareParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(FlareParser.FINAL, 0); }
		public TerminalNode STATIC() { return getToken(FlareParser.STATIC, 0); }
		public EntityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitEntityModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityModifierContext entityModifier() throws RecognitionException {
		EntityModifierContext _localctx = new EntityModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_entityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FlareParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(FlareParser.INTERFACE, 0); }
		public ClassOrInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterface; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitClassOrInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceContext classOrInterface() throws RecognitionException {
		ClassOrInterfaceContext _localctx = new ClassOrInterfaceContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_classOrInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if ( !(_la==INTERFACE || _la==CLASS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(FlareParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(FlareParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(FlareParser.PUBLIC, 0); }
		public VisibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitVisibilityModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityModifierContext visibilityModifier() throws RecognitionException {
		VisibilityModifierContext _localctx = new VisibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(FlareParser.ABSTRACT, 0); }
		public TerminalNode OVERRIDE() { return getToken(FlareParser.OVERRIDE, 0); }
		public TerminalNode STATIC() { return getToken(FlareParser.STATIC, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(FlareParser.SYNCHRONIZED, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << OVERRIDE) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodTypeContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(FlareParser.VOID, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_methodType);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case FLOAT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				variableType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(FlareParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(FlareParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(FlareParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(FlareParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(FlareParser.INT, 0); }
		public TerminalNode LONG() { return getToken(FlareParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(FlareParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(FlareParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u0263\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\7\2\u0086\n\2\f\2\16\2\u0089\13\2\3"+
		"\2\7\2\u008c\n\2\f\2\16\2\u008f\13\2\3\3\3\3\3\3\3\3\5\3\u0095\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\6\4\u009d\n\4\r\4\16\4\u009e\3\4\3\4\3\4\5\4\u00a4"+
		"\n\4\3\5\5\5\u00a7\n\5\3\5\3\5\3\5\5\5\u00ac\n\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\6\6\u00b4\n\6\r\6\16\6\u00b5\3\6\3\6\6\6\u00ba\n\6\r\6\16\6\u00bb\5"+
		"\6\u00be\n\6\3\7\5\7\u00c1\n\7\3\7\7\7\u00c4\n\7\f\7\16\7\u00c7\13\7\3"+
		"\b\3\b\3\b\7\b\u00cc\n\b\f\b\16\b\u00cf\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5"+
		"\t\u00d7\n\t\3\n\3\n\3\n\3\n\5\n\u00dd\n\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\5\f\u00e6\n\f\3\r\5\r\u00e9\n\r\3\r\3\r\3\16\5\16\u00ee\n\16\3\16"+
		"\3\16\3\16\3\17\5\17\u00f4\n\17\3\17\5\17\u00f7\n\17\3\17\3\17\5\17\u00fb"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0103\n\20\f\20\16\20\u0106\13"+
		"\20\5\20\u0108\n\20\3\20\3\20\3\21\3\21\7\21\u010e\n\21\f\21\16\21\u0111"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0119\n\22\3\23\3\23\3\23\5"+
		"\23\u011e\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0127\n\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0132\n\27\f\27\16\27\u0135"+
		"\13\27\3\27\5\27\u0138\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\7\36\u0161\n\36\f\36\16\36\u0164\13\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\7\37\u016c\n\37\f\37\16\37\u016f\13\37\3\37\3\37\3\37\7"+
		"\37\u0174\n\37\f\37\16\37\u0177\13\37\5\37\u0179\n\37\3 \3 \3 \3 \3 \3"+
		"!\3!\5!\u0182\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u018d\n\"\3#"+
		"\3#\3$\3$\5$\u0193\n$\3$\3$\3%\3%\3%\3%\7%\u019b\n%\f%\16%\u019e\13%\5"+
		"%\u01a0\n%\3%\3%\3&\3&\3&\7&\u01a7\n&\f&\16&\u01aa\13&\3&\5&\u01ad\n&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b7\n\'\3(\3(\3)\3)\3)\3)\3)\5"+
		")\u01c0\n)\3*\3*\3*\7*\u01c5\n*\f*\16*\u01c8\13*\3+\3+\3+\7+\u01cd\n+"+
		"\f+\16+\u01d0\13+\3,\3,\5,\u01d4\n,\3-\3-\3-\3-\5-\u01da\n-\3.\3.\3.\3"+
		".\3.\3.\5.\u01e2\n.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01ec\n/\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\5\61\u01f4\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u01ff\n\62\3\63\3\63\5\63\u0203\n\63\3\63\7\63\u0206\n\63\f"+
		"\63\16\63\u0209\13\63\3\63\3\63\3\64\3\64\7\64\u020f\n\64\f\64\16\64\u0212"+
		"\13\64\3\64\3\64\3\65\3\65\3\65\7\65\u0219\n\65\f\65\16\65\u021c\13\65"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u022e\n\67\38\38\38\78\u0233\n8\f8\168\u0236\138\38\3"+
		"8\38\58\u023b\n8\38\38\38\58\u0240\n8\58\u0242\n8\39\39\39\39\39\39\5"+
		"9\u024a\n9\3:\3:\3;\3;\3<\3<\3<\5<\u0253\n<\3=\3=\3>\3>\3?\3?\3@\3@\3"+
		"A\3A\5A\u025f\nA\3B\3B\3B\2\2C\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\2\16\4\2JJcm\3\2UV\4\2KLQT\3\2YZ\4\2[\\``\3\2\66:\3\2;<\4\2\17\20\23"+
		"\23\4\2\22\22\32\32\3\2\f\16\5\2\17\17\21\21\23\24\4\2\3\t$$\2\u0274\2"+
		"\u0087\3\2\2\2\4\u0090\3\2\2\2\6\u00a3\3\2\2\2\b\u00a6\3\2\2\2\n\u00bd"+
		"\3\2\2\2\f\u00c0\3\2\2\2\16\u00c8\3\2\2\2\20\u00d6\3\2\2\2\22\u00dc\3"+
		"\2\2\2\24\u00de\3\2\2\2\26\u00e5\3\2\2\2\30\u00e8\3\2\2\2\32\u00ed\3\2"+
		"\2\2\34\u00f3\3\2\2\2\36\u00fe\3\2\2\2 \u010b\3\2\2\2\"\u0118\3\2\2\2"+
		"$\u011d\3\2\2\2&\u0126\3\2\2\2(\u0128\3\2\2\2*\u012b\3\2\2\2,\u012e\3"+
		"\2\2\2.\u0139\3\2\2\2\60\u013d\3\2\2\2\62\u0140\3\2\2\2\64\u0148\3\2\2"+
		"\2\66\u0150\3\2\2\28\u0153\3\2\2\2:\u015a\3\2\2\2<\u0178\3\2\2\2>\u017a"+
		"\3\2\2\2@\u0181\3\2\2\2B\u018c\3\2\2\2D\u018e\3\2\2\2F\u0190\3\2\2\2H"+
		"\u0196\3\2\2\2J\u01ac\3\2\2\2L\u01b6\3\2\2\2N\u01b8\3\2\2\2P\u01bf\3\2"+
		"\2\2R\u01c1\3\2\2\2T\u01c9\3\2\2\2V\u01d3\3\2\2\2X\u01d9\3\2\2\2Z\u01e1"+
		"\3\2\2\2\\\u01eb\3\2\2\2^\u01ed\3\2\2\2`\u01f3\3\2\2\2b\u01fe\3\2\2\2"+
		"d\u0200\3\2\2\2f\u020c\3\2\2\2h\u0215\3\2\2\2j\u021d\3\2\2\2l\u022d\3"+
		"\2\2\2n\u0241\3\2\2\2p\u0249\3\2\2\2r\u024b\3\2\2\2t\u024d\3\2\2\2v\u0252"+
		"\3\2\2\2x\u0254\3\2\2\2z\u0256\3\2\2\2|\u0258\3\2\2\2~\u025a\3\2\2\2\u0080"+
		"\u025e\3\2\2\2\u0082\u0260\3\2\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\6\4\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\3\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7)\2\2\u0091\u0094\5n8\2\u0092"+
		"\u0093\7\25\2\2\u0093\u0095\7q\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7G\2\2\u0097\5\3\2\2\2\u0098\u0099"+
		"\7,\2\2\u0099\u009a\7q\2\2\u009a\u009c\7C\2\2\u009b\u009d\5\b\5\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7D\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a4\5\b\5\2\u00a3\u0098\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\7\3\2\2\2"+
		"\u00a5\u00a7\5x=\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\5z>\2\u00a9\u00ab\7q\2\2\u00aa\u00ac\5\n\6\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7C"+
		"\2\2\u00ae\u00af\5\f\7\2\u00af\u00b0\7D\2\2\u00b0\t\3\2\2\2\u00b1\u00b3"+
		"\7\"\2\2\u00b2\u00b4\5n8\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00be\3\2\2\2\u00b7\u00b9\7("+
		"\2\2\u00b8\u00ba\5n8\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00be\13\3\2\2\2\u00bf\u00c1\5\16\b\2\u00c0\u00bf\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\5\24\13\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\r\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7.\2\2\u00c9\u00cd"+
		"\7C\2\2\u00ca\u00cc\5\20\t\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d1\7D\2\2\u00d1\17\3\2\2\2\u00d2\u00d3\5d\63\2\u00d3\u00d4"+
		"\7G\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\5\22\n\2\u00d6\u00d2\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00d9\7\33\2\2\u00d9\u00dd\7P\2"+
		"\2\u00da\u00db\7&\2\2\u00db\u00dd\7P\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\23\3\2\2\2\u00de\u00df\5\26\f\2\u00df\u00e0\5\36\20\2\u00e0"+
		"\u00e1\5 \21\2\u00e1\25\3\2\2\2\u00e2\u00e6\5\30\r\2\u00e3\u00e6\5\32"+
		"\16\2\u00e4\u00e6\5\34\17\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\27\3\2\2\2\u00e7\u00e9\5|?\2\u00e8\u00e7\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7q\2\2\u00eb\31\3"+
		"\2\2\2\u00ec\u00ee\5|?\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\7N\2\2\u00f0\u00f1\7q\2\2\u00f1\33\3\2\2\2"+
		"\u00f2\u00f4\5|?\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f7\5~@\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\5\u0080A\2\u00f9\u00fb\5j\66\2\u00fa\u00f9"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		"\35\3\2\2\2\u00fe\u0107\7A\2\2\u00ff\u0104\5f\64\2\u0100\u0101\7H\2\2"+
		"\u0101\u0103\5f\64\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u00ff\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7B"+
		"\2\2\u010a\37\3\2\2\2\u010b\u010f\7C\2\2\u010c\u010e\5\"\22\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7D\2\2\u0113!\3\2\2\2\u0114"+
		"\u0115\5$\23\2\u0115\u0116\7G\2\2\u0116\u0119\3\2\2\2\u0117\u0119\5&\24"+
		"\2\u0118\u0114\3\2\2\2\u0118\u0117\3\2\2\2\u0119#\3\2\2\2\u011a\u011e"+
		"\5d\63\2\u011b\u011e\5B\"\2\u011c\u011e\5F$\2\u011d\u011a\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e%\3\2\2\2\u011f\u0127\5,\27\2"+
		"\u0120\u0127\5\62\32\2\u0121\u0127\5\64\33\2\u0122\u0127\5\66\34\2\u0123"+
		"\u0127\58\35\2\u0124\u0127\5:\36\2\u0125\u0127\7\26\2\2\u0126\u011f\3"+
		"\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\'\3\2\2\2"+
		"\u0128\u0129\5l\67\2\u0129\u012a\5 \21\2\u012a)\3\2\2\2\u012b\u012c\7"+
		"+\2\2\u012c\u012d\5F$\2\u012d+\3\2\2\2\u012e\u012f\7\'\2\2\u012f\u0133"+
		"\5> \2\u0130\u0132\5.\30\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0138\5\60\31\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"-\3\2\2\2\u0139\u013a\7 \2\2\u013a\u013b\7\'\2\2\u013b\u013c\5> \2\u013c"+
		"/\3\2\2\2\u013d\u013e\7 \2\2\u013e\u013f\5@!\2\u013f\61\3\2\2\2\u0140"+
		"\u0141\7%\2\2\u0141\u0142\7A\2\2\u0142\u0143\7G\2\2\u0143\u0144\7G\2\2"+
		"\u0144\u0145\7G\2\2\u0145\u0146\7B\2\2\u0146\u0147\5@!\2\u0147\63\3\2"+
		"\2\2\u0148\u0149\7%\2\2\u0149\u014a\7A\2\2\u014a\u014b\5d\63\2\u014b\u014c"+
		"\7G\2\2\u014c\u014d\5n8\2\u014d\u014e\7B\2\2\u014e\u014f\5@!\2\u014f\65"+
		"\3\2\2\2\u0150\u0151\7\65\2\2\u0151\u0152\5> \2\u0152\67\3\2\2\2\u0153"+
		"\u0154\7\37\2\2\u0154\u0155\5@!\2\u0155\u0156\7\65\2\2\u0156\u0157\7A"+
		"\2\2\u0157\u0158\5J&\2\u0158\u0159\7B\2\2\u01599\3\2\2\2\u015a\u015b\7"+
		"\60\2\2\u015b\u015c\7A\2\2\u015c\u015d\5n8\2\u015d\u015e\7B\2\2\u015e"+
		"\u0162\7C\2\2\u015f\u0161\5<\37\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0166\7D\2\2\u0166;\3\2\2\2\u0167\u0168\7\30\2\2"+
		"\u0168\u0169\5p9\2\u0169\u016d\7P\2\2\u016a\u016c\5\"\22\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0179\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\36\2\2\u0171\u0175\7"+
		"P\2\2\u0172\u0174\5\"\22\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0167\3\2\2\2\u0178\u0170\3\2\2\2\u0179=\3\2\2\2\u017a\u017b"+
		"\7A\2\2\u017b\u017c\5J&\2\u017c\u017d\7B\2\2\u017d\u017e\5@!\2\u017e?"+
		"\3\2\2\2\u017f\u0182\5 \21\2\u0180\u0182\5\"\22\2\u0181\u017f\3\2\2\2"+
		"\u0181\u0180\3\2\2\2\u0182A\3\2\2\2\u0183\u0184\5f\64\2\u0184\u0185\5"+
		"D#\2\u0185\u0186\5P)\2\u0186\u018d\3\2\2\2\u0187\u0188\5^\60\2\u0188\u0189"+
		"\5D#\2\u0189\u018a\5P)\2\u018a\u018d\3\2\2\2\u018b\u018d\5V,\2\u018c\u0183"+
		"\3\2\2\2\u018c\u0187\3\2\2\2\u018c\u018b\3\2\2\2\u018dC\3\2\2\2\u018e"+
		"\u018f\t\2\2\2\u018fE\3\2\2\2\u0190\u0192\5n8\2\u0191\u0193\5j\66\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\5H"+
		"%\2\u0195G\3\2\2\2\u0196\u019f\7A\2\2\u0197\u019c\5P)\2\u0198\u0199\7"+
		"H\2\2\u0199\u019b\5P)\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019f\u0197\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\7B\2\2\u01a2I\3\2\2\2\u01a3\u01a8\5L\'\2\u01a4\u01a5\t\3\2\2\u01a5"+
		"\u01a7\5L\'\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ad\7=\2\2\u01ac\u01a3\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adK\3\2\2\2\u01ae"+
		"\u01af\5P)\2\u01af\u01b0\5N(\2\u01b0\u01b1\5P)\2\u01b1\u01b7\3\2\2\2\u01b2"+
		"\u01b3\7A\2\2\u01b3\u01b4\5J&\2\u01b4\u01b5\7B\2\2\u01b5\u01b7\3\2\2\2"+
		"\u01b6\u01ae\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b7M\3\2\2\2\u01b8\u01b9\t"+
		"\4\2\2\u01b9O\3\2\2\2\u01ba\u01c0\5R*\2\u01bb\u01c0\5(\25\2\u01bc\u01c0"+
		"\5*\26\2\u01bd\u01c0\5b\62\2\u01be\u01c0\5V,\2\u01bf\u01ba\3\2\2\2\u01bf"+
		"\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2"+
		"\2\2\u01c0Q\3\2\2\2\u01c1\u01c6\5T+\2\u01c2\u01c3\t\5\2\2\u01c3\u01c5"+
		"\5T+\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7S\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ce\5\\/\2\u01ca"+
		"\u01cb\t\6\2\2\u01cb\u01cd\5\\/\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfU\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d1\u01d4\5X-\2\u01d2\u01d4\5Z.\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4W\3\2\2\2\u01d5\u01d6\7W\2\2\u01d6\u01da\5n8\2\u01d7"+
		"\u01d8\7X\2\2\u01d8\u01da\5n8\2\u01d9\u01d5\3\2\2\2\u01d9\u01d7\3\2\2"+
		"\2\u01daY\3\2\2\2\u01db\u01dc\5n8\2\u01dc\u01dd\7W\2\2\u01dd\u01e2\3\2"+
		"\2\2\u01de\u01df\5n8\2\u01df\u01e0\7X\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01db"+
		"\3\2\2\2\u01e1\u01de\3\2\2\2\u01e2[\3\2\2\2\u01e3\u01ec\5p9\2\u01e4\u01ec"+
		"\5F$\2\u01e5\u01ec\5^\60\2\u01e6\u01ec\5`\61\2\u01e7\u01e8\7A\2\2\u01e8"+
		"\u01e9\5P)\2\u01e9\u01ea\7B\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e3\3\2\2"+
		"\2\u01eb\u01e4\3\2\2\2\u01eb\u01e5\3\2\2\2\u01eb\u01e6\3\2\2\2\u01eb\u01e7"+
		"\3\2\2\2\u01ec]\3\2\2\2\u01ed\u01ee\5n8\2\u01ee_\3\2\2\2\u01ef\u01f0\7"+
		"]\2\2\u01f0\u01f4\5n8\2\u01f1\u01f2\7]\2\2\u01f2\u01f4\7*\2\2\u01f3\u01ef"+
		"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4a\3\2\2\2\u01f5\u01f6\7A\2\2\u01f6\u01f7"+
		"\5J&\2\u01f7\u01f8\7B\2\2\u01f8\u01f9\7O\2\2\u01f9\u01fa\5P)\2\u01fa\u01fb"+
		"\7P\2\2\u01fb\u01fc\5P)\2\u01fc\u01ff\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe"+
		"\u01f5\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ffc\3\2\2\2\u0200\u0202\5v<\2\u0201"+
		"\u0203\5j\66\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0207\3\2"+
		"\2\2\u0204\u0206\5l\67\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020b\5h\65\2\u020be\3\2\2\2\u020c\u0210\5v<\2\u020d\u020f"+
		"\5l\67\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\7q"+
		"\2\2\u0214g\3\2\2\2\u0215\u021a\7q\2\2\u0216\u0217\7H\2\2\u0217\u0219"+
		"\7q\2\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021bi\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7L\2\2\u021e"+
		"\u021f\5v<\2\u021f\u0220\7K\2\2\u0220k\3\2\2\2\u0221\u0222\7E\2\2\u0222"+
		"\u0223\7\66\2\2\u0223\u022e\7F\2\2\u0224\u0225\7E\2\2\u0225\u0226\7H\2"+
		"\2\u0226\u0227\7\66\2\2\u0227\u022e\7F\2\2\u0228\u0229\7E\2\2\u0229\u022a"+
		"\7\66\2\2\u022a\u022b\7H\2\2\u022b\u022c\7\66\2\2\u022c\u022e\7F\2\2\u022d"+
		"\u0221\3\2\2\2\u022d\u0224\3\2\2\2\u022d\u0228\3\2\2\2\u022em\3\2\2\2"+
		"\u022f\u0234\7q\2\2\u0230\u0231\7I\2\2\u0231\u0233\7q\2\2\u0232\u0230"+
		"\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0242\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u023a\7\61\2\2\u0238\u0239\7"+
		"I\2\2\u0239\u023b\5n8\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u0242\3\2\2\2\u023c\u023f\7/\2\2\u023d\u023e\7I\2\2\u023e\u0240\5n8\2"+
		"\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u022f"+
		"\3\2\2\2\u0241\u0237\3\2\2\2\u0241\u023c\3\2\2\2\u0242o\3\2\2\2\u0243"+
		"\u024a\5r:\2\u0244\u024a\5t;\2\u0245\u024a\7>\2\2\u0246\u024a\7?\2\2\u0247"+
		"\u024a\7=\2\2\u0248\u024a\7@\2\2\u0249\u0243\3\2\2\2\u0249\u0244\3\2\2"+
		"\2\u0249\u0245\3\2\2\2\u0249\u0246\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248"+
		"\3\2\2\2\u024aq\3\2\2\2\u024b\u024c\t\7\2\2\u024cs\3\2\2\2\u024d\u024e"+
		"\t\b\2\2\u024eu\3\2\2\2\u024f\u0253\5\u0082B\2\u0250\u0253\7q\2\2\u0251"+
		"\u0253\7\n\2\2\u0252\u024f\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0251\3\2"+
		"\2\2\u0253w\3\2\2\2\u0254\u0255\t\t\2\2\u0255y\3\2\2\2\u0256\u0257\t\n"+
		"\2\2\u0257{\3\2\2\2\u0258\u0259\t\13\2\2\u0259}\3\2\2\2\u025a\u025b\t"+
		"\f\2\2\u025b\177\3\2\2\2\u025c\u025f\5v<\2\u025d\u025f\7\13\2\2\u025e"+
		"\u025c\3\2\2\2\u025e\u025d\3\2\2\2\u025f\u0081\3\2\2\2\u0260\u0261\t\r"+
		"\2\2\u0261\u0083\3\2\2\2@\u0087\u008d\u0094\u009e\u00a3\u00a6\u00ab\u00b5"+
		"\u00bb\u00bd\u00c0\u00c5\u00cd\u00d6\u00dc\u00e5\u00e8\u00ed\u00f3\u00f6"+
		"\u00fa\u0104\u0107\u010f\u0118\u011d\u0126\u0133\u0137\u0162\u016d\u0175"+
		"\u0178\u0181\u018c\u0192\u019c\u019f\u01a8\u01ac\u01b6\u01bf\u01c6\u01ce"+
		"\u01d3\u01d9\u01e1\u01eb\u01f3\u01fe\u0202\u0207\u0210\u021a\u022d\u0234"+
		"\u023a\u023f\u0241\u0249\u0252\u025e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}