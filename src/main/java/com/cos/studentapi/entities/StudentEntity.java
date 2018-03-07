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
    
    //10.50.138.129:8080/StudentApi/api/students
    public List<CourseEntity> courses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public long getStudypoints() {
        return studypoints;
    }

    public StudentEntity(String name, long studypoints, int id) {
        this.name = name;
        this.studypoints = studypoints;
        this.id=id;
    }
}
