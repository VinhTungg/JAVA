package BUOI2.mybookstore.models.Product;

import BUOI2.mybookstore.common.constants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    @Override
    public String toString() {
        return String.format(constants.tableFormat, id, title, author, genre, publishDate);
    }
}