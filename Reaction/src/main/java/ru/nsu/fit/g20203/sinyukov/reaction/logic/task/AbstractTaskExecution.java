package ru.nsu.fit.g20203.sinyukov.reaction.logic.task;

public abstract class AbstractTaskExecution implements TaskExecution {

    protected final String taskName;

    public AbstractTaskExecution(String taskName) {
        this.taskName = taskName;
    }
}
