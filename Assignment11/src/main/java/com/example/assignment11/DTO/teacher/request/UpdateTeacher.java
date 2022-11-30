package com.example.assignment11.DTO.teacher.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTeacher {

    private long id;
    @NotEmpty
    @NotBlank
    @NotNull
    private String name;
}
