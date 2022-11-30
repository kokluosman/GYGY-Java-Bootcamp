package com.example.assignment11.api;

import com.example.assignment11.DTO.course.request.CreateCourseRequest;
import com.example.assignment11.DTO.course.request.UpdateCourseRequest;
import com.example.assignment11.DTO.course.response.GetAllCourse;
import com.example.assignment11.DTO.course.response.GetCourse;
import com.example.assignment11.DTO.courseStudent.request.CreateCourseStudent;
import com.example.assignment11.DTO.courseStudent.request.UpdateCourseStudent;
import com.example.assignment11.DTO.courseStudent.response.GetAllCourseStudent;
import com.example.assignment11.DTO.courseStudent.response.GetCourseStudent;
import com.example.assignment11.business.service.CourseStudentService;
import com.example.assignment11.model.Course;
import com.example.assignment11.model.CourseStudent;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/coursestudent")
@RequiredArgsConstructor
public class CourseStudentsController {

    private final CourseStudentService courseStudentService;

    @GetMapping(path = "/get")
    ResponseEntity<GetCourseStudent> getCourseStudent(@RequestParam long id){
        return this.courseStudentService.getCourseStudent(id);
    }
    @GetMapping(path = "/getall")
    ResponseEntity<List<GetAllCourseStudent>> getCourseStudent(){
        return this.courseStudentService.getAllCourseStudent();
    }
    @PostMapping(path = "/add")
    ResponseEntity<CourseStudent> addCourseStudent(@RequestBody CreateCourseStudent createCourseStudent){
        return this.courseStudentService.addCourseStudent(createCourseStudent);
    }
    @PutMapping(path = "/update")
    ResponseEntity<UpdateCourseStudent> updateCourseStudent(long id, UpdateCourseStudent updateCourseStudent){
        return this.courseStudentService.updateCourseStudent(id, updateCourseStudent);
    }
    @DeleteMapping(path = "/delete")
    ResponseEntity<String> deleteCourseStudent(long id){
        return this.courseStudentService.deleteCourseStudent(id);
    }

}
