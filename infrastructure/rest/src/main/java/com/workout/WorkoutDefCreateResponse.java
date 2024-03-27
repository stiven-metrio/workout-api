package com.workout;

import java.io.Serial;
import java.io.Serializable;

public record WorkoutDefCreateResponse(String id) implements Serializable {

    @Serial
    private static final long serialVersionUID = -1807410314357528744L;
}
