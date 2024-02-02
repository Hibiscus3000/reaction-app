package ru.nsu.fit.g20203.sinyukov.reaction.logic.task.concrete.verbalcounting.expression;

public interface Expression {

    int count();

    String getStringRepresentation(int upperOperationPriority);
}
