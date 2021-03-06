// Generated from E:/Documents/IntelliJ/Project Flare/src\FlareParser.g4 by ANTLR 4.9.1
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
		PRINT=44, PRINTLN=45, RETURN=46, SUPER=47, SWITCH=48, THIS=49, THROW=50, 
		THROWS=51, TRY=52, WHILE=53, INTEGER_LITERAL=54, FLOAT_LITERAL=55, LONG_LITERAL=56, 
		BOOL_LITERAL=57, CHAR_LITERAL=58, STRING_LITERAL=59, LPAREN=60, RPAREN=61, 
		LBRACE=62, RBRACE=63, LBRACK=64, RBRACK=65, SEMI=66, COMMA=67, DOT=68, 
		ASSIGN=69, GREATER=70, LESSER=71, EXCLAMATION=72, TILDE=73, QUESTION=74, 
		COLON=75, EQUAL=76, LESSEREQUAL=77, GREATEREQUAL=78, NOTEQUAL=79, AND=80, 
		OR=81, INCREMENT=82, DECREMENT=83, ADD=84, SUB=85, MUL=86, DIV=87, BITAND=88, 
		BITOR=89, CARET=90, MOD=91, LSHIFT=92, RSHIFT=93, ADD_ASSIGN=94, SUB_ASSIGN=95, 
		MUL_ASSIGN=96, DIV_ASSIGN=97, AND_ASSIGN=98, OR_ASSIGN=99, XOR_ASSIGN=100, 
		MOD_ASSIGN=101, LSHIFT_ASSIGN=102, RSHIFT_ASSIGN=103, URSHIFT_ASSIGN=104, 
		Whitespace=105, MULTI_COMMENT=106, LINE_COMMENT=107, IDENTIFIER=108;
	public static final int
		RULE_file = 0, RULE_importLine = 1, RULE_packageHeader = 2, RULE_entityHeader = 3, 
		RULE_extensions = 4, RULE_entityBody = 5, RULE_declarationHeader = 6, 
		RULE_declarationLine = 7, RULE_declarationTag = 8, RULE_entityMethods = 9, 
		RULE_definedFunctionHeaders = 10, RULE_constructorHeader = 11, RULE_destructorHeader = 12, 
		RULE_methodHeader = 13, RULE_mainMethod = 14, RULE_declarationParameters = 15, 
		RULE_body = 16, RULE_line = 17, RULE_statement = 18, RULE_newStatement = 19, 
		RULE_returnStatement = 20, RULE_builtinFunctions = 21, RULE_ifStatement = 22, 
		RULE_elseIfStatement = 23, RULE_elseStatement = 24, RULE_forStatement = 25, 
		RULE_foreachStatement = 26, RULE_whileStatement = 27, RULE_doStatement = 28, 
		RULE_switchStatement = 29, RULE_caseStatement = 30, RULE_assertStatement = 31, 
		RULE_printStatement = 32, RULE_conditionAndBlock = 33, RULE_singleLineOrBlockBody = 34, 
		RULE_assignment = 35, RULE_assign = 36, RULE_functionCall = 37, RULE_callParameter = 38, 
		RULE_parameterExpression = 39, RULE_parameterAdditiveExpression = 40, 
		RULE_parameterMultiplicativeExpression = 41, RULE_parameterTerm = 42, 
		RULE_parameterTernaryExpression = 43, RULE_condition = 44, RULE_comparator = 45, 
		RULE_comparison = 46, RULE_expression = 47, RULE_additiveExpression = 48, 
		RULE_multiplicativeExpression = 49, RULE_term = 50, RULE_ternaryExpression = 51, 
		RULE_declarationStatement = 52, RULE_declarationStatementSingular = 53, 
		RULE_identifierList = 54, RULE_arraySpecifier = 55, RULE_castSpecifier = 56, 
		RULE_identifierSpecifier = 57, RULE_literal = 58, RULE_integerLiteral = 59, 
		RULE_floatLiteral = 60, RULE_variableType = 61, RULE_entityModifier = 62, 
		RULE_classOrInterface = 63, RULE_visibilityModifier = 64, RULE_methodModifier = 65, 
		RULE_methodType = 66, RULE_primitiveType = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "importLine", "packageHeader", "entityHeader", "extensions", 
			"entityBody", "declarationHeader", "declarationLine", "declarationTag", 
			"entityMethods", "definedFunctionHeaders", "constructorHeader", "destructorHeader", 
			"methodHeader", "mainMethod", "declarationParameters", "body", "line", 
			"statement", "newStatement", "returnStatement", "builtinFunctions", "ifStatement", 
			"elseIfStatement", "elseStatement", "forStatement", "foreachStatement", 
			"whileStatement", "doStatement", "switchStatement", "caseStatement", 
			"assertStatement", "printStatement", "conditionAndBlock", "singleLineOrBlockBody", 
			"assignment", "assign", "functionCall", "callParameter", "parameterExpression", 
			"parameterAdditiveExpression", "parameterMultiplicativeExpression", "parameterTerm", 
			"parameterTernaryExpression", "condition", "comparator", "comparison", 
			"expression", "additiveExpression", "multiplicativeExpression", "term", 
			"ternaryExpression", "declarationStatement", "declarationStatementSingular", 
			"identifierList", "arraySpecifier", "castSpecifier", "identifierSpecifier", 
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
			"'import'", "'iter'", "'main'", "'package'", "'print'", "'println'", 
			"'return'", "'super'", "'switch'", "'this'", "'throw'", "'throws'", "'try'", 
			"'while'", null, null, null, null, null, null, "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", 
			"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
			"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'<<'", 
			"'>>'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
			"'<<='", "'>>='", "'>>>='"
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
			"IMPLEMENTS", "IMPORT", "ITER", "MAIN", "PACKAGE", "PRINT", "PRINTLN", 
			"RETURN", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TRY", "WHILE", 
			"INTEGER_LITERAL", "FLOAT_LITERAL", "LONG_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
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
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
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
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << VOID) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << FINAL) | (1L << OVERRIDE) | (1L << INTERFACE) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << ENTITY) | (1L << FLOAT) | (1L << PACKAGE))) != 0) || _la==TILDE || _la==IDENTIFIER );
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
			setState(148);
			match(IMPORT);
			setState(149);
			identifierSpecifier();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(150);
				match(AS);
				setState(151);
				match(IDENTIFIER);
				}
			}

			setState(154);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(PACKAGE);
				setState(157);
				match(IDENTIFIER);
				setState(158);
				match(LBRACE);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					entityHeader();
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << INTERFACE) | (1L << STATIC) | (1L << ENTITY))) != 0) );
				setState(164);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				entityHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << STATIC))) != 0)) {
				{
				setState(170);
				entityModifier();
				}
			}

			setState(173);
			classOrInterface();
			setState(174);
			match(IDENTIFIER);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==IMPLEMENTS) {
				{
				setState(175);
				extensions();
				}
			}

			setState(178);
			match(LBRACE);
			setState(179);
			entityBody();
			setState(180);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(EXTENDS);
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183);
					identifierSpecifier();
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (SUPER - 47)) | (1L << (THIS - 47)) | (1L << (IDENTIFIER - 47)))) != 0) );
				}
				break;
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(IMPLEMENTS);
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(189);
					identifierSpecifier();
					}
					}
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (SUPER - 47)) | (1L << (THIS - 47)) | (1L << (IDENTIFIER - 47)))) != 0) );
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
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPONENT) {
				{
				setState(196);
				declarationHeader();
				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << VOID) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << ABSTRACT) | (1L << OVERRIDE) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << FLOAT))) != 0) || _la==TILDE || _la==IDENTIFIER) {
				{
				{
				setState(199);
				entityMethods();
				}
				}
				setState(204);
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
			setState(205);
			match(COMPONENT);
			setState(206);
			match(LBRACE);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << COLD) | (1L << FLOAT) | (1L << HOT))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(207);
				declarationLine();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
			setState(219);
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
				setState(215);
				declarationStatement();
				setState(216);
				match(SEMI);
				}
				break;
			case COLD:
			case HOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
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
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(COLD);
				setState(222);
				match(COLON);
				}
				break;
			case HOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(HOT);
				setState(224);
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
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(227);
				visibilityModifier();
				}
			}

			setState(230);
			definedFunctionHeaders();
			setState(231);
			declarationParameters();
			setState(232);
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
		public DestructorHeaderContext destructorHeader() {
			return getRuleContext(DestructorHeaderContext.class,0);
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				constructorHeader();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				destructorHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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

	public static class DestructorHeaderContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(FlareParser.TILDE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FlareParser.IDENTIFIER, 0); }
		public DestructorHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructorHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitDestructorHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructorHeaderContext destructorHeader() throws RecognitionException {
		DestructorHeaderContext _localctx = new DestructorHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_destructorHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(TILDE);
			setState(242);
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
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << OVERRIDE) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(244);
				methodModifier();
				}
			}

			setState(247);
			methodType();
			setState(248);
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
			setState(250);
			match(VOID);
			setState(251);
			match(MAIN);
			setState(252);
			match(LPAREN);
			setState(253);
			match(RPAREN);
			setState(254);
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
			setState(256);
			match(LPAREN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << FLOAT))) != 0) || _la==IDENTIFIER) {
				{
				setState(257);
				declarationStatementSingular();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(258);
					match(COMMA);
					setState(259);
					declarationStatementSingular();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(267);
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
			setState(269);
			match(LBRACE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << SUPER) | (1L << THIS) | (1L << WHILE))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(270);
				line();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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
			setState(282);
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
				setState(278);
				statement();
				setState(279);
				match(SEMI);
				}
				break;
			case DO:
			case FOR:
			case IF:
			case PRINT:
			case PRINTLN:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
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
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				newStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				returnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
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
			setState(290);
			variableType();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(291);
				arraySpecifier();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(IDENTIFIER);
			setState(298);
			callParameter();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(299);
				match(COMMA);
				setState(300);
				match(IDENTIFIER);
				setState(301);
				callParameter();
				}
				}
				setState(306);
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
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
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
			setState(307);
			match(RETURN);
			setState(308);
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

	public static class BuiltinFunctionsContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
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
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				whileStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				doStatement();
				}
				break;
			case PRINT:
			case PRINTLN:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				printStatement();
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
			setState(317);
			match(IF);
			setState(318);
			conditionAndBlock();
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					elseIfStatement();
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(325);
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
			setState(328);
			match(ELSE);
			setState(329);
			match(IF);
			setState(330);
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
			setState(332);
			match(ELSE);
			setState(333);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public SingleLineOrBlockBodyContext singleLineOrBlockBody() {
			return getRuleContext(SingleLineOrBlockBodyContext.class,0);
		}
		public NewStatementContext newStatement() {
			return getRuleContext(NewStatementContext.class,0);
		}
		public IdentifierSpecifierContext identifierSpecifier() {
			return getRuleContext(IdentifierSpecifierContext.class,0);
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
			setState(335);
			match(FOR);
			setState(336);
			match(LPAREN);
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(337);
				newStatement();
				}
				break;
			case 2:
				{
				setState(338);
				identifierSpecifier();
				}
				break;
			}
			setState(341);
			match(SEMI);
			setState(342);
			condition();
			setState(343);
			match(SEMI);
			setState(344);
			assignment();
			setState(345);
			match(RPAREN);
			setState(346);
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
			setState(348);
			match(FOR);
			setState(349);
			match(LPAREN);
			setState(350);
			declarationStatement();
			setState(351);
			match(COLON);
			setState(352);
			identifierSpecifier();
			setState(353);
			match(RPAREN);
			setState(354);
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
			setState(356);
			match(WHILE);
			setState(357);
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
			setState(359);
			match(DO);
			setState(360);
			singleLineOrBlockBody();
			setState(361);
			match(WHILE);
			setState(362);
			match(LPAREN);
			setState(363);
			condition();
			setState(364);
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
			setState(366);
			match(SWITCH);
			setState(367);
			match(LPAREN);
			setState(368);
			identifierSpecifier();
			setState(369);
			match(RPAREN);
			setState(370);
			match(LBRACE);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(371);
				caseStatement();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
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
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(CASE);
				setState(380);
				literal();
				setState(381);
				match(COLON);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << SUPER) | (1L << THIS) | (1L << WHILE))) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(382);
					line();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(DEFAULT);
				setState(389);
				match(COLON);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << DO) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << SUPER) | (1L << THIS) | (1L << WHILE))) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(390);
					line();
					}
					}
					setState(395);
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

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(FlareParser.ASSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(ASSERT);
			setState(399);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(FlareParser.SEMI, 0); }
		public TerminalNode PRINT() { return getToken(FlareParser.PRINT, 0); }
		public TerminalNode PRINTLN() { return getToken(FlareParser.PRINTLN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FlareParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlareParser.COMMA, i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlareParserVisitor ) return ((FlareParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !(_la==PRINT || _la==PRINTLN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(402);
			match(LPAREN);
			setState(403);
			expression();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(404);
				match(COMMA);
				setState(405);
				expression();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(RPAREN);
			setState(412);
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
		enterRule(_localctx, 66, RULE_conditionAndBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(LPAREN);
			setState(415);
			condition();
			setState(416);
			match(RPAREN);
			setState(417);
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
		enterRule(_localctx, 68, RULE_singleLineOrBlockBody);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
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
			case DO:
			case FLOAT:
			case FOR:
			case IF:
			case PRINT:
			case PRINTLN:
			case RETURN:
			case SUPER:
			case THIS:
			case WHILE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
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
		enterRule(_localctx, 70, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			identifierSpecifier();
			setState(424);
			assign();
			setState(425);
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
		enterRule(_localctx, 72, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ASSIGN - 69)) | (1L << (ADD_ASSIGN - 69)) | (1L << (SUB_ASSIGN - 69)) | (1L << (MUL_ASSIGN - 69)) | (1L << (DIV_ASSIGN - 69)) | (1L << (AND_ASSIGN - 69)) | (1L << (OR_ASSIGN - 69)) | (1L << (XOR_ASSIGN - 69)) | (1L << (MOD_ASSIGN - 69)) | (1L << (LSHIFT_ASSIGN - 69)) | (1L << (RSHIFT_ASSIGN - 69)) | (1L << (URSHIFT_ASSIGN - 69)))) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			identifierSpecifier();
			setState(430);
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
		enterRule(_localctx, 76, RULE_callParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(LPAREN);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ITER) | (1L << SUPER) | (1L << THIS) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << LONG_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LPAREN))) != 0) || _la==SUB || _la==IDENTIFIER) {
				{
				setState(433);
				parameterExpression();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(434);
					match(COMMA);
					setState(435);
					parameterExpression();
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(443);
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
		enterRule(_localctx, 78, RULE_parameterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			parameterAdditiveExpression();
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
		enterRule(_localctx, 80, RULE_parameterAdditiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			parameterMultiplicativeExpression();
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
				parameterMultiplicativeExpression();
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
		enterRule(_localctx, 82, RULE_parameterMultiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			parameterTerm();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) {
				{
				{
				setState(456);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				parameterTerm();
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
		enterRule(_localctx, 84, RULE_parameterTerm);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				identifierSpecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(ITER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				match(LPAREN);
				setState(468);
				parameterExpression();
				setState(469);
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
		enterRule(_localctx, 86, RULE_parameterTernaryExpression);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(LPAREN);
				setState(474);
				condition();
				setState(475);
				match(RPAREN);
				setState(476);
				match(QUESTION);
				setState(477);
				parameterExpression();
				setState(478);
				match(COLON);
				setState(479);
				parameterExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				condition();
				setState(482);
				match(QUESTION);
				setState(483);
				expression();
				setState(484);
				match(COLON);
				setState(485);
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
		enterRule(_localctx, 88, RULE_condition);
		int _la;
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				comparator();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(490);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(491);
					comparator();
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
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
		enterRule(_localctx, 90, RULE_comparator);
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				expression();
				setState(501);
				comparison();
				setState(502);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(LPAREN);
				setState(505);
				condition();
				setState(506);
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
		enterRule(_localctx, 92, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (GREATER - 70)) | (1L << (LESSER - 70)) | (1L << (EQUAL - 70)) | (1L << (LESSEREQUAL - 70)) | (1L << (GREATEREQUAL - 70)) | (1L << (NOTEQUAL - 70)))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			additiveExpression();
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
		enterRule(_localctx, 96, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			multiplicativeExpression();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				multiplicativeExpression();
				}
				}
				setState(521);
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
		enterRule(_localctx, 98, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			term();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) {
				{
				{
				setState(523);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(524);
				term();
				}
				}
				setState(529);
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
		enterRule(_localctx, 100, RULE_term);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				identifierSpecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				match(LPAREN);
				setState(534);
				expression();
				setState(535);
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
		enterRule(_localctx, 102, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			comparison();
			setState(540);
			match(QUESTION);
			setState(541);
			expression();
			setState(542);
			match(COLON);
			setState(543);
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
		enterRule(_localctx, 104, RULE_declarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			variableType();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(546);
				arraySpecifier();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
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
		enterRule(_localctx, 106, RULE_declarationStatementSingular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			variableType();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(555);
				arraySpecifier();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
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
		enterRule(_localctx, 108, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(IDENTIFIER);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(564);
				match(COMMA);
				setState(565);
				match(IDENTIFIER);
				}
				}
				setState(570);
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
		public List<TerminalNode> COLON() { return getTokens(FlareParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FlareParser.COLON, i);
		}
		public TerminalNode LESSER() { return getToken(FlareParser.LESSER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(FlareParser.INTEGER_LITERAL, 0); }
		public TerminalNode GREATER() { return getToken(FlareParser.GREATER, 0); }
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
		enterRule(_localctx, 110, RULE_arraySpecifier);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(COLON);
				setState(572);
				match(COLON);
				setState(573);
				match(LESSER);
				setState(574);
				match(INTEGER_LITERAL);
				setState(575);
				match(GREATER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(COLON);
				setState(577);
				match(COLON);
				setState(578);
				match(LESSER);
				setState(579);
				match(COMMA);
				setState(580);
				match(INTEGER_LITERAL);
				setState(581);
				match(GREATER);
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

	public static class CastSpecifierContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FlareParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlareParser.RPAREN, 0); }
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_castSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(LPAREN);
			setState(585);
			primitiveType();
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(586);
				arraySpecifier();
				}
			}

			setState(589);
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
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(IDENTIFIER);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(592);
					match(DOT);
					setState(593);
					match(IDENTIFIER);
					}
					}
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(THIS);
				setState(602); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(600);
					match(DOT);
					setState(601);
					match(IDENTIFIER);
					}
					}
					setState(604); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				match(SUPER);
				setState(609); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(607);
					match(DOT);
					setState(608);
					match(IDENTIFIER);
					}
					}
					setState(611); 
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
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case LONG_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(619);
				match(BOOL_LITERAL);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(FlareParser.INTEGER_LITERAL, 0); }
		public TerminalNode SUB() { return getToken(FlareParser.SUB, 0); }
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
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(INTEGER_LITERAL);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(SUB);
				setState(624);
				match(INTEGER_LITERAL);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(FlareParser.FLOAT_LITERAL, 0); }
		public TerminalNode LONG_LITERAL() { return getToken(FlareParser.LONG_LITERAL, 0); }
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
			setState(627);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==LONG_LITERAL) ) {
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
			setState(631);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(IDENTIFIER);
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
			setState(633);
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
			setState(635);
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
			setState(637);
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
			setState(639);
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
			setState(643);
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
				setState(641);
				variableType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
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
		public TerminalNode STRING() { return getToken(FlareParser.STRING, 0); }
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
			setState(645);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u028a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\7\2\u008c\n\2\f\2"+
		"\16\2\u008f\13\2\3\2\3\2\6\2\u0093\n\2\r\2\16\2\u0094\3\3\3\3\3\3\3\3"+
		"\5\3\u009b\n\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4\u00a3\n\4\r\4\16\4\u00a4\3"+
		"\4\3\4\3\4\3\4\5\4\u00ab\n\4\3\5\5\5\u00ae\n\5\3\5\3\5\3\5\5\5\u00b3\n"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\6\6\u00bb\n\6\r\6\16\6\u00bc\3\6\3\6\6\6\u00c1"+
		"\n\6\r\6\16\6\u00c2\5\6\u00c5\n\6\3\7\5\7\u00c8\n\7\3\7\7\7\u00cb\n\7"+
		"\f\7\16\7\u00ce\13\7\3\b\3\b\3\b\7\b\u00d3\n\b\f\b\16\b\u00d6\13\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\5\t\u00de\n\t\3\n\3\n\3\n\3\n\5\n\u00e4\n\n\3\13"+
		"\5\13\u00e7\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00f0\n\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\5\17\u00f8\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0107\n\21\f\21\16\21\u010a\13\21"+
		"\5\21\u010c\n\21\3\21\3\21\3\22\3\22\7\22\u0112\n\22\f\22\16\22\u0115"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u011d\n\23\3\24\3\24\3\24\3"+
		"\24\5\24\u0123\n\24\3\25\3\25\7\25\u0127\n\25\f\25\16\25\u012a\13\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u0131\n\25\f\25\16\25\u0134\13\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u013e\n\27\3\30\3\30\3\30\7\30"+
		"\u0143\n\30\f\30\16\30\u0146\13\30\3\30\5\30\u0149\n\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0156\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0177\n\37\f\37\16\37\u017a\13\37\3\37\3\37\3 \3 \3 \3 \7 \u0182"+
		"\n \f \16 \u0185\13 \3 \3 \3 \7 \u018a\n \f \16 \u018d\13 \5 \u018f\n"+
		" \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0199\n\"\f\"\16\"\u019c\13\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\5$\u01a8\n$\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\7(\u01b7\n(\f(\16(\u01ba\13(\5(\u01bc\n(\3(\3(\3)\3)\3*\3"+
		"*\3*\7*\u01c5\n*\f*\16*\u01c8\13*\3+\3+\3+\7+\u01cd\n+\f+\16+\u01d0\13"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01da\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\5-\u01ea\n-\3.\3.\3.\7.\u01ef\n.\f.\16.\u01f2\13.\3.\5.\u01f5"+
		"\n.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01ff\n/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\7\62\u0208\n\62\f\62\16\62\u020b\13\62\3\63\3\63\3\63\7\63\u0210"+
		"\n\63\f\63\16\63\u0213\13\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u021c"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\7\66\u0226\n\66\f\66\16"+
		"\66\u0229\13\66\3\66\3\66\3\67\3\67\7\67\u022f\n\67\f\67\16\67\u0232\13"+
		"\67\3\67\3\67\38\38\38\78\u0239\n8\f8\168\u023c\138\39\39\39\39\39\39"+
		"\39\39\39\39\39\59\u0249\n9\3:\3:\3:\5:\u024e\n:\3:\3:\3;\3;\3;\7;\u0255"+
		"\n;\f;\16;\u0258\13;\3;\3;\3;\6;\u025d\n;\r;\16;\u025e\3;\3;\3;\6;\u0264"+
		"\n;\r;\16;\u0265\5;\u0268\n;\3<\3<\3<\3<\3<\5<\u026f\n<\3=\3=\3=\5=\u0274"+
		"\n=\3>\3>\3?\3?\5?\u027a\n?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\5D\u0286\nD"+
		"\3E\3E\3E\2\2F\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\2\16\3\2./\4\2GG`j\3\2VW\4\2XY]]\3\2RS\4\2HINQ\3\29:\4\2\17\20\23\23"+
		"\4\2\22\22!!\3\2\f\16\5\2\17\17\21\21\23\24\4\2\3\n%%\2\u0292\2\u008d"+
		"\3\2\2\2\4\u0096\3\2\2\2\6\u00aa\3\2\2\2\b\u00ad\3\2\2\2\n\u00c4\3\2\2"+
		"\2\f\u00c7\3\2\2\2\16\u00cf\3\2\2\2\20\u00dd\3\2\2\2\22\u00e3\3\2\2\2"+
		"\24\u00e6\3\2\2\2\26\u00ef\3\2\2\2\30\u00f1\3\2\2\2\32\u00f3\3\2\2\2\34"+
		"\u00f7\3\2\2\2\36\u00fc\3\2\2\2 \u0102\3\2\2\2\"\u010f\3\2\2\2$\u011c"+
		"\3\2\2\2&\u0122\3\2\2\2(\u0124\3\2\2\2*\u0135\3\2\2\2,\u013d\3\2\2\2."+
		"\u013f\3\2\2\2\60\u014a\3\2\2\2\62\u014e\3\2\2\2\64\u0151\3\2\2\2\66\u015e"+
		"\3\2\2\28\u0166\3\2\2\2:\u0169\3\2\2\2<\u0170\3\2\2\2>\u018e\3\2\2\2@"+
		"\u0190\3\2\2\2B\u0193\3\2\2\2D\u01a0\3\2\2\2F\u01a7\3\2\2\2H\u01a9\3\2"+
		"\2\2J\u01ad\3\2\2\2L\u01af\3\2\2\2N\u01b2\3\2\2\2P\u01bf\3\2\2\2R\u01c1"+
		"\3\2\2\2T\u01c9\3\2\2\2V\u01d9\3\2\2\2X\u01e9\3\2\2\2Z\u01f4\3\2\2\2\\"+
		"\u01fe\3\2\2\2^\u0200\3\2\2\2`\u0202\3\2\2\2b\u0204\3\2\2\2d\u020c\3\2"+
		"\2\2f\u021b\3\2\2\2h\u021d\3\2\2\2j\u0223\3\2\2\2l\u022c\3\2\2\2n\u0235"+
		"\3\2\2\2p\u0248\3\2\2\2r\u024a\3\2\2\2t\u0267\3\2\2\2v\u026e\3\2\2\2x"+
		"\u0273\3\2\2\2z\u0275\3\2\2\2|\u0279\3\2\2\2~\u027b\3\2\2\2\u0080\u027d"+
		"\3\2\2\2\u0082\u027f\3\2\2\2\u0084\u0281\3\2\2\2\u0086\u0285\3\2\2\2\u0088"+
		"\u0287\3\2\2\2\u008a\u008c\5\4\3\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0093\5\6\4\2\u0091\u0093\5\36\20\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\3\3\2\2\2\u0096\u0097\7*\2\2\u0097\u009a\5t;\2\u0098"+
		"\u0099\7\25\2\2\u0099\u009b\7n\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7D\2\2\u009d\5\3\2\2\2\u009e\u009f"+
		"\7-\2\2\u009f\u00a0\7n\2\2\u00a0\u00a2\7@\2\2\u00a1\u00a3\5\b\5\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7A\2\2\u00a7\u00ab\3\2\2\2\u00a8"+
		"\u00ab\5\b\5\2\u00a9\u00ab\5\24\13\2\u00aa\u009e\3\2\2\2\u00aa\u00a8\3"+
		"\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\7\3\2\2\2\u00ac\u00ae\5~@\2\u00ad\u00ac"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5\u0080A"+
		"\2\u00b0\u00b2\7n\2\2\u00b1\u00b3\5\n\6\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6\5\f\7\2\u00b6"+
		"\u00b7\7A\2\2\u00b7\t\3\2\2\2\u00b8\u00ba\7#\2\2\u00b9\u00bb\5t;\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00c5\3\2\2\2\u00be\u00c0\7)\2\2\u00bf\u00c1\5t;\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\13\3\2\2"+
		"\2\u00c6\u00c8\5\16\b\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00cc\3\2\2\2\u00c9\u00cb\5\24\13\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\r\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d0\7\33\2\2\u00d0\u00d4\7@\2\2\u00d1\u00d3\5\20\t\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7A\2\2\u00d8"+
		"\17\3\2\2\2\u00d9\u00da\5j\66\2\u00da\u00db\7D\2\2\u00db\u00de\3\2\2\2"+
		"\u00dc\u00de\5\22\n\2\u00dd\u00d9\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\21"+
		"\3\2\2\2\u00df\u00e0\7\32\2\2\u00e0\u00e4\7M\2\2\u00e1\u00e2\7\'\2\2\u00e2"+
		"\u00e4\7M\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\23\3\2\2\2"+
		"\u00e5\u00e7\5\u0082B\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea\5 \21\2\u00ea\u00eb\5"+
		"\"\22\2\u00eb\25\3\2\2\2\u00ec\u00f0\5\30\r\2\u00ed\u00f0\5\32\16\2\u00ee"+
		"\u00f0\5\34\17\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3"+
		"\2\2\2\u00f0\27\3\2\2\2\u00f1\u00f2\7n\2\2\u00f2\31\3\2\2\2\u00f3\u00f4"+
		"\7K\2\2\u00f4\u00f5\7n\2\2\u00f5\33\3\2\2\2\u00f6\u00f8\5\u0084C\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\5\u0086"+
		"D\2\u00fa\u00fb\7n\2\2\u00fb\35\3\2\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe"+
		"\7,\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100\7?\2\2\u0100\u0101\5\"\22\2\u0101"+
		"\37\3\2\2\2\u0102\u010b\7>\2\2\u0103\u0108\5l\67\2\u0104\u0105\7E\2\2"+
		"\u0105\u0107\5l\67\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u0103\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7?"+
		"\2\2\u010e!\3\2\2\2\u010f\u0113\7@\2\2\u0110\u0112\5$\23\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7A\2\2\u0117#\3\2\2\2\u0118"+
		"\u0119\5&\24\2\u0119\u011a\7D\2\2\u011a\u011d\3\2\2\2\u011b\u011d\5,\27"+
		"\2\u011c\u0118\3\2\2\2\u011c\u011b\3\2\2\2\u011d%\3\2\2\2\u011e\u0123"+
		"\5(\25\2\u011f\u0123\5*\26\2\u0120\u0123\5H%\2\u0121\u0123\5L\'\2\u0122"+
		"\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\'\3\2\2\2\u0124\u0128\5|?\2\u0125\u0127\5p9\2\u0126\u0125\3"+
		"\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7n\2\2\u012c\u0132\5N("+
		"\2\u012d\u012e\7E\2\2\u012e\u012f\7n\2\2\u012f\u0131\5N(\2\u0130\u012d"+
		"\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		")\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\60\2\2\u0136\u0137\5t;\2\u0137"+
		"+\3\2\2\2\u0138\u013e\5.\30\2\u0139\u013e\5\64\33\2\u013a\u013e\58\35"+
		"\2\u013b\u013e\5:\36\2\u013c\u013e\5B\"\2\u013d\u0138\3\2\2\2\u013d\u0139"+
		"\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"-\3\2\2\2\u013f\u0140\7(\2\2\u0140\u0144\5D#\2\u0141\u0143\5\60\31\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\5\62\32\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149/\3\2\2\2\u014a\u014b\7 \2\2\u014b"+
		"\u014c\7(\2\2\u014c\u014d\5D#\2\u014d\61\3\2\2\2\u014e\u014f\7 \2\2\u014f"+
		"\u0150\5F$\2\u0150\63\3\2\2\2\u0151\u0152\7&\2\2\u0152\u0155\7>\2\2\u0153"+
		"\u0156\5(\25\2\u0154\u0156\5t;\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2"+
		"\2\u0156\u0157\3\2\2\2\u0157\u0158\7D\2\2\u0158\u0159\5Z.\2\u0159\u015a"+
		"\7D\2\2\u015a\u015b\5H%\2\u015b\u015c\7?\2\2\u015c\u015d\5F$\2\u015d\65"+
		"\3\2\2\2\u015e\u015f\7&\2\2\u015f\u0160\7>\2\2\u0160\u0161\5j\66\2\u0161"+
		"\u0162\7M\2\2\u0162\u0163\5t;\2\u0163\u0164\7?\2\2\u0164\u0165\5F$\2\u0165"+
		"\67\3\2\2\2\u0166\u0167\7\67\2\2\u0167\u0168\5D#\2\u01689\3\2\2\2\u0169"+
		"\u016a\7\37\2\2\u016a\u016b\5F$\2\u016b\u016c\7\67\2\2\u016c\u016d\7>"+
		"\2\2\u016d\u016e\5Z.\2\u016e\u016f\7?\2\2\u016f;\3\2\2\2\u0170\u0171\7"+
		"\62\2\2\u0171\u0172\7>\2\2\u0172\u0173\5t;\2\u0173\u0174\7?\2\2\u0174"+
		"\u0178\7@\2\2\u0175\u0177\5> \2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2"+
		"\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017b\u017c\7A\2\2\u017c=\3\2\2\2\u017d\u017e\7\30\2\2\u017e"+
		"\u017f\5v<\2\u017f\u0183\7M\2\2\u0180\u0182\5$\23\2\u0181\u0180\3\2\2"+
		"\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u018f"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\36\2\2\u0187\u018b\7M\2\2\u0188"+
		"\u018a\5$\23\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u017d\3\2\2\2\u018e\u0186\3\2\2\2\u018f?\3\2\2\2\u0190\u0191\7\26\2\2"+
		"\u0191\u0192\5`\61\2\u0192A\3\2\2\2\u0193\u0194\t\2\2\2\u0194\u0195\7"+
		">\2\2\u0195\u019a\5`\61\2\u0196\u0197\7E\2\2\u0197\u0199\5`\61\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7?\2\2\u019e"+
		"\u019f\7D\2\2\u019fC\3\2\2\2\u01a0\u01a1\7>\2\2\u01a1\u01a2\5Z.\2\u01a2"+
		"\u01a3\7?\2\2\u01a3\u01a4\5F$\2\u01a4E\3\2\2\2\u01a5\u01a8\5\"\22\2\u01a6"+
		"\u01a8\5$\23\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8G\3\2\2\2"+
		"\u01a9\u01aa\5t;\2\u01aa\u01ab\5J&\2\u01ab\u01ac\5`\61\2\u01acI\3\2\2"+
		"\2\u01ad\u01ae\t\3\2\2\u01aeK\3\2\2\2\u01af\u01b0\5t;\2\u01b0\u01b1\5"+
		"N(\2\u01b1M\3\2\2\2\u01b2\u01bb\7>\2\2\u01b3\u01b8\5P)\2\u01b4\u01b5\7"+
		"E\2\2\u01b5\u01b7\5P)\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\7?\2\2\u01beO\3\2\2\2\u01bf\u01c0\5R*\2\u01c0Q\3\2\2\2\u01c1\u01c6"+
		"\5T+\2\u01c2\u01c3\t\4\2\2\u01c3\u01c5\5T+\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7S\3\2\2\2"+
		"\u01c8\u01c6\3\2\2\2\u01c9\u01ce\5V,\2\u01ca\u01cb\t\5\2\2\u01cb\u01cd"+
		"\5V,\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cfU\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01da\5v<\2\u01d2"+
		"\u01da\5L\'\2\u01d3\u01da\5t;\2\u01d4\u01da\7+\2\2\u01d5\u01d6\7>\2\2"+
		"\u01d6\u01d7\5P)\2\u01d7\u01d8\7?\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d1"+
		"\3\2\2\2\u01d9\u01d2\3\2\2\2\u01d9\u01d3\3\2\2\2\u01d9\u01d4\3\2\2\2\u01d9"+
		"\u01d5\3\2\2\2\u01daW\3\2\2\2\u01db\u01dc\7>\2\2\u01dc\u01dd\5Z.\2\u01dd"+
		"\u01de\7?\2\2\u01de\u01df\7L\2\2\u01df\u01e0\5P)\2\u01e0\u01e1\7M\2\2"+
		"\u01e1\u01e2\5P)\2\u01e2\u01ea\3\2\2\2\u01e3\u01e4\5Z.\2\u01e4\u01e5\7"+
		"L\2\2\u01e5\u01e6\5`\61\2\u01e6\u01e7\7M\2\2\u01e7\u01e8\5`\61\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01db\3\2\2\2\u01e9\u01e3\3\2\2\2\u01eaY\3\2\2\2"+
		"\u01eb\u01f0\5\\/\2\u01ec\u01ed\t\6\2\2\u01ed\u01ef\5\\/\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f5\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\7;\2\2\u01f4\u01eb\3\2"+
		"\2\2\u01f4\u01f3\3\2\2\2\u01f5[\3\2\2\2\u01f6\u01f7\5`\61\2\u01f7\u01f8"+
		"\5^\60\2\u01f8\u01f9\5`\61\2\u01f9\u01ff\3\2\2\2\u01fa\u01fb\7>\2\2\u01fb"+
		"\u01fc\5Z.\2\u01fc\u01fd\7?\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01f6\3\2\2"+
		"\2\u01fe\u01fa\3\2\2\2\u01ff]\3\2\2\2\u0200\u0201\t\7\2\2\u0201_\3\2\2"+
		"\2\u0202\u0203\5b\62\2\u0203a\3\2\2\2\u0204\u0209\5d\63\2\u0205\u0206"+
		"\t\4\2\2\u0206\u0208\5d\63\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020ac\3\2\2\2\u020b\u0209\3\2\2\2"+
		"\u020c\u0211\5f\64\2\u020d\u020e\t\5\2\2\u020e\u0210\5f\64\2\u020f\u020d"+
		"\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"e\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u021c\5v<\2\u0215\u021c\5L\'\2\u0216"+
		"\u021c\5t;\2\u0217\u0218\7>\2\2\u0218\u0219\5`\61\2\u0219\u021a\7?\2\2"+
		"\u021a\u021c\3\2\2\2\u021b\u0214\3\2\2\2\u021b\u0215\3\2\2\2\u021b\u0216"+
		"\3\2\2\2\u021b\u0217\3\2\2\2\u021cg\3\2\2\2\u021d\u021e\5^\60\2\u021e"+
		"\u021f\7L\2\2\u021f\u0220\5`\61\2\u0220\u0221\7M\2\2\u0221\u0222\5`\61"+
		"\2\u0222i\3\2\2\2\u0223\u0227\5|?\2\u0224\u0226\5p9\2\u0225\u0224\3\2"+
		"\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\5n8\2\u022bk\3\2\2\2\u022c"+
		"\u0230\5|?\2\u022d\u022f\5p9\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2"+
		"\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230"+
		"\3\2\2\2\u0233\u0234\7n\2\2\u0234m\3\2\2\2\u0235\u023a\7n\2\2\u0236\u0237"+
		"\7E\2\2\u0237\u0239\7n\2\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023bo\3\2\2\2\u023c\u023a\3\2\2\2"+
		"\u023d\u023e\7M\2\2\u023e\u023f\7M\2\2\u023f\u0240\7I\2\2\u0240\u0241"+
		"\78\2\2\u0241\u0249\7H\2\2\u0242\u0243\7M\2\2\u0243\u0244\7M\2\2\u0244"+
		"\u0245\7I\2\2\u0245\u0246\7E\2\2\u0246\u0247\78\2\2\u0247\u0249\7H\2\2"+
		"\u0248\u023d\3\2\2\2\u0248\u0242\3\2\2\2\u0249q\3\2\2\2\u024a\u024b\7"+
		">\2\2\u024b\u024d\5\u0088E\2\u024c\u024e\5p9\2\u024d\u024c\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7?\2\2\u0250s\3\2\2\2\u0251"+
		"\u0256\7n\2\2\u0252\u0253\7F\2\2\u0253\u0255\7n\2\2\u0254\u0252\3\2\2"+
		"\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0268"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025c\7\63\2\2\u025a\u025b\7F\2\2\u025b"+
		"\u025d\7n\2\2\u025c\u025a\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025c\3\2"+
		"\2\2\u025e\u025f\3\2\2\2\u025f\u0268\3\2\2\2\u0260\u0263\7\61\2\2\u0261"+
		"\u0262\7F\2\2\u0262\u0264\7n\2\2\u0263\u0261\3\2\2\2\u0264\u0265\3\2\2"+
		"\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0251"+
		"\3\2\2\2\u0267\u0259\3\2\2\2\u0267\u0260\3\2\2\2\u0268u\3\2\2\2\u0269"+
		"\u026f\5x=\2\u026a\u026f\5z>\2\u026b\u026f\7<\2\2\u026c\u026f\7=\2\2\u026d"+
		"\u026f\7;\2\2\u026e\u0269\3\2\2\2\u026e\u026a\3\2\2\2\u026e\u026b\3\2"+
		"\2\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026fw\3\2\2\2\u0270\u0274"+
		"\78\2\2\u0271\u0272\7W\2\2\u0272\u0274\78\2\2\u0273\u0270\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0274y\3\2\2\2\u0275\u0276\t\b\2\2\u0276{\3\2\2\2\u0277"+
		"\u027a\5\u0088E\2\u0278\u027a\7n\2\2\u0279\u0277\3\2\2\2\u0279\u0278\3"+
		"\2\2\2\u027a}\3\2\2\2\u027b\u027c\t\t\2\2\u027c\177\3\2\2\2\u027d\u027e"+
		"\t\n\2\2\u027e\u0081\3\2\2\2\u027f\u0280\t\13\2\2\u0280\u0083\3\2\2\2"+
		"\u0281\u0282\t\f\2\2\u0282\u0085\3\2\2\2\u0283\u0286\5|?\2\u0284\u0286"+
		"\7\13\2\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286\u0087\3\2\2\2"+
		"\u0287\u0288\t\r\2\2\u0288\u0089\3\2\2\2?\u008d\u0092\u0094\u009a\u00a4"+
		"\u00aa\u00ad\u00b2\u00bc\u00c2\u00c4\u00c7\u00cc\u00d4\u00dd\u00e3\u00e6"+
		"\u00ef\u00f7\u0108\u010b\u0113\u011c\u0122\u0128\u0132\u013d\u0144\u0148"+
		"\u0155\u0178\u0183\u018b\u018e\u019a\u01a7\u01b8\u01bb\u01c6\u01ce\u01d9"+
		"\u01e9\u01f0\u01f4\u01fe\u0209\u0211\u021b\u0227\u0230\u023a\u0248\u024d"+
		"\u0256\u025e\u0265\u0267\u026e\u0273\u0279\u0285";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}