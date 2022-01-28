package com.trabeya.studentsManagement.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection ="students")
public class Students {

    @Id
    private Long id;

    @NonNull
    private String firstName;
    private String lastName;
    @NonNull
    private String email;

}
