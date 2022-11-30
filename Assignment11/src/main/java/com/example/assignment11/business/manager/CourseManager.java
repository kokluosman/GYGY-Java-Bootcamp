package com.example.assignment11.business.manager;

import com.example.assignment11.DTO.course.request.CreateCourseRequest;
import com.example.assignment11.DTO.course.request.UpdateCourseRequest;
import com.example.assignment11.DTO.course.response.GetAllCourse;
import com.example.assignment11.DTO.course.response.GetCourse;
import com.example.assignment11.business.service.CourseService;
import com.example.assignment11.exception.BusinessException;
import com.example.assignment11.model.Course;
import com.example.assignment11.repository.CourseRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseManager implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public ResponseEntity<GetCourse> getCourse(long id) {
        Course course = this.courseRepository.findById(id).get();
        GetCourse course1 = new GetCourse();
        course1.setName(course.getName());
        course1.setSubjects(course.getSubject());
        course1.setTeacher(course.getTeacher());
        return ResponseEntity.status(HttpStatus.OK).body(course1);
    }

    @Override
    public ResponseEntity<List<GetAllCourse>> getAllCourse() {
        List<Course> course = this.courseRepository.findAll();
        List<GetAllCourse> course1 = new ArrayList<>();
        for (Course x:course){
            GetAllCourse getAllCourse = new GetAllCourse();
            getAllCourse.setId(x.getId());
            getAllCourse.setName(x.getName());
            getAllCourse.setSubjects(x.getSubject());
            getAllCourse.setTeacher(x.getTeacher());
            course1.add(getAllCourse);
        }
        return ResponseEntity.status(HttpStatus.OK).body(course1);
    }

    @Override
    public ResponseEntity<Course> addCourse(CreateCourseRequest createCourseRequest) {
        List<Course> repositoryAll = this.courseRepository.findAll();
        Course course = new Course();
        for (Course x : repositoryAll){
            if (x.getName().equals(createCourseRequest.getName())){
                throw new BusinessException("The Course Name is already exist");
            }else {
                course.setName(createCourseRequest.getName());
                course.setSubject(createCourseRequest.getSubjects());
                course.setTeacher(createCourseRequest.getTeacher());
            }
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(course);
    }

    @Override
    public ResponseEntity<UpdateCourseRequest> updateCourse(long id,UpdateCourseRequest createCourseRequest) {
        if (this.courseRepository.existsById(id)){
            throw new BusinessException("Id already exist");
        }else {
            Course course = this.courseRepository.findById(id).get();
            course.setName(createCourseRequest.getName());
            course.setTeacher(createCourseRequest.getTeacher());
            course.setSubject(createCourseRequest.getSubjects());
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(createCourseRequest);
    }

    @Override
    public ResponseEntity<String> deleteCourse(long id) {
        if (this.courseRepository.existsById(id)){
            this.courseRepository.deleteById(id);
        }
        return ResponseEntity.status(HttpStatus.OK).body("Deleted");
    }
}
