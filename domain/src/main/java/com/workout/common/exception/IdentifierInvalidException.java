package com.workout.common.exception;

import java.io.Serial;

public class IdentifierInvalidException extends TrackerException {

	@Serial
	private static final long serialVersionUID = -8254066944981717416L;

	public IdentifierInvalidException(String identifier) {
		super(IdentifierInvalidException.class.getName(), String.format("The identifier <%s> is malformed", identifier), "TR001", null);
	}
}
