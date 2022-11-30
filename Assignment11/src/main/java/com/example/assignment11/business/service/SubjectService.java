package com.example.assignment11.business.service;

import com.example.assignment11.DTO.subject.request.CreateSubjectRequest;
import com.example.assignment11.DTO.subject.request.UpdateSubjectRequest;
import com.example.assignment11.DTO.subject.response.GetAllSubject;
import com.example.assignment11.DTO.subject.response.GetSubject;
import com.example.assignment11.model.Subject;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SubjectService {

    ResponseEntity<GetSubject> getSubject(long id);
    ResponseEntity<List<GetAllSubject>> getAllSubject();
    ResponseEntity<Subject> addSubject(CreateSubjectRequest createSubjectRequest);
    ResponseEntity<UpdateSubjectRequest> updateSubject(long id, UpdateSubjectRequest updateSubjectRequest);
    ResponseEntity<String> deleteSubject(long id);

}
