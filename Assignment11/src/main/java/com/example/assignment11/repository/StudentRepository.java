package com.example.assignment11.repository;

import com.example.assignment11.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    boolean existsByName(String name);
}
