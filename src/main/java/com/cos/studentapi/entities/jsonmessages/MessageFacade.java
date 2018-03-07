/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.studentapi.entities.jsonmessages;

import com.cos.studentapi.entities.CourseEntity;
import com.cos.studentapi.entities.StudentEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bladt
 */
public class MessageFacade {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public static String toJson(JSONMessage jm){
        return gson.toJson(jm);
    }
    
    public static StudentEntity fromJson(String message){
        StudentMessage sm = gson.fromJson(message, StudentMessage.class);
        return new StudentEntity(sm.name, sm.studypoints,sm.id);
    }
    
    public static String toJson(StudentEntity se){
        List<String> cNames=new ArrayList<>();
        for (CourseEntity c : se.courses) {
            cNames.add(c.getCourseName());
        }
        StudentMessage sm = new StudentMessage(se.getName(), se.getStudypoints(), cNames, se.id);
        return gson.toJson(sm);
    }
}
