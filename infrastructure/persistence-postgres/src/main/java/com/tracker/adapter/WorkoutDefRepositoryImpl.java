package com.tracker.adapter;

import com.tracker.definition.IWorkoutDefRepository;
import com.tracker.definition.domain.WorkoutDef;
import com.tracker.definition.domain.WorkoutDefId;
import com.tracker.definition.domain.WorkoutDefName;
import com.tracker.entity.WorkoutDefEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Adapter: Implementation of the IWorkoutDefRepository interface using JPA repository.
 * <p>
 * This class provides methods for accessing and manipulating workout definitions using JPA repository.
 */
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
	@Transactional(readOnly = true)
	public Optional<WorkoutDef> findByName(WorkoutDefName name) {
		return jpaWorkoutDefRepository.findByName(name.getValue()).map(WorkoutDefEntity::workoutDefEntityToWorkoutDef);
	}

	@Override
	@Transactional
	public void create(WorkoutDef workoutDef) {
		jpaWorkoutDefRepository.save(WorkoutDefEntity.workoutDefToWorkoutDefEntity(workoutDef));
	}
}
