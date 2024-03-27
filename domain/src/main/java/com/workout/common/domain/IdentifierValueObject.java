package com.workout.common.domain;

import com.workout.common.exception.IdentifierInvalidException;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
public abstract class IdentifierValueObject implements Serializable {

	@Serial
	private static final long serialVersionUID = 608305153118801124L;

	protected String value;

	protected IdentifierValueObject(String value) {
		validateUuid(value);
		this.value = value;
	}

	private void validateUuid(String value) {
		if (value == null) {
			throw new IdentifierInvalidException(null);
		}
		try {
			UUID.fromString(value);
		} catch(IllegalArgumentException ex) {
			throw new IdentifierInvalidException(value);
		}
	}
}
