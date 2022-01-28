package com.trabeya.studentsManagement.dto;

import com.trabeya.studentsManagement.entity.Students;

import java.util.ArrayList;
import java.util.List;

public class StudentsDTOMapper {
    public static StudentsDTOResponse mapStudentsToStudentsDto(Students students) {
        StudentsDTOResponse studentsDTOResponse = new StudentsDTOResponse();
        studentsDTOResponse.setId(students.getId());
        studentsDTOResponse.setFirstName(students.getFirstName());
        studentsDTOResponse.setLastName(students.getLastName());
        studentsDTOResponse.setEmail(students.getEmail());

        return studentsDTOResponse;
    }
    public static List<StudentsDTOResponse> mapUserListToUserDtoList(List<Students> studentsList){
        List<StudentsDTOResponse> studentsDTOList = new ArrayList<StudentsDTOResponse>();
        if(studentsList != null) {
            for(Students students:studentsList) {
                studentsDTOList.add(mapStudentsToStudentsDto(students));
            }
        }
        return studentsDTOList;

    }
}
