// Generated from E:/Documents/IntelliJ/Project Flare/src\FlareLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlareLexer extends Lexer {
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
		TRY=51, WHILE=52, INTEGER_LITERAL=53, FLOAT_LITERAL=54, LONG_LITERAL=55, 
		BOOL_LITERAL=56, CHAR_LITERAL=57, STRING_LITERAL=58, LPAREN=59, RPAREN=60, 
		LBRACE=61, RBRACE=62, LBRACK=63, RBRACK=64, SEMI=65, COMMA=66, DOT=67, 
		ASSIGN=68, GREATER=69, LESSER=70, EXCLAMATION=71, TILDE=72, QUESTION=73, 
		COLON=74, EQUAL=75, LESSEREQUAL=76, GREATEREQUAL=77, NOTEQUAL=78, AND=79, 
		OR=80, INCREMENT=81, DECREMENT=82, ADD=83, SUB=84, MUL=85, DIV=86, BITAND=87, 
		BITOR=88, CARET=89, MOD=90, LSHIFT=91, RSHIFT=92, ADD_ASSIGN=93, SUB_ASSIGN=94, 
		MUL_ASSIGN=95, DIV_ASSIGN=96, AND_ASSIGN=97, OR_ASSIGN=98, XOR_ASSIGN=99, 
		MOD_ASSIGN=100, LSHIFT_ASSIGN=101, RSHIFT_ASSIGN=102, URSHIFT_ASSIGN=103, 
		Whitespace=104, MULTI_COMMENT=105, LINE_COMMENT=106, IDENTIFIER=107;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "BYTE", "CHAR", "DOUBLE", "INT", "LONG", "SHORT", "STRING", 
			"VOID", "PRIVATE", "PROTECTED", "PUBLIC", "ABSTRACT", "FINAL", "OVERRIDE", 
			"INTERFACE", "STATIC", "SYNCHRONIZED", "AS", "ASSERT", "BREAK", "CASE", 
			"CATCH", "COLD", "COMPONENT", "CONST", "CONTINUE", "DEFAULT", "DO", "ELSE", 
			"ENTITY", "ENUM", "EXTENDS", "FINALLY", "FLOAT", "FOR", "HOT", "IF", 
			"IMPLEMENTS", "IMPORT", "ITER", "MAIN", "PACKAGE", "PRINT", "RETURN", 
			"SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TRY", "WHILE", "INTEGER_LITERAL", 
			"FLOAT_LITERAL", "LONG_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GREATER", "LESSER", "EXCLAMATION", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LESSEREQUAL", "GREATEREQUAL", "NOTEQUAL", "AND", "OR", 
			"INCREMENT", "DECREMENT", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "LSHIFT", "RSHIFT", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
			"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Whitespace", "MULTI_COMMENT", 
			"LINE_COMMENT", "IDENTIFIER", "ExponentPart", "EscapeSequence", "HexDigits", 
			"HexDigit", "Digits", "LetterOrDigit", "Letter"
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
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'<<'", "'>>'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='"
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
			"FLOAT_LITERAL", "LONG_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GREATER", "LESSER", "EXCLAMATION", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LESSEREQUAL", "GREATEREQUAL", "NOTEQUAL", "AND", "OR", 
			"INCREMENT", "DECREMENT", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "LSHIFT", "RSHIFT", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
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


	public FlareLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FlareLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2m\u0352\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\7\66\u023e\n\66\f\66\16\66\u0241\13"+
		"\66\5\66\u0243\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u024c\n\67"+
		"\3\67\5\67\u024f\n\67\3\67\5\67\u0252\n\67\38\38\38\38\38\38\38\58\u025b"+
		"\n8\38\58\u025e\n8\38\58\u0261\n8\39\39\39\39\39\39\39\39\39\59\u026c"+
		"\n9\3:\3:\3:\5:\u0271\n:\3:\3:\3;\3;\3;\7;\u0278\n;\f;\16;\u027b\13;\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3"+
		"P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3"+
		"Y\3Z\3Z\3[\3[\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3_\3`\3`\3`\3a\3a\3"+
		"a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\3h\3h\3"+
		"h\3h\3h\3i\6i\u02f3\ni\ri\16i\u02f4\3i\3i\3j\3j\3j\3j\7j\u02fd\nj\fj\16"+
		"j\u0300\13j\3j\3j\3j\3j\3j\3k\3k\3k\3k\7k\u030b\nk\fk\16k\u030e\13k\3"+
		"k\3k\3l\3l\7l\u0314\nl\fl\16l\u0317\13l\3m\3m\5m\u031b\nm\3m\3m\3n\3n"+
		"\3n\3n\5n\u0323\nn\3n\5n\u0326\nn\3n\3n\3n\6n\u032b\nn\rn\16n\u032c\3"+
		"n\3n\3n\3n\3n\5n\u0334\nn\3o\3o\3o\7o\u0339\no\fo\16o\u033c\13o\3o\5o"+
		"\u033f\no\3p\3p\3q\3q\7q\u0345\nq\fq\16q\u0348\13q\3q\5q\u034b\nq\3r\3"+
		"r\5r\u034f\nr\3s\3s\3\u02fe\2t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"O\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00af"+
		"Y\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3"+
		"c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7"+
		"m\u00d9\2\u00db\2\u00dd\2\u00df\2\u00e1\2\u00e3\2\u00e5\2\3\2\22\3\2\63"+
		";\4\2HHhh\4\2NNnn\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\4\2GGgg\4\2--//\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\62"+
		"9\5\2\62;CHch\3\2\62;\4\2\62;aa\4\2C\\c|\2\u0366\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\3\u00e7\3\2\2\2\5\u00ef\3\2\2\2\7\u00f4\3\2\2\2\t\u00f9\3\2\2\2\13"+
		"\u0100\3\2\2\2\r\u0104\3\2\2\2\17\u0109\3\2\2\2\21\u010f\3\2\2\2\23\u0116"+
		"\3\2\2\2\25\u011b\3\2\2\2\27\u0123\3\2\2\2\31\u012d\3\2\2\2\33\u0134\3"+
		"\2\2\2\35\u013d\3\2\2\2\37\u0143\3\2\2\2!\u014c\3\2\2\2#\u0156\3\2\2\2"+
		"%\u015d\3\2\2\2\'\u016a\3\2\2\2)\u016d\3\2\2\2+\u0174\3\2\2\2-\u017a\3"+
		"\2\2\2/\u017f\3\2\2\2\61\u0185\3\2\2\2\63\u018a\3\2\2\2\65\u0194\3\2\2"+
		"\2\67\u019a\3\2\2\29\u01a3\3\2\2\2;\u01ab\3\2\2\2=\u01ae\3\2\2\2?\u01b3"+
		"\3\2\2\2A\u01ba\3\2\2\2C\u01bf\3\2\2\2E\u01c7\3\2\2\2G\u01cf\3\2\2\2I"+
		"\u01d5\3\2\2\2K\u01d9\3\2\2\2M\u01dd\3\2\2\2O\u01e0\3\2\2\2Q\u01eb\3\2"+
		"\2\2S\u01f2\3\2\2\2U\u01f7\3\2\2\2W\u01fc\3\2\2\2Y\u0204\3\2\2\2[\u020a"+
		"\3\2\2\2]\u0211\3\2\2\2_\u0217\3\2\2\2a\u021e\3\2\2\2c\u0223\3\2\2\2e"+
		"\u0229\3\2\2\2g\u0230\3\2\2\2i\u0234\3\2\2\2k\u0242\3\2\2\2m\u024b\3\2"+
		"\2\2o\u025a\3\2\2\2q\u026b\3\2\2\2s\u026d\3\2\2\2u\u0274\3\2\2\2w\u027e"+
		"\3\2\2\2y\u0280\3\2\2\2{\u0282\3\2\2\2}\u0284\3\2\2\2\177\u0286\3\2\2"+
		"\2\u0081\u0288\3\2\2\2\u0083\u028a\3\2\2\2\u0085\u028c\3\2\2\2\u0087\u028e"+
		"\3\2\2\2\u0089\u0290\3\2\2\2\u008b\u0292\3\2\2\2\u008d\u0294\3\2\2\2\u008f"+
		"\u0296\3\2\2\2\u0091\u0298\3\2\2\2\u0093\u029a\3\2\2\2\u0095\u029c\3\2"+
		"\2\2\u0097\u029e\3\2\2\2\u0099\u02a1\3\2\2\2\u009b\u02a4\3\2\2\2\u009d"+
		"\u02a7\3\2\2\2\u009f\u02aa\3\2\2\2\u00a1\u02ad\3\2\2\2\u00a3\u02b0\3\2"+
		"\2\2\u00a5\u02b3\3\2\2\2\u00a7\u02b6\3\2\2\2\u00a9\u02b8\3\2\2\2\u00ab"+
		"\u02ba\3\2\2\2\u00ad\u02bc\3\2\2\2\u00af\u02be\3\2\2\2\u00b1\u02c0\3\2"+
		"\2\2\u00b3\u02c2\3\2\2\2\u00b5\u02c4\3\2\2\2\u00b7\u02c6\3\2\2\2\u00b9"+
		"\u02c9\3\2\2\2\u00bb\u02cc\3\2\2\2\u00bd\u02cf\3\2\2\2\u00bf\u02d2\3\2"+
		"\2\2\u00c1\u02d5\3\2\2\2\u00c3\u02d8\3\2\2\2\u00c5\u02db\3\2\2\2\u00c7"+
		"\u02de\3\2\2\2\u00c9\u02e1\3\2\2\2\u00cb\u02e4\3\2\2\2\u00cd\u02e8\3\2"+
		"\2\2\u00cf\u02ec\3\2\2\2\u00d1\u02f2\3\2\2\2\u00d3\u02f8\3\2\2\2\u00d5"+
		"\u0306\3\2\2\2\u00d7\u0311\3\2\2\2\u00d9\u0318\3\2\2\2\u00db\u0333\3\2"+
		"\2\2\u00dd\u0335\3\2\2\2\u00df\u0340\3\2\2\2\u00e1\u0342\3\2\2\2\u00e3"+
		"\u034e\3\2\2\2\u00e5\u0350\3\2\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7q\2"+
		"\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\4\3\2\2\2\u00ef\u00f0\7d\2\2\u00f0\u00f1"+
		"\7{\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3\6\3\2\2\2\u00f4\u00f5"+
		"\7e\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		"\b\3\2\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7w\2\2\u00fc"+
		"\u00fd\7d\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7g\2\2\u00ff\n\3\2\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103\f\3\2\2\2\u0104"+
		"\u0105\7n\2\2\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107\u0108\7i\2\2"+
		"\u0108\16\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b\7j\2\2\u010b\u010c\7"+
		"q\2\2\u010c\u010d\7t\2\2\u010d\u010e\7v\2\2\u010e\20\3\2\2\2\u010f\u0110"+
		"\7u\2\2\u0110\u0111\7v\2\2\u0111\u0112\7t\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7p\2\2\u0114\u0115\7i\2\2\u0115\22\3\2\2\2\u0116\u0117\7x\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0119\7k\2\2\u0119\u011a\7f\2\2\u011a\24\3\2\2\2\u011b"+
		"\u011c\7r\2\2\u011c\u011d\7t\2\2\u011d\u011e\7k\2\2\u011e\u011f\7x\2\2"+
		"\u011f\u0120\7c\2\2\u0120\u0121\7v\2\2\u0121\u0122\7g\2\2\u0122\26\3\2"+
		"\2\2\u0123\u0124\7r\2\2\u0124\u0125\7t\2\2\u0125\u0126\7q\2\2\u0126\u0127"+
		"\7v\2\2\u0127\u0128\7g\2\2\u0128\u0129\7e\2\2\u0129\u012a\7v\2\2\u012a"+
		"\u012b\7g\2\2\u012b\u012c\7f\2\2\u012c\30\3\2\2\2\u012d\u012e\7r\2\2\u012e"+
		"\u012f\7w\2\2\u012f\u0130\7d\2\2\u0130\u0131\7n\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7e\2\2\u0133\32\3\2\2\2\u0134\u0135\7c\2\2\u0135\u0136\7"+
		"d\2\2\u0136\u0137\7u\2\2\u0137\u0138\7v\2\2\u0138\u0139\7t\2\2\u0139\u013a"+
		"\7c\2\2\u013a\u013b\7e\2\2\u013b\u013c\7v\2\2\u013c\34\3\2\2\2\u013d\u013e"+
		"\7h\2\2\u013e\u013f\7k\2\2\u013f\u0140\7p\2\2\u0140\u0141\7c\2\2\u0141"+
		"\u0142\7n\2\2\u0142\36\3\2\2\2\u0143\u0144\7q\2\2\u0144\u0145\7x\2\2\u0145"+
		"\u0146\7g\2\2\u0146\u0147\7t\2\2\u0147\u0148\7t\2\2\u0148\u0149\7k\2\2"+
		"\u0149\u014a\7f\2\2\u014a\u014b\7g\2\2\u014b \3\2\2\2\u014c\u014d\7k\2"+
		"\2\u014d\u014e\7p\2\2\u014e\u014f\7v\2\2\u014f\u0150\7g\2\2\u0150\u0151"+
		"\7t\2\2\u0151\u0152\7h\2\2\u0152\u0153\7c\2\2\u0153\u0154\7e\2\2\u0154"+
		"\u0155\7g\2\2\u0155\"\3\2\2\2\u0156\u0157\7u\2\2\u0157\u0158\7v\2\2\u0158"+
		"\u0159\7c\2\2\u0159\u015a\7v\2\2\u015a\u015b\7k\2\2\u015b\u015c\7e\2\2"+
		"\u015c$\3\2\2\2\u015d\u015e\7u\2\2\u015e\u015f\7{\2\2\u015f\u0160\7p\2"+
		"\2\u0160\u0161\7e\2\2\u0161\u0162\7j\2\2\u0162\u0163\7t\2\2\u0163\u0164"+
		"\7q\2\2\u0164\u0165\7p\2\2\u0165\u0166\7k\2\2\u0166\u0167\7|\2\2\u0167"+
		"\u0168\7g\2\2\u0168\u0169\7f\2\2\u0169&\3\2\2\2\u016a\u016b\7c\2\2\u016b"+
		"\u016c\7u\2\2\u016c(\3\2\2\2\u016d\u016e\7c\2\2\u016e\u016f\7u\2\2\u016f"+
		"\u0170\7u\2\2\u0170\u0171\7g\2\2\u0171\u0172\7t\2\2\u0172\u0173\7v\2\2"+
		"\u0173*\3\2\2\2\u0174\u0175\7d\2\2\u0175\u0176\7t\2\2\u0176\u0177\7g\2"+
		"\2\u0177\u0178\7c\2\2\u0178\u0179\7m\2\2\u0179,\3\2\2\2\u017a\u017b\7"+
		"e\2\2\u017b\u017c\7c\2\2\u017c\u017d\7u\2\2\u017d\u017e\7g\2\2\u017e."+
		"\3\2\2\2\u017f\u0180\7e\2\2\u0180\u0181\7c\2\2\u0181\u0182\7v\2\2\u0182"+
		"\u0183\7e\2\2\u0183\u0184\7j\2\2\u0184\60\3\2\2\2\u0185\u0186\7e\2\2\u0186"+
		"\u0187\7q\2\2\u0187\u0188\7n\2\2\u0188\u0189\7f\2\2\u0189\62\3\2\2\2\u018a"+
		"\u018b\7e\2\2\u018b\u018c\7q\2\2\u018c\u018d\7o\2\2\u018d\u018e\7r\2\2"+
		"\u018e\u018f\7q\2\2\u018f\u0190\7p\2\2\u0190\u0191\7g\2\2\u0191\u0192"+
		"\7p\2\2\u0192\u0193\7v\2\2\u0193\64\3\2\2\2\u0194\u0195\7e\2\2\u0195\u0196"+
		"\7q\2\2\u0196\u0197\7p\2\2\u0197\u0198\7u\2\2\u0198\u0199\7v\2\2\u0199"+
		"\66\3\2\2\2\u019a\u019b\7e\2\2\u019b\u019c\7q\2\2\u019c\u019d\7p\2\2\u019d"+
		"\u019e\7v\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7w\2\2"+
		"\u01a1\u01a2\7g\2\2\u01a28\3\2\2\2\u01a3\u01a4\7f\2\2\u01a4\u01a5\7g\2"+
		"\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7w\2\2\u01a8\u01a9"+
		"\7n\2\2\u01a9\u01aa\7v\2\2\u01aa:\3\2\2\2\u01ab\u01ac\7f\2\2\u01ac\u01ad"+
		"\7q\2\2\u01ad<\3\2\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7n\2\2\u01b0\u01b1"+
		"\7u\2\2\u01b1\u01b2\7g\2\2\u01b2>\3\2\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5"+
		"\7p\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7v\2\2\u01b8"+
		"\u01b9\7{\2\2\u01b9@\3\2\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7p\2\2\u01bc"+
		"\u01bd\7w\2\2\u01bd\u01be\7o\2\2\u01beB\3\2\2\2\u01bf\u01c0\7g\2\2\u01c0"+
		"\u01c1\7z\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7p\2\2"+
		"\u01c4\u01c5\7f\2\2\u01c5\u01c6\7u\2\2\u01c6D\3\2\2\2\u01c7\u01c8\7h\2"+
		"\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc"+
		"\7n\2\2\u01cc\u01cd\7n\2\2\u01cd\u01ce\7{\2\2\u01ceF\3\2\2\2\u01cf\u01d0"+
		"\7h\2\2\u01d0\u01d1\7n\2\2\u01d1\u01d2\7q\2\2\u01d2\u01d3\7c\2\2\u01d3"+
		"\u01d4\7v\2\2\u01d4H\3\2\2\2\u01d5\u01d6\7h\2\2\u01d6\u01d7\7q\2\2\u01d7"+
		"\u01d8\7t\2\2\u01d8J\3\2\2\2\u01d9\u01da\7j\2\2\u01da\u01db\7q\2\2\u01db"+
		"\u01dc\7v\2\2\u01dcL\3\2\2\2\u01dd\u01de\7k\2\2\u01de\u01df\7h\2\2\u01df"+
		"N\3\2\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2\7o\2\2\u01e2\u01e3\7r\2\2\u01e3"+
		"\u01e4\7n\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7o\2\2\u01e6\u01e7\7g\2\2"+
		"\u01e7\u01e8\7p\2\2\u01e8\u01e9\7v\2\2\u01e9\u01ea\7u\2\2\u01eaP\3\2\2"+
		"\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7o\2\2\u01ed\u01ee\7r\2\2\u01ee\u01ef"+
		"\7q\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7v\2\2\u01f1R\3\2\2\2\u01f2\u01f3"+
		"\7k\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7t\2\2\u01f6"+
		"T\3\2\2\2\u01f7\u01f8\7o\2\2\u01f8\u01f9\7c\2\2\u01f9\u01fa\7k\2\2\u01fa"+
		"\u01fb\7p\2\2\u01fbV\3\2\2\2\u01fc\u01fd\7r\2\2\u01fd\u01fe\7c\2\2\u01fe"+
		"\u01ff\7e\2\2\u01ff\u0200\7m\2\2\u0200\u0201\7c\2\2\u0201\u0202\7i\2\2"+
		"\u0202\u0203\7g\2\2\u0203X\3\2\2\2\u0204\u0205\7r\2\2\u0205\u0206\7t\2"+
		"\2\u0206\u0207\7k\2\2\u0207\u0208\7p\2\2\u0208\u0209\7v\2\2\u0209Z\3\2"+
		"\2\2\u020a\u020b\7t\2\2\u020b\u020c\7g\2\2\u020c\u020d\7v\2\2\u020d\u020e"+
		"\7w\2\2\u020e\u020f\7t\2\2\u020f\u0210\7p\2\2\u0210\\\3\2\2\2\u0211\u0212"+
		"\7u\2\2\u0212\u0213\7w\2\2\u0213\u0214\7r\2\2\u0214\u0215\7g\2\2\u0215"+
		"\u0216\7t\2\2\u0216^\3\2\2\2\u0217\u0218\7u\2\2\u0218\u0219\7y\2\2\u0219"+
		"\u021a\7k\2\2\u021a\u021b\7v\2\2\u021b\u021c\7e\2\2\u021c\u021d\7j\2\2"+
		"\u021d`\3\2\2\2\u021e\u021f\7v\2\2\u021f\u0220\7j\2\2\u0220\u0221\7k\2"+
		"\2\u0221\u0222\7u\2\2\u0222b\3\2\2\2\u0223\u0224\7v\2\2\u0224\u0225\7"+
		"j\2\2\u0225\u0226\7t\2\2\u0226\u0227\7q\2\2\u0227\u0228\7y\2\2\u0228d"+
		"\3\2\2\2\u0229\u022a\7v\2\2\u022a\u022b\7j\2\2\u022b\u022c\7t\2\2\u022c"+
		"\u022d\7q\2\2\u022d\u022e\7y\2\2\u022e\u022f\7u\2\2\u022ff\3\2\2\2\u0230"+
		"\u0231\7v\2\2\u0231\u0232\7t\2\2\u0232\u0233\7{\2\2\u0233h\3\2\2\2\u0234"+
		"\u0235\7y\2\2\u0235\u0236\7j\2\2\u0236\u0237\7k\2\2\u0237\u0238\7n\2\2"+
		"\u0238\u0239\7g\2\2\u0239j\3\2\2\2\u023a\u0243\7\62\2\2\u023b\u023f\t"+
		"\2\2\2\u023c\u023e\5\u00e1q\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2"+
		"\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f"+
		"\3\2\2\2\u0242\u023a\3\2\2\2\u0242\u023b\3\2\2\2\u0243l\3\2\2\2\u0244"+
		"\u0245\5\u00e1q\2\u0245\u0246\5\u0087D\2\u0246\u0247\5\u00e1q\2\u0247"+
		"\u024c\3\2\2\2\u0248\u0249\5\u0087D\2\u0249\u024a\5\u00e1q\2\u024a\u024c"+
		"\3\2\2\2\u024b\u0244\3\2\2\2\u024b\u0248\3\2\2\2\u024c\u024e\3\2\2\2\u024d"+
		"\u024f\5\u00d9m\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251"+
		"\3\2\2\2\u0250\u0252\t\3\2\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"n\3\2\2\2\u0253\u0254\5\u00e1q\2\u0254\u0255\5\u0087D\2\u0255\u0256\5"+
		"\u00e1q\2\u0256\u025b\3\2\2\2\u0257\u0258\5\u0087D\2\u0258\u0259\5\u00e1"+
		"q\2\u0259\u025b\3\2\2\2\u025a\u0253\3\2\2\2\u025a\u0257\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u025e\5\u00d9m\2\u025d\u025c\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u0261\t\4\2\2\u0260\u025f\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261p\3\2\2\2\u0262\u0263\7v\2\2\u0263\u0264\7t\2\2\u0264"+
		"\u0265\7w\2\2\u0265\u026c\7g\2\2\u0266\u0267\7h\2\2\u0267\u0268\7c\2\2"+
		"\u0268\u0269\7n\2\2\u0269\u026a\7u\2\2\u026a\u026c\7g\2\2\u026b\u0262"+
		"\3\2\2\2\u026b\u0266\3\2\2\2\u026cr\3\2\2\2\u026d\u0270\7)\2\2\u026e\u0271"+
		"\n\5\2\2\u026f\u0271\5\u00dbn\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0273\7)\2\2\u0273t\3\2\2\2\u0274\u0279\7"+
		"$\2\2\u0275\u0278\n\6\2\2\u0276\u0278\5\u00dbn\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2"+
		"\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7$\2\2\u027d"+
		"v\3\2\2\2\u027e\u027f\7*\2\2\u027fx\3\2\2\2\u0280\u0281\7+\2\2\u0281z"+
		"\3\2\2\2\u0282\u0283\7}\2\2\u0283|\3\2\2\2\u0284\u0285\7\177\2\2\u0285"+
		"~\3\2\2\2\u0286\u0287\7]\2\2\u0287\u0080\3\2\2\2\u0288\u0289\7_\2\2\u0289"+
		"\u0082\3\2\2\2\u028a\u028b\7=\2\2\u028b\u0084\3\2\2\2\u028c\u028d\7.\2"+
		"\2\u028d\u0086\3\2\2\2\u028e\u028f\7\60\2\2\u028f\u0088\3\2\2\2\u0290"+
		"\u0291\7?\2\2\u0291\u008a\3\2\2\2\u0292\u0293\7@\2\2\u0293\u008c\3\2\2"+
		"\2\u0294\u0295\7>\2\2\u0295\u008e\3\2\2\2\u0296\u0297\7#\2\2\u0297\u0090"+
		"\3\2\2\2\u0298\u0299\7\u0080\2\2\u0299\u0092\3\2\2\2\u029a\u029b\7A\2"+
		"\2\u029b\u0094\3\2\2\2\u029c\u029d\7<\2\2\u029d\u0096\3\2\2\2\u029e\u029f"+
		"\7?\2\2\u029f\u02a0\7?\2\2\u02a0\u0098\3\2\2\2\u02a1\u02a2\7>\2\2\u02a2"+
		"\u02a3\7?\2\2\u02a3\u009a\3\2\2\2\u02a4\u02a5\7@\2\2\u02a5\u02a6\7?\2"+
		"\2\u02a6\u009c\3\2\2\2\u02a7\u02a8\7#\2\2\u02a8\u02a9\7?\2\2\u02a9\u009e"+
		"\3\2\2\2\u02aa\u02ab\7(\2\2\u02ab\u02ac\7(\2\2\u02ac\u00a0\3\2\2\2\u02ad"+
		"\u02ae\7~\2\2\u02ae\u02af\7~\2\2\u02af\u00a2\3\2\2\2\u02b0\u02b1\7-\2"+
		"\2\u02b1\u02b2\7-\2\2\u02b2\u00a4\3\2\2\2\u02b3\u02b4\7/\2\2\u02b4\u02b5"+
		"\7/\2\2\u02b5\u00a6\3\2\2\2\u02b6\u02b7\7-\2\2\u02b7\u00a8\3\2\2\2\u02b8"+
		"\u02b9\7/\2\2\u02b9\u00aa\3\2\2\2\u02ba\u02bb\7,\2\2\u02bb\u00ac\3\2\2"+
		"\2\u02bc\u02bd\7\61\2\2\u02bd\u00ae\3\2\2\2\u02be\u02bf\7(\2\2\u02bf\u00b0"+
		"\3\2\2\2\u02c0\u02c1\7~\2\2\u02c1\u00b2\3\2\2\2\u02c2\u02c3\7`\2\2\u02c3"+
		"\u00b4\3\2\2\2\u02c4\u02c5\7\'\2\2\u02c5\u00b6\3\2\2\2\u02c6\u02c7\7>"+
		"\2\2\u02c7\u02c8\7>\2\2\u02c8\u00b8\3\2\2\2\u02c9\u02ca\7@\2\2\u02ca\u02cb"+
		"\7@\2\2\u02cb\u00ba\3\2\2\2\u02cc\u02cd\7-\2\2\u02cd\u02ce\7?\2\2\u02ce"+
		"\u00bc\3\2\2\2\u02cf\u02d0\7/\2\2\u02d0\u02d1\7?\2\2\u02d1\u00be\3\2\2"+
		"\2\u02d2\u02d3\7,\2\2\u02d3\u02d4\7?\2\2\u02d4\u00c0\3\2\2\2\u02d5\u02d6"+
		"\7\61\2\2\u02d6\u02d7\7?\2\2\u02d7\u00c2\3\2\2\2\u02d8\u02d9\7(\2\2\u02d9"+
		"\u02da\7?\2\2\u02da\u00c4\3\2\2\2\u02db\u02dc\7~\2\2\u02dc\u02dd\7?\2"+
		"\2\u02dd\u00c6\3\2\2\2\u02de\u02df\7`\2\2\u02df\u02e0\7?\2\2\u02e0\u00c8"+
		"\3\2\2\2\u02e1\u02e2\7\'\2\2\u02e2\u02e3\7?\2\2\u02e3\u00ca\3\2\2\2\u02e4"+
		"\u02e5\7>\2\2\u02e5\u02e6\7>\2\2\u02e6\u02e7\7?\2\2\u02e7\u00cc\3\2\2"+
		"\2\u02e8\u02e9\7@\2\2\u02e9\u02ea\7@\2\2\u02ea\u02eb\7?\2\2\u02eb\u00ce"+
		"\3\2\2\2\u02ec\u02ed\7@\2\2\u02ed\u02ee\7@\2\2\u02ee\u02ef\7@\2\2\u02ef"+
		"\u02f0\7?\2\2\u02f0\u00d0\3\2\2\2\u02f1\u02f3\t\7\2\2\u02f2\u02f1\3\2"+
		"\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f7\bi\2\2\u02f7\u00d2\3\2\2\2\u02f8\u02f9\7\61"+
		"\2\2\u02f9\u02fa\7,\2\2\u02fa\u02fe\3\2\2\2\u02fb\u02fd\13\2\2\2\u02fc"+
		"\u02fb\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02ff\3\2\2\2\u02fe\u02fc\3\2"+
		"\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0302\7,\2\2\u0302"+
		"\u0303\7\61\2\2\u0303\u0304\3\2\2\2\u0304\u0305\bj\2\2\u0305\u00d4\3\2"+
		"\2\2\u0306\u0307\7\61\2\2\u0307\u0308\7\61\2\2\u0308\u030c\3\2\2\2\u0309"+
		"\u030b\n\b\2\2\u030a\u0309\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2"+
		"\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f"+
		"\u0310\bk\2\2\u0310\u00d6\3\2\2\2\u0311\u0315\5\u00e5s\2\u0312\u0314\5"+
		"\u00e3r\2\u0313\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2"+
		"\u0315\u0316\3\2\2\2\u0316\u00d8\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031a"+
		"\t\t\2\2\u0319\u031b\t\n\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u031d\5\u00e1q\2\u031d\u00da\3\2\2\2\u031e\u031f"+
		"\7^\2\2\u031f\u0334\t\13\2\2\u0320\u0325\7^\2\2\u0321\u0323\t\f\2\2\u0322"+
		"\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\t\r"+
		"\2\2\u0325\u0322\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0334\t\r\2\2\u0328\u032a\7^\2\2\u0329\u032b\7w\2\2\u032a\u0329\3\2\2"+
		"\2\u032b\u032c\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u032f\5\u00dfp\2\u032f\u0330\5\u00dfp\2\u0330\u0331\5\u00df"+
		"p\2\u0331\u0332\5\u00dfp\2\u0332\u0334\3\2\2\2\u0333\u031e\3\2\2\2\u0333"+
		"\u0320\3\2\2\2\u0333\u0328\3\2\2\2\u0334\u00dc\3\2\2\2\u0335\u033e\5\u00df"+
		"p\2\u0336\u0339\5\u00dfp\2\u0337\u0339\7a\2\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0337\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u033d\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u033f\5\u00dfp\2\u033e"+
		"\u033a\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u00de\3\2\2\2\u0340\u0341\t\16"+
		"\2\2\u0341\u00e0\3\2\2\2\u0342\u034a\t\17\2\2\u0343\u0345\t\20\2\2\u0344"+
		"\u0343\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2"+
		"\2\2\u0347\u0349\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034b\t\17\2\2\u034a"+
		"\u0346\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u00e2\3\2\2\2\u034c\u034f\5\u00e5"+
		"s\2\u034d\u034f\t\20\2\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f"+
		"\u00e4\3\2\2\2\u0350\u0351\t\21\2\2\u0351\u00e6\3\2\2\2\36\2\u023f\u0242"+
		"\u024b\u024e\u0251\u025a\u025d\u0260\u026b\u0270\u0277\u0279\u02f4\u02fe"+
		"\u030c\u0315\u031a\u0322\u0325\u032c\u0333\u0338\u033a\u033e\u0346\u034a"+
		"\u034e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}