// Generated from E:/Documents/IntelliJ/Project Flare/src\FlareLexer.g4 by ANTLR 4.9
package Flare;
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, CHAR=3, DOUBLE=4, INT=5, LONG=6, SHORT=7, STRING=8, 
		VOID=9, PRIVATE=10, PROTECTED=11, PUBLIC=12, ABSTRACT=13, FINAL=14, OVERRIDE=15, 
		INTERFACE=16, STATIC=17, SYNCHRONIZED=18, AS=19, ASSERT=20, BREAK=21, 
		CASE=22, CATCH=23, COLD=24, COMPONENT=25, CONST=26, CONTINUE=27, DEFAULT=28, 
		DO=29, ELSE=30, ENTITY=31, ENUM=32, EXTENDS=33, FINALLY=34, FLOAT=35, 
		FOR=36, HOT=37, IF=38, IMPLEMENTS=39, IMPORT=40, ITER=41, MAIN=42, NEW=43, 
		PACKAGE=44, RETURN=45, SUPER=46, SWITCH=47, THIS=48, THROW=49, THROWS=50, 
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
			"IMPLEMENTS", "IMPORT", "ITER", "MAIN", "NEW", "PACKAGE", "RETURN", "SUPER", 
			"SWITCH", "THIS", "THROW", "THROWS", "TRY", "WHILE", "INTEGER_LITERAL", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GREATER", "LESSER", "EXCLAMATION", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LESSEREQUAL", "GREATEREQUAL", 
			"NOTEQUAL", "AND", "OR", "INCREMENT", "DECREMENT", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "LSHIFT", "RSHIFT", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"Whitespace", "MULTI_COMMENT", "LINE_COMMENT", "IDENTIFIER", "ExponentPart", 
			"EscapeSequence", "HexDigits", "HexDigit", "Digits", "LetterOrDigit", 
			"Letter"
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
			"'import'", "'iter'", "'main'", "'new'", "'package'", "'return'", "'super'", 
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
			"IMPLEMENTS", "IMPORT", "ITER", "MAIN", "NEW", "PACKAGE", "RETURN", "SUPER", 
			"SWITCH", "THIS", "THROW", "THROWS", "TRY", "WHILE", "INTEGER_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2r\u03b5\b\1\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\5\66\u0244\n\66\3\66"+
		"\3\66\7\66\u0248\n\66\f\66\16\66\u024b\13\66\3\67\3\67\3\67\5\67\u0250"+
		"\n\67\3\67\6\67\u0253\n\67\r\67\16\67\u0254\3\67\5\67\u0258\n\67\5\67"+
		"\u025a\n\67\3\67\5\67\u025d\n\67\38\38\38\38\78\u0263\n8\f8\168\u0266"+
		"\138\38\58\u0269\n8\38\58\u026c\n8\39\39\79\u0270\n9\f9\169\u0273\139"+
		"\39\39\79\u0277\n9\f9\169\u027a\139\39\59\u027d\n9\39\59\u0280\n9\3:\3"+
		":\3:\3:\7:\u0286\n:\f:\16:\u0289\13:\3:\5:\u028c\n:\3:\5:\u028f\n:\3;"+
		"\3;\3;\5;\u0294\n;\3;\3;\3;\5;\u0299\n;\3;\5;\u029c\n;\3;\5;\u029f\n;"+
		"\3;\3;\3;\5;\u02a4\n;\3;\5;\u02a7\n;\5;\u02a9\n;\3<\3<\3<\3<\5<\u02af"+
		"\n<\3<\5<\u02b2\n<\3<\3<\3<\5<\u02b7\n<\3<\3<\5<\u02bb\n<\3<\3<\5<\u02bf"+
		"\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02ca\n=\3>\3>\3>\5>\u02cf\n>\3>\3>"+
		"\3?\3?\3?\7?\u02d6\n?\f?\16?\u02d9\13?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3"+
		"N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3"+
		"V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`"+
		"\3a\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3g\3h\3h"+
		"\3h\3i\3i\3i\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\3m\3m\3m\3m\3m\3n\6n\u0356"+
		"\nn\rn\16n\u0357\3n\3n\3o\3o\3o\3o\7o\u0360\no\fo\16o\u0363\13o\3o\3o"+
		"\3o\3o\3o\3p\3p\3p\3p\7p\u036e\np\fp\16p\u0371\13p\3p\3p\3q\3q\7q\u0377"+
		"\nq\fq\16q\u037a\13q\3r\3r\5r\u037e\nr\3r\3r\3s\3s\3s\3s\5s\u0386\ns\3"+
		"s\5s\u0389\ns\3s\3s\3s\6s\u038e\ns\rs\16s\u038f\3s\3s\3s\3s\3s\5s\u0397"+
		"\ns\3t\3t\3t\7t\u039c\nt\ft\16t\u039f\13t\3t\5t\u03a2\nt\3u\3u\3v\3v\7"+
		"v\u03a8\nv\fv\16v\u03ab\13v\3v\5v\u03ae\nv\3w\3w\5w\u03b2\nw\3x\3x\3\u0361"+
		"\2y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5"+
		"\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9"+
		"f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00dd"+
		"p\u00dfq\u00e1r\u00e3\2\u00e5\2\u00e7\2\u00e9\2\u00eb\2\u00ed\2\u00ef"+
		"\2\3\2\30\3\2\63;\4\2NNnn\4\2ZZzz\3\2\629\4\2\629aa\4\2DDdd\3\2\62\63"+
		"\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17))^^\6\2\f\f\17"+
		"\17$$^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2$$))^^ddhhppttvv\3"+
		"\2\62\65\5\2\62;CHch\3\2\62;\4\2\62;aa\4\2C\\c|\2\u03de\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2"+
		"\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7"+
		"\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2"+
		"\2\2\u00e1\3\2\2\2\3\u00f1\3\2\2\2\5\u00f9\3\2\2\2\7\u00fe\3\2\2\2\t\u0103"+
		"\3\2\2\2\13\u010a\3\2\2\2\r\u010e\3\2\2\2\17\u0113\3\2\2\2\21\u0119\3"+
		"\2\2\2\23\u0120\3\2\2\2\25\u0125\3\2\2\2\27\u012d\3\2\2\2\31\u0137\3\2"+
		"\2\2\33\u013e\3\2\2\2\35\u0147\3\2\2\2\37\u014d\3\2\2\2!\u0156\3\2\2\2"+
		"#\u0160\3\2\2\2%\u0167\3\2\2\2\'\u0174\3\2\2\2)\u0177\3\2\2\2+\u017e\3"+
		"\2\2\2-\u0184\3\2\2\2/\u0189\3\2\2\2\61\u018f\3\2\2\2\63\u0194\3\2\2\2"+
		"\65\u019e\3\2\2\2\67\u01a4\3\2\2\29\u01ad\3\2\2\2;\u01b5\3\2\2\2=\u01b8"+
		"\3\2\2\2?\u01bd\3\2\2\2A\u01c4\3\2\2\2C\u01c9\3\2\2\2E\u01d1\3\2\2\2G"+
		"\u01d9\3\2\2\2I\u01df\3\2\2\2K\u01e3\3\2\2\2M\u01e7\3\2\2\2O\u01ea\3\2"+
		"\2\2Q\u01f5\3\2\2\2S\u01fc\3\2\2\2U\u0201\3\2\2\2W\u0206\3\2\2\2Y\u020a"+
		"\3\2\2\2[\u0212\3\2\2\2]\u0219\3\2\2\2_\u021f\3\2\2\2a\u0226\3\2\2\2c"+
		"\u022b\3\2\2\2e\u0231\3\2\2\2g\u0238\3\2\2\2i\u023c\3\2\2\2k\u0243\3\2"+
		"\2\2m\u0259\3\2\2\2o\u025e\3\2\2\2q\u026d\3\2\2\2s\u0281\3\2\2\2u\u02a8"+
		"\3\2\2\2w\u02aa\3\2\2\2y\u02c9\3\2\2\2{\u02cb\3\2\2\2}\u02d2\3\2\2\2\177"+
		"\u02dc\3\2\2\2\u0081\u02e1\3\2\2\2\u0083\u02e3\3\2\2\2\u0085\u02e5\3\2"+
		"\2\2\u0087\u02e7\3\2\2\2\u0089\u02e9\3\2\2\2\u008b\u02eb\3\2\2\2\u008d"+
		"\u02ed\3\2\2\2\u008f\u02ef\3\2\2\2\u0091\u02f1\3\2\2\2\u0093\u02f3\3\2"+
		"\2\2\u0095\u02f5\3\2\2\2\u0097\u02f7\3\2\2\2\u0099\u02f9\3\2\2\2\u009b"+
		"\u02fb\3\2\2\2\u009d\u02fd\3\2\2\2\u009f\u02ff\3\2\2\2\u00a1\u0301\3\2"+
		"\2\2\u00a3\u0304\3\2\2\2\u00a5\u0307\3\2\2\2\u00a7\u030a\3\2\2\2\u00a9"+
		"\u030d\3\2\2\2\u00ab\u0310\3\2\2\2\u00ad\u0313\3\2\2\2\u00af\u0316\3\2"+
		"\2\2\u00b1\u0319\3\2\2\2\u00b3\u031b\3\2\2\2\u00b5\u031d\3\2\2\2\u00b7"+
		"\u031f\3\2\2\2\u00b9\u0321\3\2\2\2\u00bb\u0323\3\2\2\2\u00bd\u0325\3\2"+
		"\2\2\u00bf\u0327\3\2\2\2\u00c1\u0329\3\2\2\2\u00c3\u032c\3\2\2\2\u00c5"+
		"\u032f\3\2\2\2\u00c7\u0332\3\2\2\2\u00c9\u0335\3\2\2\2\u00cb\u0338\3\2"+
		"\2\2\u00cd\u033b\3\2\2\2\u00cf\u033e\3\2\2\2\u00d1\u0341\3\2\2\2\u00d3"+
		"\u0344\3\2\2\2\u00d5\u0347\3\2\2\2\u00d7\u034b\3\2\2\2\u00d9\u034f\3\2"+
		"\2\2\u00db\u0355\3\2\2\2\u00dd\u035b\3\2\2\2\u00df\u0369\3\2\2\2\u00e1"+
		"\u0374\3\2\2\2\u00e3\u037b\3\2\2\2\u00e5\u0396\3\2\2\2\u00e7\u0398\3\2"+
		"\2\2\u00e9\u03a3\3\2\2\2\u00eb\u03a5\3\2\2\2\u00ed\u03b1\3\2\2\2\u00ef"+
		"\u03b3\3\2\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7q\2"+
		"\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\4\3\2\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7{\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\u00fd\7g\2\2\u00fd\6\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100"+
		"\7j\2\2\u0100\u0101\7c\2\2\u0101\u0102\7t\2\2\u0102\b\3\2\2\2\u0103\u0104"+
		"\7f\2\2\u0104\u0105\7q\2\2\u0105\u0106\7w\2\2\u0106\u0107\7d\2\2\u0107"+
		"\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109\n\3\2\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7p\2\2\u010c\u010d\7v\2\2\u010d\f\3\2\2\2\u010e\u010f\7n\2\2\u010f"+
		"\u0110\7q\2\2\u0110\u0111\7p\2\2\u0111\u0112\7i\2\2\u0112\16\3\2\2\2\u0113"+
		"\u0114\7u\2\2\u0114\u0115\7j\2\2\u0115\u0116\7q\2\2\u0116\u0117\7t\2\2"+
		"\u0117\u0118\7v\2\2\u0118\20\3\2\2\2\u0119\u011a\7u\2\2\u011a\u011b\7"+
		"v\2\2\u011b\u011c\7t\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e\u011f"+
		"\7i\2\2\u011f\22\3\2\2\2\u0120\u0121\7x\2\2\u0121\u0122\7q\2\2\u0122\u0123"+
		"\7k\2\2\u0123\u0124\7f\2\2\u0124\24\3\2\2\2\u0125\u0126\7r\2\2\u0126\u0127"+
		"\7t\2\2\u0127\u0128\7k\2\2\u0128\u0129\7x\2\2\u0129\u012a\7c\2\2\u012a"+
		"\u012b\7v\2\2\u012b\u012c\7g\2\2\u012c\26\3\2\2\2\u012d\u012e\7r\2\2\u012e"+
		"\u012f\7t\2\2\u012f\u0130\7q\2\2\u0130\u0131\7v\2\2\u0131\u0132\7g\2\2"+
		"\u0132\u0133\7e\2\2\u0133\u0134\7v\2\2\u0134\u0135\7g\2\2\u0135\u0136"+
		"\7f\2\2\u0136\30\3\2\2\2\u0137\u0138\7r\2\2\u0138\u0139\7w\2\2\u0139\u013a"+
		"\7d\2\2\u013a\u013b\7n\2\2\u013b\u013c\7k\2\2\u013c\u013d\7e\2\2\u013d"+
		"\32\3\2\2\2\u013e\u013f\7c\2\2\u013f\u0140\7d\2\2\u0140\u0141\7u\2\2\u0141"+
		"\u0142\7v\2\2\u0142\u0143\7t\2\2\u0143\u0144\7c\2\2\u0144\u0145\7e\2\2"+
		"\u0145\u0146\7v\2\2\u0146\34\3\2\2\2\u0147\u0148\7h\2\2\u0148\u0149\7"+
		"k\2\2\u0149\u014a\7p\2\2\u014a\u014b\7c\2\2\u014b\u014c\7n\2\2\u014c\36"+
		"\3\2\2\2\u014d\u014e\7q\2\2\u014e\u014f\7x\2\2\u014f\u0150\7g\2\2\u0150"+
		"\u0151\7t\2\2\u0151\u0152\7t\2\2\u0152\u0153\7k\2\2\u0153\u0154\7f\2\2"+
		"\u0154\u0155\7g\2\2\u0155 \3\2\2\2\u0156\u0157\7k\2\2\u0157\u0158\7p\2"+
		"\2\u0158\u0159\7v\2\2\u0159\u015a\7g\2\2\u015a\u015b\7t\2\2\u015b\u015c"+
		"\7h\2\2\u015c\u015d\7c\2\2\u015d\u015e\7e\2\2\u015e\u015f\7g\2\2\u015f"+
		"\"\3\2\2\2\u0160\u0161\7u\2\2\u0161\u0162\7v\2\2\u0162\u0163\7c\2\2\u0163"+
		"\u0164\7v\2\2\u0164\u0165\7k\2\2\u0165\u0166\7e\2\2\u0166$\3\2\2\2\u0167"+
		"\u0168\7u\2\2\u0168\u0169\7{\2\2\u0169\u016a\7p\2\2\u016a\u016b\7e\2\2"+
		"\u016b\u016c\7j\2\2\u016c\u016d\7t\2\2\u016d\u016e\7q\2\2\u016e\u016f"+
		"\7p\2\2\u016f\u0170\7k\2\2\u0170\u0171\7|\2\2\u0171\u0172\7g\2\2\u0172"+
		"\u0173\7f\2\2\u0173&\3\2\2\2\u0174\u0175\7c\2\2\u0175\u0176\7u\2\2\u0176"+
		"(\3\2\2\2\u0177\u0178\7c\2\2\u0178\u0179\7u\2\2\u0179\u017a\7u\2\2\u017a"+
		"\u017b\7g\2\2\u017b\u017c\7t\2\2\u017c\u017d\7v\2\2\u017d*\3\2\2\2\u017e"+
		"\u017f\7d\2\2\u017f\u0180\7t\2\2\u0180\u0181\7g\2\2\u0181\u0182\7c\2\2"+
		"\u0182\u0183\7m\2\2\u0183,\3\2\2\2\u0184\u0185\7e\2\2\u0185\u0186\7c\2"+
		"\2\u0186\u0187\7u\2\2\u0187\u0188\7g\2\2\u0188.\3\2\2\2\u0189\u018a\7"+
		"e\2\2\u018a\u018b\7c\2\2\u018b\u018c\7v\2\2\u018c\u018d\7e\2\2\u018d\u018e"+
		"\7j\2\2\u018e\60\3\2\2\2\u018f\u0190\7e\2\2\u0190\u0191\7q\2\2\u0191\u0192"+
		"\7n\2\2\u0192\u0193\7f\2\2\u0193\62\3\2\2\2\u0194\u0195\7e\2\2\u0195\u0196"+
		"\7q\2\2\u0196\u0197\7o\2\2\u0197\u0198\7r\2\2\u0198\u0199\7q\2\2\u0199"+
		"\u019a\7p\2\2\u019a\u019b\7g\2\2\u019b\u019c\7p\2\2\u019c\u019d\7v\2\2"+
		"\u019d\64\3\2\2\2\u019e\u019f\7e\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7"+
		"p\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3\7v\2\2\u01a3\66\3\2\2\2\u01a4\u01a5"+
		"\7e\2\2\u01a5\u01a6\7q\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7v\2\2\u01a8"+
		"\u01a9\7k\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7w\2\2\u01ab\u01ac\7g\2\2"+
		"\u01ac8\3\2\2\2\u01ad\u01ae\7f\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7h\2"+
		"\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7w\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4"+
		"\7v\2\2\u01b4:\3\2\2\2\u01b5\u01b6\7f\2\2\u01b6\u01b7\7q\2\2\u01b7<\3"+
		"\2\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7u\2\2\u01bb"+
		"\u01bc\7g\2\2\u01bc>\3\2\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7p\2\2\u01bf"+
		"\u01c0\7v\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3\7{\2\2"+
		"\u01c3@\3\2\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7w\2"+
		"\2\u01c7\u01c8\7o\2\2\u01c8B\3\2\2\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7"+
		"z\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce\7p\2\2\u01ce\u01cf"+
		"\7f\2\2\u01cf\u01d0\7u\2\2\u01d0D\3\2\2\2\u01d1\u01d2\7h\2\2\u01d2\u01d3"+
		"\7k\2\2\u01d3\u01d4\7p\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7n\2\2\u01d6"+
		"\u01d7\7n\2\2\u01d7\u01d8\7{\2\2\u01d8F\3\2\2\2\u01d9\u01da\7h\2\2\u01da"+
		"\u01db\7n\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7c\2\2\u01dd\u01de\7v\2\2"+
		"\u01deH\3\2\2\2\u01df\u01e0\7h\2\2\u01e0\u01e1\7q\2\2\u01e1\u01e2\7t\2"+
		"\2\u01e2J\3\2\2\2\u01e3\u01e4\7j\2\2\u01e4\u01e5\7q\2\2\u01e5\u01e6\7"+
		"v\2\2\u01e6L\3\2\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7h\2\2\u01e9N\3\2"+
		"\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7o\2\2\u01ec\u01ed\7r\2\2\u01ed\u01ee"+
		"\7n\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7o\2\2\u01f0\u01f1\7g\2\2\u01f1"+
		"\u01f2\7p\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f4\7u\2\2\u01f4P\3\2\2\2\u01f5"+
		"\u01f6\7k\2\2\u01f6\u01f7\7o\2\2\u01f7\u01f8\7r\2\2\u01f8\u01f9\7q\2\2"+
		"\u01f9\u01fa\7t\2\2\u01fa\u01fb\7v\2\2\u01fbR\3\2\2\2\u01fc\u01fd\7k\2"+
		"\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200\7t\2\2\u0200T\3\2"+
		"\2\2\u0201\u0202\7o\2\2\u0202\u0203\7c\2\2\u0203\u0204\7k\2\2\u0204\u0205"+
		"\7p\2\2\u0205V\3\2\2\2\u0206\u0207\7p\2\2\u0207\u0208\7g\2\2\u0208\u0209"+
		"\7y\2\2\u0209X\3\2\2\2\u020a\u020b\7r\2\2\u020b\u020c\7c\2\2\u020c\u020d"+
		"\7e\2\2\u020d\u020e\7m\2\2\u020e\u020f\7c\2\2\u020f\u0210\7i\2\2\u0210"+
		"\u0211\7g\2\2\u0211Z\3\2\2\2\u0212\u0213\7t\2\2\u0213\u0214\7g\2\2\u0214"+
		"\u0215\7v\2\2\u0215\u0216\7w\2\2\u0216\u0217\7t\2\2\u0217\u0218\7p\2\2"+
		"\u0218\\\3\2\2\2\u0219\u021a\7u\2\2\u021a\u021b\7w\2\2\u021b\u021c\7r"+
		"\2\2\u021c\u021d\7g\2\2\u021d\u021e\7t\2\2\u021e^\3\2\2\2\u021f\u0220"+
		"\7u\2\2\u0220\u0221\7y\2\2\u0221\u0222\7k\2\2\u0222\u0223\7v\2\2\u0223"+
		"\u0224\7e\2\2\u0224\u0225\7j\2\2\u0225`\3\2\2\2\u0226\u0227\7v\2\2\u0227"+
		"\u0228\7j\2\2\u0228\u0229\7k\2\2\u0229\u022a\7u\2\2\u022ab\3\2\2\2\u022b"+
		"\u022c\7v\2\2\u022c\u022d\7j\2\2\u022d\u022e\7t\2\2\u022e\u022f\7q\2\2"+
		"\u022f\u0230\7y\2\2\u0230d\3\2\2\2\u0231\u0232\7v\2\2\u0232\u0233\7j\2"+
		"\2\u0233\u0234\7t\2\2\u0234\u0235\7q\2\2\u0235\u0236\7y\2\2\u0236\u0237"+
		"\7u\2\2\u0237f\3\2\2\2\u0238\u0239\7v\2\2\u0239\u023a\7t\2\2\u023a\u023b"+
		"\7{\2\2\u023bh\3\2\2\2\u023c\u023d\7y\2\2\u023d\u023e\7j\2\2\u023e\u023f"+
		"\7k\2\2\u023f\u0240\7n\2\2\u0240\u0241\7g\2\2\u0241j\3\2\2\2\u0242\u0244"+
		"\7/\2\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0249\t\2\2\2\u0246\u0248\5\u00ebv\2\u0247\u0246\3\2\2\2\u0248\u024b"+
		"\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024al\3\2\2\2\u024b"+
		"\u0249\3\2\2\2\u024c\u025a\7\62\2\2\u024d\u0257\t\2\2\2\u024e\u0250\5"+
		"\u00ebv\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0258\3\2\2\2"+
		"\u0251\u0253\7a\2\2\u0252\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0252"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\5\u00ebv"+
		"\2\u0257\u024f\3\2\2\2\u0257\u0252\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u024c"+
		"\3\2\2\2\u0259\u024d\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d\t\3\2\2\u025c"+
		"\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025dn\3\2\2\2\u025e\u025f\7\62\2\2"+
		"\u025f\u0260\t\4\2\2\u0260\u0268\5\u00e7t\2\u0261\u0263\5\u00e7t\2\u0262"+
		"\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0269\5\u00e7t\2\u0268"+
		"\u0264\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u026c\t\3"+
		"\2\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026cp\3\2\2\2\u026d\u0271"+
		"\7\62\2\2\u026e\u0270\7a\2\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2"+
		"\2\2\u0274\u027c\t\5\2\2\u0275\u0277\t\6\2\2\u0276\u0275\3\2\2\2\u0277"+
		"\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2"+
		"\2\2\u027a\u0278\3\2\2\2\u027b\u027d\t\5\2\2\u027c\u0278\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0280\t\3\2\2\u027f\u027e\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280r\3\2\2\2\u0281\u0282\7\62\2\2\u0282\u0283"+
		"\t\7\2\2\u0283\u028b\t\b\2\2\u0284\u0286\t\t\2\2\u0285\u0284\3\2\2\2\u0286"+
		"\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u028a\u028c\t\b\2\2\u028b\u0287\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028f\t\3\2\2\u028e\u028d\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028ft\3\2\2\2\u0290\u0291\5\u00ebv\2\u0291\u0293"+
		"\5\u0091I\2\u0292\u0294\5\u00ebv\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0299\3\2\2\2\u0295\u0296\5\u0091I\2\u0296\u0297\5\u00ebv\2"+
		"\u0297\u0299\3\2\2\2\u0298\u0290\3\2\2\2\u0298\u0295\3\2\2\2\u0299\u029b"+
		"\3\2\2\2\u029a\u029c\5\u00e3r\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2"+
		"\2\u029c\u029e\3\2\2\2\u029d\u029f\t\n\2\2\u029e\u029d\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a9\3\2\2\2\u02a0\u02a6\5\u00ebv\2\u02a1\u02a3\5\u00e3"+
		"r\2\u02a2\u02a4\t\n\2\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a7\t\n\2\2\u02a6\u02a1\3\2\2\2\u02a6\u02a5\3\2"+
		"\2\2\u02a7\u02a9\3\2\2\2\u02a8\u0298\3\2\2\2\u02a8\u02a0\3\2\2\2\u02a9"+
		"v\3\2\2\2\u02aa\u02ab\7\62\2\2\u02ab\u02b6\t\4\2\2\u02ac\u02ae\5\u00e7"+
		"t\2\u02ad\u02af\5\u0091I\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b7\3\2\2\2\u02b0\u02b2\5\u00e7t\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\5\u0091I\2\u02b4\u02b5\5\u00e7"+
		"t\2\u02b5\u02b7\3\2\2\2\u02b6\u02ac\3\2\2\2\u02b6\u02b1\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02ba\t\13\2\2\u02b9\u02bb\t\f\2\2\u02ba\u02b9\3"+
		"\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\5\u00ebv\2"+
		"\u02bd\u02bf\t\n\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bfx\3"+
		"\2\2\2\u02c0\u02c1\7v\2\2\u02c1\u02c2\7t\2\2\u02c2\u02c3\7w\2\2\u02c3"+
		"\u02ca\7g\2\2\u02c4\u02c5\7h\2\2\u02c5\u02c6\7c\2\2\u02c6\u02c7\7n\2\2"+
		"\u02c7\u02c8\7u\2\2\u02c8\u02ca\7g\2\2\u02c9\u02c0\3\2\2\2\u02c9\u02c4"+
		"\3\2\2\2\u02caz\3\2\2\2\u02cb\u02ce\7)\2\2\u02cc\u02cf\n\r\2\2\u02cd\u02cf"+
		"\5\u00e5s\2\u02ce\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2"+
		"\2\u02d0\u02d1\7)\2\2\u02d1|\3\2\2\2\u02d2\u02d7\7$\2\2\u02d3\u02d6\n"+
		"\16\2\2\u02d4\u02d6\5\u00e5s\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2"+
		"\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7$\2\2\u02db~\3\2\2\2\u02dc\u02dd"+
		"\7p\2\2\u02dd\u02de\7w\2\2\u02de\u02df\7n\2\2\u02df\u02e0\7n\2\2\u02e0"+
		"\u0080\3\2\2\2\u02e1\u02e2\7*\2\2\u02e2\u0082\3\2\2\2\u02e3\u02e4\7+\2"+
		"\2\u02e4\u0084\3\2\2\2\u02e5\u02e6\7}\2\2\u02e6\u0086\3\2\2\2\u02e7\u02e8"+
		"\7\177\2\2\u02e8\u0088\3\2\2\2\u02e9\u02ea\7]\2\2\u02ea\u008a\3\2\2\2"+
		"\u02eb\u02ec\7_\2\2\u02ec\u008c\3\2\2\2\u02ed\u02ee\7=\2\2\u02ee\u008e"+
		"\3\2\2\2\u02ef\u02f0\7.\2\2\u02f0\u0090\3\2\2\2\u02f1\u02f2\7\60\2\2\u02f2"+
		"\u0092\3\2\2\2\u02f3\u02f4\7?\2\2\u02f4\u0094\3\2\2\2\u02f5\u02f6\7@\2"+
		"\2\u02f6\u0096\3\2\2\2\u02f7\u02f8\7>\2\2\u02f8\u0098\3\2\2\2\u02f9\u02fa"+
		"\7#\2\2\u02fa\u009a\3\2\2\2\u02fb\u02fc\7\u0080\2\2\u02fc\u009c\3\2\2"+
		"\2\u02fd\u02fe\7A\2\2\u02fe\u009e\3\2\2\2\u02ff\u0300\7<\2\2\u0300\u00a0"+
		"\3\2\2\2\u0301\u0302\7?\2\2\u0302\u0303\7?\2\2\u0303\u00a2\3\2\2\2\u0304"+
		"\u0305\7>\2\2\u0305\u0306\7?\2\2\u0306\u00a4\3\2\2\2\u0307\u0308\7@\2"+
		"\2\u0308\u0309\7?\2\2\u0309\u00a6\3\2\2\2\u030a\u030b\7#\2\2\u030b\u030c"+
		"\7?\2\2\u030c\u00a8\3\2\2\2\u030d\u030e\7(\2\2\u030e\u030f\7(\2\2\u030f"+
		"\u00aa\3\2\2\2\u0310\u0311\7~\2\2\u0311\u0312\7~\2\2\u0312\u00ac\3\2\2"+
		"\2\u0313\u0314\7-\2\2\u0314\u0315\7-\2\2\u0315\u00ae\3\2\2\2\u0316\u0317"+
		"\7/\2\2\u0317\u0318\7/\2\2\u0318\u00b0\3\2\2\2\u0319\u031a\7-\2\2\u031a"+
		"\u00b2\3\2\2\2\u031b\u031c\7/\2\2\u031c\u00b4\3\2\2\2\u031d\u031e\7,\2"+
		"\2\u031e\u00b6\3\2\2\2\u031f\u0320\7\61\2\2\u0320\u00b8\3\2\2\2\u0321"+
		"\u0322\7(\2\2\u0322\u00ba\3\2\2\2\u0323\u0324\7~\2\2\u0324\u00bc\3\2\2"+
		"\2\u0325\u0326\7`\2\2\u0326\u00be\3\2\2\2\u0327\u0328\7\'\2\2\u0328\u00c0"+
		"\3\2\2\2\u0329\u032a\7>\2\2\u032a\u032b\7>\2\2\u032b\u00c2\3\2\2\2\u032c"+
		"\u032d\7@\2\2\u032d\u032e\7@\2\2\u032e\u00c4\3\2\2\2\u032f\u0330\7-\2"+
		"\2\u0330\u0331\7?\2\2\u0331\u00c6\3\2\2\2\u0332\u0333\7/\2\2\u0333\u0334"+
		"\7?\2\2\u0334\u00c8\3\2\2\2\u0335\u0336\7,\2\2\u0336\u0337\7?\2\2\u0337"+
		"\u00ca\3\2\2\2\u0338\u0339\7\61\2\2\u0339\u033a\7?\2\2\u033a\u00cc\3\2"+
		"\2\2\u033b\u033c\7(\2\2\u033c\u033d\7?\2\2\u033d\u00ce\3\2\2\2\u033e\u033f"+
		"\7~\2\2\u033f\u0340\7?\2\2\u0340\u00d0\3\2\2\2\u0341\u0342\7`\2\2\u0342"+
		"\u0343\7?\2\2\u0343\u00d2\3\2\2\2\u0344\u0345\7\'\2\2\u0345\u0346\7?\2"+
		"\2\u0346\u00d4\3\2\2\2\u0347\u0348\7>\2\2\u0348\u0349\7>\2\2\u0349\u034a"+
		"\7?\2\2\u034a\u00d6\3\2\2\2\u034b\u034c\7@\2\2\u034c\u034d\7@\2\2\u034d"+
		"\u034e\7?\2\2\u034e\u00d8\3\2\2\2\u034f\u0350\7@\2\2\u0350\u0351\7@\2"+
		"\2\u0351\u0352\7@\2\2\u0352\u0353\7?\2\2\u0353\u00da\3\2\2\2\u0354\u0356"+
		"\t\17\2\2\u0355\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0355\3\2\2\2"+
		"\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\bn\2\2\u035a\u00dc"+
		"\3\2\2\2\u035b\u035c\7\61\2\2\u035c\u035d\7,\2\2\u035d\u0361\3\2\2\2\u035e"+
		"\u0360\13\2\2\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u0362\3"+
		"\2\2\2\u0361\u035f\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0361\3\2\2\2\u0364"+
		"\u0365\7,\2\2\u0365\u0366\7\61\2\2\u0366\u0367\3\2\2\2\u0367\u0368\bo"+
		"\2\2\u0368\u00de\3\2\2\2\u0369\u036a\7\61\2\2\u036a\u036b\7\61\2\2\u036b"+
		"\u036f\3\2\2\2\u036c\u036e\n\20\2\2\u036d\u036c\3\2\2\2\u036e\u0371\3"+
		"\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0372\u0373\bp\2\2\u0373\u00e0\3\2\2\2\u0374\u0378\5\u00ef"+
		"x\2\u0375\u0377\5\u00edw\2\u0376\u0375\3\2\2\2\u0377\u037a\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u00e2\3\2\2\2\u037a\u0378\3\2"+
		"\2\2\u037b\u037d\t\21\2\2\u037c\u037e\t\f\2\2\u037d\u037c\3\2\2\2\u037d"+
		"\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\5\u00ebv\2\u0380\u00e4"+
		"\3\2\2\2\u0381\u0382\7^\2\2\u0382\u0397\t\22\2\2\u0383\u0388\7^\2\2\u0384"+
		"\u0386\t\23\2\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3"+
		"\2\2\2\u0387\u0389\t\5\2\2\u0388\u0385\3\2\2\2\u0388\u0389\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u0397\t\5\2\2\u038b\u038d\7^\2\2\u038c\u038e\7w\2"+
		"\2\u038d\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390"+
		"\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\5\u00e9u\2\u0392\u0393\5\u00e9"+
		"u\2\u0393\u0394\5\u00e9u\2\u0394\u0395\5\u00e9u\2\u0395\u0397\3\2\2\2"+
		"\u0396\u0381\3\2\2\2\u0396\u0383\3\2\2\2\u0396\u038b\3\2\2\2\u0397\u00e6"+
		"\3\2\2\2\u0398\u03a1\5\u00e9u\2\u0399\u039c\5\u00e9u\2\u039a\u039c\7a"+
		"\2\2\u039b\u0399\3\2\2\2\u039b\u039a\3\2\2\2\u039c\u039f\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u039d\3\2"+
		"\2\2\u03a0\u03a2\5\u00e9u\2\u03a1\u039d\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u00e8\3\2\2\2\u03a3\u03a4\t\24\2\2\u03a4\u00ea\3\2\2\2\u03a5\u03ad\t"+
		"\25\2\2\u03a6\u03a8\t\26\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03a9\3\2"+
		"\2\2\u03ac\u03ae\t\25\2\2\u03ad\u03a9\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u00ec\3\2\2\2\u03af\u03b2\5\u00efx\2\u03b0\u03b2\t\26\2\2\u03b1\u03af"+
		"\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b2\u00ee\3\2\2\2\u03b3\u03b4\t\27\2\2"+
		"\u03b4\u00f0\3\2\2\2\63\2\u0243\u0249\u024f\u0254\u0257\u0259\u025c\u0264"+
		"\u0268\u026b\u0271\u0278\u027c\u027f\u0287\u028b\u028e\u0293\u0298\u029b"+
		"\u029e\u02a3\u02a6\u02a8\u02ae\u02b1\u02b6\u02ba\u02be\u02c9\u02ce\u02d5"+
		"\u02d7\u0357\u0361\u036f\u0378\u037d\u0385\u0388\u038f\u0396\u039b\u039d"+
		"\u03a1\u03a9\u03ad\u03b1\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}