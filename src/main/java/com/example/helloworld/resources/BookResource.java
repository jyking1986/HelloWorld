package com.example.helloworld.resources;

import com.example.helloworld.DBAccesser;
import com.example.helloworld.core.Book;
import com.example.helloworld.core.Person;
import com.example.helloworld.views.BaseView;
import com.example.helloworld.views.BooksView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Path("/books")
@Produces(MediaType.TEXT_HTML)
public class BookResource {

    @GET
    public BooksView viewBooks()
    {
        return new BooksView();

    }

    @GET
    @Path("/listJson")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> viewBookList() throws IOException {
        List<Book> list = DBAccesser.Load();
        /*=new ArrayList<Book>();
        list.add(new Book("BookA","123"));
        list.add(new Book("BookB","124")); */
        return list;

    }
    @GET
    @Path("/listText")
    @Produces(MediaType.TEXT_PLAIN)
    public String viewBookListText() {
        return DBAccesser.LoadData();
    }

    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response updateBookList(@FormParam("data") String data)
    {
       DBAccesser.Save(data);
       return Response.ok().build();
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addBook(MultivaluedMap<String, String> formParams)
    {

        return Response.ok().build();
    }


}
