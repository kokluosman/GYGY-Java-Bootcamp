package com.example.assignment11.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_number",unique = true,nullable = false)
    private int number;
    @Column(name = "student_year")
    private int year;
}
