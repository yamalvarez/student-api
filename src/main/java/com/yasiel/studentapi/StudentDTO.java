package com.yasiel.studentapi;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 1, message = "Grade must be at least 1")
    @Max(value = 12, message = "Grade must be at most 12")
    private int grade;

    @Min(value = 0, message = "Score must be at least 0")
    @Max(value = 100, message = "Score must be at most 100")
    private double score;


}
