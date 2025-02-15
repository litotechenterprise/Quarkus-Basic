package org.agoncal.quarkus.starting;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getAllBooks() {
        return List.of(new Book(1, "New home", "Pablo", 2025, "Comedy"),
                new Book(2, "Booklyn", "Pablo", 2025, "Comedy"),
                new Book(3, "Monkey mind", "Pablo", 2025, "Comedy"),
                new Book(4, "Battle Scars", "Pablo", 2025, "Comedy"));
    }


//    @GET
//    @Path("{id}")
//    public Book getBookById() {
//        return getAllBooks().stream().filter(::)
//    }


    @GET
    @Path("/count")
    public int getBookCount(){
        return getAllBooks().size();
    }
}
