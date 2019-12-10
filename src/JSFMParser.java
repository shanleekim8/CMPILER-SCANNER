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
		STRING=17, SWITCH=18, VOID=19, WHILE=20, INPUT=21, OUTPUT=22, BOOL_LITERAL=23, 
		NULL_LITERAL=24, IDENTIFIER=25, LPAREN=26, RPAREN=27, LBRACE=28, RBRACE=29, 
		LBRACK=30, RBRACK=31, SEMI=32, COMMA=33, DOT=34, QUOTE=35, ASSIGN=36, 
		GT=37, LT=38, BANG=39, QUESTION=40, COLON=41, EQUAL=42, GEQ=43, LEQ=44, 
		NEQ=45, AND=46, OR=47, INC=48, DEC=49, ADD=50, SUB=51, MUL=52, DIV=53, 
		MOD=54, ADD_ASSIGN=55, SUB_ASSIGN=56, MUL_ASSIGN=57, DIV_ASSIGN=58, ELLIPSIS=59, 
		DECIMAL_LITERAL=60, FLOAT_LITERAL=61, CHAR_LITERAL=62, STRING_LITERAL=63, 
		WS=64, COMMENT=65;
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
		RULE_expressionList = 36, RULE_methodCall = 37, RULE_prepostFix = 38, 
		RULE_expression = 39, RULE_methodCallErrors = 40, RULE_primary = 41, RULE_inputStatement = 42, 
		RULE_inputStatementErrors = 43, RULE_outputStatement = 44, RULE_outputStatementErrors = 45, 
		RULE_primitiveType = 46;
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
			"expressionList", "methodCall", "prepostFix", "expression", "methodCallErrors", 
			"primary", "inputStatement", "inputStatementErrors", "outputStatement", 
			"outputStatementErrors", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolin'", "'cease'", "'option'", "'kachow'", "'fiber'", "'megaman'", 
			"'basic'", "'perform'", "'otherwise'", "'ultimate'", "'coke'", "'repeat'", 
			"'upon'", "'techies'", "'main'", "'respond'", "'thread'", "'choices'", 
			"'faceless'", "'during'", "'inputf'", "'outputf'", null, "'null'", null, 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'\"'", 
			"'='", "'>'", "'<'", "'!'", "'?'", "':'", "'=='", "'>='", "'<='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", 
			"'-='", "'*='", "'/='", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "MAIN", "RETURN", 
			"STRING", "SWITCH", "VOID", "WHILE", "INPUT", "OUTPUT", "BOOL_LITERAL", 
			"NULL_LITERAL", "IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "QUOTE", "ASSIGN", "GT", 
			"LT", "BANG", "QUESTION", "COLON", "EQUAL", "GEQ", "LEQ", "NEQ", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "ELLIPSIS", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "WS", "COMMENT"
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
			setState(94);
			mainStatement();
			setState(95);
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
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
				{
				{
				setState(97);
				methodDeclaration();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(MAIN);
			setState(104);
			block();
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
			setState(106);
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
			setState(108);
			match(LT);
			setState(109);
			typeParameter();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				typeParameter();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
			setState(119);
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
			setState(121);
			typeTypeOrVoid();
			setState(122);
			match(IDENTIFIER);
			setState(123);
			formalParameters();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(124);
				match(LBRACK);
				setState(125);
				match(RBRACK);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
			setState(137);
			typeParameters();
			setState(138);
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
			setState(140);
			typeType();
			setState(141);
			variableDeclarators();
			setState(142);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(JSFMParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JSFMParser.IDENTIFIER, i);
		}
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public TerminalNode STRING() { return getToken(JSFMParser.STRING, 0); }
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
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(153);
				primitiveType();
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						match(LBRACK);
						setState(157);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(155);
							match(IDENTIFIER);
							}
							break;
						case SUB:
						case DECIMAL_LITERAL:
							{
							setState(156);
							integerLiteral();
							}
							break;
						case RBRACK:
							break;
						default:
							break;
						}
						setState(159);
						match(RBRACK);
						}
						} 
					}
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(165);
				match(STRING);
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(166);
						match(LBRACK);
						setState(169);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(167);
							match(IDENTIFIER);
							}
							break;
						case SUB:
						case DECIMAL_LITERAL:
							{
							setState(168);
							integerLiteral();
							}
							break;
						case RBRACK:
							break;
						default:
							break;
						}
						setState(171);
						match(RBRACK);
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(179);
			match(LPAREN);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(180);
				formalParameterList();
				}
			}

			setState(183);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				formalParameter();
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(186);
						match(COMMA);
						setState(187);
						formalParameter();
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(193);
					match(COMMA);
					setState(194);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
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
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(200);
				variableModifier();
				}
			}

			setState(203);
			typeType();
			setState(204);
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
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
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
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(206);
				variableModifier();
				}
			}

			setState(209);
			typeType();
			setState(210);
			match(ELLIPSIS);
			setState(211);
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
			setState(213);
			match(IDENTIFIER);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(214);
				match(DOT);
				setState(215);
				match(IDENTIFIER);
				}
				}
				setState(220);
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
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				floatLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(BOOL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(NULL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JSFMParser.DECIMAL_LITERAL, 0); }
		public TerminalNode SUB() { return getToken(JSFMParser.SUB, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(229);
				match(SUB);
				}
			}

			setState(232);
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
		public TerminalNode SUB() { return getToken(JSFMParser.SUB, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(234);
				match(SUB);
				}
			}

			setState(237);
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
			setState(239);
			qualifiedName();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(241);
				qualifiedName();
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
			setState(247);
			variableDeclarator();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(248);
				match(COMMA);
				setState(249);
				variableDeclarator();
				}
				}
				setState(254);
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
			setState(255);
			variableDeclaratorId();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(256);
				match(ASSIGN);
				setState(257);
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
			setState(260);
			match(IDENTIFIER);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(261);
				match(LBRACK);
				setState(262);
				match(RBRACK);
				}
				}
				setState(267);
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
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
			case BOOL_LITERAL:
			case NULL_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case BANG:
			case INC:
			case DEC:
			case SUB:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
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
			setState(272);
			match(LBRACE);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(273);
				variableInitializer();
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(274);
						match(COMMA);
						setState(275);
						variableInitializer();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(281);
					match(COMMA);
					}
				}

				}
			}

			setState(286);
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
			setState(288);
			match(LBRACE);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << DO) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << STRING) | (1L << SWITCH) | (1L << VOID) | (1L << WHILE) | (1L << INPUT) | (1L << OUTPUT) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(289);
				blockStatement();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
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
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				localVariableDeclaration();
				setState(298);
				match(SEMI);
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(299);
					blockStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				statement();
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(303);
					blockStatement();
					}
					break;
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
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
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(308);
				variableModifier();
				}
			}

			setState(311);
			typeType();
			setState(312);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(JSFMParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopStmtContext extends StatementContext {
		public TerminalNode FOR() { return getToken(JSFMParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterForLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitForLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitForLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputStmtContext extends StatementContext {
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public InputStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStmtContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(JSFMParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
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
		public SwitchStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileLoopStmtContext extends StatementContext {
		public TerminalNode DO() { return getToken(JSFMParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JSFMParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public DoWhileLoopStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterDoWhileLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitDoWhileLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitDoWhileLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStmtContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputStmtErrorsContext extends StatementContext {
		public InputStatementErrorsContext inputStatementErrors() {
			return getRuleContext(InputStatementErrorsContext.class,0);
		}
		public InputStmtErrorsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterInputStmtErrors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitInputStmtErrors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitInputStmtErrors(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StatementContext {
		public BlockContext blockLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierStmtContext extends StatementContext {
		public Token identifierLabel;
		public TerminalNode COLON() { return getToken(JSFMParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public IdentifierStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterIdentifierStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitIdentifierStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitIdentifierStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends StatementContext {
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
		public IfElseStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(JSFMParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(JSFMParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterWhileLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitWhileLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitWhileLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputStmtContext extends StatementContext {
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public OutputStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterOutputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitOutputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitOutputStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputStmtErrorsContext extends StatementContext {
		public OutputStatementErrorsContext outputStatementErrors() {
			return getRuleContext(OutputStatementErrorsContext.class,0);
		}
		public OutputStmtErrorsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterOutputStmtErrors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitOutputStmtErrors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitOutputStmtErrors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				((BlockStmtContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(IF);
				setState(316);
				parExpression();
				setState(317);
				statement();
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(318);
					match(ELSE);
					setState(319);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ForLoopStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(FOR);
				setState(323);
				match(LPAREN);
				setState(324);
				forControl();
				setState(325);
				match(RPAREN);
				setState(326);
				statement();
				}
				break;
			case 4:
				_localctx = new WhileLoopStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(WHILE);
				setState(329);
				parExpression();
				setState(330);
				statement();
				}
				break;
			case 5:
				_localctx = new DoWhileLoopStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				match(DO);
				setState(333);
				statement();
				setState(334);
				match(WHILE);
				setState(335);
				parExpression();
				setState(336);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(SWITCH);
				setState(339);
				parExpression();
				setState(340);
				match(LBRACE);
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(341);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(346);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(347);
					switchLabel();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353);
				match(RBRACE);
				}
				break;
			case 7:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				match(RETURN);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(356);
					expression(0);
					}
				}

				setState(359);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(360);
				match(BREAK);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(361);
					match(IDENTIFIER);
					}
				}

				setState(364);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(365);
				expression(0);
				setState(366);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new IdentifierStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(368);
				((IdentifierStmtContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(369);
				match(COLON);
				setState(370);
				statement();
				}
				break;
			case 11:
				_localctx = new OutputStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(371);
				outputStatement();
				}
				break;
			case 12:
				_localctx = new OutputStmtErrorsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(372);
				outputStatementErrors();
				}
				break;
			case 13:
				_localctx = new InputStmtErrorsContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(373);
				inputStatementErrors();
				}
				break;
			case 14:
				_localctx = new InputStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(374);
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
			setState(378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(377);
				switchLabel();
				}
				}
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(383); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(382);
				blockStatement();
				}
				}
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << DO) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << RETURN) | (1L << STRING) | (1L << SWITCH) | (1L << VOID) | (1L << WHILE) | (1L << INPUT) | (1L << OUTPUT) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0) );
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
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(CASE);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(388);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(389);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(392);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(DEFAULT);
				setState(394);
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
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JSFMParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JSFMParser.SEMI, i);
		}
		public PrepostFixContext prepostFix() {
			return getRuleContext(PrepostFixContext.class,0);
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
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(398);
					forInit();
					}
				}

				setState(401);
				match(SEMI);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(402);
					expression(0);
					}
				}

				setState(405);
				match(SEMI);
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
						{
						setState(406);
						expressionList();
						}
					}

					}
					break;
				case 2:
					{
					setState(409);
					prepostFix();
					}
					break;
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
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
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
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
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
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(418);
				variableModifier();
				}
			}

			setState(421);
			typeType();
			setState(422);
			variableDeclaratorId();
			setState(423);
			match(COLON);
			setState(424);
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
			setState(426);
			match(LPAREN);
			setState(427);
			expression(0);
			setState(428);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			expression(0);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					match(COMMA);
					setState(432);
					expression(0);
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
			setState(438);
			match(IDENTIFIER);
			setState(439);
			match(LPAREN);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(440);
				expressionList();
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

	public static class PrepostFixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode INC() { return getToken(JSFMParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JSFMParser.DEC, 0); }
		public PrepostFixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepostFix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterPrepostFix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitPrepostFix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitPrepostFix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepostFixContext prepostFix() throws RecognitionException {
		PrepostFixContext _localctx = new PrepostFixContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_prepostFix);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(IDENTIFIER);
				setState(446);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token bop;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallErrorsContext methodCallErrors() {
			return getRuleContext(MethodCallErrorsContext.class,0);
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
		public TerminalNode BANG() { return getToken(JSFMParser.BANG, 0); }
		public PrepostFixContext prepostFix() {
			return getRuleContext(PrepostFixContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JSFMParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JSFMParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JSFMParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(JSFMParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JSFMParser.SUB, 0); }
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(452);
				primary();
				}
				break;
			case 2:
				{
				setState(453);
				methodCall();
				}
				break;
			case 3:
				{
				setState(454);
				methodCallErrors();
				}
				break;
			case 4:
				{
				setState(455);
				match(LPAREN);
				setState(456);
				typeType();
				setState(457);
				match(RPAREN);
				setState(458);
				expression(12);
				}
				break;
			case 5:
				{
				setState(460);
				match(BANG);
				setState(461);
				expression(11);
				}
				break;
			case 6:
				{
				setState(462);
				prepostFix();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(466);
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
						setState(467);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(468);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(469);
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
						setState(470);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(479);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(472);
							match(LT);
							setState(473);
							match(LT);
							}
							break;
						case 2:
							{
							setState(474);
							match(GT);
							setState(475);
							match(GT);
							setState(476);
							match(GT);
							}
							break;
						case 3:
							{
							setState(477);
							match(GT);
							setState(478);
							match(GT);
							}
							break;
						}
						setState(481);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(482);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(483);
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
						setState(484);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(485);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(486);
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
						setState(487);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(488);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(489);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(490);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(491);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(492);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(493);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(494);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(495);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(496);
						expression(0);
						setState(497);
						match(COLON);
						setState(498);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(500);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(501);
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
						setState(502);
						expression(1);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(503);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(504);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(507);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(505);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(506);
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
						setState(509);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(510);
						match(LBRACK);
						setState(511);
						expression(0);
						setState(512);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class MethodCallErrorsContext extends ParserRuleContext {
		public MethodCallErrorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallErrors; }
	 
		public MethodCallErrorsContext() { }
		public void copyFrom(MethodCallErrorsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MissingRParenMethodCallContext extends MethodCallErrorsContext {
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MissingRParenMethodCallContext(MethodCallErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingRParenMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingRParenMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingRParenMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingLParenMethodCallContext extends MethodCallErrorsContext {
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MissingLParenMethodCallContext(MethodCallErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingLParenMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingLParenMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingLParenMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallErrorsContext methodCallErrors() throws RecognitionException {
		MethodCallErrorsContext _localctx = new MethodCallErrorsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_methodCallErrors);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new MissingLParenMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(IDENTIFIER);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << BOOL_LITERAL) | (1L << NULL_LITERAL) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << BANG) | (1L << INC) | (1L << DEC) | (1L << SUB) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(520);
					expressionList();
					}
				}

				setState(523);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new MissingRParenMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(IDENTIFIER);
				setState(525);
				match(LPAREN);
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(526);
					expressionList();
					}
					break;
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
		enterRule(_localctx, 82, RULE_primary);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(LPAREN);
				setState(532);
				expression(0);
				setState(533);
				match(RPAREN);
				}
				break;
			case BOOL_LITERAL:
			case NULL_LITERAL:
			case SUB:
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				typeTypeOrVoid();
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
		public TerminalNode STRING_LITERAL() { return getToken(JSFMParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(JSFMParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
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
		enterRule(_localctx, 84, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(INPUT);
			setState(541);
			match(LPAREN);
			setState(542);
			match(STRING_LITERAL);
			setState(543);
			match(COMMA);
			setState(544);
			match(IDENTIFIER);
			setState(545);
			match(RPAREN);
			setState(546);
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

	public static class InputStatementErrorsContext extends ParserRuleContext {
		public InputStatementErrorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatementErrors; }
	 
		public InputStatementErrorsContext() { }
		public void copyFrom(InputStatementErrorsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MissingCommaInputContext extends InputStatementErrorsContext {
		public TerminalNode INPUT() { return getToken(JSFMParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSFMParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public MissingCommaInputContext(InputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingCommaInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingCommaInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingCommaInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingIdenInputContext extends InputStatementErrorsContext {
		public TerminalNode INPUT() { return getToken(JSFMParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSFMParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(JSFMParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public MissingIdenInputContext(InputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingIdenInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingIdenInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingIdenInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingRParenInputContext extends InputStatementErrorsContext {
		public TerminalNode INPUT() { return getToken(JSFMParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSFMParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(JSFMParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public MissingRParenInputContext(InputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingRParenInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingRParenInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingRParenInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingLParenInputContext extends InputStatementErrorsContext {
		public TerminalNode INPUT() { return getToken(JSFMParser.INPUT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSFMParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(JSFMParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public MissingLParenInputContext(InputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingLParenInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingLParenInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingLParenInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingStrLitInputContext extends InputStatementErrorsContext {
		public TerminalNode INPUT() { return getToken(JSFMParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(JSFMParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public MissingStrLitInputContext(InputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingStrLitInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingStrLitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingStrLitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingSemiInputContext extends InputStatementErrorsContext {
		public TerminalNode INPUT() { return getToken(JSFMParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JSFMParser.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(JSFMParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JSFMParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public MissingSemiInputContext(InputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingSemiInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingSemiInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingSemiInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementErrorsContext inputStatementErrors() throws RecognitionException {
		InputStatementErrorsContext _localctx = new InputStatementErrorsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_inputStatementErrors);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new MissingLParenInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(INPUT);
				setState(549);
				match(STRING_LITERAL);
				setState(550);
				match(COMMA);
				setState(551);
				match(IDENTIFIER);
				setState(552);
				match(RPAREN);
				setState(553);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new MissingRParenInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				match(INPUT);
				setState(555);
				match(LPAREN);
				setState(556);
				match(STRING_LITERAL);
				setState(557);
				match(COMMA);
				setState(558);
				match(IDENTIFIER);
				setState(559);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new MissingCommaInputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				match(INPUT);
				setState(561);
				match(LPAREN);
				setState(562);
				match(STRING_LITERAL);
				setState(563);
				match(IDENTIFIER);
				setState(564);
				match(RPAREN);
				setState(565);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new MissingIdenInputContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(566);
				match(INPUT);
				setState(567);
				match(LPAREN);
				setState(568);
				match(STRING_LITERAL);
				setState(569);
				match(COMMA);
				setState(570);
				match(RPAREN);
				setState(571);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new MissingStrLitInputContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(572);
				match(INPUT);
				setState(573);
				match(LPAREN);
				setState(574);
				match(COMMA);
				setState(575);
				match(IDENTIFIER);
				setState(576);
				match(RPAREN);
				setState(577);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new MissingSemiInputContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(578);
				match(INPUT);
				setState(579);
				match(LPAREN);
				setState(580);
				match(STRING_LITERAL);
				setState(581);
				match(COMMA);
				setState(582);
				match(IDENTIFIER);
				setState(583);
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

	public static class OutputStatementContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(JSFMParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JSFMParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JSFMParser.IDENTIFIER, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(JSFMParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(JSFMParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(JSFMParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(JSFMParser.DECIMAL_LITERAL, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(JSFMParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(JSFMParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(JSFMParser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(JSFMParser.CHAR_LITERAL, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(JSFMParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(JSFMParser.BOOL_LITERAL, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JSFMParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JSFMParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JSFMParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JSFMParser.RBRACK, i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<MethodCallErrorsContext> methodCallErrors() {
			return getRuleContexts(MethodCallErrorsContext.class);
		}
		public MethodCallErrorsContext methodCallErrors(int i) {
			return getRuleContext(MethodCallErrorsContext.class,i);
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
		enterRule(_localctx, 88, RULE_outputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(OUTPUT);
			setState(587);
			match(LPAREN);
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(588);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(589);
				match(FLOAT_LITERAL);
				}
				break;
			case 3:
				{
				setState(590);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				{
				setState(591);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				{
				setState(592);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				{
				setState(593);
				match(BOOL_LITERAL);
				}
				break;
			case 7:
				{
				setState(594);
				match(IDENTIFIER);
				setState(595);
				match(LBRACK);
				setState(596);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(597);
				match(RBRACK);
				}
				break;
			case 8:
				{
				setState(600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(598);
					methodCall();
					}
					break;
				case 2:
					{
					setState(599);
					methodCallErrors();
					}
					break;
				}
				}
				break;
			}
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD) {
				{
				{
				{
				setState(604);
				match(ADD);
				}
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(605);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(606);
					match(FLOAT_LITERAL);
					}
					break;
				case 3:
					{
					setState(607);
					match(DECIMAL_LITERAL);
					}
					break;
				case 4:
					{
					setState(608);
					match(STRING_LITERAL);
					}
					break;
				case 5:
					{
					setState(609);
					match(CHAR_LITERAL);
					}
					break;
				case 6:
					{
					setState(610);
					match(BOOL_LITERAL);
					}
					break;
				case 7:
					{
					setState(611);
					match(IDENTIFIER);
					setState(612);
					match(LBRACK);
					setState(613);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(614);
					match(RBRACK);
					}
					break;
				case 8:
					{
					setState(617);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(615);
						methodCall();
						}
						break;
					case 2:
						{
						setState(616);
						methodCallErrors();
						}
						break;
					}
					}
					break;
				}
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			match(RPAREN);
			setState(627);
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

	public static class OutputStatementErrorsContext extends ParserRuleContext {
		public OutputStatementErrorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatementErrors; }
	 
		public OutputStatementErrorsContext() { }
		public void copyFrom(OutputStatementErrorsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MissingRParenOutputContext extends OutputStatementErrorsContext {
		public TerminalNode OUTPUT() { return getToken(JSFMParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JSFMParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JSFMParser.IDENTIFIER, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(JSFMParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(JSFMParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(JSFMParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(JSFMParser.DECIMAL_LITERAL, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(JSFMParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(JSFMParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(JSFMParser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(JSFMParser.CHAR_LITERAL, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(JSFMParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(JSFMParser.BOOL_LITERAL, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JSFMParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JSFMParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JSFMParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JSFMParser.RBRACK, i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<MethodCallErrorsContext> methodCallErrors() {
			return getRuleContexts(MethodCallErrorsContext.class);
		}
		public MethodCallErrorsContext methodCallErrors(int i) {
			return getRuleContext(MethodCallErrorsContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JSFMParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JSFMParser.ADD, i);
		}
		public MissingRParenOutputContext(OutputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingRParenOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingRParenOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingRParenOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingSemiOutputContext extends OutputStatementErrorsContext {
		public TerminalNode OUTPUT() { return getToken(JSFMParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JSFMParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JSFMParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JSFMParser.IDENTIFIER, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(JSFMParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(JSFMParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(JSFMParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(JSFMParser.DECIMAL_LITERAL, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(JSFMParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(JSFMParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(JSFMParser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(JSFMParser.CHAR_LITERAL, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(JSFMParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(JSFMParser.BOOL_LITERAL, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JSFMParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JSFMParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JSFMParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JSFMParser.RBRACK, i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<MethodCallErrorsContext> methodCallErrors() {
			return getRuleContexts(MethodCallErrorsContext.class);
		}
		public MethodCallErrorsContext methodCallErrors(int i) {
			return getRuleContext(MethodCallErrorsContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JSFMParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JSFMParser.ADD, i);
		}
		public MissingSemiOutputContext(OutputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingSemiOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingSemiOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingSemiOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingLParenOutputContext extends OutputStatementErrorsContext {
		public TerminalNode OUTPUT() { return getToken(JSFMParser.OUTPUT, 0); }
		public TerminalNode RPAREN() { return getToken(JSFMParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JSFMParser.SEMI, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JSFMParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JSFMParser.IDENTIFIER, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(JSFMParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(JSFMParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(JSFMParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(JSFMParser.DECIMAL_LITERAL, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(JSFMParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(JSFMParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(JSFMParser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(JSFMParser.CHAR_LITERAL, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(JSFMParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(JSFMParser.BOOL_LITERAL, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JSFMParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JSFMParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JSFMParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JSFMParser.RBRACK, i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<MethodCallErrorsContext> methodCallErrors() {
			return getRuleContexts(MethodCallErrorsContext.class);
		}
		public MethodCallErrorsContext methodCallErrors(int i) {
			return getRuleContext(MethodCallErrorsContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JSFMParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JSFMParser.ADD, i);
		}
		public MissingLParenOutputContext(OutputStatementErrorsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).enterMissingLParenOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSFMParserListener ) ((JSFMParserListener)listener).exitMissingLParenOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSFMParserVisitor ) return ((JSFMParserVisitor<? extends T>)visitor).visitMissingLParenOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStatementErrorsContext outputStatementErrors() throws RecognitionException {
		OutputStatementErrorsContext _localctx = new OutputStatementErrorsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_outputStatementErrors);
		int _la;
		try {
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new MissingLParenOutputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(OUTPUT);
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(630);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(631);
					match(FLOAT_LITERAL);
					}
					break;
				case 3:
					{
					setState(632);
					match(DECIMAL_LITERAL);
					}
					break;
				case 4:
					{
					setState(633);
					match(STRING_LITERAL);
					}
					break;
				case 5:
					{
					setState(634);
					match(CHAR_LITERAL);
					}
					break;
				case 6:
					{
					setState(635);
					match(BOOL_LITERAL);
					}
					break;
				case 7:
					{
					setState(636);
					match(IDENTIFIER);
					setState(637);
					match(LBRACK);
					setState(638);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(639);
					match(RBRACK);
					}
					break;
				case 8:
					{
					setState(642);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(640);
						methodCall();
						}
						break;
					case 2:
						{
						setState(641);
						methodCallErrors();
						}
						break;
					}
					}
					break;
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					{
					setState(646);
					match(ADD);
					}
					setState(661);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(647);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(648);
						match(FLOAT_LITERAL);
						}
						break;
					case 3:
						{
						setState(649);
						match(DECIMAL_LITERAL);
						}
						break;
					case 4:
						{
						setState(650);
						match(STRING_LITERAL);
						}
						break;
					case 5:
						{
						setState(651);
						match(CHAR_LITERAL);
						}
						break;
					case 6:
						{
						setState(652);
						match(BOOL_LITERAL);
						}
						break;
					case 7:
						{
						setState(653);
						match(IDENTIFIER);
						setState(654);
						match(LBRACK);
						setState(655);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(656);
						match(RBRACK);
						}
						break;
					case 8:
						{
						setState(659);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
						case 1:
							{
							setState(657);
							methodCall();
							}
							break;
						case 2:
							{
							setState(658);
							methodCallErrors();
							}
							break;
						}
						}
						break;
					}
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(668);
				match(RPAREN);
				setState(669);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new MissingRParenOutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(OUTPUT);
				setState(671);
				match(LPAREN);
				setState(686);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(672);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(673);
					match(FLOAT_LITERAL);
					}
					break;
				case 3:
					{
					setState(674);
					match(DECIMAL_LITERAL);
					}
					break;
				case 4:
					{
					setState(675);
					match(STRING_LITERAL);
					}
					break;
				case 5:
					{
					setState(676);
					match(CHAR_LITERAL);
					}
					break;
				case 6:
					{
					setState(677);
					match(BOOL_LITERAL);
					}
					break;
				case 7:
					{
					setState(678);
					match(IDENTIFIER);
					setState(679);
					match(LBRACK);
					setState(680);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(681);
					match(RBRACK);
					}
					break;
				case 8:
					{
					setState(684);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(682);
						methodCall();
						}
						break;
					case 2:
						{
						setState(683);
						methodCallErrors();
						}
						break;
					}
					}
					break;
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					{
					setState(688);
					match(ADD);
					}
					setState(703);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(689);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(690);
						match(FLOAT_LITERAL);
						}
						break;
					case 3:
						{
						setState(691);
						match(DECIMAL_LITERAL);
						}
						break;
					case 4:
						{
						setState(692);
						match(STRING_LITERAL);
						}
						break;
					case 5:
						{
						setState(693);
						match(CHAR_LITERAL);
						}
						break;
					case 6:
						{
						setState(694);
						match(BOOL_LITERAL);
						}
						break;
					case 7:
						{
						setState(695);
						match(IDENTIFIER);
						setState(696);
						match(LBRACK);
						setState(697);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(698);
						match(RBRACK);
						}
						break;
					case 8:
						{
						setState(701);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(699);
							methodCall();
							}
							break;
						case 2:
							{
							setState(700);
							methodCallErrors();
							}
							break;
						}
						}
						break;
					}
					}
					}
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(710);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new MissingSemiOutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				match(OUTPUT);
				setState(712);
				match(LPAREN);
				setState(727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(713);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(714);
					match(FLOAT_LITERAL);
					}
					break;
				case 3:
					{
					setState(715);
					match(DECIMAL_LITERAL);
					}
					break;
				case 4:
					{
					setState(716);
					match(STRING_LITERAL);
					}
					break;
				case 5:
					{
					setState(717);
					match(CHAR_LITERAL);
					}
					break;
				case 6:
					{
					setState(718);
					match(BOOL_LITERAL);
					}
					break;
				case 7:
					{
					setState(719);
					match(IDENTIFIER);
					setState(720);
					match(LBRACK);
					setState(721);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(722);
					match(RBRACK);
					}
					break;
				case 8:
					{
					setState(725);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(723);
						methodCall();
						}
						break;
					case 2:
						{
						setState(724);
						methodCallErrors();
						}
						break;
					}
					}
					break;
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					{
					setState(729);
					match(ADD);
					}
					setState(744);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(730);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(731);
						match(FLOAT_LITERAL);
						}
						break;
					case 3:
						{
						setState(732);
						match(DECIMAL_LITERAL);
						}
						break;
					case 4:
						{
						setState(733);
						match(STRING_LITERAL);
						}
						break;
					case 5:
						{
						setState(734);
						match(CHAR_LITERAL);
						}
						break;
					case 6:
						{
						setState(735);
						match(BOOL_LITERAL);
						}
						break;
					case 7:
						{
						setState(736);
						match(IDENTIFIER);
						setState(737);
						match(LBRACK);
						setState(738);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==DECIMAL_LITERAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(739);
						match(RBRACK);
						}
						break;
					case 8:
						{
						setState(742);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
						case 1:
							{
							setState(740);
							methodCall();
							}
							break;
						case 2:
							{
							setState(741);
							methodCallErrors();
							}
							break;
						}
						}
						break;
					}
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(751);
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
		enterRule(_localctx, 92, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
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
		case 39:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u02f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\7\3e\n\3\f\3\16\3h\13"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5s\n\5\f\5\16\5v\13\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084\13\7\3\7\3\7"+
		"\3\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13"+
		"\u0096\n\13\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\r\7"+
		"\r\u00a3\n\r\f\r\16\r\u00a6\13\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\r\7\r"+
		"\u00af\n\r\f\r\16\r\u00b2\13\r\5\r\u00b4\n\r\3\16\3\16\5\16\u00b8\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\7\17\u00bf\n\17\f\17\16\17\u00c2\13\17\3\17"+
		"\3\17\5\17\u00c6\n\17\3\17\5\17\u00c9\n\17\3\20\5\20\u00cc\n\20\3\20\3"+
		"\20\3\20\3\21\5\21\u00d2\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22"+
		"\u00db\n\22\f\22\16\22\u00de\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00e6\n\23\3\24\5\24\u00e9\n\24\3\24\3\24\3\25\5\25\u00ee\n\25\3\25\3"+
		"\25\3\26\3\26\3\26\7\26\u00f5\n\26\f\26\16\26\u00f8\13\26\3\27\3\27\3"+
		"\27\7\27\u00fd\n\27\f\27\16\27\u0100\13\27\3\30\3\30\3\30\5\30\u0105\n"+
		"\30\3\31\3\31\3\31\7\31\u010a\n\31\f\31\16\31\u010d\13\31\3\32\3\32\5"+
		"\32\u0111\n\32\3\33\3\33\3\33\3\33\7\33\u0117\n\33\f\33\16\33\u011a\13"+
		"\33\3\33\5\33\u011d\n\33\5\33\u011f\n\33\3\33\3\33\3\34\3\34\7\34\u0125"+
		"\n\34\f\34\16\34\u0128\13\34\3\34\3\34\3\35\3\35\3\35\5\35\u012f\n\35"+
		"\3\35\3\35\5\35\u0133\n\35\5\35\u0135\n\35\3\36\5\36\u0138\n\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0143\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u0159\n\37\f\37\16\37\u015c\13\37\3\37\7\37\u015f"+
		"\n\37\f\37\16\37\u0162\13\37\3\37\3\37\3\37\3\37\5\37\u0168\n\37\3\37"+
		"\3\37\3\37\5\37\u016d\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u017a\n\37\3 \6 \u017d\n \r \16 \u017e\3 \6 \u0182\n "+
		"\r \16 \u0183\3!\3!\3!\5!\u0189\n!\3!\3!\3!\5!\u018e\n!\3\"\3\"\5\"\u0192"+
		"\n\"\3\"\3\"\5\"\u0196\n\"\3\"\3\"\5\"\u019a\n\"\3\"\5\"\u019d\n\"\5\""+
		"\u019f\n\"\3#\3#\5#\u01a3\n#\3$\5$\u01a6\n$\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3&\3&\3&\7&\u01b4\n&\f&\16&\u01b7\13&\3\'\3\'\3\'\5\'\u01bc\n\'\3\'"+
		"\3\'\3(\3(\3(\3(\5(\u01c4\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01d2"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01e2\n)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)"+
		"\u01fe\n)\3)\3)\3)\3)\3)\7)\u0205\n)\f)\16)\u0208\13)\3*\3*\5*\u020c\n"+
		"*\3*\3*\3*\3*\5*\u0212\n*\5*\u0214\n*\3+\3+\3+\3+\3+\3+\3+\5+\u021d\n"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u024b"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u025b\n.\5.\u025d\n."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u026c\n.\5.\u026e\n.\7.\u0270"+
		"\n.\f.\16.\u0273\13.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5"+
		"/\u0285\n/\5/\u0287\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0296"+
		"\n/\5/\u0298\n/\7/\u029a\n/\f/\16/\u029d\13/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\5/\u02af\n/\5/\u02b1\n/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\5/\u02c0\n/\5/\u02c2\n/\7/\u02c4\n/\f/\16/\u02c7\13/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02d8\n/\5/\u02da\n/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02e9\n/\5/\u02eb\n/\7/\u02ed"+
		"\n/\f/\16/\u02f0\13/\3/\5/\u02f3\n/\3\60\3\60\3\60\2\3P\61\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"\2\n\3\2\62\63\3\2\668\3\2\64\65\4\2\'(-.\4\2,,//\4\2&&9<\4\2\33\33>>"+
		"\6\2\3\3\6\6\r\r\20\20\2\u0374\2`\3\2\2\2\4f\3\2\2\2\6l\3\2\2\2\bn\3\2"+
		"\2\2\ny\3\2\2\2\f{\3\2\2\2\16\u0089\3\2\2\2\20\u008b\3\2\2\2\22\u008e"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u0099\3\2\2\2\30\u00b3\3\2\2\2\32\u00b5\3"+
		"\2\2\2\34\u00c8\3\2\2\2\36\u00cb\3\2\2\2 \u00d1\3\2\2\2\"\u00d7\3\2\2"+
		"\2$\u00e5\3\2\2\2&\u00e8\3\2\2\2(\u00ed\3\2\2\2*\u00f1\3\2\2\2,\u00f9"+
		"\3\2\2\2.\u0101\3\2\2\2\60\u0106\3\2\2\2\62\u0110\3\2\2\2\64\u0112\3\2"+
		"\2\2\66\u0122\3\2\2\28\u0134\3\2\2\2:\u0137\3\2\2\2<\u0179\3\2\2\2>\u017c"+
		"\3\2\2\2@\u018d\3\2\2\2B\u019e\3\2\2\2D\u01a2\3\2\2\2F\u01a5\3\2\2\2H"+
		"\u01ac\3\2\2\2J\u01b0\3\2\2\2L\u01b8\3\2\2\2N\u01c3\3\2\2\2P\u01d1\3\2"+
		"\2\2R\u0213\3\2\2\2T\u021c\3\2\2\2V\u021e\3\2\2\2X\u024a\3\2\2\2Z\u024c"+
		"\3\2\2\2\\\u02f2\3\2\2\2^\u02f4\3\2\2\2`a\5\4\3\2ab\7\2\2\3b\3\3\2\2\2"+
		"ce\5\f\7\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2"+
		"ij\7\21\2\2jk\5\66\34\2k\5\3\2\2\2lm\7\f\2\2m\7\3\2\2\2no\7(\2\2ot\5\n"+
		"\6\2pq\7#\2\2qs\5\n\6\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2"+
		"\2\2vt\3\2\2\2wx\7\'\2\2x\t\3\2\2\2yz\7\33\2\2z\13\3\2\2\2{|\5\26\f\2"+
		"|}\7\33\2\2}\u0082\5\32\16\2~\177\7 \2\2\177\u0081\7!\2\2\u0080~\3\2\2"+
		"\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5\16\b\2\u0086\r\3\2\2\2\u0087"+
		"\u008a\5\66\34\2\u0088\u008a\7\"\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\17\3\2\2\2\u008b\u008c\5\b\5\2\u008c\u008d\5\f\7\2\u008d"+
		"\21\3\2\2\2\u008e\u008f\5\30\r\2\u008f\u0090\5,\27\2\u0090\u0091\7\"\2"+
		"\2\u0091\23\3\2\2\2\u0092\u0096\5\f\7\2\u0093\u0096\5\20\t\2\u0094\u0096"+
		"\5\22\n\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\25\3\2\2\2\u0097\u009a\5\30\r\2\u0098\u009a\7\25\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\27\3\2\2\2\u009b\u00a4\5^\60\2\u009c"+
		"\u009f\7 \2\2\u009d\u00a0\7\33\2\2\u009e\u00a0\5&\24\2\u009f\u009d\3\2"+
		"\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\7!\2\2\u00a2\u009c\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b4\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00b0\7\23\2\2\u00a8\u00ab\7 \2\2\u00a9\u00ac\7\33\2\2\u00aa\u00ac\5"+
		"&\24\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\7!\2\2\u00ae\u00a8\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u009b\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b4\31\3\2\2"+
		"\2\u00b5\u00b7\7\34\2\2\u00b6\u00b8\5\34\17\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\35\2\2\u00ba\33\3\2\2"+
		"\2\u00bb\u00c0\5\36\20\2\u00bc\u00bd\7#\2\2\u00bd\u00bf\5\36\20\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4"+
		"\u00c6\5 \21\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c9\5 \21\2\u00c8\u00bb\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\35\3\2\2\2\u00ca\u00cc\5\6\4\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf\5\60\31\2\u00cf"+
		"\37\3\2\2\2\u00d0\u00d2\5\6\4\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5\30\r\2\u00d4\u00d5\7=\2\2\u00d5\u00d6"+
		"\5\60\31\2\u00d6!\3\2\2\2\u00d7\u00dc\7\33\2\2\u00d8\u00d9\7$\2\2\u00d9"+
		"\u00db\7\33\2\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd#\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e6"+
		"\5&\24\2\u00e0\u00e6\5(\25\2\u00e1\u00e6\7@\2\2\u00e2\u00e6\7A\2\2\u00e3"+
		"\u00e6\7\31\2\2\u00e4\u00e6\7\32\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3"+
		"\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e9\7\65\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\'\3"+
		"\2\2\2\u00ec\u00ee\7\65\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0)\3\2\2\2\u00f1\u00f6\5\"\22\2"+
		"\u00f2\u00f3\7#\2\2\u00f3\u00f5\5\"\22\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7+\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fe\5.\30\2\u00fa\u00fb\7#\2\2\u00fb\u00fd\5.\30"+
		"\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff-\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\5\60\31\2\u0102"+
		"\u0103\7&\2\2\u0103\u0105\5\62\32\2\u0104\u0102\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105/\3\2\2\2\u0106\u010b\7\33\2\2\u0107\u0108\7 \2\2\u0108\u010a"+
		"\7!\2\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\61\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0111\5\64\33"+
		"\2\u010f\u0111\5P)\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\63"+
		"\3\2\2\2\u0112\u011e\7\36\2\2\u0113\u0118\5\62\32\2\u0114\u0115\7#\2\2"+
		"\u0115\u0117\5\62\32\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011d\7#\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u0113\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7\37\2\2\u0121\65\3\2\2\2\u0122\u0126\7\36\2\2\u0123\u0125\58\35"+
		"\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\37\2\2"+
		"\u012a\67\3\2\2\2\u012b\u012c\5:\36\2\u012c\u012e\7\"\2\2\u012d\u012f"+
		"\58\35\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0135\3\2\2\2\u0130"+
		"\u0132\5<\37\2\u0131\u0133\58\35\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u0130\3\2\2\2\u0135"+
		"9\3\2\2\2\u0136\u0138\5\6\4\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2"+
		"\u0138\u0139\3\2\2\2\u0139\u013a\5\30\r\2\u013a\u013b\5,\27\2\u013b;\3"+
		"\2\2\2\u013c\u017a\5\66\34\2\u013d\u013e\7\17\2\2\u013e\u013f\5H%\2\u013f"+
		"\u0142\5<\37\2\u0140\u0141\7\13\2\2\u0141\u0143\5<\37\2\u0142\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u017a\3\2\2\2\u0144\u0145\7\16\2\2\u0145"+
		"\u0146\7\34\2\2\u0146\u0147\5B\"\2\u0147\u0148\7\35\2\2\u0148\u0149\5"+
		"<\37\2\u0149\u017a\3\2\2\2\u014a\u014b\7\26\2\2\u014b\u014c\5H%\2\u014c"+
		"\u014d\5<\37\2\u014d\u017a\3\2\2\2\u014e\u014f\7\n\2\2\u014f\u0150\5<"+
		"\37\2\u0150\u0151\7\26\2\2\u0151\u0152\5H%\2\u0152\u0153\7\"\2\2\u0153"+
		"\u017a\3\2\2\2\u0154\u0155\7\24\2\2\u0155\u0156\5H%\2\u0156\u015a\7\36"+
		"\2\2\u0157\u0159\5> \2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0160\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015f\5@!\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2"+
		"\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164"+
		"\7\37\2\2\u0164\u017a\3\2\2\2\u0165\u0167\7\22\2\2\u0166\u0168\5P)\2\u0167"+
		"\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u017a\7\""+
		"\2\2\u016a\u016c\7\4\2\2\u016b\u016d\7\33\2\2\u016c\u016b\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u017a\7\"\2\2\u016f\u0170\5P"+
		")\2\u0170\u0171\7\"\2\2\u0171\u017a\3\2\2\2\u0172\u0173\7\33\2\2\u0173"+
		"\u0174\7+\2\2\u0174\u017a\5<\37\2\u0175\u017a\5Z.\2\u0176\u017a\5\\/\2"+
		"\u0177\u017a\5X-\2\u0178\u017a\5V,\2\u0179\u013c\3\2\2\2\u0179\u013d\3"+
		"\2\2\2\u0179\u0144\3\2\2\2\u0179\u014a\3\2\2\2\u0179\u014e\3\2\2\2\u0179"+
		"\u0154\3\2\2\2\u0179\u0165\3\2\2\2\u0179\u016a\3\2\2\2\u0179\u016f\3\2"+
		"\2\2\u0179\u0172\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u0176\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a=\3\2\2\2\u017b\u017d\5@!\2\u017c"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0181\3\2\2\2\u0180\u0182\58\35\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184?\3\2\2\2"+
		"\u0185\u0188\7\5\2\2\u0186\u0189\5P)\2\u0187\u0189\7\33\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018e\7+\2\2\u018b"+
		"\u018c\7\t\2\2\u018c\u018e\7+\2\2\u018d\u0185\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018eA\3\2\2\2\u018f\u019f\5F$\2\u0190\u0192\5D#\2\u0191\u0190\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\7\"\2\2\u0194"+
		"\u0196\5P)\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2"+
		"\2\u0197\u019c\7\"\2\2\u0198\u019a\5J&\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u019d\5N(\2\u019c\u0199\3\2\2\2\u019c"+
		"\u019b\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u018f\3\2\2\2\u019e\u0191\3\2"+
		"\2\2\u019fC\3\2\2\2\u01a0\u01a3\5:\36\2\u01a1\u01a3\5J&\2\u01a2\u01a0"+
		"\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3E\3\2\2\2\u01a4\u01a6\5\6\4\2\u01a5"+
		"\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\5\30"+
		"\r\2\u01a8\u01a9\5\60\31\2\u01a9\u01aa\7+\2\2\u01aa\u01ab\5P)\2\u01ab"+
		"G\3\2\2\2\u01ac\u01ad\7\34\2\2\u01ad\u01ae\5P)\2\u01ae\u01af\7\35\2\2"+
		"\u01afI\3\2\2\2\u01b0\u01b5\5P)\2\u01b1\u01b2\7#\2\2\u01b2\u01b4\5P)\2"+
		"\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6K\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7\33\2\2\u01b9"+
		"\u01bb\7\34\2\2\u01ba\u01bc\5J&\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\35\2\2\u01beM\3\2\2\2\u01bf\u01c0"+
		"\7\33\2\2\u01c0\u01c4\t\2\2\2\u01c1\u01c2\t\2\2\2\u01c2\u01c4\7\33\2\2"+
		"\u01c3\u01bf\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4O\3\2\2\2\u01c5\u01c6\b"+
		")\1\2\u01c6\u01d2\5T+\2\u01c7\u01d2\5L\'\2\u01c8\u01d2\5R*\2\u01c9\u01ca"+
		"\7\34\2\2\u01ca\u01cb\5\30\r\2\u01cb\u01cc\7\35\2\2\u01cc\u01cd\5P)\16"+
		"\u01cd\u01d2\3\2\2\2\u01ce\u01cf\7)\2\2\u01cf\u01d2\5P)\r\u01d0\u01d2"+
		"\5N(\2\u01d1\u01c5\3\2\2\2\u01d1\u01c7\3\2\2\2\u01d1\u01c8\3\2\2\2\u01d1"+
		"\u01c9\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u0206\3\2"+
		"\2\2\u01d3\u01d4\f\f\2\2\u01d4\u01d5\t\3\2\2\u01d5\u0205\5P)\r\u01d6\u01d7"+
		"\f\13\2\2\u01d7\u01d8\t\4\2\2\u01d8\u0205\5P)\f\u01d9\u01e1\f\n\2\2\u01da"+
		"\u01db\7(\2\2\u01db\u01e2\7(\2\2\u01dc\u01dd\7\'\2\2\u01dd\u01de\7\'\2"+
		"\2\u01de\u01e2\7\'\2\2\u01df\u01e0\7\'\2\2\u01e0\u01e2\7\'\2\2\u01e1\u01da"+
		"\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u0205\5P)\13\u01e4\u01e5\f\t\2\2\u01e5\u01e6\t\5\2\2\u01e6\u0205\5P)"+
		"\n\u01e7\u01e8\f\b\2\2\u01e8\u01e9\t\6\2\2\u01e9\u0205\5P)\t\u01ea\u01eb"+
		"\f\7\2\2\u01eb\u01ec\7\60\2\2\u01ec\u0205\5P)\b\u01ed\u01ee\f\6\2\2\u01ee"+
		"\u01ef\7\61\2\2\u01ef\u0205\5P)\7\u01f0\u01f1\f\4\2\2\u01f1\u01f2\7*\2"+
		"\2\u01f2\u01f3\5P)\2\u01f3\u01f4\7+\2\2\u01f4\u01f5\5P)\4\u01f5\u0205"+
		"\3\2\2\2\u01f6\u01f7\f\3\2\2\u01f7\u01f8\t\7\2\2\u01f8\u0205\5P)\3\u01f9"+
		"\u01fa\f\22\2\2\u01fa\u01fd\7$\2\2\u01fb\u01fe\7\33\2\2\u01fc\u01fe\5"+
		"L\'\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0205\3\2\2\2\u01ff"+
		"\u0200\f\21\2\2\u0200\u0201\7 \2\2\u0201\u0202\5P)\2\u0202\u0203\7!\2"+
		"\2\u0203\u0205\3\2\2\2\u0204\u01d3\3\2\2\2\u0204\u01d6\3\2\2\2\u0204\u01d9"+
		"\3\2\2\2\u0204\u01e4\3\2\2\2\u0204\u01e7\3\2\2\2\u0204\u01ea\3\2\2\2\u0204"+
		"\u01ed\3\2\2\2\u0204\u01f0\3\2\2\2\u0204\u01f6\3\2\2\2\u0204\u01f9\3\2"+
		"\2\2\u0204\u01ff\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207Q\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\7\33\2\2"+
		"\u020a\u020c\5J&\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u0214\7\35\2\2\u020e\u020f\7\33\2\2\u020f\u0211\7\34\2"+
		"\2\u0210\u0212\5J&\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214"+
		"\3\2\2\2\u0213\u0209\3\2\2\2\u0213\u020e\3\2\2\2\u0214S\3\2\2\2\u0215"+
		"\u0216\7\34\2\2\u0216\u0217\5P)\2\u0217\u0218\7\35\2\2\u0218\u021d\3\2"+
		"\2\2\u0219\u021d\5$\23\2\u021a\u021d\7\33\2\2\u021b\u021d\5\26\f\2\u021c"+
		"\u0215\3\2\2\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2"+
		"\2\2\u021dU\3\2\2\2\u021e\u021f\7\27\2\2\u021f\u0220\7\34\2\2\u0220\u0221"+
		"\7A\2\2\u0221\u0222\7#\2\2\u0222\u0223\7\33\2\2\u0223\u0224\7\35\2\2\u0224"+
		"\u0225\7\"\2\2\u0225W\3\2\2\2\u0226\u0227\7\27\2\2\u0227\u0228\7A\2\2"+
		"\u0228\u0229\7#\2\2\u0229\u022a\7\33\2\2\u022a\u022b\7\35\2\2\u022b\u024b"+
		"\7\"\2\2\u022c\u022d\7\27\2\2\u022d\u022e\7\34\2\2\u022e\u022f\7A\2\2"+
		"\u022f\u0230\7#\2\2\u0230\u0231\7\33\2\2\u0231\u024b\7\"\2\2\u0232\u0233"+
		"\7\27\2\2\u0233\u0234\7\34\2\2\u0234\u0235\7A\2\2\u0235\u0236\7\33\2\2"+
		"\u0236\u0237\7\35\2\2\u0237\u024b\7\"\2\2\u0238\u0239\7\27\2\2\u0239\u023a"+
		"\7\34\2\2\u023a\u023b\7A\2\2\u023b\u023c\7#\2\2\u023c\u023d\7\35\2\2\u023d"+
		"\u024b\7\"\2\2\u023e\u023f\7\27\2\2\u023f\u0240\7\34\2\2\u0240\u0241\7"+
		"#\2\2\u0241\u0242\7\33\2\2\u0242\u0243\7\35\2\2\u0243\u024b\7\"\2\2\u0244"+
		"\u0245\7\27\2\2\u0245\u0246\7\34\2\2\u0246\u0247\7A\2\2\u0247\u0248\7"+
		"#\2\2\u0248\u0249\7\33\2\2\u0249\u024b\7\35\2\2\u024a\u0226\3\2\2\2\u024a"+
		"\u022c\3\2\2\2\u024a\u0232\3\2\2\2\u024a\u0238\3\2\2\2\u024a\u023e\3\2"+
		"\2\2\u024a\u0244\3\2\2\2\u024bY\3\2\2\2\u024c\u024d\7\30\2\2\u024d\u025c"+
		"\7\34\2\2\u024e\u025d\7\33\2\2\u024f\u025d\7?\2\2\u0250\u025d\7>\2\2\u0251"+
		"\u025d\7A\2\2\u0252\u025d\7@\2\2\u0253\u025d\7\31\2\2\u0254\u0255\7\33"+
		"\2\2\u0255\u0256\7 \2\2\u0256\u0257\t\b\2\2\u0257\u025d\7!\2\2\u0258\u025b"+
		"\5L\'\2\u0259\u025b\5R*\2\u025a\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u024e\3\2\2\2\u025c\u024f\3\2\2\2\u025c\u0250\3\2"+
		"\2\2\u025c\u0251\3\2\2\2\u025c\u0252\3\2\2\2\u025c\u0253\3\2\2\2\u025c"+
		"\u0254\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0271\3\2\2\2\u025e\u026d\7\64"+
		"\2\2\u025f\u026e\7\33\2\2\u0260\u026e\7?\2\2\u0261\u026e\7>\2\2\u0262"+
		"\u026e\7A\2\2\u0263\u026e\7@\2\2\u0264\u026e\7\31\2\2\u0265\u0266\7\33"+
		"\2\2\u0266\u0267\7 \2\2\u0267\u0268\t\b\2\2\u0268\u026e\7!\2\2\u0269\u026c"+
		"\5L\'\2\u026a\u026c\5R*\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c"+
		"\u026e\3\2\2\2\u026d\u025f\3\2\2\2\u026d\u0260\3\2\2\2\u026d\u0261\3\2"+
		"\2\2\u026d\u0262\3\2\2\2\u026d\u0263\3\2\2\2\u026d\u0264\3\2\2\2\u026d"+
		"\u0265\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u025e\3\2"+
		"\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7\35\2\2\u0275\u0276\7"+
		"\"\2\2\u0276[\3\2\2\2\u0277\u0286\7\30\2\2\u0278\u0287\7\33\2\2\u0279"+
		"\u0287\7?\2\2\u027a\u0287\7>\2\2\u027b\u0287\7A\2\2\u027c\u0287\7@\2\2"+
		"\u027d\u0287\7\31\2\2\u027e\u027f\7\33\2\2\u027f\u0280\7 \2\2\u0280\u0281"+
		"\t\b\2\2\u0281\u0287\7!\2\2\u0282\u0285\5L\'\2\u0283\u0285\5R*\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285\u0287\3\2\2\2\u0286\u0278\3\2"+
		"\2\2\u0286\u0279\3\2\2\2\u0286\u027a\3\2\2\2\u0286\u027b\3\2\2\2\u0286"+
		"\u027c\3\2\2\2\u0286\u027d\3\2\2\2\u0286\u027e\3\2\2\2\u0286\u0284\3\2"+
		"\2\2\u0287\u029b\3\2\2\2\u0288\u0297\7\64\2\2\u0289\u0298\7\33\2\2\u028a"+
		"\u0298\7?\2\2\u028b\u0298\7>\2\2\u028c\u0298\7A\2\2\u028d\u0298\7@\2\2"+
		"\u028e\u0298\7\31\2\2\u028f\u0290\7\33\2\2\u0290\u0291\7 \2\2\u0291\u0292"+
		"\t\b\2\2\u0292\u0298\7!\2\2\u0293\u0296\5L\'\2\u0294\u0296\5R*\2\u0295"+
		"\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0289\3\2"+
		"\2\2\u0297\u028a\3\2\2\2\u0297\u028b\3\2\2\2\u0297\u028c\3\2\2\2\u0297"+
		"\u028d\3\2\2\2\u0297\u028e\3\2\2\2\u0297\u028f\3\2\2\2\u0297\u0295\3\2"+
		"\2\2\u0298\u029a\3\2\2\2\u0299\u0288\3\2\2\2\u029a\u029d\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2"+
		"\2\2\u029e\u029f\7\35\2\2\u029f\u02f3\7\"\2\2\u02a0\u02a1\7\30\2\2\u02a1"+
		"\u02b0\7\34\2\2\u02a2\u02b1\7\33\2\2\u02a3\u02b1\7?\2\2\u02a4\u02b1\7"+
		">\2\2\u02a5\u02b1\7A\2\2\u02a6\u02b1\7@\2\2\u02a7\u02b1\7\31\2\2\u02a8"+
		"\u02a9\7\33\2\2\u02a9\u02aa\7 \2\2\u02aa\u02ab\t\b\2\2\u02ab\u02b1\7!"+
		"\2\2\u02ac\u02af\5L\'\2\u02ad\u02af\5R*\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad"+
		"\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02a2\3\2\2\2\u02b0\u02a3\3\2\2\2\u02b0"+
		"\u02a4\3\2\2\2\u02b0\u02a5\3\2\2\2\u02b0\u02a6\3\2\2\2\u02b0\u02a7\3\2"+
		"\2\2\u02b0\u02a8\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02c5\3\2\2\2\u02b2"+
		"\u02c1\7\64\2\2\u02b3\u02c2\7\33\2\2\u02b4\u02c2\7?\2\2\u02b5\u02c2\7"+
		">\2\2\u02b6\u02c2\7A\2\2\u02b7\u02c2\7@\2\2\u02b8\u02c2\7\31\2\2\u02b9"+
		"\u02ba\7\33\2\2\u02ba\u02bb\7 \2\2\u02bb\u02bc\t\b\2\2\u02bc\u02c2\7!"+
		"\2\2\u02bd\u02c0\5L\'\2\u02be\u02c0\5R*\2\u02bf\u02bd\3\2\2\2\u02bf\u02be"+
		"\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02b3\3\2\2\2\u02c1\u02b4\3\2\2\2\u02c1"+
		"\u02b5\3\2\2\2\u02c1\u02b6\3\2\2\2\u02c1\u02b7\3\2\2\2\u02c1\u02b8\3\2"+
		"\2\2\u02c1\u02b9\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3"+
		"\u02b2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02f3\7\"\2\2\u02c9"+
		"\u02ca\7\30\2\2\u02ca\u02d9\7\34\2\2\u02cb\u02da\7\33\2\2\u02cc\u02da"+
		"\7?\2\2\u02cd\u02da\7>\2\2\u02ce\u02da\7A\2\2\u02cf\u02da\7@\2\2\u02d0"+
		"\u02da\7\31\2\2\u02d1\u02d2\7\33\2\2\u02d2\u02d3\7 \2\2\u02d3\u02d4\t"+
		"\b\2\2\u02d4\u02da\7!\2\2\u02d5\u02d8\5L\'\2\u02d6\u02d8\5R*\2\u02d7\u02d5"+
		"\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02cb\3\2\2\2\u02d9"+
		"\u02cc\3\2\2\2\u02d9\u02cd\3\2\2\2\u02d9\u02ce\3\2\2\2\u02d9\u02cf\3\2"+
		"\2\2\u02d9\u02d0\3\2\2\2\u02d9\u02d1\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da"+
		"\u02ee\3\2\2\2\u02db\u02ea\7\64\2\2\u02dc\u02eb\7\33\2\2\u02dd\u02eb\7"+
		"?\2\2\u02de\u02eb\7>\2\2\u02df\u02eb\7A\2\2\u02e0\u02eb\7@\2\2\u02e1\u02eb"+
		"\7\31\2\2\u02e2\u02e3\7\33\2\2\u02e3\u02e4\7 \2\2\u02e4\u02e5\t\b\2\2"+
		"\u02e5\u02eb\7!\2\2\u02e6\u02e9\5L\'\2\u02e7\u02e9\5R*\2\u02e8\u02e6\3"+
		"\2\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02dc\3\2\2\2\u02ea"+
		"\u02dd\3\2\2\2\u02ea\u02de\3\2\2\2\u02ea\u02df\3\2\2\2\u02ea\u02e0\3\2"+
		"\2\2\u02ea\u02e1\3\2\2\2\u02ea\u02e2\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb"+
		"\u02ed\3\2\2\2\u02ec\u02db\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2"+
		"\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02f3\7\35\2\2\u02f2\u0277\3\2\2\2\u02f2\u02a0\3\2\2\2\u02f2\u02c9\3"+
		"\2\2\2\u02f3]\3\2\2\2\u02f4\u02f5\t\t\2\2\u02f5_\3\2\2\2Wft\u0082\u0089"+
		"\u0095\u0099\u009f\u00a4\u00ab\u00b0\u00b3\u00b7\u00c0\u00c5\u00c8\u00cb"+
		"\u00d1\u00dc\u00e5\u00e8\u00ed\u00f6\u00fe\u0104\u010b\u0110\u0118\u011c"+
		"\u011e\u0126\u012e\u0132\u0134\u0137\u0142\u015a\u0160\u0167\u016c\u0179"+
		"\u017e\u0183\u0188\u018d\u0191\u0195\u0199\u019c\u019e\u01a2\u01a5\u01b5"+
		"\u01bb\u01c3\u01d1\u01e1\u01fd\u0204\u0206\u020b\u0211\u0213\u021c\u024a"+
		"\u025a\u025c\u026b\u026d\u0271\u0284\u0286\u0295\u0297\u029b\u02ae\u02b0"+
		"\u02bf\u02c1\u02c5\u02d7\u02d9\u02e8\u02ea\u02ee\u02f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}