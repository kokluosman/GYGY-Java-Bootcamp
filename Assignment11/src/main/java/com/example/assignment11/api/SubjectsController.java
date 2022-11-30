package com.example.assignment11.api;

import com.example.assignment11.DTO.subject.request.CreateSubjectRequest;
import com.example.assignment11.DTO.subject.request.UpdateSubjectRequest;
import com.example.assignment11.DTO.subject.response.GetAllSubject;
import com.example.assignment11.DTO.subject.response.GetSubject;
import com.example.assignment11.business.service.SubjectService;
import com.example.assignment11.model.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/subjects")
@RequiredArgsConstructor
public class SubjectsController {

    private final SubjectService subjectService;

    @GetMapping(path = "/get")
    ResponseEntity<GetSubject> getSubject(@RequestParam long id){
        return this.subjectService.getSubject(id);
    }
    @GetMapping(path = "/getAll")
    ResponseEntity<List<GetAllSubject>> getAllSubject(){
        return this.subjectService.getAllSubject();
    }
    @PostMapping(path = "/add")
    ResponseEntity<Subject> addSubject(@RequestBody CreateSubjectRequest createSubjectRequest){
        return this.subjectService.addSubject(createSubjectRequest);
    }
    @PutMapping(path = "/update")
    ResponseEntity<UpdateSubjectRequest> updateSubject(@RequestParam long id,@RequestBody UpdateSubjectRequest updateSubjectRequest){
        return this.subjectService.updateSubject(id, updateSubjectRequest);
    }
    @DeleteMapping(path = "/delete")
    ResponseEntity<String> deleteSubject(@RequestParam long id){
        return this.subjectService.deleteSubject(id);
    }
}
