package com.workout.definition.domain;

import com.workout.common.domain.StringValueObject;
import com.workout.definition.exception.WorkoutDefNameLengthException;
import com.workout.definition.exception.WorkoutDefNameNullOrEmptyException;

/**
 * Value object that represents the name of a workout definition.
 * <p>
 * This class extends StringValueObject and encapsulates information about the name of a workout definition.
 */
public class WorkoutDefName extends StringValueObject {

	private static final int MAX_LENGTH = 60;

	/**
	 * Constructs a new WorkoutDefName with the specified value.
	 *
	 * @param value The name value.
	 * @throws WorkoutDefNameNullOrEmptyException If the provided value is null or empty.
	 * @throws WorkoutDefNameLengthException      If the length of the provided value exceeds the maximum allowed length.
	 */
	public WorkoutDefName(String value) {
		super(value);
		if (value == null || value.trim().isEmpty()) {
			throw new WorkoutDefNameNullOrEmptyException();
		}
		if (value.length() > MAX_LENGTH) {
			throw new WorkoutDefNameLengthException(value, MAX_LENGTH);
		}
	}
}
