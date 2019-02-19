// Generated from com/semantalytics/antlr/grammar/sparql/sparql10/Sparql10Parser.g4 by ANTLR 4.7.2
package com.semantalytics.antlr.grammar.sparql.sparql10;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Sparql10Parser}.
 */
public interface Sparql10ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(Sparql10Parser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(Sparql10Parser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#prologue}.
	 * @param ctx the parse tree
	 */
	void enterPrologue(Sparql10Parser.PrologueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#prologue}.
	 * @param ctx the parse tree
	 */
	void exitPrologue(Sparql10Parser.PrologueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void enterBaseDecl(Sparql10Parser.BaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void exitBaseDecl(Sparql10Parser.BaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void enterPrefixDecl(Sparql10Parser.PrefixDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void exitPrefixDecl(Sparql10Parser.PrefixDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(Sparql10Parser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(Sparql10Parser.SelectQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#constructQuery}.
	 * @param ctx the parse tree
	 */
	void enterConstructQuery(Sparql10Parser.ConstructQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#constructQuery}.
	 * @param ctx the parse tree
	 */
	void exitConstructQuery(Sparql10Parser.ConstructQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#describeQuery}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(Sparql10Parser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#describeQuery}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(Sparql10Parser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#askQuery}.
	 * @param ctx the parse tree
	 */
	void enterAskQuery(Sparql10Parser.AskQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#askQuery}.
	 * @param ctx the parse tree
	 */
	void exitAskQuery(Sparql10Parser.AskQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void enterDatasetClause(Sparql10Parser.DatasetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void exitDatasetClause(Sparql10Parser.DatasetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#defaultGraphClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultGraphClause(Sparql10Parser.DefaultGraphClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#defaultGraphClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultGraphClause(Sparql10Parser.DefaultGraphClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#namedGraphClause}.
	 * @param ctx the parse tree
	 */
	void enterNamedGraphClause(Sparql10Parser.NamedGraphClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#namedGraphClause}.
	 * @param ctx the parse tree
	 */
	void exitNamedGraphClause(Sparql10Parser.NamedGraphClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#sourceSelector}.
	 * @param ctx the parse tree
	 */
	void enterSourceSelector(Sparql10Parser.SourceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#sourceSelector}.
	 * @param ctx the parse tree
	 */
	void exitSourceSelector(Sparql10Parser.SourceSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(Sparql10Parser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(Sparql10Parser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#solutionModifier}.
	 * @param ctx the parse tree
	 */
	void enterSolutionModifier(Sparql10Parser.SolutionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#solutionModifier}.
	 * @param ctx the parse tree
	 */
	void exitSolutionModifier(Sparql10Parser.SolutionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#limitOffsetClauses}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffsetClauses(Sparql10Parser.LimitOffsetClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#limitOffsetClauses}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffsetClauses(Sparql10Parser.LimitOffsetClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#orderClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderClause(Sparql10Parser.OrderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#orderClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderClause(Sparql10Parser.OrderClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#orderCondition}.
	 * @param ctx the parse tree
	 */
	void enterOrderCondition(Sparql10Parser.OrderConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#orderCondition}.
	 * @param ctx the parse tree
	 */
	void exitOrderCondition(Sparql10Parser.OrderConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(Sparql10Parser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(Sparql10Parser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(Sparql10Parser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(Sparql10Parser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#groupGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupGraphPattern(Sparql10Parser.GroupGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#groupGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupGraphPattern(Sparql10Parser.GroupGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#triplesBlock}.
	 * @param ctx the parse tree
	 */
	void enterTriplesBlock(Sparql10Parser.TriplesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#triplesBlock}.
	 * @param ctx the parse tree
	 */
	void exitTriplesBlock(Sparql10Parser.TriplesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#graphPatternNotTriples}.
	 * @param ctx the parse tree
	 */
	void enterGraphPatternNotTriples(Sparql10Parser.GraphPatternNotTriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#graphPatternNotTriples}.
	 * @param ctx the parse tree
	 */
	void exitGraphPatternNotTriples(Sparql10Parser.GraphPatternNotTriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#optionalGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterOptionalGraphPattern(Sparql10Parser.OptionalGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#optionalGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitOptionalGraphPattern(Sparql10Parser.OptionalGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#graphGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGraphGraphPattern(Sparql10Parser.GraphGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#graphGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGraphGraphPattern(Sparql10Parser.GraphGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#groupOrUnionGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupOrUnionGraphPattern(Sparql10Parser.GroupOrUnionGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#groupOrUnionGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupOrUnionGraphPattern(Sparql10Parser.GroupOrUnionGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(Sparql10Parser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(Sparql10Parser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(Sparql10Parser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(Sparql10Parser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Sparql10Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Sparql10Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(Sparql10Parser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(Sparql10Parser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#constructTemplate}.
	 * @param ctx the parse tree
	 */
	void enterConstructTemplate(Sparql10Parser.ConstructTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#constructTemplate}.
	 * @param ctx the parse tree
	 */
	void exitConstructTemplate(Sparql10Parser.ConstructTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#constructTriples}.
	 * @param ctx the parse tree
	 */
	void enterConstructTriples(Sparql10Parser.ConstructTriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#constructTriples}.
	 * @param ctx the parse tree
	 */
	void exitConstructTriples(Sparql10Parser.ConstructTriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#triplesSameSubject}.
	 * @param ctx the parse tree
	 */
	void enterTriplesSameSubject(Sparql10Parser.TriplesSameSubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#triplesSameSubject}.
	 * @param ctx the parse tree
	 */
	void exitTriplesSameSubject(Sparql10Parser.TriplesSameSubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#propertyListNotEmpty}.
	 * @param ctx the parse tree
	 */
	void enterPropertyListNotEmpty(Sparql10Parser.PropertyListNotEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#propertyListNotEmpty}.
	 * @param ctx the parse tree
	 */
	void exitPropertyListNotEmpty(Sparql10Parser.PropertyListNotEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(Sparql10Parser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(Sparql10Parser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(Sparql10Parser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(Sparql10Parser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(Sparql10Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(Sparql10Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(Sparql10Parser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(Sparql10Parser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#triplesNode}.
	 * @param ctx the parse tree
	 */
	void enterTriplesNode(Sparql10Parser.TriplesNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#triplesNode}.
	 * @param ctx the parse tree
	 */
	void exitTriplesNode(Sparql10Parser.TriplesNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(Sparql10Parser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(Sparql10Parser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(Sparql10Parser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(Sparql10Parser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#graphNode}.
	 * @param ctx the parse tree
	 */
	void enterGraphNode(Sparql10Parser.GraphNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#graphNode}.
	 * @param ctx the parse tree
	 */
	void exitGraphNode(Sparql10Parser.GraphNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#varOrTerm}.
	 * @param ctx the parse tree
	 */
	void enterVarOrTerm(Sparql10Parser.VarOrTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#varOrTerm}.
	 * @param ctx the parse tree
	 */
	void exitVarOrTerm(Sparql10Parser.VarOrTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#varOrIRIref}.
	 * @param ctx the parse tree
	 */
	void enterVarOrIRIref(Sparql10Parser.VarOrIRIrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#varOrIRIref}.
	 * @param ctx the parse tree
	 */
	void exitVarOrIRIref(Sparql10Parser.VarOrIRIrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(Sparql10Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(Sparql10Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#graphTerm}.
	 * @param ctx the parse tree
	 */
	void enterGraphTerm(Sparql10Parser.GraphTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#graphTerm}.
	 * @param ctx the parse tree
	 */
	void exitGraphTerm(Sparql10Parser.GraphTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Sparql10Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Sparql10Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(Sparql10Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(Sparql10Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(Sparql10Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(Sparql10Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#valueLogical}.
	 * @param ctx the parse tree
	 */
	void enterValueLogical(Sparql10Parser.ValueLogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#valueLogical}.
	 * @param ctx the parse tree
	 */
	void exitValueLogical(Sparql10Parser.ValueLogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Sparql10Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Sparql10Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpression(Sparql10Parser.NumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpression(Sparql10Parser.NumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Sparql10Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Sparql10Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Sparql10Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Sparql10Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Sparql10Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Sparql10Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(Sparql10Parser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(Sparql10Parser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#brackettedExpression}.
	 * @param ctx the parse tree
	 */
	void enterBrackettedExpression(Sparql10Parser.BrackettedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#brackettedExpression}.
	 * @param ctx the parse tree
	 */
	void exitBrackettedExpression(Sparql10Parser.BrackettedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#builtInCall}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInCall(Sparql10Parser.BuiltInCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#builtInCall}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInCall(Sparql10Parser.BuiltInCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#regexExpression}.
	 * @param ctx the parse tree
	 */
	void enterRegexExpression(Sparql10Parser.RegexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#regexExpression}.
	 * @param ctx the parse tree
	 */
	void exitRegexExpression(Sparql10Parser.RegexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#iriRefOrFunction}.
	 * @param ctx the parse tree
	 */
	void enterIriRefOrFunction(Sparql10Parser.IriRefOrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#iriRefOrFunction}.
	 * @param ctx the parse tree
	 */
	void exitIriRefOrFunction(Sparql10Parser.IriRefOrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfLiteral(Sparql10Parser.RdfLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#rdfLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfLiteral(Sparql10Parser.RdfLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(Sparql10Parser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(Sparql10Parser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralUnsigned(Sparql10Parser.NumericLiteralUnsignedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralUnsigned(Sparql10Parser.NumericLiteralUnsignedContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralPositive(Sparql10Parser.NumericLiteralPositiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralPositive(Sparql10Parser.NumericLiteralPositiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralNegative(Sparql10Parser.NumericLiteralNegativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralNegative(Sparql10Parser.NumericLiteralNegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(Sparql10Parser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(Sparql10Parser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(Sparql10Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(Sparql10Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#iriRef}.
	 * @param ctx the parse tree
	 */
	void enterIriRef(Sparql10Parser.IriRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#iriRef}.
	 * @param ctx the parse tree
	 */
	void exitIriRef(Sparql10Parser.IriRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(Sparql10Parser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(Sparql10Parser.PrefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Sparql10Parser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(Sparql10Parser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sparql10Parser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(Sparql10Parser.BlankNodeContext ctx);
}