package com.nosql.project.controller;

import com.nosql.project.entities.Course;
import com.nosql.project.entities.Student;
import com.nosql.project.entities.Teacher;
import com.nosql.project.repository.CourseRepository;
import com.nosql.project.repository.StudentRepository;
import com.nosql.project.repository.TeacherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/noSqlProject")
@CrossOrigin(origins = "http://localhost:4200/")
public class HomePage {
    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;


    @GetMapping("/teachers")
    public List<Teacher> getTeachers(){
        return teacherRepository.findAll() ;
    }
    @GetMapping("/teachers/{id}")
    public Optional<Teacher> findTeacherById(@PathVariable Long id){
        return teacherRepository.findById(id) ;
    }
    @PostMapping("/teachers")
    public Teacher addTeachers(@RequestBody Teacher teacher){
        return teacherRepository.save(teacher) ;
    }

    ///////////course

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseRepository.findAll() ;
    }
    @GetMapping("/courses/{id}")
    public Optional<Course> findCourseById(@PathVariable Long id){
        return courseRepository.findById(id) ;
    }

    @PostMapping("/courses")
    public Course addCourses(@RequestBody Course course){
        return courseRepository.save(course) ;
    }
    ////////////////////////Studant

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentRepository.findAll() ;
    }
    @GetMapping("/students/{id}")
    public Optional<Student> findStudentById(@PathVariable Long id){
        return studentRepository.findById(id) ;
    }
    @GetMapping("/students/course/{courseId}")
    public List<Student> getStudentsByCourse(@PathVariable Long courseId) {
        // Find the course by its ID
        Optional<Course> optionalCourse = courseRepository.findById(courseId);

        // Check if the course exists
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();

            // Get the list of students enrolled in the course
            List<Student> students = course.getStudents();

            return students;
        } else {
            // Course not found
            throw new RuntimeException("Course with ID " + courseId + " not found");
        }
    }

    @PostMapping("/students")
    public Student addStudents(@RequestBody Student student){
        return studentRepository.save(student) ;
    }



}

