package org.agoncal.quarkus.starting;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.util.List;
import java.util.Optional;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {


    @Inject
    BookRepository repository;

    @Inject
    Logger logger;

    @GET
    public List<Book> getAllBooks() {
        logger.info("Returning all books from collection");
        return repository.getAllBooks();
    }


    @GET
    @Path("{id}")
    public Optional<Book> getBookById(@PathParam("id") int id) {
        logger.info("Fetching book with id:" + id);
        return repository.getBookById(id);
    }


    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int getBookCount(){
        logger.info("Return count from all books within collection");
        return repository.getBookCount();
    }
}
