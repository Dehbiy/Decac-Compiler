// Generated from /user/2/hammouji/Desktop/PGL/gl22/src/main/antlr4/fr/ensimag/deca/syntax/DecaLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DecaLexer extends AbstractDecaLexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENT=1, ASM=2, INSTANCEOF=3, PRINTLN=4, TRUE=5, CLASS=6, NEW=7, PRINTLNX=8, 
		WHILE=9, EXTENDS=10, NULL=11, PRINTX=12, ELSE=13, READINT=14, PROTECTED=15, 
		FALSE=16, READFLOAT=17, RETURN=18, IF=19, PRINT=20, THIS=21, EQUALS=22, 
		PLUS=23, EXCLAMATION=24, SEMICOLON=25, MINUS=26, ASTERISK=27, GREATER_THAN_EQUALS=28, 
		DIVISION=29, MODULO=30, DOT=31, LESS_THAN_EQUALS=32, AND=33, OR=34, COMMA=35, 
		OPEN_PAREN=36, CLOSE_PAREN=37, OPEN_BRACE=38, CLOSE_BRACE=39, LT=40, GT=41, 
		EQUAL_EQUAL=42, NOT_EQUAL=43, INT=44, FLOAT=45, STRING=46, MULTI_LINE_STRING=47, 
		INCLUDE=48, WS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "IDENT", "ASM", "INSTANCEOF", "PRINTLN", "TRUE", "CLASS", 
			"NEW", "PRINTLNX", "WHILE", "EXTENDS", "NULL", "PRINTX", "ELSE", "READINT", 
			"PROTECTED", "FALSE", "READFLOAT", "RETURN", "IF", "PRINT", "THIS", "EQUALS", 
			"PLUS", "EXCLAMATION", "SEMICOLON", "MINUS", "ASTERISK", "GREATER_THAN_EQUALS", 
			"DIVISION", "MODULO", "DOT", "LESS_THAN_EQUALS", "AND", "OR", "COMMA", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "LT", "GT", 
			"EQUAL_EQUAL", "NOT_EQUAL", "POSITIVE_DIGIT", "INT", "NUM", "SIGN", "EXP", 
			"DEC", "FLOATDEC", "DIGITHEX", "NUMHEX", "FLOATHEX", "FLOAT", "STRING_CAR", 
			"STRING", "MULTI_LINE_STRING", "MULTI_LINE_COMMENT", "MONO_LINE_COMMENT", 
			"FILENAME", "INCLUDE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'asm'", "'instanceof'", "'println'", "'true'", "'class'", 
			"'new'", "'printlnx'", "'while'", "'extends'", "'null'", "'printx'", 
			"'else'", "'readInt'", "'protected'", "'false'", "'readFloat'", "'return'", 
			"'if'", "'print'", "'this'", "'='", "'+'", "'!'", "';'", "'-'", "'*'", 
			"'>='", "'/'", "'%'", "'.'", "'<='", "'&&'", "'||'", "','", "'('", "')'", 
			"'{'", "'}'", "'<'", "'>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENT", "ASM", "INSTANCEOF", "PRINTLN", "TRUE", "CLASS", "NEW", 
			"PRINTLNX", "WHILE", "EXTENDS", "NULL", "PRINTX", "ELSE", "READINT", 
			"PROTECTED", "FALSE", "READFLOAT", "RETURN", "IF", "PRINT", "THIS", "EQUALS", 
			"PLUS", "EXCLAMATION", "SEMICOLON", "MINUS", "ASTERISK", "GREATER_THAN_EQUALS", 
			"DIVISION", "MODULO", "DOT", "LESS_THAN_EQUALS", "AND", "OR", "COMMA", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "LT", "GT", 
			"EQUAL_EQUAL", "NOT_EQUAL", "INT", "FLOAT", "STRING", "MULTI_LINE_STRING", 
			"INCLUDE", "WS"
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




	public DecaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecaLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 62:
			INCLUDE_action((RuleContext)_localctx, actionIndex);
			break;
		case 63:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INCLUDE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 
			      String filename = getText();
			      doInclude(filename);

			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			              skip(); // avoid producing a token
			          
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u00001\u01e3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0088\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u008d\b\u0002\n\u0002\f\u0002\u0090\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u014e"+
		"\b.\n.\f.\u0151\t.\u0003.\u0153\b.\u0001/\u0004/\u0156\b/\u000b/\f/\u0157"+
		"\u00010\u00030\u015b\b0\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00033\u0169\b3\u00013\u00033\u016c"+
		"\b3\u00014\u00014\u00015\u00045\u0171\b5\u000b5\f5\u0172\u00016\u0001"+
		"6\u00016\u00016\u00036\u0179\b6\u00016\u00016\u00016\u00016\u00046\u017f"+
		"\b6\u000b6\f6\u0180\u00016\u00016\u00016\u00016\u00016\u00036\u0188\b"+
		"6\u00017\u00017\u00037\u018c\b7\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00059\u0196\b9\n9\f9\u0199\t9\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u01a4\b:\n:\f:\u01a7\t:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0005;\u01af\b;\n;\f;\u01b2\t;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0005<\u01bb\b<\n<\f<\u01be"+
		"\t<\u0001<\u0001<\u0001=\u0001=\u0001=\u0004=\u01c5\b=\u000b=\f=\u01c6"+
		"\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0005>\u01d3\b>\n>\f>\u01d6\t>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		"?\u0001?\u0001?\u0003?\u01e0\b?\u0001?\u0001?\u0001\u01b0\u0000@\u0001"+
		"\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005"+
		"\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d"+
		"\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u0016"+
		"1\u00173\u00185\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001fC E!G\""+
		"I#K$M%O&Q\'S(U)W*Y+[\u0000],_\u0000a\u0000c\u0000e\u0000g\u0000i\u0000"+
		"k\u0000m\u0000o-q\u0000s.u/w\u0000y\u0000{\u0000}0\u007f1\u0001\u0000"+
		"\n\u0002\u0000AZaz\u0002\u0000$$__\u0002\u0000++--\u0002\u0000EEee\u0002"+
		"\u0000FFff\u0003\u000009AFaf\u0003\u0000\n\n\"\"\\\\\u0001\u0000\n\n\u0002"+
		"\u0000-.__\u0003\u0000\t\n\r\r  \u01f1\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000]\u0001"+
		"\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000"+
		"\u0000\u0000u\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000"+
		"\u007f\u0001\u0000\u0000\u0000\u0001\u0081\u0001\u0000\u0000\u0000\u0003"+
		"\u0083\u0001\u0000\u0000\u0000\u0005\u0087\u0001\u0000\u0000\u0000\u0007"+
		"\u0091\u0001\u0000\u0000\u0000\t\u0095\u0001\u0000\u0000\u0000\u000b\u00a0"+
		"\u0001\u0000\u0000\u0000\r\u00a8\u0001\u0000\u0000\u0000\u000f\u00ad\u0001"+
		"\u0000\u0000\u0000\u0011\u00b3\u0001\u0000\u0000\u0000\u0013\u00b7\u0001"+
		"\u0000\u0000\u0000\u0015\u00c0\u0001\u0000\u0000\u0000\u0017\u00c6\u0001"+
		"\u0000\u0000\u0000\u0019\u00ce\u0001\u0000\u0000\u0000\u001b\u00d3\u0001"+
		"\u0000\u0000\u0000\u001d\u00da\u0001\u0000\u0000\u0000\u001f\u00df\u0001"+
		"\u0000\u0000\u0000!\u00e7\u0001\u0000\u0000\u0000#\u00f1\u0001\u0000\u0000"+
		"\u0000%\u00f7\u0001\u0000\u0000\u0000\'\u0101\u0001\u0000\u0000\u0000"+
		")\u0108\u0001\u0000\u0000\u0000+\u010b\u0001\u0000\u0000\u0000-\u0111"+
		"\u0001\u0000\u0000\u0000/\u0116\u0001\u0000\u0000\u00001\u0118\u0001\u0000"+
		"\u0000\u00003\u011a\u0001\u0000\u0000\u00005\u011c\u0001\u0000\u0000\u0000"+
		"7\u011e\u0001\u0000\u0000\u00009\u0120\u0001\u0000\u0000\u0000;\u0122"+
		"\u0001\u0000\u0000\u0000=\u0125\u0001\u0000\u0000\u0000?\u0127\u0001\u0000"+
		"\u0000\u0000A\u0129\u0001\u0000\u0000\u0000C\u012b\u0001\u0000\u0000\u0000"+
		"E\u012e\u0001\u0000\u0000\u0000G\u0131\u0001\u0000\u0000\u0000I\u0134"+
		"\u0001\u0000\u0000\u0000K\u0136\u0001\u0000\u0000\u0000M\u0138\u0001\u0000"+
		"\u0000\u0000O\u013a\u0001\u0000\u0000\u0000Q\u013c\u0001\u0000\u0000\u0000"+
		"S\u013e\u0001\u0000\u0000\u0000U\u0140\u0001\u0000\u0000\u0000W\u0142"+
		"\u0001\u0000\u0000\u0000Y\u0145\u0001\u0000\u0000\u0000[\u0148\u0001\u0000"+
		"\u0000\u0000]\u0152\u0001\u0000\u0000\u0000_\u0155\u0001\u0000\u0000\u0000"+
		"a\u015a\u0001\u0000\u0000\u0000c\u015c\u0001\u0000\u0000\u0000e\u0160"+
		"\u0001\u0000\u0000\u0000g\u0168\u0001\u0000\u0000\u0000i\u016d\u0001\u0000"+
		"\u0000\u0000k\u0170\u0001\u0000\u0000\u0000m\u0178\u0001\u0000\u0000\u0000"+
		"o\u018b\u0001\u0000\u0000\u0000q\u018d\u0001\u0000\u0000\u0000s\u018f"+
		"\u0001\u0000\u0000\u0000u\u019c\u0001\u0000\u0000\u0000w\u01aa\u0001\u0000"+
		"\u0000\u0000y\u01b6\u0001\u0000\u0000\u0000{\u01c4\u0001\u0000\u0000\u0000"+
		"}\u01c8\u0001\u0000\u0000\u0000\u007f\u01df\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0007\u0000\u0000\u0000\u0082\u0002\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u000209\u0000\u0084\u0004\u0001\u0000\u0000\u0000\u0085\u0088\u0003"+
		"\u0001\u0000\u0000\u0086\u0088\u0007\u0001\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008e\u0001"+
		"\u0000\u0000\u0000\u0089\u008d\u0003\u0001\u0000\u0000\u008a\u008d\u0003"+
		"\u0003\u0001\u0000\u008b\u008d\u0007\u0001\u0000\u0000\u008c\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0006\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"a\u0000\u0000\u0092\u0093\u0005s\u0000\u0000\u0093\u0094\u0005m\u0000"+
		"\u0000\u0094\b\u0001\u0000\u0000\u0000\u0095\u0096\u0005i\u0000\u0000"+
		"\u0096\u0097\u0005n\u0000\u0000\u0097\u0098\u0005s\u0000\u0000\u0098\u0099"+
		"\u0005t\u0000\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u009b\u0005n"+
		"\u0000\u0000\u009b\u009c\u0005c\u0000\u0000\u009c\u009d\u0005e\u0000\u0000"+
		"\u009d\u009e\u0005o\u0000\u0000\u009e\u009f\u0005f\u0000\u0000\u009f\n"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005p\u0000\u0000\u00a1\u00a2\u0005"+
		"r\u0000\u0000\u00a2\u00a3\u0005i\u0000\u0000\u00a3\u00a4\u0005n\u0000"+
		"\u0000\u00a4\u00a5\u0005t\u0000\u0000\u00a5\u00a6\u0005l\u0000\u0000\u00a6"+
		"\u00a7\u0005n\u0000\u0000\u00a7\f\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005t\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa\u00ab\u0005u"+
		"\u0000\u0000\u00ab\u00ac\u0005e\u0000\u0000\u00ac\u000e\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005c\u0000\u0000\u00ae\u00af\u0005l\u0000\u0000\u00af"+
		"\u00b0\u0005a\u0000\u0000\u00b0\u00b1\u0005s\u0000\u0000\u00b1\u00b2\u0005"+
		"s\u0000\u0000\u00b2\u0010\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005n\u0000"+
		"\u0000\u00b4\u00b5\u0005e\u0000\u0000\u00b5\u00b6\u0005w\u0000\u0000\u00b6"+
		"\u0012\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005p\u0000\u0000\u00b8\u00b9"+
		"\u0005r\u0000\u0000\u00b9\u00ba\u0005i\u0000\u0000\u00ba\u00bb\u0005n"+
		"\u0000\u0000\u00bb\u00bc\u0005t\u0000\u0000\u00bc\u00bd\u0005l\u0000\u0000"+
		"\u00bd\u00be\u0005n\u0000\u0000\u00be\u00bf\u0005x\u0000\u0000\u00bf\u0014"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005w\u0000\u0000\u00c1\u00c2\u0005"+
		"h\u0000\u0000\u00c2\u00c3\u0005i\u0000\u0000\u00c3\u00c4\u0005l\u0000"+
		"\u0000\u00c4\u00c5\u0005e\u0000\u0000\u00c5\u0016\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005e\u0000\u0000\u00c7\u00c8\u0005x\u0000\u0000\u00c8\u00c9"+
		"\u0005t\u0000\u0000\u00c9\u00ca\u0005e\u0000\u0000\u00ca\u00cb\u0005n"+
		"\u0000\u0000\u00cb\u00cc\u0005d\u0000\u0000\u00cc\u00cd\u0005s\u0000\u0000"+
		"\u00cd\u0018\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005n\u0000\u0000\u00cf"+
		"\u00d0\u0005u\u0000\u0000\u00d0\u00d1\u0005l\u0000\u0000\u00d1\u00d2\u0005"+
		"l\u0000\u0000\u00d2\u001a\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005p\u0000"+
		"\u0000\u00d4\u00d5\u0005r\u0000\u0000\u00d5\u00d6\u0005i\u0000\u0000\u00d6"+
		"\u00d7\u0005n\u0000\u0000\u00d7\u00d8\u0005t\u0000\u0000\u00d8\u00d9\u0005"+
		"x\u0000\u0000\u00d9\u001c\u0001\u0000\u0000\u0000\u00da\u00db\u0005e\u0000"+
		"\u0000\u00db\u00dc\u0005l\u0000\u0000\u00dc\u00dd\u0005s\u0000\u0000\u00dd"+
		"\u00de\u0005e\u0000\u0000\u00de\u001e\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005r\u0000\u0000\u00e0\u00e1\u0005e\u0000\u0000\u00e1\u00e2\u0005a"+
		"\u0000\u0000\u00e2\u00e3\u0005d\u0000\u0000\u00e3\u00e4\u0005I\u0000\u0000"+
		"\u00e4\u00e5\u0005n\u0000\u0000\u00e5\u00e6\u0005t\u0000\u0000\u00e6 "+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005p\u0000\u0000\u00e8\u00e9\u0005"+
		"r\u0000\u0000\u00e9\u00ea\u0005o\u0000\u0000\u00ea\u00eb\u0005t\u0000"+
		"\u0000\u00eb\u00ec\u0005e\u0000\u0000\u00ec\u00ed\u0005c\u0000\u0000\u00ed"+
		"\u00ee\u0005t\u0000\u0000\u00ee\u00ef\u0005e\u0000\u0000\u00ef\u00f0\u0005"+
		"d\u0000\u0000\u00f0\"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005f\u0000"+
		"\u0000\u00f2\u00f3\u0005a\u0000\u0000\u00f3\u00f4\u0005l\u0000\u0000\u00f4"+
		"\u00f5\u0005s\u0000\u0000\u00f5\u00f6\u0005e\u0000\u0000\u00f6$\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005r\u0000\u0000\u00f8\u00f9\u0005e\u0000"+
		"\u0000\u00f9\u00fa\u0005a\u0000\u0000\u00fa\u00fb\u0005d\u0000\u0000\u00fb"+
		"\u00fc\u0005F\u0000\u0000\u00fc\u00fd\u0005l\u0000\u0000\u00fd\u00fe\u0005"+
		"o\u0000\u0000\u00fe\u00ff\u0005a\u0000\u0000\u00ff\u0100\u0005t\u0000"+
		"\u0000\u0100&\u0001\u0000\u0000\u0000\u0101\u0102\u0005r\u0000\u0000\u0102"+
		"\u0103\u0005e\u0000\u0000\u0103\u0104\u0005t\u0000\u0000\u0104\u0105\u0005"+
		"u\u0000\u0000\u0105\u0106\u0005r\u0000\u0000\u0106\u0107\u0005n\u0000"+
		"\u0000\u0107(\u0001\u0000\u0000\u0000\u0108\u0109\u0005i\u0000\u0000\u0109"+
		"\u010a\u0005f\u0000\u0000\u010a*\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"p\u0000\u0000\u010c\u010d\u0005r\u0000\u0000\u010d\u010e\u0005i\u0000"+
		"\u0000\u010e\u010f\u0005n\u0000\u0000\u010f\u0110\u0005t\u0000\u0000\u0110"+
		",\u0001\u0000\u0000\u0000\u0111\u0112\u0005t\u0000\u0000\u0112\u0113\u0005"+
		"h\u0000\u0000\u0113\u0114\u0005i\u0000\u0000\u0114\u0115\u0005s\u0000"+
		"\u0000\u0115.\u0001\u0000\u0000\u0000\u0116\u0117\u0005=\u0000\u0000\u0117"+
		"0\u0001\u0000\u0000\u0000\u0118\u0119\u0005+\u0000\u0000\u01192\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005!\u0000\u0000\u011b4\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0005;\u0000\u0000\u011d6\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005-\u0000\u0000\u011f8\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"*\u0000\u0000\u0121:\u0001\u0000\u0000\u0000\u0122\u0123\u0005>\u0000"+
		"\u0000\u0123\u0124\u0005=\u0000\u0000\u0124<\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0005/\u0000\u0000\u0126>\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"%\u0000\u0000\u0128@\u0001\u0000\u0000\u0000\u0129\u012a\u0005.\u0000"+
		"\u0000\u012aB\u0001\u0000\u0000\u0000\u012b\u012c\u0005<\u0000\u0000\u012c"+
		"\u012d\u0005=\u0000\u0000\u012dD\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		"&\u0000\u0000\u012f\u0130\u0005&\u0000\u0000\u0130F\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005|\u0000\u0000\u0132\u0133\u0005|\u0000\u0000\u0133"+
		"H\u0001\u0000\u0000\u0000\u0134\u0135\u0005,\u0000\u0000\u0135J\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005(\u0000\u0000\u0137L\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005)\u0000\u0000\u0139N\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005{\u0000\u0000\u013bP\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"}\u0000\u0000\u013dR\u0001\u0000\u0000\u0000\u013e\u013f\u0005<\u0000"+
		"\u0000\u013fT\u0001\u0000\u0000\u0000\u0140\u0141\u0005>\u0000\u0000\u0141"+
		"V\u0001\u0000\u0000\u0000\u0142\u0143\u0005=\u0000\u0000\u0143\u0144\u0005"+
		"=\u0000\u0000\u0144X\u0001\u0000\u0000\u0000\u0145\u0146\u0005!\u0000"+
		"\u0000\u0146\u0147\u0005=\u0000\u0000\u0147Z\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u000219\u0000\u0149\\\u0001\u0000\u0000\u0000\u014a\u0153\u0005"+
		"0\u0000\u0000\u014b\u014f\u0003[-\u0000\u014c\u014e\u0003\u0003\u0001"+
		"\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0152\u014a\u0001\u0000\u0000\u0000\u0152\u014b\u0001\u0000\u0000"+
		"\u0000\u0153^\u0001\u0000\u0000\u0000\u0154\u0156\u0003\u0003\u0001\u0000"+
		"\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158`\u0001\u0000\u0000\u0000\u0159\u015b\u0007\u0002\u0000\u0000\u015a"+
		"\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"b\u0001\u0000\u0000\u0000\u015c\u015d\u0007\u0003\u0000\u0000\u015d\u015e"+
		"\u0003a0\u0000\u015e\u015f\u0003_/\u0000\u015fd\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0003_/\u0000\u0161\u0162\u0005.\u0000\u0000\u0162\u0163"+
		"\u0003_/\u0000\u0163f\u0001\u0000\u0000\u0000\u0164\u0169\u0003e2\u0000"+
		"\u0165\u0166\u0003e2\u0000\u0166\u0167\u0003c1\u0000\u0167\u0169\u0001"+
		"\u0000\u0000\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168\u0165\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u016c\u0007"+
		"\u0004\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016ch\u0001\u0000\u0000\u0000\u016d\u016e\u0007\u0005"+
		"\u0000\u0000\u016ej\u0001\u0000\u0000\u0000\u016f\u0171\u0003i4\u0000"+
		"\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000"+
		"\u0173l\u0001\u0000\u0000\u0000\u0174\u0175\u00050\u0000\u0000\u0175\u0179"+
		"\u0005x\u0000\u0000\u0176\u0177\u00050\u0000\u0000\u0177\u0179\u0005X"+
		"\u0000\u0000\u0178\u0174\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0003k5\u0000"+
		"\u017b\u017c\u0005.\u0000\u0000\u017c\u017e\u0003k5\u0000\u017d\u017f"+
		"\u0005P\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0005"+
		"p\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0003a0"+
		"\u0000\u0185\u0187\u0003_/\u0000\u0186\u0188\u0007\u0004\u0000\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"n\u0001\u0000\u0000\u0000\u0189\u018c\u0003g3\u0000\u018a\u018c\u0003"+
		"m6\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000"+
		"\u0000\u018cp\u0001\u0000\u0000\u0000\u018d\u018e\b\u0006\u0000\u0000"+
		"\u018er\u0001\u0000\u0000\u0000\u018f\u0197\u0005\"\u0000\u0000\u0190"+
		"\u0196\u0003q8\u0000\u0191\u0192\u0005\\\u0000\u0000\u0192\u0196\u0005"+
		"\"\u0000\u0000\u0193\u0194\u0005\\\u0000\u0000\u0194\u0196\u0005\\\u0000"+
		"\u0000\u0195\u0190\u0001\u0000\u0000\u0000\u0195\u0191\u0001\u0000\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0005\"\u0000\u0000\u019bt\u0001\u0000\u0000\u0000"+
		"\u019c\u01a5\u0005\"\u0000\u0000\u019d\u01a4\u0003q8\u0000\u019e\u01a4"+
		"\u0005\n\u0000\u0000\u019f\u01a0\u0005\\\u0000\u0000\u01a0\u01a4\u0005"+
		"\"\u0000\u0000\u01a1\u01a2\u0005\\\u0000\u0000\u01a2\u01a4\u0005\\\u0000"+
		"\u0000\u01a3\u019d\u0001\u0000\u0000\u0000\u01a3\u019e\u0001\u0000\u0000"+
		"\u0000\u01a3\u019f\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\"\u0000\u0000"+
		"\u01a9v\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005/\u0000\u0000\u01ab\u01ac"+
		"\u0005*\u0000\u0000\u01ac\u01b0\u0001\u0000\u0000\u0000\u01ad\u01af\t"+
		"\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0005*\u0000\u0000\u01b4\u01b5\u0005/\u0000"+
		"\u0000\u01b5x\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005/\u0000\u0000\u01b7"+
		"\u01b8\u0005/\u0000\u0000\u01b8\u01bc\u0001\u0000\u0000\u0000\u01b9\u01bb"+
		"\b\u0007\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0005\n\u0000\u0000\u01c0z\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c5\u0003\u0001\u0000\u0000\u01c2\u01c5\u0003\u0003"+
		"\u0001\u0000\u01c3\u01c5\u0007\b\u0000\u0000\u01c4\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7|\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0005#\u0000\u0000\u01c9\u01ca\u0005i\u0000\u0000\u01ca\u01cb"+
		"\u0005n\u0000\u0000\u01cb\u01cc\u0005c\u0000\u0000\u01cc\u01cd\u0005l"+
		"\u0000\u0000\u01cd\u01ce\u0005u\u0000\u0000\u01ce\u01cf\u0005d\u0000\u0000"+
		"\u01cf\u01d0\u0005e\u0000\u0000\u01d0\u01d4\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d3\u0005 \u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\"\u0000\u0000\u01d8\u01d9\u0003"+
		"{=\u0000\u01d9\u01da\u0005\"\u0000\u0000\u01da\u01db\u0006>\u0000\u0000"+
		"\u01db~\u0001\u0000\u0000\u0000\u01dc\u01e0\u0007\t\u0000\u0000\u01dd"+
		"\u01e0\u0003w;\u0000\u01de\u01e0\u0003y<\u0000\u01df\u01dc\u0001\u0000"+
		"\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01de\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0006?\u0001"+
		"\u0000\u01e2\u0080\u0001\u0000\u0000\u0000\u0019\u0000\u0087\u008c\u008e"+
		"\u014f\u0152\u0157\u015a\u0168\u016b\u0172\u0178\u0180\u0187\u018b\u0195"+
		"\u0197\u01a3\u01a5\u01b0\u01bc\u01c4\u01c6\u01d4\u01df\u0002\u0001>\u0000"+
		"\u0001?\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}