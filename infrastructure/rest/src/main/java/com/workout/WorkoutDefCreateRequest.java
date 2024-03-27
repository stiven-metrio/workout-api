package com.workout;

import com.workout.definition.application.WorkoutDefCreateCommand;

import java.io.Serial;
import java.io.Serializable;

public record WorkoutDefCreateRequest(
        String name,
        String type,
        String category,
        String note
) implements Serializable {

    @Serial
    private static final long serialVersionUID = -1807410314357528744L;

    public WorkoutDefCreateCommand toCommand() {
        return WorkoutDefCreateMapper.INSTANCE.mapToCommand(this);
    }
}
