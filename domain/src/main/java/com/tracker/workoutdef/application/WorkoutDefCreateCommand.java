package com.tracker.workoutdef.application;

import com.tracker.workoutdef.domain.WorkoutDefId;
import com.tracker.common.ICommand;
import lombok.Getter;
import lombok.Setter;

/**
 * Command class for creating a new workout definition.
 * <p>
 * This class represents a command that contains information necessary for creating a new workout definition.
 * It implements the ICommand interface, indicating that it can be executed to perform the creation action.
 */
@Getter
@Setter
public class WorkoutDefCreateCommand implements ICommand<WorkoutDefId> {
	private String id;
	private String name;
	private String type;
	private String category;
	private String note;
}
