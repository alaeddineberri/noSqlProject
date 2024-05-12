package com.nosql.project.repository;

import com.nosql.project.entities.Course;
import com.nosql.project.entities.Student;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
public interface CourseRepository extends CrudRepository<Course,Long> {
    List<Course> findAll();
    Optional<Course> findById(Long id);
    Course save(Course entity);
}
