package com.trabeya.studentsManagement.service;

import com.trabeya.studentsManagement.entity.Students;
import com.trabeya.studentsManagement.repository.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsServiceImple implements StudentsService {

    @Autowired
    private StudentsRepo studentsRepo;

    @Override
    public Students addStudents(Students students) {
        return studentsRepo.save(students);
    }

    @Override
//    Pageable pageableRequest = PageRequest.of(0, 1);
//    Page<Students> page = studentsRepo.findAll((org.springframework.data.domain.Pageable) pageableRequest);
//    List<Students> students = pages.getContent();
    public List<Students> getAllStudents() {
        return studentsRepo.findAll();

    }

    @Override
    public Students getStudentsById(Long id) {
        return studentsRepo.findStudentsById(id);
    }

    @Override
    public Students updateStudents(Long id, Students students) {
        students.setId(id);
        return studentsRepo.save(students);
    }

    @Override
    public String deleteStudents(Long id) {
        studentsRepo.deleteById(id);
        return "Delete Successfully";
    }
}
