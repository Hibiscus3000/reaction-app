package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.config;

public class TaskConfig {

    public static final long TIME_UNLIMITED = -1;
    public static final long ATTEMPTS_UNLIMITED = -1;

    private final boolean skipable;
    private final boolean failOnSkip;
    private final boolean countable;
    private final long beforeTaskTimeMillis;

    private final boolean timeCounts;
    private final long timeLimitMillis;

    private final int numberOfAttempts;

    public TaskConfig(boolean skipable,
                      boolean failOnSkip, 
                      boolean countable,
                      long beforeTaskTimeMillis,
                      boolean timeCounts,
                      long timeLimitMillis,
                      int numberOfAttempts) {
        this.skipable = skipable;
        this.failOnSkip = failOnSkip;
        this.countable = countable;
        this.beforeTaskTimeMillis = beforeTaskTimeMillis;
        this.timeCounts = timeCounts;
        this.timeLimitMillis = timeLimitMillis;
        this.numberOfAttempts = numberOfAttempts;
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

    public boolean isTimeCounts() {
        return timeCounts;
    }

    public long getTimeLimitMillis() {
        return timeLimitMillis;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }
}
