package com.workout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutDefinitionController {

    @GetMapping
    public String create() {
        return "Success!";
    }
}
