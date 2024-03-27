package com.workout;

import com.workout.common.ICommandHandler;
import com.workout.definition.application.WorkoutDefCreateCommand;
import com.workout.definition.domain.WorkoutDefId;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WorkoutDefCreateCommandHandler implements ICommandHandler<WorkoutDefId, WorkoutDefCreateCommand> {

	private final IWorkoutDefCreate workoutDefCreate;

	@Override
	public WorkoutDefId handle(WorkoutDefCreateCommand workoutDefCreateCommand) {
		return workoutDefCreate.execute(workoutDefCreateCommand);
	}
}
