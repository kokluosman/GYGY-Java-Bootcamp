package com.example.assignment11.repository;

import com.example.assignment11.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    //boolean existsById();
}
