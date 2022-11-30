package com.example.assignment11.business.manager;

import com.example.assignment11.DTO.teacher.request.CreateTeacher;
import com.example.assignment11.DTO.teacher.request.UpdateTeacher;
import com.example.assignment11.DTO.teacher.response.GetAllTeacher;
import com.example.assignment11.DTO.teacher.response.GetTeacher;
import com.example.assignment11.business.service.TeacherService;
import com.example.assignment11.exception.BusinessException;
import com.example.assignment11.model.Teacher;
import com.example.assignment11.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherManager implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public ResponseEntity<GetTeacher> getTeacher(long id) {
        isExistId(id);
        Teacher teacher = this.teacherRepository.findById(id).get();
        GetTeacher getTeacher = new GetTeacher();
        getTeacher.setName(getTeacher.getName());
        return ResponseEntity.status(HttpStatus.OK).body(getTeacher);
    }

    @Override
    public ResponseEntity<List<GetAllTeacher>> getAllTeacher() {
        List<Teacher> teachers = this.teacherRepository.findAll();
        List<GetAllTeacher> getAllTeachers = new ArrayList<>();
        for (Teacher teacher : teachers){
            GetAllTeacher getAllTeacher = new GetAllTeacher();
            getAllTeacher.setName(teacher.getName());
            getAllTeacher.setId(teacher.getId());

            getAllTeachers.add(getAllTeacher);
        }
        return ResponseEntity.status(HttpStatus.OK).body(getAllTeachers);
    }

    @Override
    public ResponseEntity<Teacher> addTeacher(CreateTeacher createTeacher) {
        isExistNAme(createTeacher.getName());
        Teacher teacher = new Teacher();
        teacher.setName(createTeacher.getName());
        this.teacherRepository.save(teacher);
        return ResponseEntity.status(HttpStatus.CREATED).body(teacher);
    }

    @Override
    public ResponseEntity<UpdateTeacher> updateTeacher(long id, UpdateTeacher updateTeacher) {
        Teacher teacher = this.teacherRepository.findById(id).get();
        updateTeacher.setId(teacher.getId());
        updateTeacher.setName(teacher.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(updateTeacher);
    }

    @Override
    public ResponseEntity<String> deleteTeacher(long id) {
        isExistId(id);
        this.teacherRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Teacher was deleted!!");
    }

    public void isExistId(long id){
        if (this.teacherRepository.existsById(id)){
            throw new BusinessException("Id is already exist");
        }
    }

    public void isExistNAme(String name){
        if (this.teacherRepository.existsByName(name)){
            throw new RuntimeException();
        }
    }
}
