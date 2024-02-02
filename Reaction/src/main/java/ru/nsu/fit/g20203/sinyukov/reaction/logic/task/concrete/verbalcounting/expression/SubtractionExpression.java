package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.concrete.verbalcounting.expression;

public class SubtractionExpression extends TwoArgsExpression {

    private static final int OPERATION_PRIORITY = 2;
    private static final String SEPARATOR = " - ";

    public SubtractionExpression(Expression leftArg, Expression rightArg) {
        super(leftArg, rightArg, OPERATION_PRIORITY, SEPARATOR,/*leftAssociative = */ true);
    }

    @Override
    public int count() {
        return leftArg.count() - rightArg.count();
    }
}
