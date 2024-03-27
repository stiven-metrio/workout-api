package com.workout;

import lombok.Getter;

@Getter
public class WorkoutDefCreateRequest {
    private String name;
    private String type;
    private String category;
    private String note;
}
