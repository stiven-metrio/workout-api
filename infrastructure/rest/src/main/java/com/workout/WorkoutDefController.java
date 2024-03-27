package com.workout;

import com.cloudogu.cb.CommandBus;
import com.workout.definition.application.WorkoutDefCreateCommand;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class WorkoutDefController {

	private final ModelMapper modelMapper;
	private final CommandBus commandBus;

	public WorkoutDefController(ModelMapper modelMapper, CommandBus commandBus) {
		this.modelMapper = modelMapper;
        this.commandBus = commandBus;
    }

	@PostMapping(value = "/workout-def", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WorkoutDefCreateResponse> createWorkoutDef(@RequestBody WorkoutDefCreateRequest workoutDefCreateRequest) {

		var workoutDefCreateCommand = modelMapper.map(workoutDefCreateRequest, WorkoutDefCreateCommand.class);
		workoutDefCreateCommand.setId(UUID.randomUUID().toString());

		var workoutDefId = commandBus.execute(workoutDefCreateCommand);
		return new ResponseEntity<>(new WorkoutDefCreateResponse(workoutDefId.getValue()), HttpStatus.CREATED);
	}
}
