package com.workout;

import com.workout.definition.application.WorkoutDefCreateCommand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

/**
 * Mapper interface for mapping between request and command objects for creating workout definitions.
 * <p>
 * This interface defines methods for mapping a request object to a command object.
 */
@Mapper
public interface WorkoutDefCreateMapper {

	WorkoutDefCreateMapper INSTANCE = Mappers.getMapper(WorkoutDefCreateMapper.class);

	/**
	 * Maps a WorkoutDefCreateRequest object to a WorkoutDefCreateCommand object.
	 *
	 * @param workoutDefCreateRequest The request object containing information for creating a workout definition.
	 * @return The corresponding command object.
	 */
	@Mapping(target = "id", expression = "java(createUUID())")
	WorkoutDefCreateCommand mapToCommand(WorkoutDefCreateRequest workoutDefCreateRequest);

	/**
	 * Generates a UUID as a string.
	 *
	 * @return The generated UUID string.
	 */
	default String createUUID() {
		return UUID.randomUUID().toString();
	}
}
