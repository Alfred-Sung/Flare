// Generated from E:/Documents/IntelliJ/Project Flare/src\FlareParser.g4 by ANTLR 4.9.1
package Flare;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlareParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, CHAR=3, DOUBLE=4, INT=5, LONG=6, SHORT=7, STRING=8, 
		VOID=9, PRIVATE=10, PROTECTED=11, PUBLIC=12, ABSTRACT=13, FINAL=14, OVERRIDE=15, 
		INTERFACE=16, STATIC=17, SYNCHRONIZED=18, AS=19, ASSERT=20, BREAK=21, 
		CASE=22, CATCH=23, COLD=24, COMPONENT=25, CONST=26, CONTINUE=27, DEFAULT=28, 
		DO=29, ELSE=30, ENTITY=31, ENUM=32, EXTENDS=33, FINALLY=34, FLOAT=35, 
		FOR=36, HOT=37, IF=38, IMPLEMENTS=39, IMPORT=40, ITER=41, MAIN=42, PACKAGE=43, 
		PRINT=44, RETURN=45, SUPER=46, SWITCH=47, THIS=48, THROW=49, THROWS=50, 
		TRY=51, WHILE=52, INTEGER_LITERAL=53, DECIMAL_LITERAL=54, HEX_LITERAL=55, 
		OCT_LITERAL=56, BINARY_LITERAL=57, FLOAT_LITERAL=58, HEX_FLOAT_LITERAL=59, 
		BOOL_LITERAL=60, CHAR_LITERAL=61, STRING_LITERAL=62, NULL_LITERAL=63, 
		LPAREN=64, RPAREN=65, LBRACE=66, RBRACE=67, LBRACK=68, RBRACK=69, SEMI=70, 
		COMMA=71, DOT=72, ASSIGN=73, GREATER=74, LESSER=75, EXCLAMATION=76, TILDE=77, 
		QUESTION=78, COLON=79, EQUAL=80, LESSEREQUAL=81, GREATEREQUAL=82, NOTEQUAL=83, 
		AND=84, OR=85, INCREMENT=86, DECREMENT=87, ADD=88, SUB=89, MUL=90, DIV=91, 
		BITAND=92, BITOR=93, CARET=94, MOD=95, LSHIFT=96, RSHIFT=97, ADD_ASSIGN=98, 
		SUB_ASSIGN=99, MUL_ASSIGN=100, DIV_ASSIGN=101, AND_ASSIGN=102, OR_ASSIGN=103, 
		XOR_ASSIGN=104, MOD_ASSIGN=105, LSHIFT_ASSIGN=106, RSHIFT_ASSIGN=107, 
		URSHIFT_ASSIGN=108, Whitespace=109, MULTI_COMMENT=110, LINE_COMMENT=111, 
		IDENTIFIER=112;
	public static final int
		RULE_file = 0, RULE_importLine = 1, RULE_packageHeader = 2, RULE_entityHeader = 3, 
		RULE_extensions = 4, RULE_entityBody = 5, RULE_declarationHeader = 6, 
		RULE_declarationLine = 7, RULE_declarationTag = 8, RULE_entityMethods = 9, 
		RULE_definedFunctionHeaders = 10, RULE_constructorHeader = 11, RULE_deconstructorHeader = 12, 
		RULE_methodHeader = 13, RULE_mainMethod = 14, RULE_declarationParameters = 15, 
		RULE_body = 16, RULE_line = 17, RULE_statement = 18, RULE_newStatement = 19, 
		RULE_returnStatement = 20, RULE_builtinFunctions = 21, RULE_ifStatement = 22, 
		RULE_elseIfStatement = 23, RULE_elseStatement = 24, RULE_forStatement = 25, 
		RULE_foreachStatement = 26, RULE_whileStatement = 27, RULE_doStatement = 28, 
		RULE_switchStatement = 29, RULE_caseStatement = 30, RULE_conditionAndBlock = 31, 
		RULE_singleLineOrBlockBody = 32, RULE_assignment = 33, RULE_assign = 34, 
		RULE_functionCall = 35, RULE_callParameter = 36, RULE_parameterExpression = 37, 
		RULE_parameterAdditiveExpression = 38, RULE_parameterMultiplicativeExpression = 39, 
		RULE_parameterTerm = 40, RULE_parameterTernaryExpression = 41, RULE_condition = 42, 
		RULE_comparator = 43, RULE_comparison = 44, RULE_expression = 45, RULE_additiveExpression = 46, 
		RULE_multiplicativeExpression = 47, RULE_unaryExpression = 48, RULE_preUnaryExpression = 49, 
		RULE_postUnaryExpression = 50, RULE_term = 51, RULE_ternaryExpression = 52, 
		RULE_declarationStatement = 53, RULE_declarationStatementSingular = 54, 
		RULE_identifierList = 55, RULE_arraySpecifier = 56, RULE_identifierSpecifier = 57, 
		RULE_literal = 58, RULE_integerLiteral = 59, RULE_floatLiteral = 60, RULE_variableType = 61, 
		RULE_entityModifier = 62, RULE_classOrInterface = 63, RULE_visibilityModifier = 64, 
		RULE_methodModifier = 65, RULE_methodType = 66, RULE_primitiveType = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "importLine", "packageHeader", "entityHeader", "extensions", 
			"entityBody", "declarationHeader", "declarationLine", "declarationTag", 
			"entityMethods", "definedFunctionHeaders", "constructorHeader", "deconstructorHeader", 
			"methodHeader", "mainMethod", "declarationParameters", "body", "line", 
			"statement", "newStatement", "returnStatement", "builtinFunctions", "ifStatement", 
			"elseIfStatement", "elseStatement", "forStatement", "foreachStatement", 
			"whileStatement", "doStatement", "switchStatement", "caseStatement", 
			"conditionAndBlock", "singleLineOrBlockBody", "assignment", "assign", 
			"functionCall", "callParameter", "parameterExpression", "parameterAdditiveExpression", 
			"parameterMultiplicativeExpression", "parameterTerm", "parameterTernaryExpression", 
			"condition", "comparator", "comparison", "expression", "additiveExpression", 
			"multiplicativeExpression", "unaryExpression", "preUnaryExpression", 
			"postUnaryExpression", "term", "ternaryExpression", "declarationStatement", 
			"declarationStatementSingular", "identifierList", "arraySpecifier", "identifierSpecifier", 
			"literal", "integerLiteral", "floatLiteral", "variableType", "entityModifier", 
			"classOrInterface", "visibilityModifier", "methodModifier", "methodType", 
			"primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'byte'", "'char'", "'double'", "'int'", "'long'", 
			"'short'", "'string'", "'void'", "'private'", "'protected'", "'public'", 
			"'abstract'", "'final'", "'override'", "'interface'", "'static'", "'synchronized'", 
			"'as'", "'assert'", "'break'", "'case'", "'catch'", "'cold'", "'component'", 
			"'const'", "'continue'", "'default'", "'do'", "'else'", "'entity'", "'enum'", 
			"'extends'", "'finally'", "'float'", "'for'", "'hot'", "'if'", "'implements'", 
			"'import'", "'iter'", "'main'", "'package'", "'print'", "'return'", "'super'", 
			"'switch'", "'this'", "'throw'", "'throws'", "'try'", "'while'", null, 
			null, null, null, null, null, null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'<<'", "'>>'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", "'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "INT", "LONG", "SHORT", "STRING", 
			"VOID", "PRIVATE", "PROTECTED", "PUBLIC", "ABSTRACT", "FINAL", "OVERRIDE", 
			"INTERFACE", "STATIC", "SYNCHRONIZED", "AS", "ASSERT", "BREAK", "CASE", 
			"CATCH", "COLD", "COMPONENT", "CONST", "CONTINUE", "DEFAULT", "DO", "ELSE", 
			"ENTITY", "ENUM", "EXTENDS", "FINALLY", "FLOAT", "FOR", "HOT", "IF", 
			"IMPLEMENTS", "IMPORT", "ITER", "MAIN", "PACKAGE", "PRINT", "RETURN", 
			"SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TRY", "WHILE", "INTEGER_LITERAL", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GREATER", "LESSER", "EXCLAMATION", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LESSEREQUAL", "GREATEREQUAL", 
			"NOTEQUAL", "AND", "OR", "INCREMENT", "DECREMENT", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "LSHIFT", "RSHIFT", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"Whitespace", "MULTI_COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
		public List<MainMethodContext> mainMethod() {
			return getRuleContexts(MainMethodContext.class);
		}
		public MainMethodContext mainMethod(int i) {
			return getRuleContext(MainMethodContext.class,i);
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
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(136);
				importLine();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << VOID) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OVERRIDE) | (1L << INTERFACE) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << ENTITY) | (1L << FLOAT) | (1L << PACKAGE))) != 0) || _la==TILDE || _la==IDENTIFIER) {
				{
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(142);
					packageHeader();
					}
					break;
				case 2:
					{
					setState(143);
					mainMethod();
					}
					break;
				}
				}
				setState(148);
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
			setState(149);
			match(IMPORT);
			setState(150);
			identifierSpecifier();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(151);
				match(AS);
				setState(152);
				match(IDENTIFIER);
				}
			}

			setState(155);
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
		public EntityMethodsContext entityMethods() {
			return getRuleContext(EntityMethodsContext.class,0);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(PACKAGE);
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(LBRACE);
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					entityHeader();
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << INTERFACE) | (1L << STATIC) | (1L << ENTITY))) != 0) );
				setState(165);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				entityHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				entityMethods();
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
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << STATIC))) != 0)) {
				{
				setState(171);
				entityModifier();
				}
			}

			setState(174);
			classOrInterface();
			setState(175);
			match(IDENTIFIER);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==IMPLEMENTS) {
				{
				setState(176);
				extensions();
				}
			}

			setState(179);
			match(LBRACE);
			setState(180);
			entityBody();
			setState(181);
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(EXTENDS);
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					identifierSpecifier();
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SUPER || _la==THIS || _la==IDENTIFIER );
				}
				break;
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(IMPLEMENTS);
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					identifierSpecifier();
					}
					}
					setState(193); 
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
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPONENT) {
				{
				setState(197);
				declarationHeader();
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << VOID) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << OVERRIDE) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << FLOAT))) != 0) || _la==TILDE || _la==IDENTIFIER) {
				{
				{
				setState(200);
				entityMethods();
				}
				}
				setState(205);
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
		public TerminalNode COMPONENT() { return getToken(FlareParser.COMPONENT, 0); }
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
			setState(206);
			match(COMPONENT);
			setState(207);
			match(LBRACE);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << COLD) | (1L << FLOAT) | (1L << HOT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(208);
				declarationLine();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
			setState(220);
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
				setState(216);
				declarationStatement();
				setState(217);
				match(SEMI);
				}
				break;
			case COLD:
			case HOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(COLD);
				setState(223);
				match(COLON);
				}
				break;
			case HOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(HOT);
				setState(225);
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
			setState(228);
			definedFunctionHeaders();
			setState(229);
			declarationParameters();
			setState(230);
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
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				constructorHeader();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				deconstructorHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(237);
				visibilityModifier();
				}
			}

			setState(240);
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
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(242);
				visibilityModifier();
				}
			}

			setState(245);
			match(TILDE);
			setState(246);
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
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(248);
				visibilityModifier();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << OVERRIDE) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(251);
				methodModifier();
				}
			}

			setState(254);
			methodType();
			setState(255);
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

	public static class MainMethodContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(FlareParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(FlareParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(VOID);
			setState(258);
			match(MAIN);
			setState(259);
			match(LPAREN);
			setState(260);
			match(RPAREN);
			setState(261);
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
		enterRule(_localctx, 30, RULE_declarationParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LPAREN);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << FLOAT))) != 0) || _la==IDENTIFIER) {
				{
				setState(264);
				declarationStatementSingular();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					declarationStatementSingular();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(274);
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
		enterRule(_localctx, 32, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LBRACE);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << ASSERT) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << RETURN) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << WHILE))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(277);
				line();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
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
		enterRule(_localctx, 34, RULE_line);
		try {
			setState(289);
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
			case RETURN:
			case SUPER:
			case THIS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				statement();
				setState(286);
				match(SEMI);
				}
				break;
			case ASSERT:
			case DO:
			case FOR:
			case IF:
			case PRINT:
			case SWITCH:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
		public NewStatementContext newStatement() {
			return getRuleContext(NewStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				newStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				returnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
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

	public static class NewStatementContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FlareParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FlareParser.IDENTIFIER, i);
		}
		public List<CallParameterContext> callParameter() {
			return getRuleContexts(CallParameterContext.class);
		}
		public CallParameterContext callParameter(int i) {
			return getRuleContext(CallParameterContext.class,i);
		}
		public List<ArraySpecifierContext> arraySpecifier() {
			return getRuleContexts(ArraySpecifierContext.class);
		}
		public ArraySpecifierContext arraySpecifier(int i) {
			return getRuleContext(ArraySpecifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlareParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlareParser.COMMA, i);
		}
		public NewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitNewStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewStatementContext newStatement() throws RecognitionException {
		NewStatementContext _localctx = new NewStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			variableType();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(298);
				arraySpecifier();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(IDENTIFIER);
			setState(305);
			callParameter();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				match(IDENTIFIER);
				setState(308);
				callParameter();
				}
				}
				setState(313);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FlareParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(RETURN);
			setState(315);
			expression();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(FlareParser.PRINT, 0); }
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
		enterRule(_localctx, 42, RULE_builtinFunctions);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				forStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				foreachStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				doStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				switchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(323);
				match(ASSERT);
				setState(324);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				match(PRINT);
				setState(326);
				expression();
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
		enterRule(_localctx, 44, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IF);
			setState(330);
			conditionAndBlock();
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					elseIfStatement();
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(337);
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
		enterRule(_localctx, 46, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ELSE);
			setState(341);
			match(IF);
			setState(342);
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
		enterRule(_localctx, 48, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ELSE);
			setState(345);
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
		public NewStatementContext newStatement() {
			return getRuleContext(NewStatementContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(FlareParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(FlareParser.SEMI, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 50, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(FOR);
			setState(348);
			match(LPAREN);
			setState(349);
			newStatement();
			setState(350);
			match(SEMI);
			setState(351);
			condition();
			setState(352);
			match(SEMI);
			setState(353);
			expression();
			setState(354);
			match(RPAREN);
			setState(355);
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
		public TerminalNode COLON() { return getToken(FlareParser.COLON, 0); }
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
		enterRule(_localctx, 52, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(FOR);
			setState(358);
			match(LPAREN);
			setState(359);
			declarationStatement();
			setState(360);
			match(COLON);
			setState(361);
			identifierSpecifier();
			setState(362);
			match(RPAREN);
			setState(363);
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
		enterRule(_localctx, 54, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(WHILE);
			setState(366);
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
		enterRule(_localctx, 56, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(DO);
			setState(369);
			singleLineOrBlockBody();
			setState(370);
			match(WHILE);
			setState(371);
			match(LPAREN);
			setState(372);
			condition();
			setState(373);
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
		enterRule(_localctx, 58, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(SWITCH);
			setState(376);
			match(LPAREN);
			setState(377);
			identifierSpecifier();
			setState(378);
			match(RPAREN);
			setState(379);
			match(LBRACE);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(380);
				caseStatement();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
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
		enterRule(_localctx, 60, RULE_caseStatement);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(CASE);
				setState(389);
				literal();
				setState(390);
				match(COLON);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << ASSERT) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << RETURN) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << WHILE))) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(391);
					line();
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(DEFAULT);
				setState(398);
				match(COLON);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << ASSERT) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << RETURN) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << WHILE))) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(399);
					line();
					}
					}
					setState(404);
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
		enterRule(_localctx, 62, RULE_conditionAndBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(LPAREN);
			setState(408);
			condition();
			setState(409);
			match(RPAREN);
			setState(410);
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
		enterRule(_localctx, 64, RULE_singleLineOrBlockBody);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
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
			case PRINT:
			case RETURN:
			case SUPER:
			case SWITCH:
			case THIS:
			case WHILE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
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
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 66, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			identifierSpecifier();
			setState(417);
			assign();
			setState(418);
			expression();
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
		enterRule(_localctx, 68, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (ASSIGN - 73)) | (1L << (ADD_ASSIGN - 73)) | (1L << (SUB_ASSIGN - 73)) | (1L << (MUL_ASSIGN - 73)) | (1L << (DIV_ASSIGN - 73)) | (1L << (AND_ASSIGN - 73)) | (1L << (OR_ASSIGN - 73)) | (1L << (XOR_ASSIGN - 73)) | (1L << (MOD_ASSIGN - 73)) | (1L << (LSHIFT_ASSIGN - 73)) | (1L << (RSHIFT_ASSIGN - 73)) | (1L << (URSHIFT_ASSIGN - 73)))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			identifierSpecifier();
			setState(423);
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
		public List<ParameterExpressionContext> parameterExpression() {
			return getRuleContexts(ParameterExpressionContext.class);
		}
		public ParameterExpressionContext parameterExpression(int i) {
			return getRuleContext(ParameterExpressionContext.class,i);
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
		enterRule(_localctx, 72, RULE_callParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(LPAREN);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ITER) | (1L << SUPER) | (1L << THIS) | (1L << INTEGER_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (INCREMENT - 64)) | (1L << (DECREMENT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(426);
				parameterExpression();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(427);
					match(COMMA);
					setState(428);
					parameterExpression();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(436);
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

	public static class ParameterExpressionContext extends ParserRuleContext {
		public ParameterAdditiveExpressionContext parameterAdditiveExpression() {
			return getRuleContext(ParameterAdditiveExpressionContext.class,0);
		}
		public ParameterTernaryExpressionContext parameterTernaryExpression() {
			return getRuleContext(ParameterTernaryExpressionContext.class,0);
		}
		public ParameterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitParameterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterExpressionContext parameterExpression() throws RecognitionException {
		ParameterExpressionContext _localctx = new ParameterExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameterExpression);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				parameterAdditiveExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				parameterTernaryExpression();
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

	public static class ParameterAdditiveExpressionContext extends ParserRuleContext {
		public List<ParameterMultiplicativeExpressionContext> parameterMultiplicativeExpression() {
			return getRuleContexts(ParameterMultiplicativeExpressionContext.class);
		}
		public ParameterMultiplicativeExpressionContext parameterMultiplicativeExpression(int i) {
			return getRuleContext(ParameterMultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(FlareParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(FlareParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(FlareParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(FlareParser.SUB, i);
		}
		public ParameterAdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterAdditiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitParameterAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterAdditiveExpressionContext parameterAdditiveExpression() throws RecognitionException {
		ParameterAdditiveExpressionContext _localctx = new ParameterAdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parameterAdditiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			parameterMultiplicativeExpression();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(443);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(444);
				parameterMultiplicativeExpression();
				}
				}
				setState(449);
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

	public static class ParameterMultiplicativeExpressionContext extends ParserRuleContext {
		public List<ParameterTermContext> parameterTerm() {
			return getRuleContexts(ParameterTermContext.class);
		}
		public ParameterTermContext parameterTerm(int i) {
			return getRuleContext(ParameterTermContext.class,i);
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
		public ParameterMultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMultiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitParameterMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMultiplicativeExpressionContext parameterMultiplicativeExpression() throws RecognitionException {
		ParameterMultiplicativeExpressionContext _localctx = new ParameterMultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameterMultiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			parameterTerm();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) {
				{
				{
				setState(451);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(452);
				parameterTerm();
				}
				}
				setState(457);
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

	public static class ParameterTermContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
		}
		public TerminalNode ITER() { return getToken(FlareParser.ITER, 0); }
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public ParameterExpressionContext parameterExpression() {
			return getRuleContext(ParameterExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public ParameterTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitParameterTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTermContext parameterTerm() throws RecognitionException {
		ParameterTermContext _localctx = new ParameterTermContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameterTerm);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				identifierSpecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				match(ITER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				match(LPAREN);
				setState(463);
				parameterExpression();
				setState(464);
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

	public static class ParameterTernaryExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public TerminalNode QUESTION() { return getToken(FlareParser.QUESTION, 0); }
		public List<ParameterExpressionContext> parameterExpression() {
			return getRuleContexts(ParameterExpressionContext.class);
		}
		public ParameterExpressionContext parameterExpression(int i) {
			return getRuleContext(ParameterExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FlareParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParameterTernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTernaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitParameterTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTernaryExpressionContext parameterTernaryExpression() throws RecognitionException {
		ParameterTernaryExpressionContext _localctx = new ParameterTernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameterTernaryExpression);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(LPAREN);
				setState(469);
				condition();
				setState(470);
				match(RPAREN);
				setState(471);
				match(QUESTION);
				setState(472);
				parameterExpression();
				setState(473);
				match(COLON);
				setState(474);
				parameterExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				condition();
				setState(477);
				match(QUESTION);
				setState(478);
				expression();
				setState(479);
				match(COLON);
				setState(480);
				expression();
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
		enterRule(_localctx, 84, RULE_condition);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				comparator();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(485);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(486);
					comparator();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
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
		enterRule(_localctx, 86, RULE_comparator);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				expression();
				setState(496);
				comparison();
				setState(497);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(LPAREN);
				setState(500);
				condition();
				setState(501);
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
		enterRule(_localctx, 88, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (GREATER - 74)) | (1L << (LESSER - 74)) | (1L << (EQUAL - 74)) | (1L << (LESSEREQUAL - 74)) | (1L << (GREATEREQUAL - 74)) | (1L << (NOTEQUAL - 74)))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_expression);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				additiveExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
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
		enterRule(_localctx, 92, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			multiplicativeExpression();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(512);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(513);
				multiplicativeExpression();
				}
				}
				setState(518);
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
		enterRule(_localctx, 94, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			term();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) {
				{
				{
				setState(520);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(521);
				term();
				}
				}
				setState(526);
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
		enterRule(_localctx, 96, RULE_unaryExpression);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				preUnaryExpression();
				}
				break;
			case SUPER:
			case THIS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
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
		enterRule(_localctx, 98, RULE_preUnaryExpression);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(INCREMENT);
				setState(532);
				identifierSpecifier();
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(DECREMENT);
				setState(534);
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
		enterRule(_localctx, 100, RULE_postUnaryExpression);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				identifierSpecifier();
				setState(538);
				match(INCREMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				identifierSpecifier();
				setState(541);
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
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
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
		enterRule(_localctx, 102, RULE_term);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				identifierSpecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				match(LPAREN);
				setState(549);
				expression();
				setState(550);
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

	public static class TernaryExpressionContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
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
		enterRule(_localctx, 104, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			comparison();
			setState(555);
			match(QUESTION);
			setState(556);
			expression();
			setState(557);
			match(COLON);
			setState(558);
			expression();
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
		enterRule(_localctx, 106, RULE_declarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			variableType();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(561);
				arraySpecifier();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
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
		enterRule(_localctx, 108, RULE_declarationStatementSingular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			variableType();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(570);
				arraySpecifier();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
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
		enterRule(_localctx, 110, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(IDENTIFIER);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(579);
				match(COMMA);
				setState(580);
				match(IDENTIFIER);
				}
				}
				setState(585);
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

	public static class ArraySpecifierContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FlareParser.LBRACK, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(FlareParser.INTEGER_LITERAL, 0); }
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
		enterRule(_localctx, 112, RULE_arraySpecifier);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(LBRACK);
				setState(587);
				match(INTEGER_LITERAL);
				setState(588);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(LBRACK);
				setState(590);
				match(COMMA);
				setState(591);
				match(INTEGER_LITERAL);
				setState(592);
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
		enterRule(_localctx, 114, RULE_identifierSpecifier);
		int _la;
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(IDENTIFIER);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(596);
					match(DOT);
					setState(597);
					match(IDENTIFIER);
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(THIS);
				setState(606); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(604);
					match(DOT);
					setState(605);
					match(IDENTIFIER);
					}
					}
					setState(608); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				match(SUPER);
				setState(613); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(611);
					match(DOT);
					setState(612);
					match(IDENTIFIER);
					}
					}
					setState(615); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
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
		enterRule(_localctx, 116, RULE_literal);
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(624);
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
		enterRule(_localctx, 118, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
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
		enterRule(_localctx, 120, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
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
		enterRule(_localctx, 122, RULE_variableType);
		try {
			setState(634);
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
				setState(631);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
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
		enterRule(_localctx, 124, RULE_entityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
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
		public TerminalNode ENTITY() { return getToken(FlareParser.ENTITY, 0); }
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
		enterRule(_localctx, 126, RULE_classOrInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==INTERFACE || _la==ENTITY) ) {
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
		enterRule(_localctx, 128, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
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
		enterRule(_localctx, 130, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
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
		enterRule(_localctx, 132, RULE_methodType);
		try {
			setState(646);
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
				setState(644);
				variableType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
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
		enterRule(_localctx, 134, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3r\u028d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\7\2\u008c\n\2\f\2"+
		"\16\2\u008f\13\2\3\2\3\2\7\2\u0093\n\2\f\2\16\2\u0096\13\2\3\3\3\3\3\3"+
		"\3\3\5\3\u009c\n\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4\u00a4\n\4\r\4\16\4\u00a5"+
		"\3\4\3\4\3\4\3\4\5\4\u00ac\n\4\3\5\5\5\u00af\n\5\3\5\3\5\3\5\5\5\u00b4"+
		"\n\5\3\5\3\5\3\5\3\5\3\6\3\6\6\6\u00bc\n\6\r\6\16\6\u00bd\3\6\3\6\6\6"+
		"\u00c2\n\6\r\6\16\6\u00c3\5\6\u00c6\n\6\3\7\5\7\u00c9\n\7\3\7\7\7\u00cc"+
		"\n\7\f\7\16\7\u00cf\13\7\3\b\3\b\3\b\7\b\u00d4\n\b\f\b\16\b\u00d7\13\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00df\n\t\3\n\3\n\3\n\3\n\5\n\u00e5\n\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ee\n\f\3\r\5\r\u00f1\n\r\3\r\3\r"+
		"\3\16\5\16\u00f6\n\16\3\16\3\16\3\16\3\17\5\17\u00fc\n\17\3\17\5\17\u00ff"+
		"\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\7\21\u010e\n\21\f\21\16\21\u0111\13\21\5\21\u0113\n\21\3\21\3\21\3\22"+
		"\3\22\7\22\u0119\n\22\f\22\16\22\u011c\13\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\5\23\u0124\n\23\3\24\3\24\3\24\3\24\5\24\u012a\n\24\3\25\3\25\7"+
		"\25\u012e\n\25\f\25\16\25\u0131\13\25\3\25\3\25\3\25\3\25\3\25\7\25\u0138"+
		"\n\25\f\25\16\25\u013b\13\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u014a\n\27\3\30\3\30\3\30\7\30\u014f\n\30"+
		"\f\30\16\30\u0152\13\30\3\30\5\30\u0155\n\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0180\n\37\f\37\16\37\u0183"+
		"\13\37\3\37\3\37\3 \3 \3 \3 \7 \u018b\n \f \16 \u018e\13 \3 \3 \3 \7 "+
		"\u0193\n \f \16 \u0196\13 \5 \u0198\n \3!\3!\3!\3!\3!\3\"\3\"\5\"\u01a1"+
		"\n\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3&\7&\u01b0\n&\f&\16&\u01b3\13"+
		"&\5&\u01b5\n&\3&\3&\3\'\3\'\5\'\u01bb\n\'\3(\3(\3(\7(\u01c0\n(\f(\16("+
		"\u01c3\13(\3)\3)\3)\7)\u01c8\n)\f)\16)\u01cb\13)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\5*\u01d5\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01e5\n+"+
		"\3,\3,\3,\7,\u01ea\n,\f,\16,\u01ed\13,\3,\5,\u01f0\n,\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\5-\u01fa\n-\3.\3.\3/\3/\5/\u0200\n/\3\60\3\60\3\60\7\60\u0205"+
		"\n\60\f\60\16\60\u0208\13\60\3\61\3\61\3\61\7\61\u020d\n\61\f\61\16\61"+
		"\u0210\13\61\3\62\3\62\5\62\u0214\n\62\3\63\3\63\3\63\3\63\5\63\u021a"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0222\n\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u022b\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\7\67\u0235\n\67\f\67\16\67\u0238\13\67\3\67\3\67\38\38\78\u023e\n8\f"+
		"8\168\u0241\138\38\38\39\39\39\79\u0248\n9\f9\169\u024b\139\3:\3:\3:\3"+
		":\3:\3:\3:\5:\u0254\n:\3;\3;\3;\7;\u0259\n;\f;\16;\u025c\13;\3;\3;\3;"+
		"\6;\u0261\n;\r;\16;\u0262\3;\3;\3;\6;\u0268\n;\r;\16;\u0269\5;\u026c\n"+
		";\3<\3<\3<\3<\3<\3<\5<\u0274\n<\3=\3=\3>\3>\3?\3?\3?\5?\u027d\n?\3@\3"+
		"@\3A\3A\3B\3B\3C\3C\3D\3D\5D\u0289\nD\3E\3E\3E\2\2F\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2\16\4\2KKdn\3\2Z[\4\2\\]aa\3"+
		"\2VW\4\2LMRU\3\2\67;\3\2<=\4\2\17\20\23\23\4\2\22\22!!\3\2\f\16\5\2\17"+
		"\17\21\21\23\24\4\2\3\t%%\2\u029d\2\u008d\3\2\2\2\4\u0097\3\2\2\2\6\u00ab"+
		"\3\2\2\2\b\u00ae\3\2\2\2\n\u00c5\3\2\2\2\f\u00c8\3\2\2\2\16\u00d0\3\2"+
		"\2\2\20\u00de\3\2\2\2\22\u00e4\3\2\2\2\24\u00e6\3\2\2\2\26\u00ed\3\2\2"+
		"\2\30\u00f0\3\2\2\2\32\u00f5\3\2\2\2\34\u00fb\3\2\2\2\36\u0103\3\2\2\2"+
		" \u0109\3\2\2\2\"\u0116\3\2\2\2$\u0123\3\2\2\2&\u0129\3\2\2\2(\u012b\3"+
		"\2\2\2*\u013c\3\2\2\2,\u0149\3\2\2\2.\u014b\3\2\2\2\60\u0156\3\2\2\2\62"+
		"\u015a\3\2\2\2\64\u015d\3\2\2\2\66\u0167\3\2\2\28\u016f\3\2\2\2:\u0172"+
		"\3\2\2\2<\u0179\3\2\2\2>\u0197\3\2\2\2@\u0199\3\2\2\2B\u01a0\3\2\2\2D"+
		"\u01a2\3\2\2\2F\u01a6\3\2\2\2H\u01a8\3\2\2\2J\u01ab\3\2\2\2L\u01ba\3\2"+
		"\2\2N\u01bc\3\2\2\2P\u01c4\3\2\2\2R\u01d4\3\2\2\2T\u01e4\3\2\2\2V\u01ef"+
		"\3\2\2\2X\u01f9\3\2\2\2Z\u01fb\3\2\2\2\\\u01ff\3\2\2\2^\u0201\3\2\2\2"+
		"`\u0209\3\2\2\2b\u0213\3\2\2\2d\u0219\3\2\2\2f\u0221\3\2\2\2h\u022a\3"+
		"\2\2\2j\u022c\3\2\2\2l\u0232\3\2\2\2n\u023b\3\2\2\2p\u0244\3\2\2\2r\u0253"+
		"\3\2\2\2t\u026b\3\2\2\2v\u0273\3\2\2\2x\u0275\3\2\2\2z\u0277\3\2\2\2|"+
		"\u027c\3\2\2\2~\u027e\3\2\2\2\u0080\u0280\3\2\2\2\u0082\u0282\3\2\2\2"+
		"\u0084\u0284\3\2\2\2\u0086\u0288\3\2\2\2\u0088\u028a\3\2\2\2\u008a\u008c"+
		"\5\4\3\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0094\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\5\6"+
		"\4\2\u0091\u0093\5\36\20\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\3\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0097\u0098\7*\2\2\u0098\u009b\5t;\2\u0099\u009a"+
		"\7\25\2\2\u009a\u009c\7r\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7H\2\2\u009e\5\3\2\2\2\u009f\u00a0\7-\2\2\u00a0"+
		"\u00a1\7r\2\2\u00a1\u00a3\7D\2\2\u00a2\u00a4\5\b\5\2\u00a3\u00a2\3\2\2"+
		"\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\7E\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ac\5\b\5\2\u00aa"+
		"\u00ac\5\24\13\2\u00ab\u009f\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\7\3\2\2\2\u00ad\u00af\5~@\2\u00ae\u00ad\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\u0080A\2\u00b1\u00b3\7r\2\2"+
		"\u00b2\u00b4\5\n\6\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\7D\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\7E\2\2\u00b8"+
		"\t\3\2\2\2\u00b9\u00bb\7#\2\2\u00ba\u00bc\5t;\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c6\3\2"+
		"\2\2\u00bf\u00c1\7)\2\2\u00c0\u00c2\5t;\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00b9\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c6\13\3\2\2\2\u00c7\u00c9\5\16\b"+
		"\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc"+
		"\5\24\13\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\r\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7"+
		"\33\2\2\u00d1\u00d5\7D\2\2\u00d2\u00d4\5\20\t\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7E\2\2\u00d9\17\3\2\2\2\u00da\u00db"+
		"\5l\67\2\u00db\u00dc\7H\2\2\u00dc\u00df\3\2\2\2\u00dd\u00df\5\22\n\2\u00de"+
		"\u00da\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\21\3\2\2\2\u00e0\u00e1\7\32\2"+
		"\2\u00e1\u00e5\7Q\2\2\u00e2\u00e3\7\'\2\2\u00e3\u00e5\7Q\2\2\u00e4\u00e0"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\23\3\2\2\2\u00e6\u00e7\5\26\f\2\u00e7"+
		"\u00e8\5 \21\2\u00e8\u00e9\5\"\22\2\u00e9\25\3\2\2\2\u00ea\u00ee\5\30"+
		"\r\2\u00eb\u00ee\5\32\16\2\u00ec\u00ee\5\34\17\2\u00ed\u00ea\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\27\3\2\2\2\u00ef\u00f1\5\u0082"+
		"B\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\7r\2\2\u00f3\31\3\2\2\2\u00f4\u00f6\5\u0082B\2\u00f5\u00f4\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7O\2\2\u00f8"+
		"\u00f9\7r\2\2\u00f9\33\3\2\2\2\u00fa\u00fc\5\u0082B\2\u00fb\u00fa\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\5\u0084C\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\5\u0086"+
		"D\2\u0101\u0102\7r\2\2\u0102\35\3\2\2\2\u0103\u0104\7\13\2\2\u0104\u0105"+
		"\7,\2\2\u0105\u0106\7B\2\2\u0106\u0107\7C\2\2\u0107\u0108\5\"\22\2\u0108"+
		"\37\3\2\2\2\u0109\u0112\7B\2\2\u010a\u010f\5n8\2\u010b\u010c\7I\2\2\u010c"+
		"\u010e\5n8\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u010a"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7C\2\2\u0115"+
		"!\3\2\2\2\u0116\u011a\7D\2\2\u0117\u0119\5$\23\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7E\2\2\u011e#\3\2\2\2\u011f\u0120"+
		"\5&\24\2\u0120\u0121\7H\2\2\u0121\u0124\3\2\2\2\u0122\u0124\5,\27\2\u0123"+
		"\u011f\3\2\2\2\u0123\u0122\3\2\2\2\u0124%\3\2\2\2\u0125\u012a\5(\25\2"+
		"\u0126\u012a\5*\26\2\u0127\u012a\5D#\2\u0128\u012a\5H%\2\u0129\u0125\3"+
		"\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\'\3\2\2\2\u012b\u012f\5|?\2\u012c\u012e\5r:\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7r\2\2\u0133\u0139\5J&\2\u0134\u0135"+
		"\7I\2\2\u0135\u0136\7r\2\2\u0136\u0138\5J&\2\u0137\u0134\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a)\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u013d\7/\2\2\u013d\u013e\5\\/\2\u013e+\3\2"+
		"\2\2\u013f\u014a\5.\30\2\u0140\u014a\5\64\33\2\u0141\u014a\5\66\34\2\u0142"+
		"\u014a\58\35\2\u0143\u014a\5:\36\2\u0144\u014a\5<\37\2\u0145\u0146\7\26"+
		"\2\2\u0146\u014a\5\\/\2\u0147\u0148\7.\2\2\u0148\u014a\5\\/\2\u0149\u013f"+
		"\3\2\2\2\u0149\u0140\3\2\2\2\u0149\u0141\3\2\2\2\u0149\u0142\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a-\3\2\2\2\u014b\u014c\7(\2\2\u014c\u0150\5@!\2\u014d\u014f\5"+
		"\60\31\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\5\62"+
		"\32\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155/\3\2\2\2\u0156\u0157"+
		"\7 \2\2\u0157\u0158\7(\2\2\u0158\u0159\5@!\2\u0159\61\3\2\2\2\u015a\u015b"+
		"\7 \2\2\u015b\u015c\5B\"\2\u015c\63\3\2\2\2\u015d\u015e\7&\2\2\u015e\u015f"+
		"\7B\2\2\u015f\u0160\5(\25\2\u0160\u0161\7H\2\2\u0161\u0162\5V,\2\u0162"+
		"\u0163\7H\2\2\u0163\u0164\5\\/\2\u0164\u0165\7C\2\2\u0165\u0166\5B\"\2"+
		"\u0166\65\3\2\2\2\u0167\u0168\7&\2\2\u0168\u0169\7B\2\2\u0169\u016a\5"+
		"l\67\2\u016a\u016b\7Q\2\2\u016b\u016c\5t;\2\u016c\u016d\7C\2\2\u016d\u016e"+
		"\5B\"\2\u016e\67\3\2\2\2\u016f\u0170\7\66\2\2\u0170\u0171\5@!\2\u0171"+
		"9\3\2\2\2\u0172\u0173\7\37\2\2\u0173\u0174\5B\"\2\u0174\u0175\7\66\2\2"+
		"\u0175\u0176\7B\2\2\u0176\u0177\5V,\2\u0177\u0178\7C\2\2\u0178;\3\2\2"+
		"\2\u0179\u017a\7\61\2\2\u017a\u017b\7B\2\2\u017b\u017c\5t;\2\u017c\u017d"+
		"\7C\2\2\u017d\u0181\7D\2\2\u017e\u0180\5> \2\u017f\u017e\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7E\2\2\u0185=\3\2\2\2\u0186\u0187"+
		"\7\30\2\2\u0187\u0188\5v<\2\u0188\u018c\7Q\2\2\u0189\u018b\5$\23\2\u018a"+
		"\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u0198\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\36\2\2\u0190"+
		"\u0194\7Q\2\2\u0191\u0193\5$\23\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0186\3\2\2\2\u0197\u018f\3\2\2\2\u0198?\3\2\2\2"+
		"\u0199\u019a\7B\2\2\u019a\u019b\5V,\2\u019b\u019c\7C\2\2\u019c\u019d\5"+
		"B\"\2\u019dA\3\2\2\2\u019e\u01a1\5\"\22\2\u019f\u01a1\5$\23\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1C\3\2\2\2\u01a2\u01a3\5t;\2\u01a3\u01a4"+
		"\5F$\2\u01a4\u01a5\5\\/\2\u01a5E\3\2\2\2\u01a6\u01a7\t\2\2\2\u01a7G\3"+
		"\2\2\2\u01a8\u01a9\5t;\2\u01a9\u01aa\5J&\2\u01aaI\3\2\2\2\u01ab\u01b4"+
		"\7B\2\2\u01ac\u01b1\5L\'\2\u01ad\u01ae\7I\2\2\u01ae\u01b0\5L\'\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7C\2\2\u01b7K\3\2\2\2\u01b8"+
		"\u01bb\5N(\2\u01b9\u01bb\5T+\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2"+
		"\u01bbM\3\2\2\2\u01bc\u01c1\5P)\2\u01bd\u01be\t\3\2\2\u01be\u01c0\5P)"+
		"\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2O\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c9\5R*\2\u01c5\u01c6"+
		"\t\4\2\2\u01c6\u01c8\5R*\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01caQ\3\2\2\2\u01cb\u01c9\3\2\2\2"+
		"\u01cc\u01d5\5v<\2\u01cd\u01d5\5H%\2\u01ce\u01d5\5t;\2\u01cf\u01d5\7+"+
		"\2\2\u01d0\u01d1\7B\2\2\u01d1\u01d2\5L\'\2\u01d2\u01d3\7C\2\2\u01d3\u01d5"+
		"\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d4\u01cd\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4"+
		"\u01cf\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d5S\3\2\2\2\u01d6\u01d7\7B\2\2\u01d7"+
		"\u01d8\5V,\2\u01d8\u01d9\7C\2\2\u01d9\u01da\7P\2\2\u01da\u01db\5L\'\2"+
		"\u01db\u01dc\7Q\2\2\u01dc\u01dd\5L\'\2\u01dd\u01e5\3\2\2\2\u01de\u01df"+
		"\5V,\2\u01df\u01e0\7P\2\2\u01e0\u01e1\5\\/\2\u01e1\u01e2\7Q\2\2\u01e2"+
		"\u01e3\5\\/\2\u01e3\u01e5\3\2\2\2\u01e4\u01d6\3\2\2\2\u01e4\u01de\3\2"+
		"\2\2\u01e5U\3\2\2\2\u01e6\u01eb\5X-\2\u01e7\u01e8\t\5\2\2\u01e8\u01ea"+
		"\5X-\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f0\7>"+
		"\2\2\u01ef\u01e6\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0W\3\2\2\2\u01f1\u01f2"+
		"\5\\/\2\u01f2\u01f3\5Z.\2\u01f3\u01f4\5\\/\2\u01f4\u01fa\3\2\2\2\u01f5"+
		"\u01f6\7B\2\2\u01f6\u01f7\5V,\2\u01f7\u01f8\7C\2\2\u01f8\u01fa\3\2\2\2"+
		"\u01f9\u01f1\3\2\2\2\u01f9\u01f5\3\2\2\2\u01faY\3\2\2\2\u01fb\u01fc\t"+
		"\6\2\2\u01fc[\3\2\2\2\u01fd\u0200\5^\60\2\u01fe\u0200\5b\62\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200]\3\2\2\2\u0201\u0206\5`\61\2\u0202"+
		"\u0203\t\3\2\2\u0203\u0205\5`\61\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207_\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0209\u020e\5h\65\2\u020a\u020b\t\4\2\2\u020b\u020d\5h\65\2\u020c"+
		"\u020a\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020fa\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0214\5d\63\2\u0212\u0214"+
		"\5f\64\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214c\3\2\2\2\u0215"+
		"\u0216\7X\2\2\u0216\u021a\5t;\2\u0217\u0218\7Y\2\2\u0218\u021a\5t;\2\u0219"+
		"\u0215\3\2\2\2\u0219\u0217\3\2\2\2\u021ae\3\2\2\2\u021b\u021c\5t;\2\u021c"+
		"\u021d\7X\2\2\u021d\u0222\3\2\2\2\u021e\u021f\5t;\2\u021f\u0220\7Y\2\2"+
		"\u0220\u0222\3\2\2\2\u0221\u021b\3\2\2\2\u0221\u021e\3\2\2\2\u0222g\3"+
		"\2\2\2\u0223\u022b\5v<\2\u0224\u022b\5H%\2\u0225\u022b\5t;\2\u0226\u0227"+
		"\7B\2\2\u0227\u0228\5\\/\2\u0228\u0229\7C\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u0223\3\2\2\2\u022a\u0224\3\2\2\2\u022a\u0225\3\2\2\2\u022a\u0226\3\2"+
		"\2\2\u022bi\3\2\2\2\u022c\u022d\5Z.\2\u022d\u022e\7P\2\2\u022e\u022f\5"+
		"\\/\2\u022f\u0230\7Q\2\2\u0230\u0231\5\\/\2\u0231k\3\2\2\2\u0232\u0236"+
		"\5|?\2\u0233\u0235\5r:\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236"+
		"\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0239\u023a\5p9\2\u023am\3\2\2\2\u023b\u023f\5|?\2\u023c\u023e\5"+
		"r:\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7r"+
		"\2\2\u0243o\3\2\2\2\u0244\u0249\7r\2\2\u0245\u0246\7I\2\2\u0246\u0248"+
		"\7r\2\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024aq\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7F\2\2\u024d"+
		"\u024e\7\67\2\2\u024e\u0254\7G\2\2\u024f\u0250\7F\2\2\u0250\u0251\7I\2"+
		"\2\u0251\u0252\7\67\2\2\u0252\u0254\7G\2\2\u0253\u024c\3\2\2\2\u0253\u024f"+
		"\3\2\2\2\u0254s\3\2\2\2\u0255\u025a\7r\2\2\u0256\u0257\7J\2\2\u0257\u0259"+
		"\7r\2\2\u0258\u0256\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u026c\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0260\7\62"+
		"\2\2\u025e\u025f\7J\2\2\u025f\u0261\7r\2\2\u0260\u025e\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u026c\3\2\2\2\u0264"+
		"\u0267\7\60\2\2\u0265\u0266\7J\2\2\u0266\u0268\7r\2\2\u0267\u0265\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026c\3\2\2\2\u026b\u0255\3\2\2\2\u026b\u025d\3\2\2\2\u026b\u0264\3\2"+
		"\2\2\u026cu\3\2\2\2\u026d\u0274\5x=\2\u026e\u0274\5z>\2\u026f\u0274\7"+
		"?\2\2\u0270\u0274\7@\2\2\u0271\u0274\7>\2\2\u0272\u0274\7A\2\2\u0273\u026d"+
		"\3\2\2\2\u0273\u026e\3\2\2\2\u0273\u026f\3\2\2\2\u0273\u0270\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0272\3\2\2\2\u0274w\3\2\2\2\u0275\u0276\t\7\2\2"+
		"\u0276y\3\2\2\2\u0277\u0278\t\b\2\2\u0278{\3\2\2\2\u0279\u027d\5\u0088"+
		"E\2\u027a\u027d\7r\2\2\u027b\u027d\7\n\2\2\u027c\u0279\3\2\2\2\u027c\u027a"+
		"\3\2\2\2\u027c\u027b\3\2\2\2\u027d}\3\2\2\2\u027e\u027f\t\t\2\2\u027f"+
		"\177\3\2\2\2\u0280\u0281\t\n\2\2\u0281\u0081\3\2\2\2\u0282\u0283\t\13"+
		"\2\2\u0283\u0083\3\2\2\2\u0284\u0285\t\f\2\2\u0285\u0085\3\2\2\2\u0286"+
		"\u0289\5|?\2\u0287\u0289\7\13\2\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2"+
		"\2\2\u0289\u0087\3\2\2\2\u028a\u028b\t\r\2\2\u028b\u0089\3\2\2\2B\u008d"+
		"\u0092\u0094\u009b\u00a5\u00ab\u00ae\u00b3\u00bd\u00c3\u00c5\u00c8\u00cd"+
		"\u00d5\u00de\u00e4\u00ed\u00f0\u00f5\u00fb\u00fe\u010f\u0112\u011a\u0123"+
		"\u0129\u012f\u0139\u0149\u0150\u0154\u0181\u018c\u0194\u0197\u01a0\u01b1"+
		"\u01b4\u01ba\u01c1\u01c9\u01d4\u01e4\u01eb\u01ef\u01f9\u01ff\u0206\u020e"+
		"\u0213\u0219\u0221\u022a\u0236\u023f\u0249\u0253\u025a\u0262\u0269\u026b"+
		"\u0273\u027c\u0288";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}