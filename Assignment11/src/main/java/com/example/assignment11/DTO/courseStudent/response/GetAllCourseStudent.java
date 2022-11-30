package com.example.assignment11.DTO.courseStudent.response;

import com.example.assignment11.model.Course;
import com.example.assignment11.model.Student;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCourseStudent {
    private long id;
    private Student student;
    private Course course;
}
