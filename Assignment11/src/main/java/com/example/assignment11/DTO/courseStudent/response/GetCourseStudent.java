package com.example.assignment11.DTO.courseStudent.response;

import com.example.assignment11.model.Course;
import com.example.assignment11.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCourseStudent {
    private int absence;
    private int note;
    private Student student;
    private Course course;
}
