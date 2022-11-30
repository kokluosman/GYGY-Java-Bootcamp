package com.example.assignment11.DTO.course.request;

import com.example.assignment11.model.Subject;
import com.example.assignment11.model.Teacher;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCourseRequest {
    private long id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String name;
    private Teacher teacher;
    private List<Subject> subjects;
}
