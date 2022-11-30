package com.example.assignment11.api;

import com.example.assignment11.DTO.teacher.request.CreateTeacher;
import com.example.assignment11.DTO.teacher.request.UpdateTeacher;
import com.example.assignment11.DTO.teacher.response.GetAllTeacher;
import com.example.assignment11.DTO.teacher.response.GetTeacher;
import com.example.assignment11.business.service.TeacherService;
import com.example.assignment11.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/teacher")
public class TeachersController {
    private final TeacherService teacherService;

    @GetMapping(path = "/get")
    ResponseEntity<GetTeacher> getTeacher(@RequestParam long id){
        return this.teacherService.getTeacher(id);
    }
    @GetMapping(path = "/getall")
    ResponseEntity<List<GetAllTeacher>> getAllTeacher(){
        return this.teacherService.getAllTeacher();
    }
    @PostMapping(path = "/add")
    ResponseEntity<Teacher> addTeacher(@RequestBody CreateTeacher createTeacher){
        return this.teacherService.addTeacher(createTeacher);
    }
    @PutMapping(path = "/update")
    ResponseEntity<UpdateTeacher> updateTeacher(@RequestParam long id, @RequestBody UpdateTeacher updateTeacher){
        return this.teacherService.updateTeacher(id,updateTeacher);
    }
    @DeleteMapping(path = "/delete")
    ResponseEntity<String> deleteTeacher(long id){
        return this.teacherService.deleteTeacher(id);
    }

}
