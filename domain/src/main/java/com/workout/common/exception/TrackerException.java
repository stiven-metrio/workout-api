package com.workout.common.exception;

import com.workout.common.domain.TrackerError;
import lombok.Getter;

import java.io.Serial;

@Getter

public class TrackerException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 8081860463641545209L;

	private final TrackerError error;

	public TrackerException(String title, String description, String code, String data) {
		this.error = new TrackerError(title, description, code, data);
	}
}
