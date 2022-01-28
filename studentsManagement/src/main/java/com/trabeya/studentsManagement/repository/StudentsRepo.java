package com.trabeya.studentsManagement.repository;

import com.trabeya.studentsManagement.entity.Students;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface StudentsRepo extends MongoRepository<Students, Long>
//        , QuerydslPredicateExecutor<Students>
{

    Students findStudentsById(Long id);

//    @Query("{ 'name' : ?0 }")
//    List<Students> findStudentsByName(String name);
}
