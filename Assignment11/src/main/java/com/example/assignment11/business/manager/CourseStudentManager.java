package com.example.assignment11.business.manager;

import com.example.assignment11.DTO.courseStudent.request.CreateCourseStudent;
import com.example.assignment11.DTO.courseStudent.request.UpdateCourseStudent;
import com.example.assignment11.DTO.courseStudent.response.GetAllCourseStudent;
import com.example.assignment11.DTO.courseStudent.response.GetCourseStudent;
import com.example.assignment11.DTO.teacher.response.GetAllTeacher;
import com.example.assignment11.business.service.CourseStudentService;
import com.example.assignment11.exception.BusinessException;
import com.example.assignment11.model.CourseStudent;
import com.example.assignment11.model.Teacher;
import com.example.assignment11.repository.CourseStudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseStudentManager implements CourseStudentService {

    private final CourseStudentRepository studentRepository;
    @Override
    public ResponseEntity<GetCourseStudent> getCourseStudent(long id) {
        GetCourseStudent student = new GetCourseStudent();
        isExistId(id);
        CourseStudent courseStudent = this.studentRepository.findById(id).get();
        student.setStudent(courseStudent.getStudent());
        student.setCourse(courseStudent.getCourse());
        student.setNote(courseStudent.getNote());
        student.setAbsence(courseStudent.getAbsence());
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @Override
    public ResponseEntity<List<GetAllCourseStudent>> getAllCourseStudent() {
        List<CourseStudent> courseStudents = this.studentRepository.findAll();
        List<GetAllCourseStudent> getAllCourseStudents = new ArrayList<>();
        for (CourseStudent courseStudent : courseStudents){
            GetAllCourseStudent getAllCourseStudent = new GetAllCourseStudent();
            getAllCourseStudent.setId(courseStudent.getId());
            getAllCourseStudent.setCourse(courseStudent.getCourse());
            getAllCourseStudent.setStudent(courseStudent.getStudent());

            getAllCourseStudents.add(getAllCourseStudent);
        }
        return ResponseEntity.status(HttpStatus.OK).body(getAllCourseStudents);
    }

    @Override
    public ResponseEntity<CourseStudent> addCourseStudent(CreateCourseStudent createCourseStudent) {
        CourseStudent student = new CourseStudent();
        student.setCourse(createCourseStudent.getCourse());
        student.setStudent(createCourseStudent.getStudent());
        student.setNote(createCourseStudent.getNote());
        student.setAbsence(createCourseStudent.getAbsence());
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @Override
    public ResponseEntity<UpdateCourseStudent> updateCourseStudent(long id, UpdateCourseStudent updateCourseStudent) {
        CourseStudent student = this.studentRepository.findById(id).get();
        updateCourseStudent.setStudent(student.getStudent());
        updateCourseStudent.setNote(student.getNote());
        updateCourseStudent.setCourse(student.getCourse());
        updateCourseStudent.setAbsence(student.getAbsence());
        return ResponseEntity.status(HttpStatus.CREATED).body(updateCourseStudent);
    }

    @Override
    public ResponseEntity<String> deleteCourseStudent(long id) {
        isExistId(id);
        this.studentRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id+".Number "+"is deleted");
    }

    public void isExistId(long id){
        if (this.studentRepository.existsById(id)){
            throw new BusinessException("Id is already exist");
        }
    }

    public void isExistNAme(String name){
        if (this.studentRepository.existsByName(name)){
            throw new RuntimeException();
        }
    }
}
