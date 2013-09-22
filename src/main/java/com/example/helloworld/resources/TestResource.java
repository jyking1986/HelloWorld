package com.example.helloworld.resources;


import com.example.helloworld.core.Person;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {
     @GET
     public Person getPerson(){
         return new Person("Ethan");
     }

    @GET
    @Path("/list")
    public List<Person> getPersons(){
        List<Person> list=new ArrayList<Person>();
        list.add(new Person("Ethan"));
        list.add(new Person("Iris"));
        list.add(new Person("Xuan"));
        return list;
    }

     @POST
     @Consumes(MediaType.APPLICATION_JSON)
     public javax.ws.rs.core.Response addPerson(@Valid Person person){
         return javax.ws.rs.core.Response.ok().build();
     }

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    public javax.ws.rs.core.Response addPersons(@Valid List<Person> person){
        return javax.ws.rs.core.Response.ok().build();
    }
}
