/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cos.studentapi;

import com.cos.studentapi.entities.StudentEntity;
import com.cos.studentapi.entities.StudentFacade;
import com.cos.studentapi.entities.jsonmessages.JSONMessage;
import com.cos.studentapi.entities.jsonmessages.MessageFacade;
import com.cos.studentapi.entities.jsonmessages.StudentMessage;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Comparator;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author bladt
 */
@Path("students")
public class StudentResource {

    Gson gson = new Gson();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StudentResource
     */
    public StudentResource() {
    }

    /**
     * Retrieves representation of an instance of com.cos.studentapi.StudentResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getStudents() {
        ArrayList<String> messages = new ArrayList<>();
        for(StudentEntity se : StudentFacade.students.values()){
            messages.add(MessageFacade.toJson(se));
        }
        return gson.toJson(messages);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addStudent(String message){
        StudentEntity s = gson.fromJson(message, StudentEntity.class);
        int nextId = 1 + StudentFacade.students.keySet().stream().max(Comparator.naturalOrder()).get();
        StudentFacade.students.put(nextId, s);
    }
}
