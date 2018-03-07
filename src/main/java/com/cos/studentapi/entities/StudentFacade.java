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

    static{
        StudentEntity s1 = new StudentEntity("GERY", 800, 1);
        StudentEntity s2 = new StudentEntity("Gurt", 9001, 2);
        StudentEntity s3 = new StudentEntity("Jon", 12, 87);
    
        students.put(1,s1);
        students.put(2,s2);
        students.put(87,s3);
        
        CourseEntity c1 = new CourseEntity("threads", 101);
        CourseEntity c2 = new CourseEntity("rest", 362);
    
        c1.enroll(s1);
        c2.enroll(s1);
    }

}
