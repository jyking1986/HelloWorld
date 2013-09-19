package com.example.helloworld.resources;

import com.example.helloworld.core.Person;
import com.example.helloworld.views.BaseView;
import com.example.helloworld.views.PersonView;
import com.sun.tools.corba.se.idl.constExpr.Or;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class HomeResource {


    @GET
    @Path("/home")
    public BaseView viewHome(@QueryParam("name") String name)
    {
        return new BaseView("home", new Person(name));

    }
    @GET
    @Path("/about")
    public BaseView viewAbout(@QueryParam("name") String name)
    {
        return new BaseView("about", new Person(name));

    }

}
