// Generated from chgrammar/CHExpr.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CHExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MUL=7, DIV=8, ADD=9, SUB=10, 
		LEQ=11, NOT=12, EQU=13, DIF=14, ID=15, NUMBER=16, CML=17, CSL=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "MUL", "DIV", "ADD", "SUB", 
		"LEQ", "NOT", "EQU", "DIF", "ID", "NUMBER", "CML", "CSL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'('", "')'", "'true'", "'false'", "'*'", "'/'", "'+'", 
		"'-'", "'<='", "'!'", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", 
		"LEQ", "NOT", "EQU", "DIF", "ID", "NUMBER", "CML", "CSL", "WS"
	};
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


	public CHExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CHExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\7\20R\n\20\f"+
		"\20\16\20U\13\20\3\21\6\21X\n\21\r\21\16\21Y\3\22\3\22\3\22\3\22\7\22"+
		"`\n\22\f\22\16\22c\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23n\n\23\f\23\16\23q\13\23\3\23\5\23t\n\23\3\23\3\23\3\23\3\23\3\24"+
		"\6\24{\n\24\r\24\16\24|\3\24\3\24\4ao\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6"+
		"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u0085\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2"+
		"\2\2\r\66\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27D"+
		"\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35L\3\2\2\2\37O\3\2\2\2!W\3\2\2\2#[\3"+
		"\2\2\2%i\3\2\2\2\'z\3\2\2\2)*\7=\2\2*\4\3\2\2\2+,\7?\2\2,\6\3\2\2\2-."+
		"\7*\2\2.\b\3\2\2\2/\60\7+\2\2\60\n\3\2\2\2\61\62\7v\2\2\62\63\7t\2\2\63"+
		"\64\7w\2\2\64\65\7g\2\2\65\f\3\2\2\2\66\67\7h\2\2\678\7c\2\289\7n\2\2"+
		"9:\7u\2\2:;\7g\2\2;\16\3\2\2\2<=\7,\2\2=\20\3\2\2\2>?\7\61\2\2?\22\3\2"+
		"\2\2@A\7-\2\2A\24\3\2\2\2BC\7/\2\2C\26\3\2\2\2DE\7>\2\2EF\7?\2\2F\30\3"+
		"\2\2\2GH\7#\2\2H\32\3\2\2\2IJ\7?\2\2JK\7?\2\2K\34\3\2\2\2LM\7#\2\2MN\7"+
		"?\2\2N\36\3\2\2\2OS\t\2\2\2PR\t\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST"+
		"\3\2\2\2T \3\2\2\2US\3\2\2\2VX\t\4\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2Y"+
		"Z\3\2\2\2Z\"\3\2\2\2[\\\7\61\2\2\\]\7,\2\2]a\3\2\2\2^`\13\2\2\2_^\3\2"+
		"\2\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7,\2\2ef\7\61"+
		"\2\2fg\3\2\2\2gh\b\22\2\2h$\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2\2\2ln"+
		"\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"rt\7\17\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\f\2\2vw\3\2\2\2wx\b\23\2"+
		"\2x&\3\2\2\2y{\t\5\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2"+
		"\2~\177\b\24\2\2\177(\3\2\2\2\t\2SYaos|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}