package com.example.assignment11.DTO.subject.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubjectRequest {
    private long id;
    @NotBlank
    private String name;
}
