package com.example.assignment11.DTO.teacher.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTeacher {

    private long id;
    private String name;
}
