package com.workout.common.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@AllArgsConstructor
public class StringValueObject implements Serializable {

	@Serial
	private static final long serialVersionUID = 4656445846130691079L;

	protected final String value;

	@Override
	public String toString() {
		return null == value ? "" : value;
	}
}
