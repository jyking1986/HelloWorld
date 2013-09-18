package com.example.helloworld.resources;

import com.example.helloworld.core.Person;
import com.example.helloworld.views.PersonView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/people/{id}")
@Produces(MediaType.TEXT_HTML)
public class PersonResource {


    public PersonResource() {

    }

    @GET
    public PersonView getPerson(@PathParam("id") String id) {
        return new PersonView(new Person(id));
    }
}
