/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.studentapi.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bladt
 */
public class StudentEntity {
    private String name;
    private long studypoints;
    public int id;
    
    
    private List<CourseEntity> courses = new ArrayList<>();

    public List<CourseEntity> getCourses() {
        if (courses == null) {
            courses = new ArrayList<>();
        }
        return courses;
    }

    public String getName() {
        return name;
    }

    public long getStudypoints() {
        return studypoints;
    }

    public StudentEntity(String name, long studypoints, int id, List<CourseEntity> courses) {
        this.name = name;
        this.studypoints = studypoints;
        this.id=id;
        this.courses = courses;
    }

    public StudentEntity(String name, long studypoints, int id) {
        this.name = name;
        this.studypoints = studypoints;
        this.id = id;
    }
    
    
}
