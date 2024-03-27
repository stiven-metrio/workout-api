package com.workout.common.domain;

import lombok.AllArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
public class TrackerError implements Serializable {

	@Serial
	private static final long serialVersionUID = -8777548088292643421L;

	private final String error;
	private final String description;
	private final String code;
	private final String data;
}
