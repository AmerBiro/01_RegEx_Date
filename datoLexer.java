// Generated from dato.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class datoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, Text=2, SEPERATE=3, Day=4, Month=5, Year=6, End=7, WHITESPACES=8, 
		Comment=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "Text", "SEPERATE", "Day", "Month", "Year", "End", "WHITESPACES", 
			"Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Today is: '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "Text", "SEPERATE", "Day", "Month", "Year", "End", 
			"WHITESPACES", "Comment"
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


	public datoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dato.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7L\n\7\5\7N\n\7\3\b\6\bQ\n\b\r\b\16\bR\3\t\6\tV\n\t\r\t\16\tW\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\7\n`\n\n\f\n\16\nc\13\n\3\n\3\n\2\2\13\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\17\3\2\61\61\3\2//\3\2\62\62\3\2"+
		"\63;\3\2\63\64\3\2\62;\3\2\65\65\3\2\62\63\3\2\63\63\3\2\62\64\3\2;;\4"+
		"\2\13\f\"\"\3\2\f\f\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25"+
		"\3\2\2\2\5\35\3\2\2\2\7+\3\2\2\2\t\65\3\2\2\2\13<\3\2\2\2\rM\3\2\2\2\17"+
		"P\3\2\2\2\21U\3\2\2\2\23[\3\2\2\2\25\26\5\5\3\2\26\27\5\t\5\2\27\30\5"+
		"\7\4\2\30\31\5\13\6\2\31\32\5\7\4\2\32\33\5\r\7\2\33\34\5\17\b\2\34\4"+
		"\3\2\2\2\35\36\7V\2\2\36\37\7q\2\2\37 \7f\2\2 !\7c\2\2!\"\7{\2\2\"#\7"+
		"\"\2\2#$\7k\2\2$%\7u\2\2%&\7<\2\2&\'\7\"\2\2\'\6\3\2\2\2(,\t\2\2\2),\3"+
		"\2\2\2*,\t\3\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\b\3\2\2\2-.\t\4\2\2.\66"+
		"\t\5\2\2/\66\3\2\2\2\60\61\t\6\2\2\61\66\t\7\2\2\62\66\3\2\2\2\63\64\t"+
		"\b\2\2\64\66\t\t\2\2\65-\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\62\3\2\2"+
		"\2\65\63\3\2\2\2\66\n\3\2\2\2\678\t\4\2\28=\t\5\2\29=\3\2\2\2:;\t\n\2"+
		"\2;=\t\13\2\2<\67\3\2\2\2<9\3\2\2\2<:\3\2\2\2=\f\3\2\2\2>?\t\n\2\2?@\t"+
		"\f\2\2@A\t\f\2\2AN\t\7\2\2BN\3\2\2\2CD\7\64\2\2DE\7\62\2\2EK\3\2\2\2F"+
		"G\t\t\2\2GL\t\7\2\2HL\3\2\2\2IJ\7\64\2\2JL\7\62\2\2KF\3\2\2\2KH\3\2\2"+
		"\2KI\3\2\2\2LN\3\2\2\2M>\3\2\2\2MB\3\2\2\2MC\3\2\2\2N\16\3\2\2\2OQ\7\60"+
		"\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\20\3\2\2\2TV\t\r\2\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\t\2\2Z\22\3\2\2\2["+
		"\\\7\61\2\2\\]\7\61\2\2]a\3\2\2\2^`\n\16\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\b\n\2\2e\24\3\2\2\2\13\2+\65<KMR"+
		"Wa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}