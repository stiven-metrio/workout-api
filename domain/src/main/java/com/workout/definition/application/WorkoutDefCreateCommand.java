package com.workout.definition.application;

import com.workout.definition.domain.WorkoutDefId;
import com.workout.common.ICommand;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkoutDefCreateCommand implements ICommand<WorkoutDefId> {
	private String id;
	private String name;
	private String type;
	private String category;
	private String note;
}
