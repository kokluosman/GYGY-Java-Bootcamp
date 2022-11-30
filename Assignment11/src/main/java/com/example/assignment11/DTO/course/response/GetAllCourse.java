package com.example.assignment11.DTO.course.response;

import com.example.assignment11.model.Subject;
import com.example.assignment11.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCourse {

    private long id;
    private String name;
    private Teacher teacher;
    private List<Subject> subjects;

}
