package com.example.assignment11.business.manager;

import com.example.assignment11.DTO.subject.request.CreateSubjectRequest;
import com.example.assignment11.DTO.subject.request.UpdateSubjectRequest;
import com.example.assignment11.DTO.subject.response.GetAllSubject;
import com.example.assignment11.DTO.subject.response.GetSubject;
import com.example.assignment11.business.service.SubjectService;
import com.example.assignment11.exception.BusinessException;
import com.example.assignment11.model.Subject;
import com.example.assignment11.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectManager implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Override
    public ResponseEntity<GetSubject> getSubject(long id) {
        isExistId(id);
        Subject subject = this.subjectRepository.findById(id).get();
        GetSubject getSubject = new GetSubject();
        getSubject.setName(subject.getName());
        return ResponseEntity.status(HttpStatus.OK).body(getSubject);
    }

    @Override
    public ResponseEntity<List<GetAllSubject>> getAllSubject() {
        List<Subject> subjects = this.subjectRepository.findAll();
        List<GetAllSubject> getAllSubjects = new ArrayList<>();
        for (Subject subject : subjects){
            GetAllSubject getAllSubject = new GetAllSubject();
            getAllSubject.setId(subject.getId());
            getAllSubject.setName(subject.getName());

            getAllSubjects.add(getAllSubject);
        }
        return ResponseEntity.status(HttpStatus.OK).body(getAllSubjects);
    }

    @Override
    public ResponseEntity<Subject> addSubject(CreateSubjectRequest createSubjectRequest) {
        List<Subject> subjects = this.subjectRepository.findAll();
        Subject subject = new Subject();
        for (Subject x : subjects){
            if (x.getName().equals(createSubjectRequest.getName())){
                throw new BusinessException("Name is already exist");
            }
        }
        subject.setName(createSubjectRequest.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(subject);
    }

    @Override
    public ResponseEntity<UpdateSubjectRequest> updateSubject(long id, UpdateSubjectRequest updateSubjectRequest) {
        isExistId(id);
        Subject subject = this.subjectRepository.findById(id).get();
        subject.setName(updateSubjectRequest.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(updateSubjectRequest);
    }

    @Override
    public ResponseEntity<String> deleteSubject(long id) {
        isExistId(id);
        this.subjectRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id+".Number is deleted!");
    }

    public void isExistId(long id){
       if ( this.subjectRepository.existsById(id)){
           throw new BusinessException("Id is already exist");
       }
    }
}
