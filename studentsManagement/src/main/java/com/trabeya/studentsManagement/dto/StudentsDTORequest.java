package com.trabeya.studentsManagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentsDTORequest {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
