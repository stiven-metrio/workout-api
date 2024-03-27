package com.workout.definition.domain;

import com.workout.common.domain.StringValueObject;
import com.workout.definition.exception.WorkoutDefNameLengthException;
import com.workout.definition.exception.WorkoutDefNameNullOrEmptyException;

public class WorkoutDefName extends StringValueObject {

	private static final int MAX_LENGTH = 60;

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
