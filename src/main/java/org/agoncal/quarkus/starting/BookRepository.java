package org.agoncal.quarkus.starting;


import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks() {
        return List.of(new Book(1, "New home", "Pablo Endara", 2022, "Comedy"),
                new Book(2, "Booklyn", "Pablo Endara", 2019, "Sci-fi"),
                new Book(3, "Monkey mind", "Pablo Endara", 2010, "Rom-Com"),
                new Book(4, "Battle Scars", "Pablo Endara", 2005, "Comedy"));
    }

    public Optional<Book> getBookById( int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }

    public int getBookCount(){
        return getAllBooks().size();
    }
}
