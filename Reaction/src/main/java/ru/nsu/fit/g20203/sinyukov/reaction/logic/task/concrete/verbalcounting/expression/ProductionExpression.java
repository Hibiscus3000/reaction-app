package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.concrete.verbalcounting.expression;

public class ProductionExpression extends TwoArgsExpression {

    private static final int OPERATION_PRIORITY = 2;
    private static final String SEPARATOR = " * ";

    public ProductionExpression(Expression leftArg, Expression rightArg) {
        super(leftArg, rightArg, OPERATION_PRIORITY, SEPARATOR,/*leftAssociative = */ false);
    }

    @Override
    public int count() {
        return leftArg.count() * rightArg.count();
    }
}
