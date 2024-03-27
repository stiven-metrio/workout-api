package com.workout;

import com.workout.definition.IWorkoutDefRepository;
import com.workout.definition.application.WorkoutDefCreateCommand;
import com.workout.definition.domain.*;
import com.workout.definition.exception.WorkoutDefIdExistsException;
import com.workout.definition.exception.WorkoutDefNameExistsException;

public class WorkoutDefCreate implements IWorkoutDefCreate {

	private final IWorkoutDefRepository workoutDefRepository;

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
