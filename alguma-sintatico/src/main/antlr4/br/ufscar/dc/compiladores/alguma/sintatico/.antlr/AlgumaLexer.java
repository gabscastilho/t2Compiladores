// Generated from /home/gabrielly/projetos/compiladores/alguma-lexico/alguma-sintatico/src/main/antlr4/br/ufscar/dc/compiladores/alguma/sintatico/Alguma.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, TIPO_VAR=42, NUMINT=43, NUMREAL=44, CADEIA=45, 
		VARIAVEL=46, OP_ARIT1=47, OP_ARIT2=48, OP_ARIT3=49, OP_REL=50, ERRO_COMENTARIO=51, 
		COMENTARIO=52, WS=53, CADEIA_NAO_FECHADA=54, COMENTARIO_NAO_FECHADO=55, 
		ABRE_PAR=56, FECHA_PAR=57, ABRE_COL=58, FECHA_COL=59, ERRO=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"TIPO_VAR", "NUMINT", "NUMREAL", "CADEIA", "VARIAVEL", "OP_ARIT1", "OP_ARIT2", 
			"OP_ARIT3", "OP_REL", "ESC_SEQ", "ERRO_COMENTARIO", "COMENTARIO", "WS", 
			"CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "ABRE_PAR", "FECHA_PAR", 
			"ABRE_COL", "FECHA_COL", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'^'", "'&'", "'<-'", "'tipo'", "':'", "'registro'", "','", 
			"'fim_registro'", "'e'", "'ou'", "'algoritmo'", "'fim_algoritmo'", "'declare'", 
			"'nao'", "'='", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", 
			"'senao'", "'..'", "'caso'", "'seja'", "'fim_caso'", "'enquanto'", "'faca'", 
			"'fim_enquanto'", "'ate'", "'para'", "'fim_para'", "'INICIO'", "'FIM'", 
			"'retorne'", "'funcao'", "'fim_funcao'", "'procedimento'", "'var'", "'fim_procedimento'", 
			"'constante'", null, null, null, null, null, null, null, "'%'", null, 
			null, null, null, null, null, "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TIPO_VAR", "NUMINT", "NUMREAL", 
			"CADEIA", "VARIAVEL", "OP_ARIT1", "OP_ARIT2", "OP_ARIT3", "OP_REL", "ERRO_COMENTARIO", 
			"COMENTARIO", "WS", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "ABRE_PAR", 
			"FECHA_PAR", "ABRE_COL", "FECHA_COL", "ERRO"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

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
		case 52:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000<\u0214\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		":\u0002;\u0007;\u0002<\u0007<\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u019e\b)\u0001"+
		"*\u0003*\u01a1\b*\u0001*\u0004*\u01a4\b*\u000b*\f*\u01a5\u0001+\u0003"+
		"+\u01a9\b+\u0001+\u0004+\u01ac\b+\u000b+\f+\u01ad\u0001+\u0001+\u0004"+
		"+\u01b2\b+\u000b+\f+\u01b3\u0003+\u01b6\b+\u0001,\u0001,\u0005,\u01ba"+
		"\b,\n,\f,\u01bd\t,\u0001,\u0001,\u0001-\u0001-\u0005-\u01c3\b-\n-\f-\u01c6"+
		"\t-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00031\u01d6\b1\u00012\u00012\u00012\u0001"+
		"3\u00013\u00053\u01dd\b3\n3\f3\u01e0\t3\u00013\u00033\u01e3\b3\u00013"+
		"\u00013\u00013\u00013\u00013\u00014\u00014\u00054\u01ec\b4\n4\f4\u01ef"+
		"\t4\u00014\u00034\u01f2\b4\u00014\u00014\u00014\u00014\u00015\u00015\u0001"+
		"5\u00016\u00016\u00056\u01fd\b6\n6\f6\u0200\t6\u00017\u00017\u00057\u0204"+
		"\b7\n7\f7\u0207\t7\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001"+
		":\u0001;\u0001;\u0001<\u0001<\u0002\u01bb\u01fe\u0000=\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/"+
		"_0a1c2e\u0000g3i4k5m6o7q8s9u:w;y<\u0001\u0000\n\u0001\u0000\n\n\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0002\u0000++--\u0002\u0000**//\u0002\u0000"+
		"\n\n\r\r\u0002\u0000\n\n  \u0003\u0000\t\n\r\r  \u0003\u0000\n\n\r\r}"+
		"}\u0005\u0000!!$$@@||~~\u0227\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000"+
		"\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u"+
		"\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000"+
		"\u0000\u0000\u0001{\u0001\u0000\u0000\u0000\u0003}\u0001\u0000\u0000\u0000"+
		"\u0005\u007f\u0001\u0000\u0000\u0000\u0007\u0081\u0001\u0000\u0000\u0000"+
		"\t\u0084\u0001\u0000\u0000\u0000\u000b\u0089\u0001\u0000\u0000\u0000\r"+
		"\u008b\u0001\u0000\u0000\u0000\u000f\u0094\u0001\u0000\u0000\u0000\u0011"+
		"\u0096\u0001\u0000\u0000\u0000\u0013\u00a3\u0001\u0000\u0000\u0000\u0015"+
		"\u00a5\u0001\u0000\u0000\u0000\u0017\u00a8\u0001\u0000\u0000\u0000\u0019"+
		"\u00b2\u0001\u0000\u0000\u0000\u001b\u00c0\u0001\u0000\u0000\u0000\u001d"+
		"\u00c8\u0001\u0000\u0000\u0000\u001f\u00cc\u0001\u0000\u0000\u0000!\u00ce"+
		"\u0001\u0000\u0000\u0000#\u00d3\u0001\u0000\u0000\u0000%\u00db\u0001\u0000"+
		"\u0000\u0000\'\u00de\u0001\u0000\u0000\u0000)\u00e4\u0001\u0000\u0000"+
		"\u0000+\u00eb\u0001\u0000\u0000\u0000-\u00f1\u0001\u0000\u0000\u0000/"+
		"\u00f4\u0001\u0000\u0000\u00001\u00f9\u0001\u0000\u0000\u00003\u00fe\u0001"+
		"\u0000\u0000\u00005\u0107\u0001\u0000\u0000\u00007\u0110\u0001\u0000\u0000"+
		"\u00009\u0115\u0001\u0000\u0000\u0000;\u0122\u0001\u0000\u0000\u0000="+
		"\u0126\u0001\u0000\u0000\u0000?\u012b\u0001\u0000\u0000\u0000A\u0134\u0001"+
		"\u0000\u0000\u0000C\u013b\u0001\u0000\u0000\u0000E\u013f\u0001\u0000\u0000"+
		"\u0000G\u0147\u0001\u0000\u0000\u0000I\u014e\u0001\u0000\u0000\u0000K"+
		"\u0159\u0001\u0000\u0000\u0000M\u0166\u0001\u0000\u0000\u0000O\u016a\u0001"+
		"\u0000\u0000\u0000Q\u017b\u0001\u0000\u0000\u0000S\u019d\u0001\u0000\u0000"+
		"\u0000U\u01a0\u0001\u0000\u0000\u0000W\u01a8\u0001\u0000\u0000\u0000Y"+
		"\u01b7\u0001\u0000\u0000\u0000[\u01c0\u0001\u0000\u0000\u0000]\u01c7\u0001"+
		"\u0000\u0000\u0000_\u01c9\u0001\u0000\u0000\u0000a\u01cb\u0001\u0000\u0000"+
		"\u0000c\u01d5\u0001\u0000\u0000\u0000e\u01d7\u0001\u0000\u0000\u0000g"+
		"\u01da\u0001\u0000\u0000\u0000i\u01e9\u0001\u0000\u0000\u0000k\u01f7\u0001"+
		"\u0000\u0000\u0000m\u01fa\u0001\u0000\u0000\u0000o\u0201\u0001\u0000\u0000"+
		"\u0000q\u020a\u0001\u0000\u0000\u0000s\u020c\u0001\u0000\u0000\u0000u"+
		"\u020e\u0001\u0000\u0000\u0000w\u0210\u0001\u0000\u0000\u0000y\u0212\u0001"+
		"\u0000\u0000\u0000{|\u0005.\u0000\u0000|\u0002\u0001\u0000\u0000\u0000"+
		"}~\u0005^\u0000\u0000~\u0004\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"&\u0000\u0000\u0080\u0006\u0001\u0000\u0000\u0000\u0081\u0082\u0005<\u0000"+
		"\u0000\u0082\u0083\u0005-\u0000\u0000\u0083\b\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005t\u0000\u0000\u0085\u0086\u0005i\u0000\u0000\u0086\u0087"+
		"\u0005p\u0000\u0000\u0087\u0088\u0005o\u0000\u0000\u0088\n\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005:\u0000\u0000\u008a\f\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005r\u0000\u0000\u008c\u008d\u0005e\u0000\u0000\u008d"+
		"\u008e\u0005g\u0000\u0000\u008e\u008f\u0005i\u0000\u0000\u008f\u0090\u0005"+
		"s\u0000\u0000\u0090\u0091\u0005t\u0000\u0000\u0091\u0092\u0005r\u0000"+
		"\u0000\u0092\u0093\u0005o\u0000\u0000\u0093\u000e\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005,\u0000\u0000\u0095\u0010\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005f\u0000\u0000\u0097\u0098\u0005i\u0000\u0000\u0098\u0099\u0005"+
		"m\u0000\u0000\u0099\u009a\u0005_\u0000\u0000\u009a\u009b\u0005r\u0000"+
		"\u0000\u009b\u009c\u0005e\u0000\u0000\u009c\u009d\u0005g\u0000\u0000\u009d"+
		"\u009e\u0005i\u0000\u0000\u009e\u009f\u0005s\u0000\u0000\u009f\u00a0\u0005"+
		"t\u0000\u0000\u00a0\u00a1\u0005r\u0000\u0000\u00a1\u00a2\u0005o\u0000"+
		"\u0000\u00a2\u0012\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000"+
		"\u00a4\u0014\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005o\u0000\u0000\u00a6"+
		"\u00a7\u0005u\u0000\u0000\u00a7\u0016\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005a\u0000\u0000\u00a9\u00aa\u0005l\u0000\u0000\u00aa\u00ab\u0005g"+
		"\u0000\u0000\u00ab\u00ac\u0005o\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000"+
		"\u00ad\u00ae\u0005i\u0000\u0000\u00ae\u00af\u0005t\u0000\u0000\u00af\u00b0"+
		"\u0005m\u0000\u0000\u00b0\u00b1\u0005o\u0000\u0000\u00b1\u0018\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005f\u0000\u0000\u00b3\u00b4\u0005i\u0000\u0000"+
		"\u00b4\u00b5\u0005m\u0000\u0000\u00b5\u00b6\u0005_\u0000\u0000\u00b6\u00b7"+
		"\u0005a\u0000\u0000\u00b7\u00b8\u0005l\u0000\u0000\u00b8\u00b9\u0005g"+
		"\u0000\u0000\u00b9\u00ba\u0005o\u0000\u0000\u00ba\u00bb\u0005r\u0000\u0000"+
		"\u00bb\u00bc\u0005i\u0000\u0000\u00bc\u00bd\u0005t\u0000\u0000\u00bd\u00be"+
		"\u0005m\u0000\u0000\u00be\u00bf\u0005o\u0000\u0000\u00bf\u001a\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005d\u0000\u0000\u00c1\u00c2\u0005e\u0000\u0000"+
		"\u00c2\u00c3\u0005c\u0000\u0000\u00c3\u00c4\u0005l\u0000\u0000\u00c4\u00c5"+
		"\u0005a\u0000\u0000\u00c5\u00c6\u0005r\u0000\u0000\u00c6\u00c7\u0005e"+
		"\u0000\u0000\u00c7\u001c\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005n\u0000"+
		"\u0000\u00c9\u00ca\u0005a\u0000\u0000\u00ca\u00cb\u0005o\u0000\u0000\u00cb"+
		"\u001e\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005=\u0000\u0000\u00cd \u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005l\u0000\u0000\u00cf\u00d0\u0005e\u0000"+
		"\u0000\u00d0\u00d1\u0005i\u0000\u0000\u00d1\u00d2\u0005a\u0000\u0000\u00d2"+
		"\"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005e\u0000\u0000\u00d4\u00d5"+
		"\u0005s\u0000\u0000\u00d5\u00d6\u0005c\u0000\u0000\u00d6\u00d7\u0005r"+
		"\u0000\u0000\u00d7\u00d8\u0005e\u0000\u0000\u00d8\u00d9\u0005v\u0000\u0000"+
		"\u00d9\u00da\u0005a\u0000\u0000\u00da$\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005s\u0000\u0000\u00dc\u00dd\u0005e\u0000\u0000\u00dd&\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005e\u0000\u0000\u00df\u00e0\u0005n\u0000\u0000"+
		"\u00e0\u00e1\u0005t\u0000\u0000\u00e1\u00e2\u0005a\u0000\u0000\u00e2\u00e3"+
		"\u0005o\u0000\u0000\u00e3(\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005f"+
		"\u0000\u0000\u00e5\u00e6\u0005i\u0000\u0000\u00e6\u00e7\u0005m\u0000\u0000"+
		"\u00e7\u00e8\u0005_\u0000\u0000\u00e8\u00e9\u0005s\u0000\u0000\u00e9\u00ea"+
		"\u0005e\u0000\u0000\u00ea*\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005s"+
		"\u0000\u0000\u00ec\u00ed\u0005e\u0000\u0000\u00ed\u00ee\u0005n\u0000\u0000"+
		"\u00ee\u00ef\u0005a\u0000\u0000\u00ef\u00f0\u0005o\u0000\u0000\u00f0,"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005.\u0000\u0000\u00f2\u00f3\u0005"+
		".\u0000\u0000\u00f3.\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005c\u0000"+
		"\u0000\u00f5\u00f6\u0005a\u0000\u0000\u00f6\u00f7\u0005s\u0000\u0000\u00f7"+
		"\u00f8\u0005o\u0000\u0000\u00f80\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"s\u0000\u0000\u00fa\u00fb\u0005e\u0000\u0000\u00fb\u00fc\u0005j\u0000"+
		"\u0000\u00fc\u00fd\u0005a\u0000\u0000\u00fd2\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005f\u0000\u0000\u00ff\u0100\u0005i\u0000\u0000\u0100\u0101\u0005"+
		"m\u0000\u0000\u0101\u0102\u0005_\u0000\u0000\u0102\u0103\u0005c\u0000"+
		"\u0000\u0103\u0104\u0005a\u0000\u0000\u0104\u0105\u0005s\u0000\u0000\u0105"+
		"\u0106\u0005o\u0000\u0000\u01064\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"e\u0000\u0000\u0108\u0109\u0005n\u0000\u0000\u0109\u010a\u0005q\u0000"+
		"\u0000\u010a\u010b\u0005u\u0000\u0000\u010b\u010c\u0005a\u0000\u0000\u010c"+
		"\u010d\u0005n\u0000\u0000\u010d\u010e\u0005t\u0000\u0000\u010e\u010f\u0005"+
		"o\u0000\u0000\u010f6\u0001\u0000\u0000\u0000\u0110\u0111\u0005f\u0000"+
		"\u0000\u0111\u0112\u0005a\u0000\u0000\u0112\u0113\u0005c\u0000\u0000\u0113"+
		"\u0114\u0005a\u0000\u0000\u01148\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"f\u0000\u0000\u0116\u0117\u0005i\u0000\u0000\u0117\u0118\u0005m\u0000"+
		"\u0000\u0118\u0119\u0005_\u0000\u0000\u0119\u011a\u0005e\u0000\u0000\u011a"+
		"\u011b\u0005n\u0000\u0000\u011b\u011c\u0005q\u0000\u0000\u011c\u011d\u0005"+
		"u\u0000\u0000\u011d\u011e\u0005a\u0000\u0000\u011e\u011f\u0005n\u0000"+
		"\u0000\u011f\u0120\u0005t\u0000\u0000\u0120\u0121\u0005o\u0000\u0000\u0121"+
		":\u0001\u0000\u0000\u0000\u0122\u0123\u0005a\u0000\u0000\u0123\u0124\u0005"+
		"t\u0000\u0000\u0124\u0125\u0005e\u0000\u0000\u0125<\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0005p\u0000\u0000\u0127\u0128\u0005a\u0000\u0000\u0128"+
		"\u0129\u0005r\u0000\u0000\u0129\u012a\u0005a\u0000\u0000\u012a>\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0005f\u0000\u0000\u012c\u012d\u0005i\u0000"+
		"\u0000\u012d\u012e\u0005m\u0000\u0000\u012e\u012f\u0005_\u0000\u0000\u012f"+
		"\u0130\u0005p\u0000\u0000\u0130\u0131\u0005a\u0000\u0000\u0131\u0132\u0005"+
		"r\u0000\u0000\u0132\u0133\u0005a\u0000\u0000\u0133@\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0005I\u0000\u0000\u0135\u0136\u0005N\u0000\u0000\u0136"+
		"\u0137\u0005I\u0000\u0000\u0137\u0138\u0005C\u0000\u0000\u0138\u0139\u0005"+
		"I\u0000\u0000\u0139\u013a\u0005O\u0000\u0000\u013aB\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005F\u0000\u0000\u013c\u013d\u0005I\u0000\u0000\u013d"+
		"\u013e\u0005M\u0000\u0000\u013eD\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"r\u0000\u0000\u0140\u0141\u0005e\u0000\u0000\u0141\u0142\u0005t\u0000"+
		"\u0000\u0142\u0143\u0005o\u0000\u0000\u0143\u0144\u0005r\u0000\u0000\u0144"+
		"\u0145\u0005n\u0000\u0000\u0145\u0146\u0005e\u0000\u0000\u0146F\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0005f\u0000\u0000\u0148\u0149\u0005u\u0000"+
		"\u0000\u0149\u014a\u0005n\u0000\u0000\u014a\u014b\u0005c\u0000\u0000\u014b"+
		"\u014c\u0005a\u0000\u0000\u014c\u014d\u0005o\u0000\u0000\u014dH\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005f\u0000\u0000\u014f\u0150\u0005i\u0000"+
		"\u0000\u0150\u0151\u0005m\u0000\u0000\u0151\u0152\u0005_\u0000\u0000\u0152"+
		"\u0153\u0005f\u0000\u0000\u0153\u0154\u0005u\u0000\u0000\u0154\u0155\u0005"+
		"n\u0000\u0000\u0155\u0156\u0005c\u0000\u0000\u0156\u0157\u0005a\u0000"+
		"\u0000\u0157\u0158\u0005o\u0000\u0000\u0158J\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005p\u0000\u0000\u015a\u015b\u0005r\u0000\u0000\u015b\u015c\u0005"+
		"o\u0000\u0000\u015c\u015d\u0005c\u0000\u0000\u015d\u015e\u0005e\u0000"+
		"\u0000\u015e\u015f\u0005d\u0000\u0000\u015f\u0160\u0005i\u0000\u0000\u0160"+
		"\u0161\u0005m\u0000\u0000\u0161\u0162\u0005e\u0000\u0000\u0162\u0163\u0005"+
		"n\u0000\u0000\u0163\u0164\u0005t\u0000\u0000\u0164\u0165\u0005o\u0000"+
		"\u0000\u0165L\u0001\u0000\u0000\u0000\u0166\u0167\u0005v\u0000\u0000\u0167"+
		"\u0168\u0005a\u0000\u0000\u0168\u0169\u0005r\u0000\u0000\u0169N\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0005f\u0000\u0000\u016b\u016c\u0005i\u0000"+
		"\u0000\u016c\u016d\u0005m\u0000\u0000\u016d\u016e\u0005_\u0000\u0000\u016e"+
		"\u016f\u0005p\u0000\u0000\u016f\u0170\u0005r\u0000\u0000\u0170\u0171\u0005"+
		"o\u0000\u0000\u0171\u0172\u0005c\u0000\u0000\u0172\u0173\u0005e\u0000"+
		"\u0000\u0173\u0174\u0005d\u0000\u0000\u0174\u0175\u0005i\u0000\u0000\u0175"+
		"\u0176\u0005m\u0000\u0000\u0176\u0177\u0005e\u0000\u0000\u0177\u0178\u0005"+
		"n\u0000\u0000\u0178\u0179\u0005t\u0000\u0000\u0179\u017a\u0005o\u0000"+
		"\u0000\u017aP\u0001\u0000\u0000\u0000\u017b\u017c\u0005c\u0000\u0000\u017c"+
		"\u017d\u0005o\u0000\u0000\u017d\u017e\u0005n\u0000\u0000\u017e\u017f\u0005"+
		"s\u0000\u0000\u017f\u0180\u0005t\u0000\u0000\u0180\u0181\u0005a\u0000"+
		"\u0000\u0181\u0182\u0005n\u0000\u0000\u0182\u0183\u0005t\u0000\u0000\u0183"+
		"\u0184\u0005e\u0000\u0000\u0184R\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"l\u0000\u0000\u0186\u0187\u0005i\u0000\u0000\u0187\u0188\u0005t\u0000"+
		"\u0000\u0188\u0189\u0005e\u0000\u0000\u0189\u018a\u0005r\u0000\u0000\u018a"+
		"\u018b\u0005a\u0000\u0000\u018b\u019e\u0005l\u0000\u0000\u018c\u018d\u0005"+
		"i\u0000\u0000\u018d\u018e\u0005n\u0000\u0000\u018e\u018f\u0005t\u0000"+
		"\u0000\u018f\u0190\u0005e\u0000\u0000\u0190\u0191\u0005i\u0000\u0000\u0191"+
		"\u0192\u0005r\u0000\u0000\u0192\u019e\u0005o\u0000\u0000\u0193\u0194\u0005"+
		"r\u0000\u0000\u0194\u0195\u0005e\u0000\u0000\u0195\u0196\u0005a\u0000"+
		"\u0000\u0196\u019e\u0005l\u0000\u0000\u0197\u0198\u0005l\u0000\u0000\u0198"+
		"\u0199\u0005o\u0000\u0000\u0199\u019a\u0005g\u0000\u0000\u019a\u019b\u0005"+
		"i\u0000\u0000\u019b\u019c\u0005c\u0000\u0000\u019c\u019e\u0005o\u0000"+
		"\u0000\u019d\u0185\u0001\u0000\u0000\u0000\u019d\u018c\u0001\u0000\u0000"+
		"\u0000\u019d\u0193\u0001\u0000\u0000\u0000\u019d\u0197\u0001\u0000\u0000"+
		"\u0000\u019eT\u0001\u0000\u0000\u0000\u019f\u01a1\u0005-\u0000\u0000\u01a0"+
		"\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a2\u01a4\u000209\u0000\u01a3\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6V\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a9\u0005-\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ac\u000209\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b5\u0001\u0000\u0000\u0000\u01af"+
		"\u01b1\u0005.\u0000\u0000\u01b0\u01b2\u000209\u0000\u01b1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b5\u01af\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b6X\u0001\u0000\u0000\u0000\u01b7\u01bb\u0005\""+
		"\u0000\u0000\u01b8\u01ba\b\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\"\u0000\u0000"+
		"\u01bfZ\u0001\u0000\u0000\u0000\u01c0\u01c4\u0007\u0001\u0000\u0000\u01c1"+
		"\u01c3\u0007\u0002\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c5\\\u0001\u0000\u0000\u0000\u01c6\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0007\u0003\u0000\u0000\u01c8^\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0007\u0004\u0000\u0000\u01ca`\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0005%\u0000\u0000\u01ccb\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d6\u0005>\u0000\u0000\u01ce\u01cf\u0005>\u0000\u0000\u01cf\u01d6"+
		"\u0005=\u0000\u0000\u01d0\u01d6\u0005<\u0000\u0000\u01d1\u01d2\u0005<"+
		"\u0000\u0000\u01d2\u01d6\u0005=\u0000\u0000\u01d3\u01d4\u0005<\u0000\u0000"+
		"\u01d4\u01d6\u0005>\u0000\u0000\u01d5\u01cd\u0001\u0000\u0000\u0000\u01d5"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d5\u01d0\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6"+
		"d\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\\\u0000\u0000\u01d8\u01d9"+
		"\u0005\'\u0000\u0000\u01d9f\u0001\u0000\u0000\u0000\u01da\u01de\u0005"+
		"{\u0000\u0000\u01db\u01dd\b\u0005\u0000\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e3\u0005\r\u0000"+
		"\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005}\u0000\u0000"+
		"\u01e5\u01e6\u0005}\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0007\u0006\u0000\u0000\u01e8h\u0001\u0000\u0000\u0000\u01e9\u01ed"+
		"\u0005{\u0000\u0000\u01ea\u01ec\b\u0005\u0000\u0000\u01eb\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f2\u0005"+
		"\r\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005}\u0000"+
		"\u0000\u01f4\u01f5\u0007\u0006\u0000\u0000\u01f5\u01f6\u00064\u0000\u0000"+
		"\u01f6j\u0001\u0000\u0000\u0000\u01f7\u01f8\u0007\u0007\u0000\u0000\u01f8"+
		"\u01f9\u00065\u0001\u0000\u01f9l\u0001\u0000\u0000\u0000\u01fa\u01fe\u0005"+
		"\"\u0000\u0000\u01fb\u01fd\b\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ffn\u0001\u0000\u0000"+
		"\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0205\u0005{\u0000\u0000"+
		"\u0202\u0204\b\b\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204"+
		"\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0001\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207"+
		"\u0205\u0001\u0000\u0000\u0000\u0208\u0209\u0005\n\u0000\u0000\u0209p"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0005(\u0000\u0000\u020br\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0005)\u0000\u0000\u020dt\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0005[\u0000\u0000\u020fv\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0005]\u0000\u0000\u0211x\u0001\u0000\u0000\u0000\u0212\u0213\u0007\t"+
		"\u0000\u0000\u0213z\u0001\u0000\u0000\u0000\u0011\u0000\u019d\u01a0\u01a5"+
		"\u01a8\u01ad\u01b3\u01b5\u01bb\u01c4\u01d5\u01de\u01e2\u01ed\u01f1\u01fe"+
		"\u0205\u0002\u00014\u0000\u00015\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}