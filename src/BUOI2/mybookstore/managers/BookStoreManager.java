package BUOI2.mybookstore.managers;

import BUOI2.mybookstore.models.Book;
import BUOI2.mybookstore.ui.constants;

import java.util.ArrayList;
import java.util.List;

public class BookStoreManager {
    private List<Book> books;

    public BookStoreManager() { this.books = new ArrayList<>(); }

    public List<Book> getListBooks() { return books; }
    public void addBook(Book book) { this.books.add(book); }
    public void removeBook(Book book) { this.books.remove(book); }
    public void updateBook(Book bookToUpdate, String newTitle, String newAuthor, String newGenre, String newPublishDate) {
        bookToUpdate.setTitle(newTitle);
        bookToUpdate.setAuthor(newAuthor);
        bookToUpdate.setGenre(newGenre);
        bookToUpdate.setPublishDate(newPublishDate);
    }
    public void printAllBooks(List<Book> books) {
        System.out.println(String.format(constants.tableFormat, "Số thứ tự", "Tiêu đề", "Tác giả", "Thể loại", "Ngày xuất bản"));
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}