package com.example.assignment11.business.service;

import com.example.assignment11.DTO.student.request.CreateStudent;
import com.example.assignment11.DTO.student.request.UpdateStudent;
import com.example.assignment11.DTO.student.response.GetAllStudent;
import com.example.assignment11.DTO.student.response.GetStudent;
import com.example.assignment11.model.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
    ResponseEntity<GetStudent> getStudent(long id);
    ResponseEntity<List<GetAllStudent>> getAllStudent();
    ResponseEntity<Student> addStudent(CreateStudent createStudent);
    ResponseEntity<UpdateStudent> updateStudent(long id, UpdateStudent updateStudent);
    ResponseEntity<String> deleteTeacher(long id);
}
