package com.nosql.project.entities;


import jakarta.persistence.*;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Entity
@RedisHash("Teacher")
@Table(name = "teachers")
public class Teacher  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // Constructeurs, getters et setters

    public Teacher() {
        // Constructeur par défaut
    }

    // Constructeur avec tous les champs
    public Teacher(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

