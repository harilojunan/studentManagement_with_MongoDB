package com.trabeya.studentsManagement.dto;

import com.trabeya.studentsManagement.entity.Students;
import com.trabeya.studentsManagement.dto.StudentsDTORequest;

public class StudentSaveDtoMapper {

    public static Students mapStudentSaveDtoToStudent(StudentsDTORequest studentsDTORequest)
    {
        Students students =new Students();
        students.setId(studentsDTORequest.getId());
        students.setFirstName(studentsDTORequest.getFirstName());
        students.setEmail(studentsDTORequest.getEmail());
        students.setLastName(studentsDTORequest.getLastName());
        return students;
    }
}
