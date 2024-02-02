package ru.nsu.fit.g20203.sinyukov.reaction.logic.task;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public record TaskResult(boolean successful,
                         long numberOfPoints,
                         long timeSpentMillis,
                         String taskName) {

    public static class TaskResultBuilder {

        private TaskResultBuilder() {

        }

        public static TaskResultBuilder create() {
            return new TaskResultBuilder();
        }

        public TaskResult build() {
            if (!isValid()) {
                throw TaskResultBuildException.createException(successful,
                        numberOfPoints, timeSpentMillis, taskName);
            }
            return new TaskResult(successful,
                    numberOfPoints, timeSpentMillis, taskName);
        }

        private Boolean successful;
        private Long numberOfPoints;
        private Long timeSpentMillis;
        private String taskName;

        public TaskResultBuilder successful(boolean successful) {
            this.successful = successful;
            return this;
        }

        public TaskResultBuilder numberOfPoints(long numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }

        public TaskResultBuilder timeSpentMillis(long timeSpentMillis) {
            this.timeSpentMillis = timeSpentMillis;
            return this;
        }

        public TaskResultBuilder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        private boolean isValid() {
            return null != successful && null != numberOfPoints
                    && null != timeSpentMillis && null != taskName;
        }

        public static class TaskResultBuildException extends RuntimeException {

            public TaskResultBuildException(String message) {
                super(message);
            }

            public static @NotNull TaskResultBuildException createException(Boolean successful, Long numberOfPoints,
                                                                            Long timeSpentMillis, String taskName) {
                final List<String> unsetFields = new ArrayList<>();
                if (null == successful) {
                    unsetFields.add("task success");
                }
                if (null == numberOfPoints) {
                    unsetFields.add("number of points");
                }
                if (null == timeSpentMillis) {
                    unsetFields.add("spent time");
                }
                if (null == taskName) {
                    unsetFields.add("task name");
                }
                final String unsetFieldsJoined = String.join(", ", unsetFields);

                return new TaskResultBuildException(unsetFieldsJoined.substring(0, 1).toUpperCase()
                        + unsetFieldsJoined.substring(1) + " were not set");
            }
        }
    }
}
