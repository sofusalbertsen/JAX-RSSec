/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.rest;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dk.cphbusiness.entity.Book;
import dk.cphbusiness.exception.BookNotFoundException;
import dk.cphbusiness.facade.Facade;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author sofus
 */
@Path("books")
public class RestServiceBook {
    Gson gson;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestService
     */
    public RestServiceBook() {
        gson= new GsonBuilder().
                setPrettyPrinting().
                setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).
                create();
    }

    @GET
    @Produces("application/json")
    public Response getBooks() {
        return Response.status(Response.Status.OK).entity(gson.toJson(Facade.getBooks())).build();
//       return gson.toJson(Facade.getBooks());
    }
    
    @POST
    @Consumes("application/json")
    public Response createBook(String book){
//    Facade.createBook(gson.fromJson(book, Book.class));
    return Response.status(Response.Status.CREATED).entity(book).build();
    }
    
    @DELETE
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteBook(@PathParam("id") String ISBN){
    Facade.deleteBook(ISBN);
    }
    @GET
    @Path("{id}")
    @Produces("application/json")
    public String getBook(@PathParam("id") String ISBN) throws BookNotFoundException{
        return gson.toJson(Facade.getBook(ISBN));
    }
    
    
    

}
