package ru.nsu.fit.g20203.sinyukov.reaction.logic.task;

import javafx.beans.property.ReadOnlyBooleanProperty;

public interface TaskExecution {

    TaskResult.TaskResultBuilder execute();

    ReadOnlyBooleanProperty isFinishedProperty();
}
