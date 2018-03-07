/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.studentapi.entities.jsonmessages;

import java.util.List;

/**
 *
 * @author bladt
 */
public class StudentMessage implements JSONMessage 
{
    public int id;
    public String name;
    public long studypoints;
    public List<String> courses;

    public StudentMessage(String name, long studypoints, List<String> courses, int id) {
        this.name = name;
        this.studypoints = studypoints;
        this.courses = courses;
    }
    
}
