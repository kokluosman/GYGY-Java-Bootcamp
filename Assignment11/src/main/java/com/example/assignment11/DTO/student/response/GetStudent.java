package com.example.assignment11.DTO.student.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetStudent {
    private String name;
    private int number;
    private int year;
}
