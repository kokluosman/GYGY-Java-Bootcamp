package com.example.assignment11.business.service;


import com.example.assignment11.DTO.teacher.request.CreateTeacher;
import com.example.assignment11.DTO.teacher.request.UpdateTeacher;
import com.example.assignment11.DTO.teacher.response.GetAllTeacher;
import com.example.assignment11.DTO.teacher.response.GetTeacher;
import com.example.assignment11.model.Teacher;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeacherService {
    ResponseEntity<GetTeacher> getTeacher(long id);
    ResponseEntity<List<GetAllTeacher>> getAllTeacher();
    ResponseEntity<Teacher> addTeacher(CreateTeacher createTeacher);
    ResponseEntity<UpdateTeacher> updateTeacher(long id, UpdateTeacher updateTeacher);
    ResponseEntity<String> deleteTeacher(long id);
}
