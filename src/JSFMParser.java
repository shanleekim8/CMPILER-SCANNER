// Generated from C:/Users/Shan/IdeaProjects/CMPILER-Scanner/src\JSFMParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSFMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BREAK=2, CASE=3, CHAR=4, CONST=5, CONTINUE=6, DEFAULT=7, DO=8, 
		ELSE=9, FINAL=10, FLOAT=11, FOR=12, IF=13, INT=14, MAIN=15, RETURN=16, 
		STRING=17, SWITCH=18, VOID=19, WHILE=20, INPUT=21, OUTPUT=22, IDENTIFIER=23, 
		LPAREN=24, RPAREN=25, LBRACE=26, RBRACE=27, LBRACK=28, RBRACK=29, SEMI=30, 
		COMMA=31, DOT=32, QUOTE=33, ASSIGN=34, GT=35, LT=36, BANG=37, QUESTION=38, 
		COLON=39, EQUAL=40, GEQ=41, LEQ=42, NEQ=43, AND=44, OR=45, INC=46, DEC=47, 
		ADD=48, SUB=49, MUL=50, DIV=51, MOD=52, ADD_ASSIGN=53, SUB_ASSIGN=54, 
		MUL_ASSIGN=55, DIV_ASSIGN=56, ELLIPSIS=57, DECIMAL_LITERAL=58, FLOAT_LITERAL=59, 
		BOOL_LITERAL=60, CHAR_LITERAL=61, STRING_LITERAL=62, NULL_LITERAL=63, 
		WS=64, COMMENT=65, CLASS=66, LetterOrDigit=67;
	public static final int
		RULE_compilationUnit = 0, RULE_mainStatement = 1, RULE_variableModifier = 2, 
		RULE_typeParameters = 3, RULE_typeParameter = 4, RULE_methodDeclaration = 5, 
		RULE_methodBody = 6, RULE_genericMethodDeclaration = 7, RULE_fieldDeclaration = 8, 
		RULE_memberDeclaration = 9, RULE_typeTypeOrVoid = 10, RULE_typeType = 11, 
		RULE_formalParameters = 12, RULE_formalParameterList = 13, RULE_formalParameter = 14, 
		RULE_lastFormalParameter = 15, RULE_qualifiedName = 16, RULE_literal = 17, 
		RULE_integerLiteral = 18, RULE_floatLiteral = 19, RULE_qualifiedNameList = 20, 
		RULE_variableDeclarators = 21, RULE_variableDeclarator = 22, RULE_variableDeclaratorId = 23, 
		RULE_variableInitializer = 24, RULE_arrayInitializer = 25, RULE_block = 26, 
		RULE_blockStatement = 27, RULE_localVariableDeclaration = 28, RULE_statement = 29, 
		RULE_switchBlockStatementGroup = 30, RULE_switchLabel = 31, RULE_forControl = 32, 
		RULE_forInit = 33, RULE_enhancedForControl = 34, RULE_parExpression = 35, 
		RULE_expressionList = 36, RULE_methodCall = 37, RULE_expression = 38, 
		RULE_primary = 39, RULE_inputStatement = 40, RULE_outputStatement = 41, 
		RULE_primitiveType = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "mainStatement", "variableModifier", "typeParameters", 
			"typeParameter", "methodDeclaration", "methodBody", "genericMethodDeclaration", 
			"fieldDeclaration", "memberDeclaration", "typeTypeOrVoid", "typeType", 
			"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
			"qualifiedName", "literal", "integerLiteral", "floatLiteral", "qualifiedNameList", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "block", "blockStatement", 
			"localVariableDeclaration", "statement", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "primary", "inputStatement", 
			"outputStatement", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolin'", "'cease'", "'option'", "'kachow'", "'fiber'", "'megaman'", 
			"'basic'", "'perform'", "'otherwise'", "'ultimate'", "'coke'", "'repeat'", 
			"'upon'", "'techies'", "'main'", "'respond'", "'thread'", "'choices'", 
			"'faceless'", "'during'", "'inputf'", "'outputf'", null, "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'\"'", "'='", "'>'", 
			"'<'", "'!'", "'?'", "':'", "'=='", "'>='", "'<='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'...'", null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "MAIN", "RETURN", 
			"STRING", "SWITCH", "VOID", "WHILE", "INPUT", "OUTPUT", "IDENTIFIER", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "QUOTE", "ASSIGN", "GT", "LT", "BANG", "QUESTION", "COLON", "EQUAL", 
			"GEQ", "LEQ", "NEQ", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"ELLIPSIS", "DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "NULL_LITERAL", "WS", "COMMENT", "CLASS", "LetterOrDigit"
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
	public String getGrammarFileName() { return "JSFMParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSFMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public MainStatementContext mainStatement() {
			return getRuleContext(MainStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JSFMParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			mainStatement();
			setState(87);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainStatementContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(JSFMParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMainStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMainStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMainStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << LT))) != 0)) {
				{
				{
				setState(89);
				memberDeclaration();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(MAIN);
			setState(96);
			block();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << LT))) != 0)) {
				{
				{
				setState(97);
				memberDeclaration();
				}
				}
				setState(102);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JSFMParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JSFMParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JSFMParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JSFMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSFMParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LT);
			setState(106);
			typeParameter();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107);
				match(COMMA);
				setState(108);
				typeParameter();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JSFMParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JSFMParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JSFMParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JSFMParser.RBRACK, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			typeTypeOrVoid();
			setState(119);
			match(IDENTIFIER);
			setState(120);
			formalParameters();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(121);
				match(LBRACK);
				setState(122);
				match(RBRACK);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodBody);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(SEMI);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			typeParameters();
			setState(135);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			typeType();
			setState(138);
			variableDeclarators();
			setState(139);
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_memberDeclaration);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				fieldDeclaration();
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JSFMParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeTypeOrVoid);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JSFMParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JSFMParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JSFMParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JSFMParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			primitiveType();
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(151);
				match(LBRACK);
				setState(152);
				match(RBRACK);
				}
				}
				setState(157);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LPAREN);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FINAL) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				setState(159);
				formalParameterList();
				}
			}

			setState(162);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSFMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSFMParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				formalParameter();
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						match(COMMA);
						setState(166);
						formalParameter();
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(172);
					match(COMMA);
					setState(173);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(179);
				variableModifier();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			typeType();
			setState(186);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JSFMParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(188);
				variableModifier();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			typeType();
			setState(195);
			match(ELLIPSIS);
			setState(196);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JSFMParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JSFMParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JSFMParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JSFMParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IDENTIFIER);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(199);
				match(DOT);
				setState(200);
				match(IDENTIFIER);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JSFMParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSFMParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JSFMParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JSFMParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(JSFMParser.DECIMAL_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FLOAT_LITERAL() { return getToken(JSFMParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSFMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSFMParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			qualifiedName();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(219);
				match(COMMA);
				setState(220);
				qualifiedName();
				}
				}
				setState(225);
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSFMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSFMParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			variableDeclarator();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				variableDeclarator();
				}
				}
				setState(233);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JSFMParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			variableDeclaratorId();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(235);
				match(ASSIGN);
				setState(236);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JSFMParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JSFMParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JSFMParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JSFMParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENTIFIER);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(240);
				match(LBRACK);
				setState(241);
				match(RBRACK);
				}
				}
				setState(246);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableInitializer);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case VOID:
			case IDENTIFIER:
			case LPAREN:
			case BANG:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JSFMParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JSFMParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSFMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSFMParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LBRACE);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
				{
				setState(252);
				variableInitializer();
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						match(COMMA);
						setState(254);
						variableInitializer();
						}
						} 
					}
					setState(259);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(260);
					match(COMMA);
					}
				}

				}
			}

			setState(265);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JSFMParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JSFMParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LBRACE);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << DO) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << SWITCH) | (1L << VOID) | (1L << WHILE) | (1L << INPUT) | (1L << OUTPUT) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
				{
				{
				setState(268);
				blockStatement();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_blockStatement);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				localVariableDeclaration();
				setState(277);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				statement();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(282);
				variableModifier();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			typeType();
			setState(289);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
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
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(JSFMParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JSFMParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(JSFMParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(JSFMParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JSFMParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public TerminalNode SWITCH() { return getToken(JSFMParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(JSFMParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JSFMParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(JSFMParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(JSFMParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(JSFMParser.COLON, 0); }
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(IF);
				setState(293);
				parExpression();
				setState(294);
				statement();
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(295);
					match(ELSE);
					setState(296);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(FOR);
				setState(300);
				match(LPAREN);
				setState(301);
				forControl();
				setState(302);
				match(RPAREN);
				setState(303);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				match(WHILE);
				setState(306);
				parExpression();
				setState(307);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(DO);
				setState(310);
				statement();
				setState(311);
				match(WHILE);
				setState(312);
				parExpression();
				setState(313);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				match(SWITCH);
				setState(316);
				parExpression();
				setState(317);
				match(LBRACE);
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(318);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(324);
					switchLabel();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(RBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				match(RETURN);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
					{
					setState(333);
					expression(0);
					}
				}

				setState(336);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(337);
				match(BREAK);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(338);
					match(IDENTIFIER);
					}
				}

				setState(341);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(342);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(343);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(345);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(346);
				match(COLON);
				setState(347);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(348);
				outputStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(349);
				inputStatement();
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(352);
				switchLabel();
				}
				}
				setState(355); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(358); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(357);
				blockStatement();
				}
				}
				setState(360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << DO) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << SWITCH) | (1L << VOID) | (1L << WHILE) | (1L << INPUT) | (1L << OUTPUT) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(JSFMParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JSFMParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(JSFMParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchLabel);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(CASE);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(363);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(364);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(367);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(DEFAULT);
				setState(369);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JSFMParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JSFMParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forControl);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
					{
					setState(373);
					forInit();
					}
				}

				setState(376);
				match(SEMI);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
					{
					setState(377);
					expression(0);
					}
				}

				setState(380);
				match(SEMI);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
					{
					setState(381);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forInit);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JSFMParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(390);
				variableModifier();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			typeType();
			setState(397);
			variableDeclaratorId();
			setState(398);
			match(COLON);
			setState(399);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(LPAREN);
			setState(402);
			expression(0);
			setState(403);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSFMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSFMParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			expression(0);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(406);
				match(COMMA);
				setState(407);
				expression(0);
				}
				}
				setState(412);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(IDENTIFIER);
			setState(414);
			match(LPAREN);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
				{
				setState(415);
				expressionList();
				}
			}

			setState(418);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(JSFMParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JSFMParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JSFMParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JSFMParser.DEC, 0); }
		public TerminalNode BANG() { return getToken(JSFMParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(JSFMParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JSFMParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JSFMParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JSFMParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JSFMParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JSFMParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JSFMParser.GT, i);
		}
		public TerminalNode LEQ() { return getToken(JSFMParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(JSFMParser.GEQ, 0); }
		public TerminalNode EQUAL() { return getToken(JSFMParser.EQUAL, 0); }
		public TerminalNode NEQ() { return getToken(JSFMParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(JSFMParser.AND, 0); }
		public TerminalNode OR() { return getToken(JSFMParser.OR, 0); }
		public TerminalNode COLON() { return getToken(JSFMParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JSFMParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(JSFMParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JSFMParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JSFMParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JSFMParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JSFMParser.DIV_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(JSFMParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode LBRACK() { return getToken(JSFMParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JSFMParser.RBRACK, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(421);
				primary();
				}
				break;
			case 2:
				{
				setState(422);
				methodCall();
				}
				break;
			case 3:
				{
				setState(423);
				match(LPAREN);
				setState(424);
				typeType();
				setState(425);
				match(RPAREN);
				setState(426);
				expression(13);
				}
				break;
			case 4:
				{
				setState(428);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				expression(11);
				}
				break;
			case 5:
				{
				setState(430);
				match(BANG);
				setState(431);
				expression(10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(434);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(435);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(436);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(437);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(438);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(439);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(440);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(448);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(441);
							match(LT);
							setState(442);
							match(LT);
							}
							break;
						case 2:
							{
							setState(443);
							match(GT);
							setState(444);
							match(GT);
							setState(445);
							match(GT);
							}
							break;
						case 3:
							{
							setState(446);
							match(GT);
							setState(447);
							match(GT);
							}
							break;
						}
						setState(450);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(451);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(452);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(453);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(455);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NEQ) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(456);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(457);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(458);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(459);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(460);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(461);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(462);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(463);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(464);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(465);
						expression(0);
						setState(466);
						match(COLON);
						setState(467);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(469);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(470);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(471);
						expression(1);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(472);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(473);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(476);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(474);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(475);
							methodCall();
							}
							break;
						}
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(478);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(479);
						match(LBRACK);
						setState(480);
						expression(0);
						setState(481);
						match(RBRACK);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(483);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(484);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JSFMParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JSFMParser.CLASS, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primary);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(LPAREN);
				setState(491);
				expression(0);
				setState(492);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				typeTypeOrVoid();
				setState(497);
				match(DOT);
				setState(498);
				match(CLASS);
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

	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(JSFMParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(JSFMParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> QUOTE() { return getTokens(JSFMParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(JSFMParser.QUOTE, i);
		}
		public List<TerminalNode> LetterOrDigit() { return getTokens(JSFMParser.LetterOrDigit); }
		public TerminalNode LetterOrDigit(int i) {
			return getToken(JSFMParser.LetterOrDigit, i);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(INPUT);
			setState(503);
			match(LPAREN);
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case VOID:
			case IDENTIFIER:
			case LPAREN:
			case BANG:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				{
				setState(504);
				expression(0);
				}
				break;
			case QUOTE:
				{
				setState(505);
				match(QUOTE);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LetterOrDigit) {
					{
					{
					setState(506);
					match(LetterOrDigit);
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
				match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(515);
			match(COMMA);
			setState(516);
			match(IDENTIFIER);
			setState(517);
			match(RPAREN);
			setState(518);
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

	public static class OutputStatementContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(JSFMParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(JSFMParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(JSFMParser.QUOTE, i);
		}
		public List<TerminalNode> LetterOrDigit() { return getTokens(JSFMParser.LetterOrDigit); }
		public TerminalNode LetterOrDigit(int i) {
			return getToken(JSFMParser.LetterOrDigit, i);
		}
		public List<TerminalNode> ADD() { return getTokens(JSFMParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JSFMParser.ADD, i);
		}
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterOutputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitOutputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitOutputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_outputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(OUTPUT);
			setState(521);
			match(LPAREN);
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case VOID:
			case IDENTIFIER:
			case LPAREN:
			case BANG:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				{
				setState(522);
				expression(0);
				}
				break;
			case QUOTE:
				{
				setState(523);
				match(QUOTE);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LetterOrDigit) {
					{
					{
					setState(524);
					match(LetterOrDigit);
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(530);
				match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD) {
				{
				{
				{
				setState(533);
				match(ADD);
				}
				setState(543);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case CHAR:
				case FLOAT:
				case INT:
				case VOID:
				case IDENTIFIER:
				case LPAREN:
				case BANG:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case DECIMAL_LITERAL:
				case FLOAT_LITERAL:
				case BOOL_LITERAL:
				case CHAR_LITERAL:
				case STRING_LITERAL:
				case NULL_LITERAL:
					{
					setState(534);
					expression(0);
					}
					break;
				case QUOTE:
					{
					setState(535);
					match(QUOTE);
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LetterOrDigit) {
						{
						{
						setState(536);
						match(LetterOrDigit);
						}
						}
						setState(541);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(542);
					match(QUOTE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			match(RPAREN);
			setState(551);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JSFMParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JSFMParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(JSFMParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JSFMParser.FLOAT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u022e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\3\3\3\3\7\3e\n\3\f\3"+
		"\16\3h\13\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\7\3\7\3\b\3"+
		"\b\5\b\u0087\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u0093"+
		"\n\13\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13"+
		"\r\3\16\3\16\5\16\u00a3\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u00aa\n\17"+
		"\f\17\16\17\u00ad\13\17\3\17\3\17\5\17\u00b1\n\17\3\17\5\17\u00b4\n\17"+
		"\3\20\7\20\u00b7\n\20\f\20\16\20\u00ba\13\20\3\20\3\20\3\20\3\21\7\21"+
		"\u00c0\n\21\f\21\16\21\u00c3\13\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\7\22\u00cc\n\22\f\22\16\22\u00cf\13\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00d7\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00e0\n\26\f"+
		"\26\16\26\u00e3\13\26\3\27\3\27\3\27\7\27\u00e8\n\27\f\27\16\27\u00eb"+
		"\13\27\3\30\3\30\3\30\5\30\u00f0\n\30\3\31\3\31\3\31\7\31\u00f5\n\31\f"+
		"\31\16\31\u00f8\13\31\3\32\3\32\5\32\u00fc\n\32\3\33\3\33\3\33\3\33\7"+
		"\33\u0102\n\33\f\33\16\33\u0105\13\33\3\33\5\33\u0108\n\33\5\33\u010a"+
		"\n\33\3\33\3\33\3\34\3\34\7\34\u0110\n\34\f\34\16\34\u0113\13\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\5\35\u011b\n\35\3\36\7\36\u011e\n\36\f\36\16"+
		"\36\u0121\13\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u012c"+
		"\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0142\n\37\f\37\16\37\u0145\13"+
		"\37\3\37\7\37\u0148\n\37\f\37\16\37\u014b\13\37\3\37\3\37\3\37\3\37\5"+
		"\37\u0151\n\37\3\37\3\37\3\37\5\37\u0156\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0161\n\37\3 \6 \u0164\n \r \16 \u0165\3 \6"+
		" \u0169\n \r \16 \u016a\3!\3!\3!\5!\u0170\n!\3!\3!\3!\5!\u0175\n!\3\""+
		"\3\"\5\"\u0179\n\"\3\"\3\"\5\"\u017d\n\"\3\"\3\"\5\"\u0181\n\"\5\"\u0183"+
		"\n\"\3#\3#\5#\u0187\n#\3$\7$\u018a\n$\f$\16$\u018d\13$\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3&\3&\3&\7&\u019b\n&\f&\16&\u019e\13&\3\'\3\'\3\'\5\'\u01a3"+
		"\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01b3\n(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01c3\n(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01df\n(\3("+
		"\3(\3(\3(\3(\3(\3(\7(\u01e8\n(\f(\16(\u01eb\13(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u01f7\n)\3*\3*\3*\3*\3*\7*\u01fe\n*\f*\16*\u0201\13*\3*\5*"+
		"\u0204\n*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\7+\u0210\n+\f+\16+\u0213\13+\3"+
		"+\5+\u0216\n+\3+\3+\3+\3+\7+\u021c\n+\f+\16+\u021f\13+\3+\5+\u0222\n+"+
		"\7+\u0224\n+\f+\16+\u0227\13+\3+\3+\3+\3,\3,\3,\2\3N-\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\n\3\2\60"+
		"\63\3\2\64\66\3\2\62\63\4\2%&+,\4\2**--\4\2$$\67:\3\2\60\61\6\2\3\3\6"+
		"\6\r\r\20\20\2\u025b\2X\3\2\2\2\4^\3\2\2\2\6i\3\2\2\2\bk\3\2\2\2\nv\3"+
		"\2\2\2\fx\3\2\2\2\16\u0086\3\2\2\2\20\u0088\3\2\2\2\22\u008b\3\2\2\2\24"+
		"\u0092\3\2\2\2\26\u0096\3\2\2\2\30\u0098\3\2\2\2\32\u00a0\3\2\2\2\34\u00b3"+
		"\3\2\2\2\36\u00b8\3\2\2\2 \u00c1\3\2\2\2\"\u00c8\3\2\2\2$\u00d6\3\2\2"+
		"\2&\u00d8\3\2\2\2(\u00da\3\2\2\2*\u00dc\3\2\2\2,\u00e4\3\2\2\2.\u00ec"+
		"\3\2\2\2\60\u00f1\3\2\2\2\62\u00fb\3\2\2\2\64\u00fd\3\2\2\2\66\u010d\3"+
		"\2\2\28\u011a\3\2\2\2:\u011f\3\2\2\2<\u0160\3\2\2\2>\u0163\3\2\2\2@\u0174"+
		"\3\2\2\2B\u0182\3\2\2\2D\u0186\3\2\2\2F\u018b\3\2\2\2H\u0193\3\2\2\2J"+
		"\u0197\3\2\2\2L\u019f\3\2\2\2N\u01b2\3\2\2\2P\u01f6\3\2\2\2R\u01f8\3\2"+
		"\2\2T\u020a\3\2\2\2V\u022b\3\2\2\2XY\5\4\3\2YZ\7\2\2\3Z\3\3\2\2\2[]\5"+
		"\24\13\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2"+
		"ab\7\21\2\2bf\5\66\34\2ce\5\24\13\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2g\5\3\2\2\2hf\3\2\2\2ij\7\f\2\2j\7\3\2\2\2kl\7&\2\2lq\5\n\6\2mn"+
		"\7!\2\2np\5\n\6\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq"+
		"\3\2\2\2tu\7%\2\2u\t\3\2\2\2vw\7\31\2\2w\13\3\2\2\2xy\5\26\f\2yz\7\31"+
		"\2\2z\177\5\32\16\2{|\7\36\2\2|~\7\37\2\2}{\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\5\16\b\2\u0083\r\3\2\2\2\u0084\u0087\5\66\34\2\u0085\u0087\7 \2"+
		"\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\17\3\2\2\2\u0088\u0089"+
		"\5\b\5\2\u0089\u008a\5\f\7\2\u008a\21\3\2\2\2\u008b\u008c\5\30\r\2\u008c"+
		"\u008d\5,\27\2\u008d\u008e\7 \2\2\u008e\23\3\2\2\2\u008f\u0093\5\f\7\2"+
		"\u0090\u0093\5\20\t\2\u0091\u0093\5\22\n\2\u0092\u008f\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0091\3\2\2\2\u0093\25\3\2\2\2\u0094\u0097\5\30\r\2\u0095"+
		"\u0097\7\25\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\27\3\2\2"+
		"\2\u0098\u009d\5V,\2\u0099\u009a\7\36\2\2\u009a\u009c\7\37\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\31\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\32\2\2\u00a1\u00a3\5\34"+
		"\17\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\7\33\2\2\u00a5\33\3\2\2\2\u00a6\u00ab\5\36\20\2\u00a7\u00a8\7!"+
		"\2\2\u00a8\u00aa\5\36\20\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00af\7!\2\2\u00af\u00b1\5 \21\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\5 \21\2\u00b3\u00a6\3\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b7\5\6\4\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd\5"+
		"\60\31\2\u00bd\37\3\2\2\2\u00be\u00c0\5\6\4\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7;\2\2\u00c6"+
		"\u00c7\5\60\31\2\u00c7!\3\2\2\2\u00c8\u00cd\7\31\2\2\u00c9\u00ca\7\"\2"+
		"\2\u00ca\u00cc\7\31\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce#\3\2\2\2\u00cf\u00cd\3\2\2\2"+
		"\u00d0\u00d7\5&\24\2\u00d1\u00d7\5(\25\2\u00d2\u00d7\7?\2\2\u00d3\u00d7"+
		"\7@\2\2\u00d4\u00d7\7>\2\2\u00d5\u00d7\7A\2\2\u00d6\u00d0\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d7%\3\2\2\2\u00d8\u00d9\7<\2\2\u00d9\'\3\2"+
		"\2\2\u00da\u00db\7=\2\2\u00db)\3\2\2\2\u00dc\u00e1\5\"\22\2\u00dd\u00de"+
		"\7!\2\2\u00de\u00e0\5\"\22\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2+\3\2\2\2\u00e3\u00e1\3\2\2\2"+
		"\u00e4\u00e9\5.\30\2\u00e5\u00e6\7!\2\2\u00e6\u00e8\5.\30\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"-\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\5\60\31\2\u00ed\u00ee\7$\2\2"+
		"\u00ee\u00f0\5\62\32\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0/"+
		"\3\2\2\2\u00f1\u00f6\7\31\2\2\u00f2\u00f3\7\36\2\2\u00f3\u00f5\7\37\2"+
		"\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\61\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\5\64\33\2\u00fa"+
		"\u00fc\5N(\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\63\3\2\2\2"+
		"\u00fd\u0109\7\34\2\2\u00fe\u0103\5\62\32\2\u00ff\u0100\7!\2\2\u0100\u0102"+
		"\5\62\32\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108"+
		"\7!\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00fe\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7\35"+
		"\2\2\u010c\65\3\2\2\2\u010d\u0111\7\34\2\2\u010e\u0110\58\35\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\35\2\2\u0115\67\3\2\2"+
		"\2\u0116\u0117\5:\36\2\u0117\u0118\7 \2\2\u0118\u011b\3\2\2\2\u0119\u011b"+
		"\5<\37\2\u011a\u0116\3\2\2\2\u011a\u0119\3\2\2\2\u011b9\3\2\2\2\u011c"+
		"\u011e\5\6\4\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0123\5\30\r\2\u0123\u0124\5,\27\2\u0124;\3\2\2\2\u0125\u0161\5\66\34"+
		"\2\u0126\u0127\7\17\2\2\u0127\u0128\5H%\2\u0128\u012b\5<\37\2\u0129\u012a"+
		"\7\13\2\2\u012a\u012c\5<\37\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2"+
		"\u012c\u0161\3\2\2\2\u012d\u012e\7\16\2\2\u012e\u012f\7\32\2\2\u012f\u0130"+
		"\5B\"\2\u0130\u0131\7\33\2\2\u0131\u0132\5<\37\2\u0132\u0161\3\2\2\2\u0133"+
		"\u0134\7\26\2\2\u0134\u0135\5H%\2\u0135\u0136\5<\37\2\u0136\u0161\3\2"+
		"\2\2\u0137\u0138\7\n\2\2\u0138\u0139\5<\37\2\u0139\u013a\7\26\2\2\u013a"+
		"\u013b\5H%\2\u013b\u013c\7 \2\2\u013c\u0161\3\2\2\2\u013d\u013e\7\24\2"+
		"\2\u013e\u013f\5H%\2\u013f\u0143\7\34\2\2\u0140\u0142\5> \2\u0141\u0140"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0149\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\5@!\2\u0147\u0146\3\2\2"+
		"\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7\35\2\2\u014d\u0161\3\2\2\2"+
		"\u014e\u0150\7\22\2\2\u014f\u0151\5N(\2\u0150\u014f\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0161\7 \2\2\u0153\u0155\7\4\2\2\u0154"+
		"\u0156\7\31\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3"+
		"\2\2\2\u0157\u0161\7 \2\2\u0158\u0159\5N(\2\u0159\u015a\7 \2\2\u015a\u0161"+
		"\3\2\2\2\u015b\u015c\7\31\2\2\u015c\u015d\7)\2\2\u015d\u0161\5<\37\2\u015e"+
		"\u0161\5T+\2\u015f\u0161\5R*\2\u0160\u0125\3\2\2\2\u0160\u0126\3\2\2\2"+
		"\u0160\u012d\3\2\2\2\u0160\u0133\3\2\2\2\u0160\u0137\3\2\2\2\u0160\u013d"+
		"\3\2\2\2\u0160\u014e\3\2\2\2\u0160\u0153\3\2\2\2\u0160\u0158\3\2\2\2\u0160"+
		"\u015b\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161=\3\2\2\2"+
		"\u0162\u0164\5@!\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0169\58\35\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b?\3\2\2\2\u016c\u016f\7\5\2\2\u016d\u0170\5N(\2\u016e\u0170"+
		"\7\31\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2"+
		"\u0171\u0175\7)\2\2\u0172\u0173\7\t\2\2\u0173\u0175\7)\2\2\u0174\u016c"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175A\3\2\2\2\u0176\u0183\5F$\2\u0177\u0179"+
		"\5D#\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\7 \2\2\u017b\u017d\5N(\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u0180\7 \2\2\u017f\u0181\5J&\2\u0180\u017f"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0176\3\2\2\2\u0182"+
		"\u0178\3\2\2\2\u0183C\3\2\2\2\u0184\u0187\5:\36\2\u0185\u0187\5J&\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187E\3\2\2\2\u0188\u018a\5\6\4\2"+
		"\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\5\30\r\2"+
		"\u018f\u0190\5\60\31\2\u0190\u0191\7)\2\2\u0191\u0192\5N(\2\u0192G\3\2"+
		"\2\2\u0193\u0194\7\32\2\2\u0194\u0195\5N(\2\u0195\u0196\7\33\2\2\u0196"+
		"I\3\2\2\2\u0197\u019c\5N(\2\u0198\u0199\7!\2\2\u0199\u019b\5N(\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019dK\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7\31\2\2\u01a0\u01a2"+
		"\7\32\2\2\u01a1\u01a3\5J&\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\7\33\2\2\u01a5M\3\2\2\2\u01a6\u01a7\b(\1\2"+
		"\u01a7\u01b3\5P)\2\u01a8\u01b3\5L\'\2\u01a9\u01aa\7\32\2\2\u01aa\u01ab"+
		"\5\30\r\2\u01ab\u01ac\7\33\2\2\u01ac\u01ad\5N(\17\u01ad\u01b3\3\2\2\2"+
		"\u01ae\u01af\t\2\2\2\u01af\u01b3\5N(\r\u01b0\u01b1\7\'\2\2\u01b1\u01b3"+
		"\5N(\f\u01b2\u01a6\3\2\2\2\u01b2\u01a8\3\2\2\2\u01b2\u01a9\3\2\2\2\u01b2"+
		"\u01ae\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01e9\3\2\2\2\u01b4\u01b5\f\13"+
		"\2\2\u01b5\u01b6\t\3\2\2\u01b6\u01e8\5N(\f\u01b7\u01b8\f\n\2\2\u01b8\u01b9"+
		"\t\4\2\2\u01b9\u01e8\5N(\13\u01ba\u01c2\f\t\2\2\u01bb\u01bc\7&\2\2\u01bc"+
		"\u01c3\7&\2\2\u01bd\u01be\7%\2\2\u01be\u01bf\7%\2\2\u01bf\u01c3\7%\2\2"+
		"\u01c0\u01c1\7%\2\2\u01c1\u01c3\7%\2\2\u01c2\u01bb\3\2\2\2\u01c2\u01bd"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01e8\5N(\n\u01c5"+
		"\u01c6\f\b\2\2\u01c6\u01c7\t\5\2\2\u01c7\u01e8\5N(\t\u01c8\u01c9\f\7\2"+
		"\2\u01c9\u01ca\t\6\2\2\u01ca\u01e8\5N(\b\u01cb\u01cc\f\6\2\2\u01cc\u01cd"+
		"\7.\2\2\u01cd\u01e8\5N(\7\u01ce\u01cf\f\5\2\2\u01cf\u01d0\7/\2\2\u01d0"+
		"\u01e8\5N(\6\u01d1\u01d2\f\4\2\2\u01d2\u01d3\7(\2\2\u01d3\u01d4\5N(\2"+
		"\u01d4\u01d5\7)\2\2\u01d5\u01d6\5N(\4\u01d6\u01e8\3\2\2\2\u01d7\u01d8"+
		"\f\3\2\2\u01d8\u01d9\t\7\2\2\u01d9\u01e8\5N(\3\u01da\u01db\f\22\2\2\u01db"+
		"\u01de\7\"\2\2\u01dc\u01df\7\31\2\2\u01dd\u01df\5L\'\2\u01de\u01dc\3\2"+
		"\2\2\u01de\u01dd\3\2\2\2\u01df\u01e8\3\2\2\2\u01e0\u01e1\f\21\2\2\u01e1"+
		"\u01e2\7\36\2\2\u01e2\u01e3\5N(\2\u01e3\u01e4\7\37\2\2\u01e4\u01e8\3\2"+
		"\2\2\u01e5\u01e6\f\16\2\2\u01e6\u01e8\t\b\2\2\u01e7\u01b4\3\2\2\2\u01e7"+
		"\u01b7\3\2\2\2\u01e7\u01ba\3\2\2\2\u01e7\u01c5\3\2\2\2\u01e7\u01c8\3\2"+
		"\2\2\u01e7\u01cb\3\2\2\2\u01e7\u01ce\3\2\2\2\u01e7\u01d1\3\2\2\2\u01e7"+
		"\u01d7\3\2\2\2\u01e7\u01da\3\2\2\2\u01e7\u01e0\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"O\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7\32\2\2\u01ed\u01ee\5N(\2\u01ee"+
		"\u01ef\7\33\2\2\u01ef\u01f7\3\2\2\2\u01f0\u01f7\5$\23\2\u01f1\u01f7\7"+
		"\31\2\2\u01f2\u01f3\5\26\f\2\u01f3\u01f4\7\"\2\2\u01f4\u01f5\7D\2\2\u01f5"+
		"\u01f7\3\2\2\2\u01f6\u01ec\3\2\2\2\u01f6\u01f0\3\2\2\2\u01f6\u01f1\3\2"+
		"\2\2\u01f6\u01f2\3\2\2\2\u01f7Q\3\2\2\2\u01f8\u01f9\7\27\2\2\u01f9\u0203"+
		"\7\32\2\2\u01fa\u0204\5N(\2\u01fb\u01ff\7#\2\2\u01fc\u01fe\7E\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\7#\2\2\u0203"+
		"\u01fa\3\2\2\2\u0203\u01fb\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7!"+
		"\2\2\u0206\u0207\7\31\2\2\u0207\u0208\7\33\2\2\u0208\u0209\7 \2\2\u0209"+
		"S\3\2\2\2\u020a\u020b\7\30\2\2\u020b\u0215\7\32\2\2\u020c\u0216\5N(\2"+
		"\u020d\u0211\7#\2\2\u020e\u0210\7E\2\2\u020f\u020e\3\2\2\2\u0210\u0213"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0214\u0216\7#\2\2\u0215\u020c\3\2\2\2\u0215\u020d\3\2"+
		"\2\2\u0216\u0225\3\2\2\2\u0217\u0221\7\62\2\2\u0218\u0222\5N(\2\u0219"+
		"\u021d\7#\2\2\u021a\u021c\7E\2\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2"+
		"\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d"+
		"\3\2\2\2\u0220\u0222\7#\2\2\u0221\u0218\3\2\2\2\u0221\u0219\3\2\2\2\u0222"+
		"\u0224\3\2\2\2\u0223\u0217\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228"+
		"\u0229\7\33\2\2\u0229\u022a\7 \2\2\u022aU\3\2\2\2\u022b\u022c\t\t\2\2"+
		"\u022cW\3\2\2\2<^fq\177\u0086\u0092\u0096\u009d\u00a2\u00ab\u00b0\u00b3"+
		"\u00b8\u00c1\u00cd\u00d6\u00e1\u00e9\u00ef\u00f6\u00fb\u0103\u0107\u0109"+
		"\u0111\u011a\u011f\u012b\u0143\u0149\u0150\u0155\u0160\u0165\u016a\u016f"+
		"\u0174\u0178\u017c\u0180\u0182\u0186\u018b\u019c\u01a2\u01b2\u01c2\u01de"+
		"\u01e7\u01e9\u01f6\u01ff\u0203\u0211\u0215\u021d\u0221\u0225";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}