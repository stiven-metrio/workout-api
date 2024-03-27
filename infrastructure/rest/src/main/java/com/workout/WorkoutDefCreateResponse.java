package com.workout;

import java.io.Serial;
import java.io.Serializable;

/**
 * Response object for indicating the successful creation of a workout definition.
 * <p>
 * This record represents a response object containing the ID of the newly created workout definition.
 */
public record WorkoutDefCreateResponse(String id) implements Serializable {

	@Serial
	private static final long serialVersionUID = -1807410314357528744L;
}
