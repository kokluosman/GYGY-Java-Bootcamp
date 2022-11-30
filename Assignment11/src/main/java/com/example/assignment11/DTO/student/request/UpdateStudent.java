package com.example.assignment11.DTO.student.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateStudent {
    private long id;
    @NotBlank
    @NotNull
    @NotEmpty
    private String name;
    @Size(min = 1000,max = 10000)
    private int number;
    @Size(min = 1900)
    private int year;
}
