package com.example.assignment11.DTO.subject.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubject {
    private long id;
    private String name;
}
