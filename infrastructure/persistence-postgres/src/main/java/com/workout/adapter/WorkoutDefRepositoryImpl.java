package com.workout.adapter;

import com.workout.definition.IWorkoutDefRepository;
import com.workout.definition.domain.WorkoutDef;
import com.workout.definition.domain.WorkoutDefId;
import com.workout.definition.domain.WorkoutDefName;
import com.workout.entity.WorkoutDefEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@AllArgsConstructor
@Component
public class WorkoutDefRepositoryImpl implements IWorkoutDefRepository {

	private final JpaWorkoutDefRepository jpaWorkoutDefRepository;

	@Override
	@Transactional(readOnly = true)
	public Optional<WorkoutDef> findById(WorkoutDefId id) {
		return jpaWorkoutDefRepository.findById(id.getValue()).map(WorkoutDefEntity::workoutDefEntityToWorkoutDef);
	}

	@Override
	public Optional<WorkoutDef> findByName(WorkoutDefName name) {
		return jpaWorkoutDefRepository.findByName(name.getValue()).map(WorkoutDefEntity::workoutDefEntityToWorkoutDef);
	}

	@Override
	public void create(WorkoutDef workoutDef) {
		jpaWorkoutDefRepository.save(WorkoutDefEntity.workoutDefToWorkoutDefEntity(workoutDef));
	}
}
