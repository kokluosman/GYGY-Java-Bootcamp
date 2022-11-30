package com.example.assignment11.DTO.courseStudent.request;

import com.example.assignment11.model.Course;
import com.example.assignment11.model.Student;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCourseStudent {
    private long id;
    @Size(min = 0 ,max = 18)
    @NotBlank
    private int absence;
    @NotBlank
    @Size(min = 0,max = 100)
    private int note;
    private Student student;
    private Course course;
}
