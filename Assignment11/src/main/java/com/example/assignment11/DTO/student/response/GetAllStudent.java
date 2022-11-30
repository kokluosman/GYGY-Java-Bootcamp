package com.example.assignment11.DTO.student.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllStudent {
    private long id;
    private String name;
    private int number;
}
