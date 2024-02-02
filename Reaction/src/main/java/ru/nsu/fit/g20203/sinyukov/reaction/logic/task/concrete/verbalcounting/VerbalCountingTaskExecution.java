package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.concrete.verbalcounting;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import ru.nsu.fit.g20203.sinyukov.reaction.logic.task.AbstractTaskExecution;
import ru.nsu.fit.g20203.sinyukov.reaction.logic.task.TaskResult;
import ru.nsu.fit.g20203.sinyukov.reaction.logic.task.concrete.verbalcounting.expression.Expression;

public class VerbalCountingTaskExecution extends AbstractTaskExecution {

    private static final String TASK_NAME = "Verbal counting";

    private final Expression expr;
    private final int expressionResult;

    private Integer playerResult = null;

    private ReadOnlyBooleanWrapper finished;

    public VerbalCountingTaskExecution(Expression expr) {
        super(TASK_NAME);

        this.expr = expr;
        this.expressionResult = expr.count();
    }

    public void setPlayerResult(int playerResult) {
        this.playerResult = playerResult;
    }

    @Override
    public TaskResult.TaskResultBuilder execute() {
        final boolean successful = null != playerResult && playerResult == expressionResult;
        return TaskResult.TaskResultBuilder.create()
                .taskName(taskName)
                .successful(successful)
                .numberOfPoints(/*TODO*/0);
    }

    @Override
    public ReadOnlyBooleanProperty isFinishedProperty() {
        return finished.getReadOnlyProperty();
    }
}
