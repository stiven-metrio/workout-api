package com.workout.common.exception;

import java.io.Serial;

/**
 * Exception thrown when an identifier is found to be invalid.
 * <p>
 * This exception is used to indicate that an identifier does not conform to the expected format.
 */
public class IdentifierInvalidException extends TrackerException {

	@Serial
	private static final long serialVersionUID = -8254066944981717416L;

	/**
	 * Constructs a new IdentifierInvalidException with the provided identifier.
	 *
	 * @param identifier The identifier that is invalid.
	 */
	public IdentifierInvalidException(String identifier) {
		super(IdentifierInvalidException.class.getName(), String.format("The identifier <%s> is malformed", identifier), "TR001", null);
	}
}
