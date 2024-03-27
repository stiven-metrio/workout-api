package com.workout.definition.domain;

import com.workout.common.domain.StringValueObject;
import com.workout.definition.exception.WorkoutDefNameLengthException;

public class WorkoutDefNote extends StringValueObject {

	private static final int MAX_LENGTH = 300;

	public WorkoutDefNote(String value) {
		super(value);
		if (value.length() > MAX_LENGTH) {
			throw new WorkoutDefNameLengthException(value, MAX_LENGTH);
		}
	}
}
