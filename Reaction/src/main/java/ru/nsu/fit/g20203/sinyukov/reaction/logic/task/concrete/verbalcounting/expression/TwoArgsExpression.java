package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.concrete.verbalcounting.expression;

public abstract class TwoArgsExpression implements Expression {

    protected final Expression leftArg;
    protected final Expression rightArg;
    private final int operationPriority;
    private final String separator;
    private final boolean leftAssociative;

    public TwoArgsExpression(Expression leftArg,
                             Expression rightArg,
                             int operationPriority,
                             String separator,
                             boolean leftAssociative) {
        this.leftArg = leftArg;
        this.rightArg = rightArg;
        this.operationPriority = operationPriority;
        this.separator = separator;
        this.leftAssociative = leftAssociative;
    }

    @Override
    public String getStringRepresentation(int upperOperationPriority) {
        return wrapWithBrackets(leftArg.getStringRepresentation(operationPriority)
                        + separator
                        + rightArg.getStringRepresentation(operationPriority
                        + (leftAssociative ? 1 : 0)),
                upperOperationPriority);
    }

    private String wrapWithBrackets(String str, int upperOperationPriority) {
        if (operationPriority < upperOperationPriority) {
            return "(" + str + ")";
        }
        return str;
    }
}
