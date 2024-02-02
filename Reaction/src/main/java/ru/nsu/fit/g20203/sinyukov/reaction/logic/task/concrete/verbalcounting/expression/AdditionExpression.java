package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.concrete.verbalcounting.expression;

public class AdditionExpression extends TwoArgsExpression {

    private static final int OPERATION_PRIORITY = 0;
    private static final String SEPARATOR = " + ";

    public AdditionExpression(Expression leftArg, Expression rightArg) {
        super(leftArg, rightArg, OPERATION_PRIORITY, SEPARATOR,/*leftAssociative = */ false);
    }

    @Override
    public int count() {
        return leftArg.count() + rightArg.count();
    }
}
