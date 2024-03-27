package com.workout.definition.domain;

import com.workout.common.domain.StringValueObject;
import com.workout.definition.exception.WorkoutDefTypeInvalidException;
import com.workout.definition.exception.WorkoutDefTypeNullOrEmptyException;

import java.util.Arrays;

/**
 * Value object that represents the type of a workout definition.
 * <p>
 * This class extends StringValueObject and encapsulates information about the type of a workout definition.
 */
public class WorkoutDefType extends StringValueObject {

	private static final String[] validTypes = {"WEIGHT_AND_REPS", "DISTANCE_AND_TIME"};

	/**
	 * Constructs a new WorkoutDefType with the specified value.
	 *
	 * @param value The type value.
	 * @throws WorkoutDefTypeNullOrEmptyException If the provided value is null or empty.
	 * @throws WorkoutDefTypeInvalidException     If the provided value is not a valid type.
	 */
	public WorkoutDefType(String value) {
		super(value);
		if (value == null || value.trim().isEmpty()) {
			throw new WorkoutDefTypeNullOrEmptyException();
		}
		if (Arrays.stream(validTypes).noneMatch(value::equalsIgnoreCase)) {
			throw new WorkoutDefTypeInvalidException(value);
		}
	}
}
