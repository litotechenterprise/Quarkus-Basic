package org.agoncal.quarkus.starting;

public class Book {
    public int id;
    public String title;
    public String author;
    public int publishYear;
    public String genre;

    public Book(int id, String title, String author, int publishYear, String genre) {
        this.id= id;
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.genre = genre;
    }
}
