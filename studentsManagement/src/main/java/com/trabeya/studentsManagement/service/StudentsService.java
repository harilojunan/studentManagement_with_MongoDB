package com.trabeya.studentsManagement.service;

import com.trabeya.studentsManagement.entity.Students;

import java.util.List;


public interface StudentsService {
    public Students addStudents(Students students);
    public List<Students> getAllStudents();
    public Students getStudentsById(Long id);
    public Students updateStudents(Long id, Students students);
    public String deleteStudents(Long id);

}
