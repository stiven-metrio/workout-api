package com.workout.entity;

import com.workout.definition.domain.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "WORKOUT_DEF")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutDefEntity extends AuditEntity implements Serializable {

	@Id
	@Column(length = 36)
	private String id;

	@Column(nullable = false, length = 60)
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 60)
	private WorkoutDefTypeEnum type;

	@Column(nullable = false, length = 60)
	private String category;

	@Column(length = 300)
	private String note;

	public static WorkoutDef workoutDefEntityToWorkoutDef(WorkoutDefEntity workoutDefEntity) {
		return new WorkoutDef(
			new WorkoutDefId(workoutDefEntity.getId()),
			new WorkoutDefName(workoutDefEntity.getName()),
			new WorkoutDefType(workoutDefEntity.getType().name()),
			new WorkoutDefCategory(workoutDefEntity.getCategory()),
			new WorkoutDefNote(workoutDefEntity.getNote())
		);
	}

	public static WorkoutDefEntity workoutDefToWorkoutDefEntity(WorkoutDef workoutDef) {
		return WorkoutDefEntity.builder()
			.id(workoutDef.getId().getValue())
			.name(workoutDef.getName().getValue())
			.type(WorkoutDefTypeEnum.valueOf(workoutDef.getType().getValue()))
			.category(workoutDef.getCategory().getValue())
			.note(workoutDef.getNote().getValue())
			.build();
	}
}
