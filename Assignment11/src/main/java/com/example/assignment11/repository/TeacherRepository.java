package com.example.assignment11.repository;

import com.example.assignment11.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    boolean existsById();
    boolean existsByName(String name);
}
