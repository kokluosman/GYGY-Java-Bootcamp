package com.example.assignment11.api;

import com.example.assignment11.DTO.student.request.CreateStudent;
import com.example.assignment11.DTO.student.request.UpdateStudent;
import com.example.assignment11.DTO.student.response.GetAllStudent;
import com.example.assignment11.DTO.student.response.GetStudent;
import com.example.assignment11.business.service.StudentService;
import com.example.assignment11.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping(path = "/get")
    ResponseEntity<GetStudent> getStudent(@RequestParam long id){
        return this.studentService.getStudent(id);
    }
    @GetMapping(path = "/getall")
    ResponseEntity<List<GetAllStudent>> getAllStudent(){
        return this.studentService.getAllStudent();
    }
    @PostMapping(path = "/add")
    ResponseEntity<Student> addStudent(@RequestBody CreateStudent createStudent){
        return this.studentService.addStudent(createStudent);
    }
    @PutMapping(path = "/update")
    ResponseEntity<UpdateStudent> updateStudent(@RequestParam long id, @RequestBody UpdateStudent updateStudent){
        return this.studentService.updateStudent(id,updateStudent);
    }
    @DeleteMapping(path = "/delete")
    ResponseEntity<String> deleteTeacher(long id){
        return this.studentService.deleteTeacher(id);
    }
}
