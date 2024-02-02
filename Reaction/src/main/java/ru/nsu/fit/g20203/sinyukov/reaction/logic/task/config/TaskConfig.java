package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.config;


public class TaskConfig {

    private final boolean skipable;
    private final boolean failOnSkip;
    private final boolean countable;
    private final long beforeTaskTimeMillis;

    public TaskConfig(boolean skipable,
                      boolean failOnSkip,
                      boolean countable,
                      long beforeTaskTimeMillis) {
        this.skipable = skipable;
        this.failOnSkip = failOnSkip;
        this.countable = countable;
        this.beforeTaskTimeMillis = beforeTaskTimeMillis;
    }

    public boolean isSkipable() {
        return skipable;
    }

    public boolean isFailOnSkip() {
        return failOnSkip;
    }

    public boolean isCountable() {
        return countable;
    }

    public long getBeforeTaskTimeMillis() {
        return beforeTaskTimeMillis;
    }
}
