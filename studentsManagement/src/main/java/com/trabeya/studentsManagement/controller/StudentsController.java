package com.trabeya.studentsManagement.controller;

import com.trabeya.studentsManagement.dto.*;
import com.trabeya.studentsManagement.entity.Students;
import com.trabeya.studentsManagement.service.StudentsService;
import com.trabeya.studentsManagement.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.trabeya.studentsManagement.util.AppConstants.STUDENTS_BY_ID_URL;
import static com.trabeya.studentsManagement.util.AppConstants.STUDENTS_URL;

@RestController
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @PostMapping(STUDENTS_URL)
    public ResponseEntity<?> addStudents(@RequestBody StudentsDTORequest studentsDTORequest) {
        return new ResponseEntity<>(StudentsDTOMapper.mapStudentsToStudentsDto(studentsService.addStudents(
                StudentSaveDtoMapper.mapStudentSaveDtoToStudent(studentsDTORequest))), HttpStatus.OK);
    }

    @GetMapping(STUDENTS_URL)
    public ResponseEntity<List<StudentsDTOResponse>> getAllStudents() {
        return new ResponseEntity<>(StudentsDTOMapper.mapUserListToUserDtoList
                (studentsService.getAllStudents()), HttpStatus.OK);
    }

    @GetMapping(STUDENTS_BY_ID_URL)
//    @GetMapping("/students/{id}")
    public ResponseEntity<?> getStudentsById(@PathVariable Long id) {
        return new ResponseEntity<>(StudentsDTOMapper.mapStudentsToStudentsDto
                (studentsService.getStudentsById(id)), HttpStatus.OK);
    }


    @PutMapping(STUDENTS_BY_ID_URL)
    public ResponseEntity<?> updateStudents(@RequestBody StudentsDTORequest studentsDTORequest, @PathVariable Long id) {
        return new ResponseEntity<>(StudentsDTOMapper.mapStudentsToStudentsDto(studentsService.updateStudents(
                id, StudentSaveDtoMapper.mapStudentSaveDtoToStudent(studentsDTORequest))), HttpStatus.OK);
    }

    @DeleteMapping(STUDENTS_BY_ID_URL)
    public ResponseEntity<?> deleteStudents(@PathVariable Long id) {
        return new ResponseEntity<>(studentsService.deleteStudents(id), HttpStatus.OK);
    }

}
