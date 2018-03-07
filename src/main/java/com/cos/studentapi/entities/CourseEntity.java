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
public class CourseEntity {
    private String courseName;
    private int roomNumber;
    
    private List<StudentEntity> participants = new ArrayList<>();

    public void enroll(StudentEntity s) {
        participants.add(s);
        s.courses.add(this);
    }
    
    public String getCourseName() {
        return courseName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public CourseEntity(String courseName, int roomNumber) {
        this.courseName = courseName;
        this.roomNumber = roomNumber;
    }
}
