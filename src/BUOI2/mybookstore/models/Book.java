package BUOI2.mybookstore.models;

import BUOI2.mybookstore.ui.constants;

public class Book {
    private String title, author, genre, publishDate;
    private int id;

    public Book(int id, String title, String author, String genre, String publishDate) {
        this.title = title;
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.publishDate = publishDate;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getPublishDate() { return publishDate; }
    public int getId() { return id; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPublishDate(String publishDate) { this.publishDate = publishDate; }

    @Override
    public String toString() {
        return String.format(constants.tableFormat, id, title, author, genre, publishDate);
    }
}