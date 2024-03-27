package com.workout;

import com.workout.definition.application.WorkoutDefCreateCommand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

@Mapper
public interface WorkoutDefCreateMapper {

    WorkoutDefCreateMapper INSTANCE = Mappers.getMapper(WorkoutDefCreateMapper.class);

    @Mapping(target = "id", expression = "java(createUUID())")
    WorkoutDefCreateCommand mapToCommand(WorkoutDefCreateRequest workoutDefCreateRequest);

    default String createUUID(){
        return UUID.randomUUID().toString();
    }
}
