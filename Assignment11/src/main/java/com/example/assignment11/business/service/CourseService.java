package com.example.assignment11.business.service;

import com.example.assignment11.DTO.course.request.CreateCourseRequest;
import com.example.assignment11.DTO.course.request.UpdateCourseRequest;
import com.example.assignment11.DTO.course.response.GetAllCourse;
import com.example.assignment11.DTO.course.response.GetCourse;
import com.example.assignment11.model.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CourseService {
    ResponseEntity<GetCourse> getCourse(long id);
    ResponseEntity<List<GetAllCourse>> getAllCourse();
    ResponseEntity<Course> addCourse(CreateCourseRequest createCourseRequest);
    ResponseEntity<UpdateCourseRequest> updateCourse(long id,UpdateCourseRequest createCourseRequest);
    ResponseEntity<String> deleteCourse(long id);

}
