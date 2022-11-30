package com.example.assignment11.business.service;

import com.example.assignment11.DTO.courseStudent.request.CreateCourseStudent;
import com.example.assignment11.DTO.courseStudent.request.UpdateCourseStudent;
import com.example.assignment11.DTO.courseStudent.response.GetAllCourseStudent;
import com.example.assignment11.DTO.courseStudent.response.GetCourseStudent;
import com.example.assignment11.model.CourseStudent;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseStudentService {

    ResponseEntity<GetCourseStudent> getCourseStudent(long id);
    ResponseEntity<List<GetAllCourseStudent>> getAllCourseStudent();
    ResponseEntity<CourseStudent> addCourseStudent(CreateCourseStudent createCourseStudent);
    ResponseEntity<UpdateCourseStudent> updateCourseStudent(long id, UpdateCourseStudent updateCourseStudent);
    ResponseEntity<String> deleteCourseStudent(long id);

}
