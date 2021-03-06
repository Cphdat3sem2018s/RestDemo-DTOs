/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.studentapi.entities;

import java.util.HashMap;
import javax.print.attribute.HashAttributeSet;

/**
 *
 * @author bladt
 */
public class StudentFacade {
    public static HashMap<Integer, StudentEntity> students = new HashMap<>();
    public static HashMap<Integer, CourseEntity> courses = new HashMap<>();

    static{
        StudentEntity s1 = new StudentEntity("GERY", 800, 1);
        StudentEntity s2 = new StudentEntity("Gurt", 9001, 2);
        StudentEntity s3 = new StudentEntity("Jon", 12, 87);
    
        students.put(1,s1);
        students.put(2,s2);
        students.put(87,s3);
        
        CourseEntity c1 = new CourseEntity("threads", 101, 1);
        CourseEntity c2 = new CourseEntity("rest", 362,2);
        
        courses.put(1, c1);
        courses.put(2, c2);
    
        c1.enroll(s1);
        c2.enroll(s1);
    }
    
    public static CourseEntity findCourseById(int id){
        return courses.get(id);
    }
    
    public static void updateStudent(StudentEntity s){
        students.put(s.id, s);
    }

}
