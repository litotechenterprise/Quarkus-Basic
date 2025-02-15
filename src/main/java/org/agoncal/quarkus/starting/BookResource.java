package org.agoncal.quarkus.starting;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getAllBooks() {
        return List.of(new Book(1, "New home", "Pablo Endara", 2022, "Comedy"),
                new Book(2, "Booklyn", "Pablo Endara", 2019, "Sci-fi"),
                new Book(3, "Monkey mind", "Pablo Endara", 2010, "Rom-Com"),
                new Book(4, "Battle Scars", "Pablo Endara", 2005, "Comedy"));
    }


    @GET
    @Path("{id}")
    public Optional<Book> getBookById(@PathParam("id") int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }


    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int getBookCount(){
        return getAllBooks().size();
    }
}
