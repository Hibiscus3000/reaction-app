package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.config;

public class TaskCreationConfig {

    public static final long ATTEMPTS_UNLIMITED = -1;
    private final int numberOfAttempts;

    public TaskCreationConfig(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }
}
