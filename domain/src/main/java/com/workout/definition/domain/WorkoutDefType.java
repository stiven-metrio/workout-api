package com.workout.definition.domain;

import com.workout.common.domain.StringValueObject;
import com.workout.definition.exception.WorkoutDefTypeInvalidException;
import com.workout.definition.exception.WorkoutDefTypeNullOrEmptyException;

import java.util.Arrays;

public class WorkoutDefType extends StringValueObject {

	private static final String[] validTypes = {"WEIGHT_AND_REPS", "DISTANCE_AND_TIME"};

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
