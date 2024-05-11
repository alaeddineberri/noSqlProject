package com.nosql.project.repository;

import com.nosql.project.entities.Student;
import com.nosql.project.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository< Student,Long> {
    List<Student> findAll();
    Optional<Student> findById(Long id);
    Student save(Student entity);
}
