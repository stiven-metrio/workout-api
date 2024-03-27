package com.tracker;

import com.tracker.common.ICommandHandler;
import com.tracker.definition.application.WorkoutDefCreateCommand;
import com.tracker.definition.domain.WorkoutDefId;
import lombok.RequiredArgsConstructor;

/**
 * Command handler for creating a new workout definition.
 * <p>
 * This class implements the ICommandHandler interface to handle the creation command for workout definitions.
 */
@RequiredArgsConstructor
public class WorkoutDefCreateCommandHandler implements ICommandHandler<WorkoutDefId, WorkoutDefCreateCommand> {

	private final IWorkoutDefCreate workoutDefCreate;

	/**
	 * Handles the command to create a new workout definition.
	 *
	 * @param workoutDefCreateCommand The command containing information for creating the workout definition.
	 * @return The ID of the newly created workout definition.
	 */
	@Override
	public WorkoutDefId handle(WorkoutDefCreateCommand workoutDefCreateCommand) {
		return workoutDefCreate.execute(workoutDefCreateCommand);
	}
}