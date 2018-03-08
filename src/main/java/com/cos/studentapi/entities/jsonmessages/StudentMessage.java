/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.studentapi.entities.jsonmessages;

import com.cos.studentapi.entities.CourseEntity;
import com.cos.studentapi.entities.StudentEntity;
import com.cos.studentapi.entities.StudentFacade;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author bladt
 */
public class StudentMessage implements JSONMessage<StudentEntity>
{
    public int id;
    public String name;
    public long studypoints;
    public List<Integer> courseIds;

    public StudentMessage(StudentEntity se) {
        this.name = se.getName();
        this.studypoints = se.getStudypoints();
        //Get coursenames as list.
        Stream<CourseEntity> courseEntities = se.getCourses().stream();
        Stream<Integer> courseIds = courseEntities.map(c -> c.id);
        this.courseIds = courseIds.collect(Collectors.toList());
    }
    
    @Override
    public StudentEntity toInternal(){
        ArrayList<CourseEntity> courses = new ArrayList<>();
        for(int id : courseIds) {
            courses.add(StudentFacade.findCourseById(id));
        }
        return new StudentEntity(name, studypoints, id,courses);
    }
    
}
