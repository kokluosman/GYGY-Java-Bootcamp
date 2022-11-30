package com.example.assignment11.api;

import com.example.assignment11.DTO.course.request.CreateCourseRequest;
import com.example.assignment11.DTO.course.request.UpdateCourseRequest;
import com.example.assignment11.DTO.course.response.GetAllCourse;
import com.example.assignment11.DTO.course.response.GetCourse;
import com.example.assignment11.business.service.CourseService;
import com.example.assignment11.model.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/course")
public class CoursesController {

    private final CourseService courseService;

    @GetMapping(path = "/get")
    ResponseEntity<GetCourse> getCourse(long id){
        return this.courseService.getCourse(id);
    }
    @GetMapping(path = "/getall")
    ResponseEntity<List<GetAllCourse>> getAllCourse(){
        return this.courseService.getAllCourse();
    }
    @PostMapping(path = "/add")
    ResponseEntity<Course> addCourse(CreateCourseRequest createCourseRequest){
        return this.courseService.addCourse(createCourseRequest);
    }
    @PutMapping(path = "/update")
    ResponseEntity<UpdateCourseRequest> updateCourse(@RequestParam long id,@RequestBody UpdateCourseRequest createCourseRequest){
        return this.courseService.updateCourse(id, createCourseRequest);
    }
    @DeleteMapping(path = "/delete")
    ResponseEntity<String> deleteCourse(@RequestParam long id){
        return this.courseService.deleteCourse(id);
    }
}
