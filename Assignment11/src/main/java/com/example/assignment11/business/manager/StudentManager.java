package com.example.assignment11.business.manager;

import com.example.assignment11.DTO.student.request.CreateStudent;
import com.example.assignment11.DTO.student.request.UpdateStudent;
import com.example.assignment11.DTO.student.response.GetAllStudent;
import com.example.assignment11.DTO.student.response.GetStudent;
import com.example.assignment11.business.service.StudentService;
import com.example.assignment11.exception.BusinessException;
import com.example.assignment11.model.Student;
import com.example.assignment11.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentManager implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public ResponseEntity<GetStudent> getStudent(long id) {
        isExistId(id);
        Student student = this.studentRepository.findById(id).get();
        GetStudent getStudent = new GetStudent();
        getStudent.setName(student.getName());
        getStudent.setYear(student.getYear());
        getStudent.setNumber(student.getNumber());
        return ResponseEntity.status(HttpStatus.OK).body(getStudent);
    }

    @Override
    public ResponseEntity<List<GetAllStudent>> getAllStudent() {
        List<Student> students = this.studentRepository.findAll();
        List<GetAllStudent> getAllStudents = new ArrayList<>();
        for (Student student : students){
            GetAllStudent getAllStudent = new GetAllStudent();
            getAllStudent.setName(student.getName());
            getAllStudent.setNumber(student.getNumber());
            getAllStudent.setId(student.getId());

            getAllStudents.add(getAllStudent);
        }
        return ResponseEntity.status(HttpStatus.OK).body(getAllStudents);
    }

    @Override
    public ResponseEntity<Student> addStudent(CreateStudent createStudent) {
        isExistNAme(createStudent.getName());
        Student student = new Student();
        student.setName(createStudent.getName());
        student.setNumber(createStudent.getNumber());
        student.setYear(createStudent.getYear());
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @Override
    public ResponseEntity<UpdateStudent> updateStudent(long id, UpdateStudent updateStudent) {
        isExistId(id);
        Student student = this.studentRepository.findById(id).get();
        student.setYear(updateStudent.getYear());
        student.setName(updateStudent.getName());
        student.setNumber(updateStudent.getNumber());
        return ResponseEntity.status(HttpStatus.CREATED).body(updateStudent);
    }

    @Override
    public ResponseEntity<String> deleteTeacher(long id) {
        isExistId(id);
        this.studentRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(" Deleted!!");
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
