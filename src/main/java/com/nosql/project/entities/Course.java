package com.nosql.project.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "teacher", nullable = false, length = 100)
    private String teacher;

    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;

    @Column(name = "level", length = 20)
    private String level;

    @Column(name = "available_places")
    private Integer availablePlaces;

    // Constructeurs, getters et setters

    public Course() {
        // Constructeur par défaut
    }

    // Constructeur avec tous les champs
    public Course(String title, String teacher, String summary, String level, Integer availablePlaces) {
        this.title = title;
        this.teacher = teacher;
        this.summary = summary;
        this.level = level;
        this.availablePlaces = availablePlaces;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getAvailablePlaces() {
        return availablePlaces;
    }

    public void setAvailablePlaces(Integer availablePlaces) {
        this.availablePlaces = availablePlaces;
    }
}
