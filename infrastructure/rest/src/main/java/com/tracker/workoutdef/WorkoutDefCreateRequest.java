package com.tracker.workoutdef;

import com.tracker.workoutdef.application.WorkoutDefCreateCommand;

import java.io.Serial;
import java.io.Serializable;

/**
 * Request object for creating a workout definition.
 * <p>
 * This record represents a request object containing information needed to create a workout definition.
 */
public record WorkoutDefCreateRequest(
	String name,
	String type,
	String category,
	String note
) implements Serializable {

	@Serial
	private static final long serialVersionUID = -1807410314357528744L;

	/**
	 * Converts the request object to a command object for creating a workout definition.
	 *
	 * @return The corresponding command object.
	 */
	public WorkoutDefCreateCommand toCommand() {
		return WorkoutDefCreateMapper.INSTANCE.mapToCommand(this);
	}
}
