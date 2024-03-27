package com.tracker;

import com.tracker.definition.IWorkoutDefRepository;
import com.tracker.definition.application.WorkoutDefCreateCommand;
import com.tracker.definition.domain.*;
import com.tracker.definition.exception.WorkoutDefIdExistsException;
import com.tracker.definition.exception.WorkoutDefNameExistsException;

/**
 * Implementation of the {@link WorkoutDefCreate} use case
 */
public class WorkoutDefCreate implements IWorkoutDefCreate {

	private final IWorkoutDefRepository workoutDefRepository;

	/**
	 * Constructs a new WorkoutDefCreate use case instance.
	 *
	 * @param workoutDefRepository The repository for accessing and persisting workout definitions.
	 */
	public WorkoutDefCreate(IWorkoutDefRepository workoutDefRepository) {
		this.workoutDefRepository = workoutDefRepository;
	}

	@Override
	public WorkoutDefId execute(WorkoutDefCreateCommand workoutDefCreateCommand) {
		var id = new WorkoutDefId(workoutDefCreateCommand.getId());
		var name = new WorkoutDefName(workoutDefCreateCommand.getName());
		var type = new WorkoutDefType(workoutDefCreateCommand.getType());
		var category = new WorkoutDefCategory(workoutDefCreateCommand.getCategory());
		var note = new WorkoutDefNote(workoutDefCreateCommand.getNote());

		workoutDefRepository.findById(id).ifPresent(workoutDef -> {
			throw new WorkoutDefIdExistsException(id.getValue());
		});

		workoutDefRepository.findByName(name).ifPresent(workoutDef -> {
			throw new WorkoutDefNameExistsException(name.getValue());
		});

		var workoutDef = new WorkoutDef(id, name, type, category, note);

		workoutDefRepository.create(workoutDef);

		return workoutDef.getId();
	}
}
