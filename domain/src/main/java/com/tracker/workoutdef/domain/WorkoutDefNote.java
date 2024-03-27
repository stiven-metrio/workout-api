package com.tracker.workoutdef.domain;

import com.tracker.common.domain.StringValueObject;
import com.tracker.workoutdef.exception.WorkoutDefNameLengthException;

/**
 * Value object that represents a note of a workout definition.
 * <p>
 * This class extends StringValueObject and encapsulates information about the note of a workout definition.
 */
public class WorkoutDefNote extends StringValueObject {

	private static final int MAX_LENGTH = 300;

	/**
	 * Constructs a new WorkoutDefNote with the specified value.
	 *
	 * @param value The note value.
	 * @throws WorkoutDefNameLengthException If the length of the provided value exceeds the maximum allowed length.
	 */
	public WorkoutDefNote(String value) {
		super(value);
		if (value.length() > MAX_LENGTH) {
			throw new WorkoutDefNameLengthException(value, MAX_LENGTH);
		}
	}
}
