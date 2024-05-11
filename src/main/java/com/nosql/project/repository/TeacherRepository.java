package com.nosql.project.repository;

import com.nosql.project.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TeacherRepository extends CrudRepository<Teacher,Long> {
    List<Teacher> findAll();
    Optional<Teacher> findById(Long id);
    Teacher save(Teacher entity);


}
