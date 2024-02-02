package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.config;

// TODO maybe delete
public class TimerConfig {

    public static final long TIME_UNLIMITED = -1;

    private final boolean timeCounts;
    private final long timeLimitMillis;

    public TimerConfig(boolean timeCounts, long timeLimitMillis) {
        this.timeCounts = timeCounts;
        this.timeLimitMillis = timeLimitMillis;
    }

    public boolean isTimeCounts() {
        return timeCounts;
    }

    public long getTimeLimitMillis() {
        return timeLimitMillis;
    }
}
