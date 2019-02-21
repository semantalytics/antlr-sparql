// Generated from com/semantalytics/antlr/sparql/sparql10/Sparql10Parser.g4 by ANTLR 4.7
package com.semantalytics.antlr.sparql.sparql10;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sparql10Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BASE=1, SELECT=2, ORDER=3, BY=4, FROM=5, GRAPH=6, STR=7, ISURI=8, PREFIX=9, 
		CONSTRUCT=10, LIMIT=11, ASC=12, DESC=13, NAMED=14, OPTIONAL=15, LANG=16, 
		ISIRI=17, DESCRIBE=18, OFFSET=19, WHERE=20, UNION=21, LANGMATCHES=22, 
		ISLITERAL=23, ASK=24, DISTINCT=25, FILTER=26, DATATYPE=27, REGEX=28, REDUCED=29, 
		A=30, BOUND=31, TRUE=32, SAMETERM=33, FALSE=34, AS=35, ISBLANK=36, IRI_REF=37, 
		PNAME_NS=38, PNAME_LN=39, BLANK_NODE_LABEL=40, VAR1=41, VAR2=42, LANGTAG=43, 
		INTEGER=44, DECIMAL=45, DOUBLE=46, INTEGER_POSITIVE=47, DECIMAL_POSITIVE=48, 
		DOUBLE_POSITIVE=49, INTEGER_NEGATIVE=50, DECIMAL_NEGATIVE=51, DOUBLE_NEGATIVE=52, 
		EXPONENT=53, STRING_LITERAL1=54, STRING_LITERAL2=55, STRING_LITERAL_LONG1=56, 
		STRING_LITERAL_LONG2=57, ECHAR=58, NIL=59, WS=60, ANON=61, PN_CHARS_BASE=62, 
		PN_CHARS_U=63, VARNAME=64, PN_CHARS=65, PN_PREFIX=66, PN_LOCAL=67, COMMENT=68, 
		ASTERISK=69, DOT=70, OPEN_CURLY_BRACE=71, CLOSE_CURLY_BRACE=72, SEMICOLON=73, 
		COMMA=74, OPEN_BRACE=75, CLOSE_BRACE=76, OPEN_SQUARE_BRACE=77, CLOSE_SQUARE_BRACE=78, 
		LESS_EQUAL=79, GREATER_EQUAL=80, NOT_EQUAL=81, NOT_SIGN=82, DIVIDE=83, 
		EQUAL=84, LESS=85, GREATER=86, PLUS=87, MINUS=88, AND=89, OR=90, REFERENCE=91;
	public static final int
		RULE_query = 0, RULE_prologue = 1, RULE_baseDecl = 2, RULE_prefixDecl = 3, 
		RULE_selectQuery = 4, RULE_constructQuery = 5, RULE_describeQuery = 6, 
		RULE_askQuery = 7, RULE_datasetClause = 8, RULE_defaultGraphClause = 9, 
		RULE_namedGraphClause = 10, RULE_sourceSelector = 11, RULE_whereClause = 12, 
		RULE_solutionModifier = 13, RULE_limitOffsetClauses = 14, RULE_orderClause = 15, 
		RULE_orderCondition = 16, RULE_limitClause = 17, RULE_offsetClause = 18, 
		RULE_groupGraphPattern = 19, RULE_triplesBlock = 20, RULE_graphPatternNotTriples = 21, 
		RULE_optionalGraphPattern = 22, RULE_graphGraphPattern = 23, RULE_groupOrUnionGraphPattern = 24, 
		RULE_filter = 25, RULE_constraint = 26, RULE_functionCall = 27, RULE_argList = 28, 
		RULE_constructTemplate = 29, RULE_constructTriples = 30, RULE_triplesSameSubject = 31, 
		RULE_propertyListNotEmpty = 32, RULE_propertyList = 33, RULE_objectList = 34, 
		RULE_object = 35, RULE_verb = 36, RULE_triplesNode = 37, RULE_blankNodePropertyList = 38, 
		RULE_collection = 39, RULE_graphNode = 40, RULE_varOrTerm = 41, RULE_varOrIRIref = 42, 
		RULE_var = 43, RULE_graphTerm = 44, RULE_expression = 45, RULE_conditionalOrExpression = 46, 
		RULE_conditionalAndExpression = 47, RULE_valueLogical = 48, RULE_relationalExpression = 49, 
		RULE_numericExpression = 50, RULE_additiveExpression = 51, RULE_multiplicativeExpression = 52, 
		RULE_unaryExpression = 53, RULE_primaryExpression = 54, RULE_brackettedExpression = 55, 
		RULE_builtInCall = 56, RULE_regexExpression = 57, RULE_iriRefOrFunction = 58, 
		RULE_rdfLiteral = 59, RULE_numericLiteral = 60, RULE_numericLiteralUnsigned = 61, 
		RULE_numericLiteralPositive = 62, RULE_numericLiteralNegative = 63, RULE_booleanLiteral = 64, 
		RULE_string = 65, RULE_iriRef = 66, RULE_prefixedName = 67, RULE_blankNode = 68;
	public static final String[] ruleNames = {
		"query", "prologue", "baseDecl", "prefixDecl", "selectQuery", "constructQuery", 
		"describeQuery", "askQuery", "datasetClause", "defaultGraphClause", "namedGraphClause", 
		"sourceSelector", "whereClause", "solutionModifier", "limitOffsetClauses", 
		"orderClause", "orderCondition", "limitClause", "offsetClause", "groupGraphPattern", 
		"triplesBlock", "graphPatternNotTriples", "optionalGraphPattern", "graphGraphPattern", 
		"groupOrUnionGraphPattern", "filter", "constraint", "functionCall", "argList", 
		"constructTemplate", "constructTriples", "triplesSameSubject", "propertyListNotEmpty", 
		"propertyList", "objectList", "object", "verb", "triplesNode", "blankNodePropertyList", 
		"collection", "graphNode", "varOrTerm", "varOrIRIref", "var", "graphTerm", 
		"expression", "conditionalOrExpression", "conditionalAndExpression", "valueLogical", 
		"relationalExpression", "numericExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "primaryExpression", "brackettedExpression", "builtInCall", 
		"regexExpression", "iriRefOrFunction", "rdfLiteral", "numericLiteral", 
		"numericLiteralUnsigned", "numericLiteralPositive", "numericLiteralNegative", 
		"booleanLiteral", "string", "iriRef", "prefixedName", "blankNode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'*'", "'.'", "'{'", 
		"'}'", "';'", "','", "'('", "')'", "'['", "']'", "'<='", "'>='", "'!='", 
		"'!'", "'/'", "'='", "'<'", "'>'", "'+'", "'-'", "'&&'", "'||'", "'^^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BASE", "SELECT", "ORDER", "BY", "FROM", "GRAPH", "STR", "ISURI", 
		"PREFIX", "CONSTRUCT", "LIMIT", "ASC", "DESC", "NAMED", "OPTIONAL", "LANG", 
		"ISIRI", "DESCRIBE", "OFFSET", "WHERE", "UNION", "LANGMATCHES", "ISLITERAL", 
		"ASK", "DISTINCT", "FILTER", "DATATYPE", "REGEX", "REDUCED", "A", "BOUND", 
		"TRUE", "SAMETERM", "FALSE", "AS", "ISBLANK", "IRI_REF", "PNAME_NS", "PNAME_LN", 
		"BLANK_NODE_LABEL", "VAR1", "VAR2", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", 
		"INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", 
		"DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "EXPONENT", "STRING_LITERAL1", 
		"STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "ECHAR", 
		"NIL", "WS", "ANON", "PN_CHARS_BASE", "PN_CHARS_U", "VARNAME", "PN_CHARS", 
		"PN_PREFIX", "PN_LOCAL", "COMMENT", "ASTERISK", "DOT", "OPEN_CURLY_BRACE", 
		"CLOSE_CURLY_BRACE", "SEMICOLON", "COMMA", "OPEN_BRACE", "CLOSE_BRACE", 
		"OPEN_SQUARE_BRACE", "CLOSE_SQUARE_BRACE", "LESS_EQUAL", "GREATER_EQUAL", 
		"NOT_EQUAL", "NOT_SIGN", "DIVIDE", "EQUAL", "LESS", "GREATER", "PLUS", 
		"MINUS", "AND", "OR", "REFERENCE"
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

	@Override
	public String getGrammarFileName() { return "Sparql10Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Sparql10Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public PrologueContext prologue() {
			return getRuleContext(PrologueContext.class,0);
		}
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public ConstructQueryContext constructQuery() {
			return getRuleContext(ConstructQueryContext.class,0);
		}
		public DescribeQueryContext describeQuery() {
			return getRuleContext(DescribeQueryContext.class,0);
		}
		public AskQueryContext askQuery() {
			return getRuleContext(AskQueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			prologue();
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(139);
				selectQuery();
				}
				break;
			case CONSTRUCT:
				{
				setState(140);
				constructQuery();
				}
				break;
			case DESCRIBE:
				{
				setState(141);
				describeQuery();
				}
				break;
			case ASK:
				{
				setState(142);
				askQuery();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrologueContext extends ParserRuleContext {
		public BaseDeclContext baseDecl() {
			return getRuleContext(BaseDeclContext.class,0);
		}
		public List<PrefixDeclContext> prefixDecl() {
			return getRuleContexts(PrefixDeclContext.class);
		}
		public PrefixDeclContext prefixDecl(int i) {
			return getRuleContext(PrefixDeclContext.class,i);
		}
		public PrologueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterPrologue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitPrologue(this);
		}
	}

	public final PrologueContext prologue() throws RecognitionException {
		PrologueContext _localctx = new PrologueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prologue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASE) {
				{
				setState(145);
				baseDecl();
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PREFIX) {
				{
				{
				setState(148);
				prefixDecl();
				}
				}
				setState(153);
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

	public static class BaseDeclContext extends ParserRuleContext {
		public TerminalNode BASE() { return getToken(Sparql10Parser.BASE, 0); }
		public IriRefContext iriRef() {
			return getRuleContext(IriRefContext.class,0);
		}
		public BaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterBaseDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitBaseDecl(this);
		}
	}

	public final BaseDeclContext baseDecl() throws RecognitionException {
		BaseDeclContext _localctx = new BaseDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_baseDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(BASE);
			setState(155);
			iriRef();
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

	public static class PrefixDeclContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(Sparql10Parser.PREFIX, 0); }
		public TerminalNode PNAME_NS() { return getToken(Sparql10Parser.PNAME_NS, 0); }
		public TerminalNode IRI_REF() { return getToken(Sparql10Parser.IRI_REF, 0); }
		public PrefixDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterPrefixDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitPrefixDecl(this);
		}
	}

	public final PrefixDeclContext prefixDecl() throws RecognitionException {
		PrefixDeclContext _localctx = new PrefixDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefixDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PREFIX);
			setState(158);
			match(PNAME_NS);
			setState(159);
			match(IRI_REF);
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

	public static class SelectQueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(Sparql10Parser.SELECT, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(Sparql10Parser.ASTERISK, 0); }
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(Sparql10Parser.DISTINCT, 0); }
		public TerminalNode REDUCED() { return getToken(Sparql10Parser.REDUCED, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterSelectQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitSelectQuery(this);
		}
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(SELECT);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==REDUCED) {
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==REDUCED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				{
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(165);
					var();
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VAR1 || _la==VAR2 );
				}
				break;
			case ASTERISK:
				{
				setState(170);
				match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(173);
				datasetClause();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			whereClause();
			setState(180);
			solutionModifier();
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

	public static class ConstructQueryContext extends ParserRuleContext {
		public TerminalNode CONSTRUCT() { return getToken(Sparql10Parser.CONSTRUCT, 0); }
		public ConstructTemplateContext constructTemplate() {
			return getRuleContext(ConstructTemplateContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public ConstructQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterConstructQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitConstructQuery(this);
		}
	}

	public final ConstructQueryContext constructQuery() throws RecognitionException {
		ConstructQueryContext _localctx = new ConstructQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(CONSTRUCT);
			setState(183);
			constructTemplate();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(184);
				datasetClause();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			whereClause();
			setState(191);
			solutionModifier();
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

	public static class DescribeQueryContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(Sparql10Parser.DESCRIBE, 0); }
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(Sparql10Parser.ASTERISK, 0); }
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<VarOrIRIrefContext> varOrIRIref() {
			return getRuleContexts(VarOrIRIrefContext.class);
		}
		public VarOrIRIrefContext varOrIRIref(int i) {
			return getRuleContext(VarOrIRIrefContext.class,i);
		}
		public DescribeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitDescribeQuery(this);
		}
	}

	public final DescribeQueryContext describeQuery() throws RecognitionException {
		DescribeQueryContext _localctx = new DescribeQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_describeQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(DESCRIBE);
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
				{
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					varOrIRIref();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IRI_REF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << VAR1) | (1L << VAR2))) != 0) );
				}
				break;
			case ASTERISK:
				{
				setState(199);
				match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(202);
				datasetClause();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE || _la==OPEN_CURLY_BRACE) {
				{
				setState(208);
				whereClause();
				}
			}

			setState(211);
			solutionModifier();
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

	public static class AskQueryContext extends ParserRuleContext {
		public TerminalNode ASK() { return getToken(Sparql10Parser.ASK, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public AskQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_askQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterAskQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitAskQuery(this);
		}
	}

	public final AskQueryContext askQuery() throws RecognitionException {
		AskQueryContext _localctx = new AskQueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_askQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ASK);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FROM) {
				{
				{
				setState(214);
				datasetClause();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			whereClause();
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

	public static class DatasetClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(Sparql10Parser.FROM, 0); }
		public DefaultGraphClauseContext defaultGraphClause() {
			return getRuleContext(DefaultGraphClauseContext.class,0);
		}
		public NamedGraphClauseContext namedGraphClause() {
			return getRuleContext(NamedGraphClauseContext.class,0);
		}
		public DatasetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterDatasetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitDatasetClause(this);
		}
	}

	public final DatasetClauseContext datasetClause() throws RecognitionException {
		DatasetClauseContext _localctx = new DatasetClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_datasetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(FROM);
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
				{
				setState(223);
				defaultGraphClause();
				}
				break;
			case NAMED:
				{
				setState(224);
				namedGraphClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DefaultGraphClauseContext extends ParserRuleContext {
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public DefaultGraphClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultGraphClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterDefaultGraphClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitDefaultGraphClause(this);
		}
	}

	public final DefaultGraphClauseContext defaultGraphClause() throws RecognitionException {
		DefaultGraphClauseContext _localctx = new DefaultGraphClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defaultGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			sourceSelector();
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

	public static class NamedGraphClauseContext extends ParserRuleContext {
		public TerminalNode NAMED() { return getToken(Sparql10Parser.NAMED, 0); }
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public NamedGraphClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedGraphClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterNamedGraphClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitNamedGraphClause(this);
		}
	}

	public final NamedGraphClauseContext namedGraphClause() throws RecognitionException {
		NamedGraphClauseContext _localctx = new NamedGraphClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_namedGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(NAMED);
			setState(230);
			sourceSelector();
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

	public static class SourceSelectorContext extends ParserRuleContext {
		public IriRefContext iriRef() {
			return getRuleContext(IriRefContext.class,0);
		}
		public SourceSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterSourceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitSourceSelector(this);
		}
	}

	public final SourceSelectorContext sourceSelector() throws RecognitionException {
		SourceSelectorContext _localctx = new SourceSelectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sourceSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			iriRef();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(Sparql10Parser.WHERE, 0); }
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(234);
				match(WHERE);
				}
			}

			setState(237);
			groupGraphPattern();
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

	public static class SolutionModifierContext extends ParserRuleContext {
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public LimitOffsetClausesContext limitOffsetClauses() {
			return getRuleContext(LimitOffsetClausesContext.class,0);
		}
		public SolutionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solutionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterSolutionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitSolutionModifier(this);
		}
	}

	public final SolutionModifierContext solutionModifier() throws RecognitionException {
		SolutionModifierContext _localctx = new SolutionModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_solutionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(239);
				orderClause();
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==OFFSET) {
				{
				setState(242);
				limitOffsetClauses();
				}
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

	public static class LimitOffsetClausesContext extends ParserRuleContext {
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public LimitOffsetClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffsetClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterLimitOffsetClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitLimitOffsetClauses(this);
		}
	}

	public final LimitOffsetClausesContext limitOffsetClauses() throws RecognitionException {
		LimitOffsetClausesContext _localctx = new LimitOffsetClausesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_limitOffsetClauses);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				limitClause();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(246);
					offsetClause();
					}
				}

				}
				break;
			case OFFSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				offsetClause();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(250);
					limitClause();
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

	public static class OrderClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(Sparql10Parser.ORDER, 0); }
		public TerminalNode BY() { return getToken(Sparql10Parser.BY, 0); }
		public List<OrderConditionContext> orderCondition() {
			return getRuleContexts(OrderConditionContext.class);
		}
		public OrderConditionContext orderCondition(int i) {
			return getRuleContext(OrderConditionContext.class,i);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterOrderClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitOrderClause(this);
		}
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ORDER);
			setState(256);
			match(BY);
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(257);
				orderCondition();
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << ISURI) | (1L << ASC) | (1L << DESC) | (1L << LANG) | (1L << ISIRI) | (1L << LANGMATCHES) | (1L << ISLITERAL) | (1L << DATATYPE) | (1L << REGEX) | (1L << BOUND) | (1L << SAMETERM) | (1L << ISBLANK) | (1L << IRI_REF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << VAR1) | (1L << VAR2))) != 0) || _la==OPEN_BRACE );
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

	public static class OrderConditionContext extends ParserRuleContext {
		public Token o;
		public ConstraintContext c;
		public VarContext v;
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(Sparql10Parser.ASC, 0); }
		public TerminalNode DESC() { return getToken(Sparql10Parser.DESC, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OrderConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterOrderCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitOrderCondition(this);
		}
	}

	public final OrderConditionContext orderCondition() throws RecognitionException {
		OrderConditionContext _localctx = new OrderConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderCondition);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
			case DESC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(264);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASC:
					{
					setState(262);
					((OrderConditionContext)_localctx).o = match(ASC);
					}
					break;
				case DESC:
					{
					setState(263);
					((OrderConditionContext)_localctx).o = match(DESC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(266);
				brackettedExpression();
				}
				}
				break;
			case STR:
			case ISURI:
			case LANG:
			case ISIRI:
			case LANGMATCHES:
			case ISLITERAL:
			case DATATYPE:
			case REGEX:
			case BOUND:
			case SAMETERM:
			case ISBLANK:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
				case ISURI:
				case LANG:
				case ISIRI:
				case LANGMATCHES:
				case ISLITERAL:
				case DATATYPE:
				case REGEX:
				case BOUND:
				case SAMETERM:
				case ISBLANK:
				case IRI_REF:
				case PNAME_NS:
				case PNAME_LN:
				case OPEN_BRACE:
					{
					setState(267);
					((OrderConditionContext)_localctx).c = constraint();
					}
					break;
				case VAR1:
				case VAR2:
					{
					setState(268);
					((OrderConditionContext)_localctx).v = var();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(Sparql10Parser.LIMIT, 0); }
		public TerminalNode INTEGER() { return getToken(Sparql10Parser.INTEGER, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitLimitClause(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LIMIT);
			setState(274);
			match(INTEGER);
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

	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(Sparql10Parser.OFFSET, 0); }
		public TerminalNode INTEGER() { return getToken(Sparql10Parser.INTEGER, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitOffsetClause(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(OFFSET);
			setState(277);
			match(INTEGER);
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

	public static class GroupGraphPatternContext extends ParserRuleContext {
		public TriplesBlockContext t1;
		public GraphPatternNotTriplesContext g;
		public FilterContext f;
		public TriplesBlockContext t2;
		public TerminalNode OPEN_CURLY_BRACE() { return getToken(Sparql10Parser.OPEN_CURLY_BRACE, 0); }
		public TerminalNode CLOSE_CURLY_BRACE() { return getToken(Sparql10Parser.CLOSE_CURLY_BRACE, 0); }
		public List<TriplesBlockContext> triplesBlock() {
			return getRuleContexts(TriplesBlockContext.class);
		}
		public TriplesBlockContext triplesBlock(int i) {
			return getRuleContext(TriplesBlockContext.class,i);
		}
		public List<GraphPatternNotTriplesContext> graphPatternNotTriples() {
			return getRuleContexts(GraphPatternNotTriplesContext.class);
		}
		public GraphPatternNotTriplesContext graphPatternNotTriples(int i) {
			return getRuleContext(GraphPatternNotTriplesContext.class,i);
		}
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Sparql10Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Sparql10Parser.DOT, i);
		}
		public GroupGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterGroupGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitGroupGraphPattern(this);
		}
	}

	public final GroupGraphPatternContext groupGraphPattern() throws RecognitionException {
		GroupGraphPatternContext _localctx = new GroupGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_groupGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(OPEN_CURLY_BRACE);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (TRUE - 32)) | (1L << (FALSE - 32)) | (1L << (IRI_REF - 32)) | (1L << (PNAME_NS - 32)) | (1L << (PNAME_LN - 32)) | (1L << (BLANK_NODE_LABEL - 32)) | (1L << (VAR1 - 32)) | (1L << (VAR2 - 32)) | (1L << (INTEGER - 32)) | (1L << (DECIMAL - 32)) | (1L << (DOUBLE - 32)) | (1L << (INTEGER_POSITIVE - 32)) | (1L << (DECIMAL_POSITIVE - 32)) | (1L << (DOUBLE_POSITIVE - 32)) | (1L << (INTEGER_NEGATIVE - 32)) | (1L << (DECIMAL_NEGATIVE - 32)) | (1L << (DOUBLE_NEGATIVE - 32)) | (1L << (STRING_LITERAL1 - 32)) | (1L << (STRING_LITERAL2 - 32)) | (1L << (STRING_LITERAL_LONG1 - 32)) | (1L << (STRING_LITERAL_LONG2 - 32)) | (1L << (NIL - 32)) | (1L << (ANON - 32)) | (1L << (OPEN_BRACE - 32)) | (1L << (OPEN_SQUARE_BRACE - 32)))) != 0)) {
				{
				setState(280);
				((GroupGraphPatternContext)_localctx).t1 = triplesBlock();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << OPTIONAL) | (1L << FILTER))) != 0) || _la==OPEN_CURLY_BRACE) {
				{
				{
				setState(285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAPH:
				case OPTIONAL:
				case OPEN_CURLY_BRACE:
					{
					setState(283);
					((GroupGraphPatternContext)_localctx).g = graphPatternNotTriples();
					}
					break;
				case FILTER:
					{
					setState(284);
					((GroupGraphPatternContext)_localctx).f = filter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(287);
					match(DOT);
					}
				}

				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (TRUE - 32)) | (1L << (FALSE - 32)) | (1L << (IRI_REF - 32)) | (1L << (PNAME_NS - 32)) | (1L << (PNAME_LN - 32)) | (1L << (BLANK_NODE_LABEL - 32)) | (1L << (VAR1 - 32)) | (1L << (VAR2 - 32)) | (1L << (INTEGER - 32)) | (1L << (DECIMAL - 32)) | (1L << (DOUBLE - 32)) | (1L << (INTEGER_POSITIVE - 32)) | (1L << (DECIMAL_POSITIVE - 32)) | (1L << (DOUBLE_POSITIVE - 32)) | (1L << (INTEGER_NEGATIVE - 32)) | (1L << (DECIMAL_NEGATIVE - 32)) | (1L << (DOUBLE_NEGATIVE - 32)) | (1L << (STRING_LITERAL1 - 32)) | (1L << (STRING_LITERAL2 - 32)) | (1L << (STRING_LITERAL_LONG1 - 32)) | (1L << (STRING_LITERAL_LONG2 - 32)) | (1L << (NIL - 32)) | (1L << (ANON - 32)) | (1L << (OPEN_BRACE - 32)) | (1L << (OPEN_SQUARE_BRACE - 32)))) != 0)) {
					{
					setState(290);
					((GroupGraphPatternContext)_localctx).t2 = triplesBlock();
					}
				}

				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(CLOSE_CURLY_BRACE);
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

	public static class TriplesBlockContext extends ParserRuleContext {
		public TriplesBlockContext t;
		public TriplesSameSubjectContext triplesSameSubject() {
			return getRuleContext(TriplesSameSubjectContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Sparql10Parser.DOT, 0); }
		public TriplesBlockContext triplesBlock() {
			return getRuleContext(TriplesBlockContext.class,0);
		}
		public TriplesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterTriplesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitTriplesBlock(this);
		}
	}

	public final TriplesBlockContext triplesBlock() throws RecognitionException {
		TriplesBlockContext _localctx = new TriplesBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_triplesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			triplesSameSubject();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(301);
				match(DOT);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (TRUE - 32)) | (1L << (FALSE - 32)) | (1L << (IRI_REF - 32)) | (1L << (PNAME_NS - 32)) | (1L << (PNAME_LN - 32)) | (1L << (BLANK_NODE_LABEL - 32)) | (1L << (VAR1 - 32)) | (1L << (VAR2 - 32)) | (1L << (INTEGER - 32)) | (1L << (DECIMAL - 32)) | (1L << (DOUBLE - 32)) | (1L << (INTEGER_POSITIVE - 32)) | (1L << (DECIMAL_POSITIVE - 32)) | (1L << (DOUBLE_POSITIVE - 32)) | (1L << (INTEGER_NEGATIVE - 32)) | (1L << (DECIMAL_NEGATIVE - 32)) | (1L << (DOUBLE_NEGATIVE - 32)) | (1L << (STRING_LITERAL1 - 32)) | (1L << (STRING_LITERAL2 - 32)) | (1L << (STRING_LITERAL_LONG1 - 32)) | (1L << (STRING_LITERAL_LONG2 - 32)) | (1L << (NIL - 32)) | (1L << (ANON - 32)) | (1L << (OPEN_BRACE - 32)) | (1L << (OPEN_SQUARE_BRACE - 32)))) != 0)) {
					{
					setState(302);
					((TriplesBlockContext)_localctx).t = triplesBlock();
					}
				}

				}
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

	public static class GraphPatternNotTriplesContext extends ParserRuleContext {
		public OptionalGraphPatternContext ogp;
		public GroupOrUnionGraphPatternContext gougp;
		public GraphGraphPatternContext ggp;
		public OptionalGraphPatternContext optionalGraphPattern() {
			return getRuleContext(OptionalGraphPatternContext.class,0);
		}
		public GroupOrUnionGraphPatternContext groupOrUnionGraphPattern() {
			return getRuleContext(GroupOrUnionGraphPatternContext.class,0);
		}
		public GraphGraphPatternContext graphGraphPattern() {
			return getRuleContext(GraphGraphPatternContext.class,0);
		}
		public GraphPatternNotTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphPatternNotTriples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterGraphPatternNotTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitGraphPatternNotTriples(this);
		}
	}

	public final GraphPatternNotTriplesContext graphPatternNotTriples() throws RecognitionException {
		GraphPatternNotTriplesContext _localctx = new GraphPatternNotTriplesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_graphPatternNotTriples);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				((GraphPatternNotTriplesContext)_localctx).ogp = optionalGraphPattern();
				}
				break;
			case OPEN_CURLY_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((GraphPatternNotTriplesContext)_localctx).gougp = groupOrUnionGraphPattern();
				}
				break;
			case GRAPH:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				((GraphPatternNotTriplesContext)_localctx).ggp = graphGraphPattern();
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

	public static class OptionalGraphPatternContext extends ParserRuleContext {
		public TerminalNode OPTIONAL() { return getToken(Sparql10Parser.OPTIONAL, 0); }
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public OptionalGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterOptionalGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitOptionalGraphPattern(this);
		}
	}

	public final OptionalGraphPatternContext optionalGraphPattern() throws RecognitionException {
		OptionalGraphPatternContext _localctx = new OptionalGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_optionalGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(OPTIONAL);
			setState(313);
			groupGraphPattern();
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

	public static class GraphGraphPatternContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(Sparql10Parser.GRAPH, 0); }
		public VarOrIRIrefContext varOrIRIref() {
			return getRuleContext(VarOrIRIrefContext.class,0);
		}
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public GraphGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterGraphGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitGraphGraphPattern(this);
		}
	}

	public final GraphGraphPatternContext graphGraphPattern() throws RecognitionException {
		GraphGraphPatternContext _localctx = new GraphGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_graphGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(GRAPH);
			setState(316);
			varOrIRIref();
			setState(317);
			groupGraphPattern();
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

	public static class GroupOrUnionGraphPatternContext extends ParserRuleContext {
		public GroupGraphPatternContext v1;
		public GroupGraphPatternContext v2;
		public List<GroupGraphPatternContext> groupGraphPattern() {
			return getRuleContexts(GroupGraphPatternContext.class);
		}
		public GroupGraphPatternContext groupGraphPattern(int i) {
			return getRuleContext(GroupGraphPatternContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(Sparql10Parser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(Sparql10Parser.UNION, i);
		}
		public GroupOrUnionGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupOrUnionGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterGroupOrUnionGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitGroupOrUnionGraphPattern(this);
		}
	}

	public final GroupOrUnionGraphPatternContext groupOrUnionGraphPattern() throws RecognitionException {
		GroupOrUnionGraphPatternContext _localctx = new GroupOrUnionGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_groupOrUnionGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((GroupOrUnionGraphPatternContext)_localctx).v1 = groupGraphPattern();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(320);
				match(UNION);
				setState(321);
				((GroupOrUnionGraphPatternContext)_localctx).v2 = groupGraphPattern();
				}
				}
				setState(326);
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(Sparql10Parser.FILTER, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(FILTER);
			setState(328);
			constraint();
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

	public static class ConstraintContext extends ParserRuleContext {
		public BrackettedExpressionContext be;
		public BuiltInCallContext bic;
		public FunctionCallContext fc;
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constraint);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				((ConstraintContext)_localctx).be = brackettedExpression();
				}
				break;
			case STR:
			case ISURI:
			case LANG:
			case ISIRI:
			case LANGMATCHES:
			case ISLITERAL:
			case DATATYPE:
			case REGEX:
			case BOUND:
			case SAMETERM:
			case ISBLANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				((ConstraintContext)_localctx).bic = builtInCall();
				}
				break;
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				((ConstraintContext)_localctx).fc = functionCall();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IriRefContext iriRef() {
			return getRuleContext(IriRefContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			iriRef();
			setState(336);
			argList();
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

	public static class ArgListContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode NIL() { return getToken(Sparql10Parser.NIL, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(Sparql10Parser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(Sparql10Parser.CLOSE_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Sparql10Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Sparql10Parser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argList);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(NIL);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(OPEN_BRACE);
				setState(340);
				((ArgListContext)_localctx).e1 = expression();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(341);
					match(COMMA);
					setState(342);
					((ArgListContext)_localctx).e2 = expression();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				match(CLOSE_BRACE);
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

	public static class ConstructTemplateContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACE() { return getToken(Sparql10Parser.OPEN_CURLY_BRACE, 0); }
		public TerminalNode CLOSE_CURLY_BRACE() { return getToken(Sparql10Parser.CLOSE_CURLY_BRACE, 0); }
		public ConstructTriplesContext constructTriples() {
			return getRuleContext(ConstructTriplesContext.class,0);
		}
		public ConstructTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterConstructTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitConstructTemplate(this);
		}
	}

	public final ConstructTemplateContext constructTemplate() throws RecognitionException {
		ConstructTemplateContext _localctx = new ConstructTemplateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constructTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(OPEN_CURLY_BRACE);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (TRUE - 32)) | (1L << (FALSE - 32)) | (1L << (IRI_REF - 32)) | (1L << (PNAME_NS - 32)) | (1L << (PNAME_LN - 32)) | (1L << (BLANK_NODE_LABEL - 32)) | (1L << (VAR1 - 32)) | (1L << (VAR2 - 32)) | (1L << (INTEGER - 32)) | (1L << (DECIMAL - 32)) | (1L << (DOUBLE - 32)) | (1L << (INTEGER_POSITIVE - 32)) | (1L << (DECIMAL_POSITIVE - 32)) | (1L << (DOUBLE_POSITIVE - 32)) | (1L << (INTEGER_NEGATIVE - 32)) | (1L << (DECIMAL_NEGATIVE - 32)) | (1L << (DOUBLE_NEGATIVE - 32)) | (1L << (STRING_LITERAL1 - 32)) | (1L << (STRING_LITERAL2 - 32)) | (1L << (STRING_LITERAL_LONG1 - 32)) | (1L << (STRING_LITERAL_LONG2 - 32)) | (1L << (NIL - 32)) | (1L << (ANON - 32)) | (1L << (OPEN_BRACE - 32)) | (1L << (OPEN_SQUARE_BRACE - 32)))) != 0)) {
				{
				setState(353);
				constructTriples();
				}
			}

			setState(356);
			match(CLOSE_CURLY_BRACE);
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

	public static class ConstructTriplesContext extends ParserRuleContext {
		public TriplesSameSubjectContext triplesSameSubject() {
			return getRuleContext(TriplesSameSubjectContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Sparql10Parser.DOT, 0); }
		public ConstructTriplesContext constructTriples() {
			return getRuleContext(ConstructTriplesContext.class,0);
		}
		public ConstructTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructTriples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterConstructTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitConstructTriples(this);
		}
	}

	public final ConstructTriplesContext constructTriples() throws RecognitionException {
		ConstructTriplesContext _localctx = new ConstructTriplesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constructTriples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			triplesSameSubject();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(359);
				match(DOT);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (TRUE - 32)) | (1L << (FALSE - 32)) | (1L << (IRI_REF - 32)) | (1L << (PNAME_NS - 32)) | (1L << (PNAME_LN - 32)) | (1L << (BLANK_NODE_LABEL - 32)) | (1L << (VAR1 - 32)) | (1L << (VAR2 - 32)) | (1L << (INTEGER - 32)) | (1L << (DECIMAL - 32)) | (1L << (DOUBLE - 32)) | (1L << (INTEGER_POSITIVE - 32)) | (1L << (DECIMAL_POSITIVE - 32)) | (1L << (DOUBLE_POSITIVE - 32)) | (1L << (INTEGER_NEGATIVE - 32)) | (1L << (DECIMAL_NEGATIVE - 32)) | (1L << (DOUBLE_NEGATIVE - 32)) | (1L << (STRING_LITERAL1 - 32)) | (1L << (STRING_LITERAL2 - 32)) | (1L << (STRING_LITERAL_LONG1 - 32)) | (1L << (STRING_LITERAL_LONG2 - 32)) | (1L << (NIL - 32)) | (1L << (ANON - 32)) | (1L << (OPEN_BRACE - 32)) | (1L << (OPEN_SQUARE_BRACE - 32)))) != 0)) {
					{
					setState(360);
					constructTriples();
					}
				}

				}
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

	public static class TriplesSameSubjectContext extends ParserRuleContext {
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public TriplesNodeContext triplesNode() {
			return getRuleContext(TriplesNodeContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TriplesSameSubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesSameSubject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterTriplesSameSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitTriplesSameSubject(this);
		}
	}

	public final TriplesSameSubjectContext triplesSameSubject() throws RecognitionException {
		TriplesSameSubjectContext _localctx = new TriplesSameSubjectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_triplesSameSubject);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				varOrTerm();
				setState(366);
				propertyListNotEmpty();
				}
				break;
			case OPEN_BRACE:
			case OPEN_SQUARE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				triplesNode();
				setState(369);
				propertyList();
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

	public static class PropertyListNotEmptyContext extends ParserRuleContext {
		public VerbContext v1;
		public ObjectListContext ol1;
		public VerbContext v2;
		public ObjectListContext ol2;
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public List<ObjectListContext> objectList() {
			return getRuleContexts(ObjectListContext.class);
		}
		public ObjectListContext objectList(int i) {
			return getRuleContext(ObjectListContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Sparql10Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Sparql10Parser.SEMICOLON, i);
		}
		public PropertyListNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyListNotEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterPropertyListNotEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitPropertyListNotEmpty(this);
		}
	}

	public final PropertyListNotEmptyContext propertyListNotEmpty() throws RecognitionException {
		PropertyListNotEmptyContext _localctx = new PropertyListNotEmptyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_propertyListNotEmpty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((PropertyListNotEmptyContext)_localctx).v1 = verb();
			setState(374);
			((PropertyListNotEmptyContext)_localctx).ol1 = objectList();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(375);
				match(SEMICOLON);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << IRI_REF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << VAR1) | (1L << VAR2))) != 0)) {
					{
					setState(376);
					((PropertyListNotEmptyContext)_localctx).v2 = verb();
					setState(377);
					((PropertyListNotEmptyContext)_localctx).ol2 = objectList();
					}
				}

				}
				}
				setState(385);
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

	public static class PropertyListContext extends ParserRuleContext {
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitPropertyList(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << IRI_REF) | (1L << PNAME_NS) | (1L << PNAME_LN) | (1L << VAR1) | (1L << VAR2))) != 0)) {
				{
				setState(386);
				propertyListNotEmpty();
				}
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

	public static class ObjectListContext extends ParserRuleContext {
		public ObjectContext o1;
		public ObjectContext o2;
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Sparql10Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Sparql10Parser.COMMA, i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitObjectList(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((ObjectListContext)_localctx).o1 = object();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				((ObjectListContext)_localctx).o2 = object();
				}
				}
				setState(396);
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

	public static class ObjectContext extends ParserRuleContext {
		public GraphNodeContext graphNode() {
			return getRuleContext(GraphNodeContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			graphNode();
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

	public static class VerbContext extends ParserRuleContext {
		public VarOrIRIrefContext varOrIRIref() {
			return getRuleContext(VarOrIRIrefContext.class,0);
		}
		public TerminalNode A() { return getToken(Sparql10Parser.A, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_verb);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				varOrIRIref();
				}
				break;
			case A:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(A);
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

	public static class TriplesNodeContext extends ParserRuleContext {
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public TriplesNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterTriplesNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitTriplesNode(this);
		}
	}

	public final TriplesNodeContext triplesNode() throws RecognitionException {
		TriplesNodeContext _localctx = new TriplesNodeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_triplesNode);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				collection();
				}
				break;
			case OPEN_SQUARE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				blankNodePropertyList();
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

	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACE() { return getToken(Sparql10Parser.OPEN_SQUARE_BRACE, 0); }
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACE() { return getToken(Sparql10Parser.CLOSE_SQUARE_BRACE, 0); }
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitBlankNodePropertyList(this);
		}
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(OPEN_SQUARE_BRACE);
			setState(408);
			propertyListNotEmpty();
			setState(409);
			match(CLOSE_SQUARE_BRACE);
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

	public static class CollectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(Sparql10Parser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(Sparql10Parser.CLOSE_BRACE, 0); }
		public List<GraphNodeContext> graphNode() {
			return getRuleContexts(GraphNodeContext.class);
		}
		public GraphNodeContext graphNode(int i) {
			return getRuleContext(GraphNodeContext.class,i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitCollection(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(OPEN_BRACE);
			setState(413); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(412);
				graphNode();
				}
				}
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (TRUE - 32)) | (1L << (FALSE - 32)) | (1L << (IRI_REF - 32)) | (1L << (PNAME_NS - 32)) | (1L << (PNAME_LN - 32)) | (1L << (BLANK_NODE_LABEL - 32)) | (1L << (VAR1 - 32)) | (1L << (VAR2 - 32)) | (1L << (INTEGER - 32)) | (1L << (DECIMAL - 32)) | (1L << (DOUBLE - 32)) | (1L << (INTEGER_POSITIVE - 32)) | (1L << (DECIMAL_POSITIVE - 32)) | (1L << (DOUBLE_POSITIVE - 32)) | (1L << (INTEGER_NEGATIVE - 32)) | (1L << (DECIMAL_NEGATIVE - 32)) | (1L << (DOUBLE_NEGATIVE - 32)) | (1L << (STRING_LITERAL1 - 32)) | (1L << (STRING_LITERAL2 - 32)) | (1L << (STRING_LITERAL_LONG1 - 32)) | (1L << (STRING_LITERAL_LONG2 - 32)) | (1L << (NIL - 32)) | (1L << (ANON - 32)) | (1L << (OPEN_BRACE - 32)) | (1L << (OPEN_SQUARE_BRACE - 32)))) != 0) );
			setState(417);
			match(CLOSE_BRACE);
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

	public static class GraphNodeContext extends ParserRuleContext {
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public TriplesNodeContext triplesNode() {
			return getRuleContext(TriplesNodeContext.class,0);
		}
		public GraphNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterGraphNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitGraphNode(this);
		}
	}

	public final GraphNodeContext graphNode() throws RecognitionException {
		GraphNodeContext _localctx = new GraphNodeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_graphNode);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				varOrTerm();
				}
				break;
			case OPEN_BRACE:
			case OPEN_SQUARE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				triplesNode();
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

	public static class VarOrTermContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public GraphTermContext graphTerm() {
			return getRuleContext(GraphTermContext.class,0);
		}
		public VarOrTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterVarOrTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitVarOrTerm(this);
		}
	}

	public final VarOrTermContext varOrTerm() throws RecognitionException {
		VarOrTermContext _localctx = new VarOrTermContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_varOrTerm);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				var();
				}
				break;
			case TRUE:
			case FALSE:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				graphTerm();
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

	public static class VarOrIRIrefContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IriRefContext iriRef() {
			return getRuleContext(IriRefContext.class,0);
		}
		public VarOrIRIrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrIRIref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterVarOrIRIref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitVarOrIRIref(this);
		}
	}

	public final VarOrIRIrefContext varOrIRIref() throws RecognitionException {
		VarOrIRIrefContext _localctx = new VarOrIRIrefContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_varOrIRIref);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				var();
				}
				break;
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				iriRef();
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

	public static class VarContext extends ParserRuleContext {
		public Token v;
		public TerminalNode VAR1() { return getToken(Sparql10Parser.VAR1, 0); }
		public TerminalNode VAR2() { return getToken(Sparql10Parser.VAR2, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_var);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				((VarContext)_localctx).v = match(VAR1);
				}
				break;
			case VAR2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				((VarContext)_localctx).v = match(VAR2);
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

	public static class GraphTermContext extends ParserRuleContext {
		public IriRefContext ir;
		public RdfLiteralContext rl;
		public NumericLiteralContext nl;
		public BooleanLiteralContext bl;
		public BlankNodeContext bn;
		public IriRefContext iriRef() {
			return getRuleContext(IriRefContext.class,0);
		}
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public TerminalNode NIL() { return getToken(Sparql10Parser.NIL, 0); }
		public GraphTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterGraphTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitGraphTerm(this);
		}
	}

	public final GraphTermContext graphTerm() throws RecognitionException {
		GraphTermContext _localctx = new GraphTermContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_graphTerm);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				((GraphTermContext)_localctx).ir = iriRef();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				((GraphTermContext)_localctx).rl = rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				((GraphTermContext)_localctx).nl = numericLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				((GraphTermContext)_localctx).bl = booleanLiteral();
				}
				break;
			case BLANK_NODE_LABEL:
			case ANON:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				((GraphTermContext)_localctx).bn = blankNode();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 6);
				{
				setState(440);
				match(NIL);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			conditionalOrExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext c1;
		public ConditionalAndExpressionContext c2;
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(Sparql10Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Sparql10Parser.OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			((ConditionalOrExpressionContext)_localctx).c1 = conditionalAndExpression();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(446);
				match(OR);
				setState(447);
				((ConditionalOrExpressionContext)_localctx).c2 = conditionalAndExpression();
				}
				}
				setState(452);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public ValueLogicalContext v1;
		public ValueLogicalContext v2;
		public List<ValueLogicalContext> valueLogical() {
			return getRuleContexts(ValueLogicalContext.class);
		}
		public ValueLogicalContext valueLogical(int i) {
			return getRuleContext(ValueLogicalContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(Sparql10Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Sparql10Parser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			((ConditionalAndExpressionContext)_localctx).v1 = valueLogical();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(454);
				match(AND);
				setState(455);
				((ConditionalAndExpressionContext)_localctx).v2 = valueLogical();
				}
				}
				setState(460);
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

	public static class ValueLogicalContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ValueLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueLogical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterValueLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitValueLogical(this);
		}
	}

	public final ValueLogicalContext valueLogical() throws RecognitionException {
		ValueLogicalContext _localctx = new ValueLogicalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_valueLogical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			relationalExpression();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public NumericExpressionContext n1;
		public NumericExpressionContext n2;
		public List<NumericExpressionContext> numericExpression() {
			return getRuleContexts(NumericExpressionContext.class);
		}
		public NumericExpressionContext numericExpression(int i) {
			return getRuleContext(NumericExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Sparql10Parser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Sparql10Parser.NOT_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(Sparql10Parser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(Sparql10Parser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(Sparql10Parser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(Sparql10Parser.GREATER_EQUAL, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_relationalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			((RelationalExpressionContext)_localctx).n1 = numericExpression();
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				{
				setState(464);
				match(EQUAL);
				setState(465);
				((RelationalExpressionContext)_localctx).n2 = numericExpression();
				}
				break;
			case NOT_EQUAL:
				{
				setState(466);
				match(NOT_EQUAL);
				setState(467);
				((RelationalExpressionContext)_localctx).n2 = numericExpression();
				}
				break;
			case LESS:
				{
				setState(468);
				match(LESS);
				setState(469);
				((RelationalExpressionContext)_localctx).n2 = numericExpression();
				}
				break;
			case GREATER:
				{
				setState(470);
				match(GREATER);
				setState(471);
				((RelationalExpressionContext)_localctx).n2 = numericExpression();
				}
				break;
			case LESS_EQUAL:
				{
				setState(472);
				match(LESS_EQUAL);
				setState(473);
				((RelationalExpressionContext)_localctx).n2 = numericExpression();
				}
				break;
			case GREATER_EQUAL:
				{
				setState(474);
				match(GREATER_EQUAL);
				setState(475);
				((RelationalExpressionContext)_localctx).n2 = numericExpression();
				}
				break;
			case COMMA:
			case CLOSE_BRACE:
			case AND:
			case OR:
				break;
			default:
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

	public static class NumericExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public NumericExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitNumericExpression(this);
		}
	}

	public final NumericExpressionContext numericExpression() throws RecognitionException {
		NumericExpressionContext _localctx = new NumericExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_numericExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
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
		public MultiplicativeExpressionContext m1;
		public Token op;
		public MultiplicativeExpressionContext m2;
		public NumericLiteralPositiveContext nlp;
		public NumericLiteralNegativeContext nln;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Sparql10Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Sparql10Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Sparql10Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Sparql10Parser.MINUS, i);
		}
		public List<NumericLiteralPositiveContext> numericLiteralPositive() {
			return getRuleContexts(NumericLiteralPositiveContext.class);
		}
		public NumericLiteralPositiveContext numericLiteralPositive(int i) {
			return getRuleContext(NumericLiteralPositiveContext.class,i);
		}
		public List<NumericLiteralNegativeContext> numericLiteralNegative() {
			return getRuleContexts(NumericLiteralNegativeContext.class);
		}
		public NumericLiteralNegativeContext numericLiteralNegative(int i) {
			return getRuleContext(NumericLiteralNegativeContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			((AdditiveExpressionContext)_localctx).m1 = multiplicativeExpression();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (INTEGER_POSITIVE - 47)) | (1L << (DECIMAL_POSITIVE - 47)) | (1L << (DOUBLE_POSITIVE - 47)) | (1L << (INTEGER_NEGATIVE - 47)) | (1L << (DECIMAL_NEGATIVE - 47)) | (1L << (DOUBLE_NEGATIVE - 47)) | (1L << (PLUS - 47)) | (1L << (MINUS - 47)))) != 0)) {
				{
				setState(487);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(481);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					setState(482);
					((AdditiveExpressionContext)_localctx).m2 = multiplicativeExpression();
					}
					break;
				case MINUS:
					{
					setState(483);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					setState(484);
					((AdditiveExpressionContext)_localctx).m2 = multiplicativeExpression();
					}
					break;
				case INTEGER_POSITIVE:
				case DECIMAL_POSITIVE:
				case DOUBLE_POSITIVE:
					{
					setState(485);
					((AdditiveExpressionContext)_localctx).nlp = numericLiteralPositive();
					}
					break;
				case INTEGER_NEGATIVE:
				case DECIMAL_NEGATIVE:
				case DOUBLE_NEGATIVE:
					{
					setState(486);
					((AdditiveExpressionContext)_localctx).nln = numericLiteralNegative();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(491);
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
		public UnaryExpressionContext u1;
		public Token op;
		public UnaryExpressionContext u2;
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(Sparql10Parser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(Sparql10Parser.ASTERISK, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(Sparql10Parser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(Sparql10Parser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			((MultiplicativeExpressionContext)_localctx).u1 = unaryExpression();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISK || _la==DIVIDE) {
				{
				setState(497);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASTERISK:
					{
					setState(493);
					((MultiplicativeExpressionContext)_localctx).op = match(ASTERISK);
					setState(494);
					((MultiplicativeExpressionContext)_localctx).u2 = unaryExpression();
					}
					break;
				case DIVIDE:
					{
					setState(495);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					setState(496);
					((MultiplicativeExpressionContext)_localctx).u2 = unaryExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(501);
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
		public PrimaryExpressionContext e;
		public TerminalNode NOT_SIGN() { return getToken(Sparql10Parser.NOT_SIGN, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(Sparql10Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Sparql10Parser.MINUS, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unaryExpression);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(NOT_SIGN);
				setState(503);
				((UnaryExpressionContext)_localctx).e = primaryExpression();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(PLUS);
				setState(505);
				((UnaryExpressionContext)_localctx).e = primaryExpression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				match(MINUS);
				setState(507);
				((UnaryExpressionContext)_localctx).e = primaryExpression();
				}
				break;
			case STR:
			case ISURI:
			case LANG:
			case ISIRI:
			case LANGMATCHES:
			case ISLITERAL:
			case DATATYPE:
			case REGEX:
			case BOUND:
			case TRUE:
			case SAMETERM:
			case FALSE:
			case ISBLANK:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				((UnaryExpressionContext)_localctx).e = primaryExpression();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public BrackettedExpressionContext be;
		public BuiltInCallContext bic;
		public IriRefOrFunctionContext irof;
		public RdfLiteralContext rl;
		public NumericLiteralContext nl;
		public BooleanLiteralContext bl;
		public VarContext v;
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public IriRefOrFunctionContext iriRefOrFunction() {
			return getRuleContext(IriRefOrFunctionContext.class,0);
		}
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primaryExpression);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				((PrimaryExpressionContext)_localctx).be = brackettedExpression();
				}
				break;
			case STR:
			case ISURI:
			case LANG:
			case ISIRI:
			case LANGMATCHES:
			case ISLITERAL:
			case DATATYPE:
			case REGEX:
			case BOUND:
			case SAMETERM:
			case ISBLANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				((PrimaryExpressionContext)_localctx).bic = builtInCall();
				}
				break;
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				((PrimaryExpressionContext)_localctx).irof = iriRefOrFunction();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				((PrimaryExpressionContext)_localctx).rl = rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(515);
				((PrimaryExpressionContext)_localctx).nl = numericLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(516);
				((PrimaryExpressionContext)_localctx).bl = booleanLiteral();
				}
				break;
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 7);
				{
				setState(517);
				((PrimaryExpressionContext)_localctx).v = var();
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

	public static class BrackettedExpressionContext extends ParserRuleContext {
		public ExpressionContext e;
		public TerminalNode OPEN_BRACE() { return getToken(Sparql10Parser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(Sparql10Parser.CLOSE_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BrackettedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackettedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterBrackettedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitBrackettedExpression(this);
		}
	}

	public final BrackettedExpressionContext brackettedExpression() throws RecognitionException {
		BrackettedExpressionContext _localctx = new BrackettedExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_brackettedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(OPEN_BRACE);
			setState(521);
			((BrackettedExpressionContext)_localctx).e = expression();
			setState(522);
			match(CLOSE_BRACE);
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

	public static class BuiltInCallContext extends ParserRuleContext {
		public ExpressionContext e;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode STR() { return getToken(Sparql10Parser.STR, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(Sparql10Parser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(Sparql10Parser.CLOSE_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LANG() { return getToken(Sparql10Parser.LANG, 0); }
		public TerminalNode LANGMATCHES() { return getToken(Sparql10Parser.LANGMATCHES, 0); }
		public TerminalNode COMMA() { return getToken(Sparql10Parser.COMMA, 0); }
		public TerminalNode DATATYPE() { return getToken(Sparql10Parser.DATATYPE, 0); }
		public TerminalNode BOUND() { return getToken(Sparql10Parser.BOUND, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode SAMETERM() { return getToken(Sparql10Parser.SAMETERM, 0); }
		public TerminalNode ISIRI() { return getToken(Sparql10Parser.ISIRI, 0); }
		public TerminalNode ISURI() { return getToken(Sparql10Parser.ISURI, 0); }
		public TerminalNode ISBLANK() { return getToken(Sparql10Parser.ISBLANK, 0); }
		public TerminalNode ISLITERAL() { return getToken(Sparql10Parser.ISLITERAL, 0); }
		public RegexExpressionContext regexExpression() {
			return getRuleContext(RegexExpressionContext.class,0);
		}
		public BuiltInCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterBuiltInCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitBuiltInCall(this);
		}
	}

	public final BuiltInCallContext builtInCall() throws RecognitionException {
		BuiltInCallContext _localctx = new BuiltInCallContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_builtInCall);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(STR);
				setState(525);
				match(OPEN_BRACE);
				setState(526);
				((BuiltInCallContext)_localctx).e = expression();
				setState(527);
				match(CLOSE_BRACE);
				}
				break;
			case LANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(LANG);
				setState(530);
				match(OPEN_BRACE);
				setState(531);
				((BuiltInCallContext)_localctx).e = expression();
				setState(532);
				match(CLOSE_BRACE);
				}
				break;
			case LANGMATCHES:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				match(LANGMATCHES);
				setState(535);
				match(OPEN_BRACE);
				setState(536);
				((BuiltInCallContext)_localctx).e1 = expression();
				setState(537);
				match(COMMA);
				setState(538);
				((BuiltInCallContext)_localctx).e2 = expression();
				setState(539);
				match(CLOSE_BRACE);
				}
				break;
			case DATATYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				match(DATATYPE);
				setState(542);
				match(OPEN_BRACE);
				setState(543);
				((BuiltInCallContext)_localctx).e = expression();
				setState(544);
				match(CLOSE_BRACE);
				}
				break;
			case BOUND:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				match(BOUND);
				setState(547);
				match(OPEN_BRACE);
				setState(548);
				var();
				setState(549);
				match(CLOSE_BRACE);
				}
				break;
			case SAMETERM:
				enterOuterAlt(_localctx, 6);
				{
				setState(551);
				match(SAMETERM);
				setState(552);
				match(OPEN_BRACE);
				setState(553);
				((BuiltInCallContext)_localctx).e1 = expression();
				setState(554);
				match(COMMA);
				setState(555);
				((BuiltInCallContext)_localctx).e2 = expression();
				setState(556);
				match(CLOSE_BRACE);
				}
				break;
			case ISIRI:
				enterOuterAlt(_localctx, 7);
				{
				setState(558);
				match(ISIRI);
				setState(559);
				match(OPEN_BRACE);
				setState(560);
				((BuiltInCallContext)_localctx).e = expression();
				setState(561);
				match(CLOSE_BRACE);
				}
				break;
			case ISURI:
				enterOuterAlt(_localctx, 8);
				{
				setState(563);
				match(ISURI);
				setState(564);
				match(OPEN_BRACE);
				setState(565);
				((BuiltInCallContext)_localctx).e = expression();
				setState(566);
				match(CLOSE_BRACE);
				}
				break;
			case ISBLANK:
				enterOuterAlt(_localctx, 9);
				{
				setState(568);
				match(ISBLANK);
				setState(569);
				match(OPEN_BRACE);
				setState(570);
				((BuiltInCallContext)_localctx).e = expression();
				setState(571);
				match(CLOSE_BRACE);
				}
				break;
			case ISLITERAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(573);
				match(ISLITERAL);
				setState(574);
				match(OPEN_BRACE);
				setState(575);
				((BuiltInCallContext)_localctx).e = expression();
				setState(576);
				match(CLOSE_BRACE);
				}
				break;
			case REGEX:
				enterOuterAlt(_localctx, 11);
				{
				setState(578);
				regexExpression();
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

	public static class RegexExpressionContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public TerminalNode REGEX() { return getToken(Sparql10Parser.REGEX, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(Sparql10Parser.OPEN_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Sparql10Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Sparql10Parser.COMMA, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(Sparql10Parser.CLOSE_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RegexExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterRegexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitRegexExpression(this);
		}
	}

	public final RegexExpressionContext regexExpression() throws RecognitionException {
		RegexExpressionContext _localctx = new RegexExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_regexExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(REGEX);
			setState(582);
			match(OPEN_BRACE);
			setState(583);
			((RegexExpressionContext)_localctx).e1 = expression();
			setState(584);
			match(COMMA);
			setState(585);
			((RegexExpressionContext)_localctx).e2 = expression();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(586);
				match(COMMA);
				setState(587);
				((RegexExpressionContext)_localctx).e3 = expression();
				}
			}

			setState(590);
			match(CLOSE_BRACE);
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

	public static class IriRefOrFunctionContext extends ParserRuleContext {
		public IriRefContext iriRef() {
			return getRuleContext(IriRefContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public IriRefOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriRefOrFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterIriRefOrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitIriRefOrFunction(this);
		}
	}

	public final IriRefOrFunctionContext iriRefOrFunction() throws RecognitionException {
		IriRefOrFunctionContext _localctx = new IriRefOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_iriRefOrFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			iriRef();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NIL || _la==OPEN_BRACE) {
				{
				setState(593);
				argList();
				}
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

	public static class RdfLiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode LANGTAG() { return getToken(Sparql10Parser.LANGTAG, 0); }
		public TerminalNode REFERENCE() { return getToken(Sparql10Parser.REFERENCE, 0); }
		public IriRefContext iriRef() {
			return getRuleContext(IriRefContext.class,0);
		}
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterRdfLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitRdfLiteral(this);
		}
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_rdfLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			string();
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGTAG:
				{
				setState(597);
				match(LANGTAG);
				}
				break;
			case REFERENCE:
				{
				{
				setState(598);
				match(REFERENCE);
				setState(599);
				iriRef();
				}
				}
				break;
			case GRAPH:
			case OPTIONAL:
			case FILTER:
			case A:
			case TRUE:
			case FALSE:
			case IRI_REF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
			case ASTERISK:
			case DOT:
			case OPEN_CURLY_BRACE:
			case CLOSE_CURLY_BRACE:
			case SEMICOLON:
			case COMMA:
			case OPEN_BRACE:
			case CLOSE_BRACE:
			case OPEN_SQUARE_BRACE:
			case CLOSE_SQUARE_BRACE:
			case LESS_EQUAL:
			case GREATER_EQUAL:
			case NOT_EQUAL:
			case DIVIDE:
			case EQUAL:
			case LESS:
			case GREATER:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
				break;
			default:
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public NumericLiteralUnsignedContext unsigned;
		public NumericLiteralPositiveContext positive;
		public NumericLiteralNegativeContext negative;
		public NumericLiteralUnsignedContext numericLiteralUnsigned() {
			return getRuleContext(NumericLiteralUnsignedContext.class,0);
		}
		public NumericLiteralPositiveContext numericLiteralPositive() {
			return getRuleContext(NumericLiteralPositiveContext.class,0);
		}
		public NumericLiteralNegativeContext numericLiteralNegative() {
			return getRuleContext(NumericLiteralNegativeContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_numericLiteral);
		try {
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				((NumericLiteralContext)_localctx).unsigned = numericLiteralUnsigned();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				((NumericLiteralContext)_localctx).positive = numericLiteralPositive();
				}
				break;
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				((NumericLiteralContext)_localctx).negative = numericLiteralNegative();
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

	public static class NumericLiteralUnsignedContext extends ParserRuleContext {
		public Token v;
		public TerminalNode INTEGER() { return getToken(Sparql10Parser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(Sparql10Parser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(Sparql10Parser.DOUBLE, 0); }
		public NumericLiteralUnsignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralUnsigned; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterNumericLiteralUnsigned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitNumericLiteralUnsigned(this);
		}
	}

	public final NumericLiteralUnsignedContext numericLiteralUnsigned() throws RecognitionException {
		NumericLiteralUnsignedContext _localctx = new NumericLiteralUnsignedContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_numericLiteralUnsigned);
		try {
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				((NumericLiteralUnsignedContext)_localctx).v = match(INTEGER);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				((NumericLiteralUnsignedContext)_localctx).v = match(DECIMAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				((NumericLiteralUnsignedContext)_localctx).v = match(DOUBLE);
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

	public static class NumericLiteralPositiveContext extends ParserRuleContext {
		public Token v;
		public TerminalNode INTEGER_POSITIVE() { return getToken(Sparql10Parser.INTEGER_POSITIVE, 0); }
		public TerminalNode DECIMAL_POSITIVE() { return getToken(Sparql10Parser.DECIMAL_POSITIVE, 0); }
		public TerminalNode DOUBLE_POSITIVE() { return getToken(Sparql10Parser.DOUBLE_POSITIVE, 0); }
		public NumericLiteralPositiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralPositive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterNumericLiteralPositive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitNumericLiteralPositive(this);
		}
	}

	public final NumericLiteralPositiveContext numericLiteralPositive() throws RecognitionException {
		NumericLiteralPositiveContext _localctx = new NumericLiteralPositiveContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_numericLiteralPositive);
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_POSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				((NumericLiteralPositiveContext)_localctx).v = match(INTEGER_POSITIVE);
				}
				break;
			case DECIMAL_POSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				((NumericLiteralPositiveContext)_localctx).v = match(DECIMAL_POSITIVE);
				}
				break;
			case DOUBLE_POSITIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				((NumericLiteralPositiveContext)_localctx).v = match(DOUBLE_POSITIVE);
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

	public static class NumericLiteralNegativeContext extends ParserRuleContext {
		public Token v;
		public TerminalNode INTEGER_NEGATIVE() { return getToken(Sparql10Parser.INTEGER_NEGATIVE, 0); }
		public TerminalNode DECIMAL_NEGATIVE() { return getToken(Sparql10Parser.DECIMAL_NEGATIVE, 0); }
		public TerminalNode DOUBLE_NEGATIVE() { return getToken(Sparql10Parser.DOUBLE_NEGATIVE, 0); }
		public NumericLiteralNegativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralNegative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterNumericLiteralNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitNumericLiteralNegative(this);
		}
	}

	public final NumericLiteralNegativeContext numericLiteralNegative() throws RecognitionException {
		NumericLiteralNegativeContext _localctx = new NumericLiteralNegativeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_numericLiteralNegative);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NEGATIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				((NumericLiteralNegativeContext)_localctx).v = match(INTEGER_NEGATIVE);
				}
				break;
			case DECIMAL_NEGATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				((NumericLiteralNegativeContext)_localctx).v = match(DECIMAL_NEGATIVE);
				}
				break;
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				((NumericLiteralNegativeContext)_localctx).v = match(DOUBLE_NEGATIVE);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Sparql10Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Sparql10Parser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL1() { return getToken(Sparql10Parser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(Sparql10Parser.STRING_LITERAL2, 0); }
		public TerminalNode STRING_LITERAL_LONG1() { return getToken(Sparql10Parser.STRING_LITERAL_LONG1, 0); }
		public TerminalNode STRING_LITERAL_LONG2() { return getToken(Sparql10Parser.STRING_LITERAL_LONG2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL1) | (1L << STRING_LITERAL2) | (1L << STRING_LITERAL_LONG1) | (1L << STRING_LITERAL_LONG2))) != 0)) ) {
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

	public static class IriRefContext extends ParserRuleContext {
		public TerminalNode IRI_REF() { return getToken(Sparql10Parser.IRI_REF, 0); }
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public IriRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterIriRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitIriRef(this);
		}
	}

	public final IriRefContext iriRef() throws RecognitionException {
		IriRefContext _localctx = new IriRefContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_iriRef);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRI_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(IRI_REF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				prefixedName();
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

	public static class PrefixedNameContext extends ParserRuleContext {
		public TerminalNode PNAME_LN() { return getToken(Sparql10Parser.PNAME_LN, 0); }
		public TerminalNode PNAME_NS() { return getToken(Sparql10Parser.PNAME_NS, 0); }
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterPrefixedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitPrefixedName(this);
		}
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(_la==PNAME_NS || _la==PNAME_LN) ) {
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

	public static class BlankNodeContext extends ParserRuleContext {
		public Token v;
		public TerminalNode BLANK_NODE_LABEL() { return getToken(Sparql10Parser.BLANK_NODE_LABEL, 0); }
		public TerminalNode ANON() { return getToken(Sparql10Parser.ANON, 0); }
		public BlankNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).enterBlankNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sparql10ParserListener ) ((Sparql10ParserListener)listener).exitBlankNode(this);
		}
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_blankNode);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				((BlankNodeContext)_localctx).v = match(BLANK_NODE_LABEL);
				}
				break;
			case ANON:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(ANON);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u027f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\u0092\n\2\3\3\5\3\u0095\n\3\3\3\7\3\u0098\n\3\f\3\16\3\u009b"+
		"\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u00a6\n\6\3\6\6\6\u00a9"+
		"\n\6\r\6\16\6\u00aa\3\6\5\6\u00ae\n\6\3\6\7\6\u00b1\n\6\f\6\16\6\u00b4"+
		"\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00bc\n\7\f\7\16\7\u00bf\13\7\3\7\3"+
		"\7\3\7\3\b\3\b\6\b\u00c6\n\b\r\b\16\b\u00c7\3\b\5\b\u00cb\n\b\3\b\7\b"+
		"\u00ce\n\b\f\b\16\b\u00d1\13\b\3\b\5\b\u00d4\n\b\3\b\3\b\3\t\3\t\7\t\u00da"+
		"\n\t\f\t\16\t\u00dd\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u00e4\n\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\5\16\u00ee\n\16\3\16\3\16\3\17\5\17\u00f3\n\17"+
		"\3\17\5\17\u00f6\n\17\3\20\3\20\5\20\u00fa\n\20\3\20\3\20\5\20\u00fe\n"+
		"\20\5\20\u0100\n\20\3\21\3\21\3\21\6\21\u0105\n\21\r\21\16\21\u0106\3"+
		"\22\3\22\5\22\u010b\n\22\3\22\3\22\3\22\5\22\u0110\n\22\5\22\u0112\n\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\5\25\u011c\n\25\3\25\3\25\5\25"+
		"\u0120\n\25\3\25\5\25\u0123\n\25\3\25\5\25\u0126\n\25\7\25\u0128\n\25"+
		"\f\25\16\25\u012b\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u0132\n\26\5\26"+
		"\u0134\n\26\3\27\3\27\3\27\5\27\u0139\n\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\7\32\u0145\n\32\f\32\16\32\u0148\13\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\5\34\u0150\n\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u015a\n\36\f\36\16\36\u015d\13\36\3\36\3\36\5\36\u0161"+
		"\n\36\3\37\3\37\5\37\u0165\n\37\3\37\3\37\3 \3 \3 \5 \u016c\n \5 \u016e"+
		"\n \3!\3!\3!\3!\3!\3!\5!\u0176\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u017e\n"+
		"\"\7\"\u0180\n\"\f\"\16\"\u0183\13\"\3#\5#\u0186\n#\3$\3$\3$\7$\u018b"+
		"\n$\f$\16$\u018e\13$\3%\3%\3&\3&\5&\u0194\n&\3\'\3\'\5\'\u0198\n\'\3("+
		"\3(\3(\3(\3)\3)\6)\u01a0\n)\r)\16)\u01a1\3)\3)\3*\3*\5*\u01a8\n*\3+\3"+
		"+\5+\u01ac\n+\3,\3,\5,\u01b0\n,\3-\3-\5-\u01b4\n-\3.\3.\3.\3.\3.\3.\5"+
		".\u01bc\n.\3/\3/\3\60\3\60\3\60\7\60\u01c3\n\60\f\60\16\60\u01c6\13\60"+
		"\3\61\3\61\3\61\7\61\u01cb\n\61\f\61\16\61\u01ce\13\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01df"+
		"\n\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u01ea\n\65\f\65"+
		"\16\65\u01ed\13\65\3\66\3\66\3\66\3\66\3\66\7\66\u01f4\n\66\f\66\16\66"+
		"\u01f7\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0200\n\67\38\38"+
		"\38\38\38\38\38\58\u0209\n8\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:"+
		"\u0246\n:\3;\3;\3;\3;\3;\3;\3;\5;\u024f\n;\3;\3;\3<\3<\5<\u0255\n<\3="+
		"\3=\3=\3=\5=\u025b\n=\3>\3>\3>\5>\u0260\n>\3?\3?\3?\5?\u0265\n?\3@\3@"+
		"\3@\5@\u026a\n@\3A\3A\3A\5A\u026f\nA\3B\3B\3C\3C\3D\3D\5D\u0277\nD\3E"+
		"\3E\3F\3F\5F\u027d\nF\3F\2\2G\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\2\6\4\2\33\33\37\37\4\2\"\"$$\3\28;\3\2()\2\u02a4"+
		"\2\u008c\3\2\2\2\4\u0094\3\2\2\2\6\u009c\3\2\2\2\b\u009f\3\2\2\2\n\u00a3"+
		"\3\2\2\2\f\u00b8\3\2\2\2\16\u00c3\3\2\2\2\20\u00d7\3\2\2\2\22\u00e0\3"+
		"\2\2\2\24\u00e5\3\2\2\2\26\u00e7\3\2\2\2\30\u00ea\3\2\2\2\32\u00ed\3\2"+
		"\2\2\34\u00f2\3\2\2\2\36\u00ff\3\2\2\2 \u0101\3\2\2\2\"\u0111\3\2\2\2"+
		"$\u0113\3\2\2\2&\u0116\3\2\2\2(\u0119\3\2\2\2*\u012e\3\2\2\2,\u0138\3"+
		"\2\2\2.\u013a\3\2\2\2\60\u013d\3\2\2\2\62\u0141\3\2\2\2\64\u0149\3\2\2"+
		"\2\66\u014f\3\2\2\28\u0151\3\2\2\2:\u0160\3\2\2\2<\u0162\3\2\2\2>\u0168"+
		"\3\2\2\2@\u0175\3\2\2\2B\u0177\3\2\2\2D\u0185\3\2\2\2F\u0187\3\2\2\2H"+
		"\u018f\3\2\2\2J\u0193\3\2\2\2L\u0197\3\2\2\2N\u0199\3\2\2\2P\u019d\3\2"+
		"\2\2R\u01a7\3\2\2\2T\u01ab\3\2\2\2V\u01af\3\2\2\2X\u01b3\3\2\2\2Z\u01bb"+
		"\3\2\2\2\\\u01bd\3\2\2\2^\u01bf\3\2\2\2`\u01c7\3\2\2\2b\u01cf\3\2\2\2"+
		"d\u01d1\3\2\2\2f\u01e0\3\2\2\2h\u01e2\3\2\2\2j\u01ee\3\2\2\2l\u01ff\3"+
		"\2\2\2n\u0208\3\2\2\2p\u020a\3\2\2\2r\u0245\3\2\2\2t\u0247\3\2\2\2v\u0252"+
		"\3\2\2\2x\u0256\3\2\2\2z\u025f\3\2\2\2|\u0264\3\2\2\2~\u0269\3\2\2\2\u0080"+
		"\u026e\3\2\2\2\u0082\u0270\3\2\2\2\u0084\u0272\3\2\2\2\u0086\u0276\3\2"+
		"\2\2\u0088\u0278\3\2\2\2\u008a\u027c\3\2\2\2\u008c\u0091\5\4\3\2\u008d"+
		"\u0092\5\n\6\2\u008e\u0092\5\f\7\2\u008f\u0092\5\16\b\2\u0090\u0092\5"+
		"\20\t\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\3\3\2\2\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0099\3\2\2\2\u0096\u0098\5\b\5\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\5\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5\u0086"+
		"D\2\u009e\7\3\2\2\2\u009f\u00a0\7\13\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a2"+
		"\7\'\2\2\u00a2\t\3\2\2\2\u00a3\u00a5\7\4\2\2\u00a4\u00a6\t\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ad\3\2\2\2\u00a7\u00a9\5X"+
		"-\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae\7G\2\2\u00ad\u00a8\3\2"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\5\22\n\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5\32\16\2\u00b6"+
		"\u00b7\5\34\17\2\u00b7\13\3\2\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00bd\5<\37"+
		"\2\u00ba\u00bc\5\22\n\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00c2\5\34\17\2\u00c2\r\3\2\2\2\u00c3"+
		"\u00ca\7\24\2\2\u00c4\u00c6\5V,\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00cb\7G\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cf\3\2"+
		"\2\2\u00cc\u00ce\5\22\n\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d4\5\32\16\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\5\34\17\2\u00d6\17\3\2\2\2\u00d7\u00db\7\32"+
		"\2\2\u00d8\u00da\5\22\n\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\5\32\16\2\u00df\21\3\2\2\2\u00e0\u00e3\7\7\2\2\u00e1"+
		"\u00e4\5\24\13\2\u00e2\u00e4\5\26\f\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4\23\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6\25\3\2\2\2\u00e7"+
		"\u00e8\7\20\2\2\u00e8\u00e9\5\30\r\2\u00e9\27\3\2\2\2\u00ea\u00eb\5\u0086"+
		"D\2\u00eb\31\3\2\2\2\u00ec\u00ee\7\26\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5(\25\2\u00f0\33\3\2\2\2\u00f1"+
		"\u00f3\5 \21\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00f6\5\36\20\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\35\3\2\2\2\u00f7\u00f9\5$\23\2\u00f8\u00fa\5&\24\2\u00f9\u00f8\3\2\2"+
		"\2\u00f9\u00fa\3\2\2\2\u00fa\u0100\3\2\2\2\u00fb\u00fd\5&\24\2\u00fc\u00fe"+
		"\5$\23\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00f7\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\37\3\2\2\2\u0101\u0102\7\5\2"+
		"\2\u0102\u0104\7\6\2\2\u0103\u0105\5\"\22\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107!\3\2\2\2"+
		"\u0108\u010b\7\16\2\2\u0109\u010b\7\17\2\2\u010a\u0108\3\2\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0112\5p9\2\u010d\u0110\5\66\34\2\u010e"+
		"\u0110\5X-\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0112\3\2\2"+
		"\2\u0111\u010a\3\2\2\2\u0111\u010f\3\2\2\2\u0112#\3\2\2\2\u0113\u0114"+
		"\7\r\2\2\u0114\u0115\7.\2\2\u0115%\3\2\2\2\u0116\u0117\7\25\2\2\u0117"+
		"\u0118\7.\2\2\u0118\'\3\2\2\2\u0119\u011b\7I\2\2\u011a\u011c\5*\26\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0129\3\2\2\2\u011d\u0120\5,"+
		"\27\2\u011e\u0120\5\64\33\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u0123\7H\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0126\5*\26\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u011f\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7J\2\2\u012d)\3\2\2\2\u012e\u0133\5@!\2\u012f"+
		"\u0131\7H\2\2\u0130\u0132\5*\26\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"+\3\2\2\2\u0135\u0139\5.\30\2\u0136\u0139\5\62\32\2\u0137\u0139\5\60\31"+
		"\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139-"+
		"\3\2\2\2\u013a\u013b\7\21\2\2\u013b\u013c\5(\25\2\u013c/\3\2\2\2\u013d"+
		"\u013e\7\b\2\2\u013e\u013f\5V,\2\u013f\u0140\5(\25\2\u0140\61\3\2\2\2"+
		"\u0141\u0146\5(\25\2\u0142\u0143\7\27\2\2\u0143\u0145\5(\25\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\63\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\34\2\2\u014a\u014b\5\66"+
		"\34\2\u014b\65\3\2\2\2\u014c\u0150\5p9\2\u014d\u0150\5r:\2\u014e\u0150"+
		"\58\35\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\67\3\2\2\2\u0151\u0152\5\u0086D\2\u0152\u0153\5:\36\2\u01539\3\2\2\2"+
		"\u0154\u0161\7=\2\2\u0155\u0156\7M\2\2\u0156\u015b\5\\/\2\u0157\u0158"+
		"\7L\2\2\u0158\u015a\5\\/\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015e\u015f\7N\2\2\u015f\u0161\3\2\2\2\u0160\u0154\3\2\2\2\u0160"+
		"\u0155\3\2\2\2\u0161;\3\2\2\2\u0162\u0164\7I\2\2\u0163\u0165\5> \2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7J"+
		"\2\2\u0167=\3\2\2\2\u0168\u016d\5@!\2\u0169\u016b\7H\2\2\u016a\u016c\5"+
		"> \2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u0169\3\2\2\2\u016d\u016e\3\2\2\2\u016e?\3\2\2\2\u016f\u0170\5T+\2\u0170"+
		"\u0171\5B\"\2\u0171\u0176\3\2\2\2\u0172\u0173\5L\'\2\u0173\u0174\5D#\2"+
		"\u0174\u0176\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0172\3\2\2\2\u0176A\3"+
		"\2\2\2\u0177\u0178\5J&\2\u0178\u0181\5F$\2\u0179\u017d\7K\2\2\u017a\u017b"+
		"\5J&\2\u017b\u017c\5F$\2\u017c\u017e\3\2\2\2\u017d\u017a\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0179\3\2\2\2\u0180\u0183\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182C\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0184\u0186\5B\"\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"E\3\2\2\2\u0187\u018c\5H%\2\u0188\u0189\7L\2\2\u0189\u018b\5H%\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018dG\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\5R*\2\u0190I\3\2\2"+
		"\2\u0191\u0194\5V,\2\u0192\u0194\7 \2\2\u0193\u0191\3\2\2\2\u0193\u0192"+
		"\3\2\2\2\u0194K\3\2\2\2\u0195\u0198\5P)\2\u0196\u0198\5N(\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198M\3\2\2\2\u0199\u019a\7O\2\2\u019a\u019b"+
		"\5B\"\2\u019b\u019c\7P\2\2\u019cO\3\2\2\2\u019d\u019f\7M\2\2\u019e\u01a0"+
		"\5R*\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7N\2\2\u01a4Q\3\2\2\2\u01a5"+
		"\u01a8\5T+\2\u01a6\u01a8\5L\'\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2"+
		"\2\u01a8S\3\2\2\2\u01a9\u01ac\5X-\2\u01aa\u01ac\5Z.\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01aa\3\2\2\2\u01acU\3\2\2\2\u01ad\u01b0\5X-\2\u01ae\u01b0"+
		"\5\u0086D\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0W\3\2\2\2\u01b1"+
		"\u01b4\7+\2\2\u01b2\u01b4\7,\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2"+
		"\2\u01b4Y\3\2\2\2\u01b5\u01bc\5\u0086D\2\u01b6\u01bc\5x=\2\u01b7\u01bc"+
		"\5z>\2\u01b8\u01bc\5\u0082B\2\u01b9\u01bc\5\u008aF\2\u01ba\u01bc\7=\2"+
		"\2\u01bb\u01b5\3\2\2\2\u01bb\u01b6\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc[\3\2\2\2\u01bd"+
		"\u01be\5^\60\2\u01be]\3\2\2\2\u01bf\u01c4\5`\61\2\u01c0\u01c1\7\\\2\2"+
		"\u01c1\u01c3\5`\61\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5_\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01cc\5b\62\2\u01c8\u01c9\7[\2\2\u01c9\u01cb\5b\62\2\u01ca\u01c8\3\2"+
		"\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"a\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\5d\63\2\u01d0c\3\2\2\2\u01d1"+
		"\u01de\5f\64\2\u01d2\u01d3\7V\2\2\u01d3\u01df\5f\64\2\u01d4\u01d5\7S\2"+
		"\2\u01d5\u01df\5f\64\2\u01d6\u01d7\7W\2\2\u01d7\u01df\5f\64\2\u01d8\u01d9"+
		"\7X\2\2\u01d9\u01df\5f\64\2\u01da\u01db\7Q\2\2\u01db\u01df\5f\64\2\u01dc"+
		"\u01dd\7R\2\2\u01dd\u01df\5f\64\2\u01de\u01d2\3\2\2\2\u01de\u01d4\3\2"+
		"\2\2\u01de\u01d6\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01da\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01dfe\3\2\2\2\u01e0\u01e1\5h\65\2"+
		"\u01e1g\3\2\2\2\u01e2\u01eb\5j\66\2\u01e3\u01e4\7Y\2\2\u01e4\u01ea\5j"+
		"\66\2\u01e5\u01e6\7Z\2\2\u01e6\u01ea\5j\66\2\u01e7\u01ea\5~@\2\u01e8\u01ea"+
		"\5\u0080A\2\u01e9\u01e3\3\2\2\2\u01e9\u01e5\3\2\2\2\u01e9\u01e7\3\2\2"+
		"\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01eci\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f5\5l\67\2\u01ef"+
		"\u01f0\7G\2\2\u01f0\u01f4\5l\67\2\u01f1\u01f2\7U\2\2\u01f2\u01f4\5l\67"+
		"\2\u01f3\u01ef\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6k\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01f9\7T\2\2\u01f9\u0200\5n8\2\u01fa\u01fb\7Y\2\2\u01fb\u0200\5n8\2\u01fc"+
		"\u01fd\7Z\2\2\u01fd\u0200\5n8\2\u01fe\u0200\5n8\2\u01ff\u01f8\3\2\2\2"+
		"\u01ff\u01fa\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200m\3"+
		"\2\2\2\u0201\u0209\5p9\2\u0202\u0209\5r:\2\u0203\u0209\5v<\2\u0204\u0209"+
		"\5x=\2\u0205\u0209\5z>\2\u0206\u0209\5\u0082B\2\u0207\u0209\5X-\2\u0208"+
		"\u0201\3\2\2\2\u0208\u0202\3\2\2\2\u0208\u0203\3\2\2\2\u0208\u0204\3\2"+
		"\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209"+
		"o\3\2\2\2\u020a\u020b\7M\2\2\u020b\u020c\5\\/\2\u020c\u020d\7N\2\2\u020d"+
		"q\3\2\2\2\u020e\u020f\7\t\2\2\u020f\u0210\7M\2\2\u0210\u0211\5\\/\2\u0211"+
		"\u0212\7N\2\2\u0212\u0246\3\2\2\2\u0213\u0214\7\22\2\2\u0214\u0215\7M"+
		"\2\2\u0215\u0216\5\\/\2\u0216\u0217\7N\2\2\u0217\u0246\3\2\2\2\u0218\u0219"+
		"\7\30\2\2\u0219\u021a\7M\2\2\u021a\u021b\5\\/\2\u021b\u021c\7L\2\2\u021c"+
		"\u021d\5\\/\2\u021d\u021e\7N\2\2\u021e\u0246\3\2\2\2\u021f\u0220\7\35"+
		"\2\2\u0220\u0221\7M\2\2\u0221\u0222\5\\/\2\u0222\u0223\7N\2\2\u0223\u0246"+
		"\3\2\2\2\u0224\u0225\7!\2\2\u0225\u0226\7M\2\2\u0226\u0227\5X-\2\u0227"+
		"\u0228\7N\2\2\u0228\u0246\3\2\2\2\u0229\u022a\7#\2\2\u022a\u022b\7M\2"+
		"\2\u022b\u022c\5\\/\2\u022c\u022d\7L\2\2\u022d\u022e\5\\/\2\u022e\u022f"+
		"\7N\2\2\u022f\u0246\3\2\2\2\u0230\u0231\7\23\2\2\u0231\u0232\7M\2\2\u0232"+
		"\u0233\5\\/\2\u0233\u0234\7N\2\2\u0234\u0246\3\2\2\2\u0235\u0236\7\n\2"+
		"\2\u0236\u0237\7M\2\2\u0237\u0238\5\\/\2\u0238\u0239\7N\2\2\u0239\u0246"+
		"\3\2\2\2\u023a\u023b\7&\2\2\u023b\u023c\7M\2\2\u023c\u023d\5\\/\2\u023d"+
		"\u023e\7N\2\2\u023e\u0246\3\2\2\2\u023f\u0240\7\31\2\2\u0240\u0241\7M"+
		"\2\2\u0241\u0242\5\\/\2\u0242\u0243\7N\2\2\u0243\u0246\3\2\2\2\u0244\u0246"+
		"\5t;\2\u0245\u020e\3\2\2\2\u0245\u0213\3\2\2\2\u0245\u0218\3\2\2\2\u0245"+
		"\u021f\3\2\2\2\u0245\u0224\3\2\2\2\u0245\u0229\3\2\2\2\u0245\u0230\3\2"+
		"\2\2\u0245\u0235\3\2\2\2\u0245\u023a\3\2\2\2\u0245\u023f\3\2\2\2\u0245"+
		"\u0244\3\2\2\2\u0246s\3\2\2\2\u0247\u0248\7\36\2\2\u0248\u0249\7M\2\2"+
		"\u0249\u024a\5\\/\2\u024a\u024b\7L\2\2\u024b\u024e\5\\/\2\u024c\u024d"+
		"\7L\2\2\u024d\u024f\5\\/\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0251\7N\2\2\u0251u\3\2\2\2\u0252\u0254\5\u0086D"+
		"\2\u0253\u0255\5:\36\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255w"+
		"\3\2\2\2\u0256\u025a\5\u0084C\2\u0257\u025b\7-\2\2\u0258\u0259\7]\2\2"+
		"\u0259\u025b\5\u0086D\2\u025a\u0257\3\2\2\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025by\3\2\2\2\u025c\u0260\5|?\2\u025d\u0260\5~@\2\u025e"+
		"\u0260\5\u0080A\2\u025f\u025c\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u025e"+
		"\3\2\2\2\u0260{\3\2\2\2\u0261\u0265\7.\2\2\u0262\u0265\7/\2\2\u0263\u0265"+
		"\7\60\2\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2"+
		"\u0265}\3\2\2\2\u0266\u026a\7\61\2\2\u0267\u026a\7\62\2\2\u0268\u026a"+
		"\7\63\2\2\u0269\u0266\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2"+
		"\u026a\177\3\2\2\2\u026b\u026f\7\64\2\2\u026c\u026f\7\65\2\2\u026d\u026f"+
		"\7\66\2\2\u026e\u026b\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2"+
		"\u026f\u0081\3\2\2\2\u0270\u0271\t\3\2\2\u0271\u0083\3\2\2\2\u0272\u0273"+
		"\t\4\2\2\u0273\u0085\3\2\2\2\u0274\u0277\7\'\2\2\u0275\u0277\5\u0088E"+
		"\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277\u0087\3\2\2\2\u0278\u0279"+
		"\t\5\2\2\u0279\u0089\3\2\2\2\u027a\u027d\7*\2\2\u027b\u027d\7?\2\2\u027c"+
		"\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027d\u008b\3\2\2\2I\u0091\u0094\u0099"+
		"\u00a5\u00aa\u00ad\u00b2\u00bd\u00c7\u00ca\u00cf\u00d3\u00db\u00e3\u00ed"+
		"\u00f2\u00f5\u00f9\u00fd\u00ff\u0106\u010a\u010f\u0111\u011b\u011f\u0122"+
		"\u0125\u0129\u0131\u0133\u0138\u0146\u014f\u015b\u0160\u0164\u016b\u016d"+
		"\u0175\u017d\u0181\u0185\u018c\u0193\u0197\u01a1\u01a7\u01ab\u01af\u01b3"+
		"\u01bb\u01c4\u01cc\u01de\u01e9\u01eb\u01f3\u01f5\u01ff\u0208\u0245\u024e"+
		"\u0254\u025a\u025f\u0264\u0269\u026e\u0276\u027c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}