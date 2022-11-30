package com.example.assignment11.repository;

import com.example.assignment11.model.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseStudentRepository extends JpaRepository<CourseStudent,Long> {
    boolean existsById();
    boolean existsByName(String name);
}
