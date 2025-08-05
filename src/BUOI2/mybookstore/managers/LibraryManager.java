package BUOI2.mybookstore.managers;

import BUOI2.mybookstore.models.Book;
import BUOI2.mybookstore.ui.menu;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books;

    public LibraryManager() { this.books = new ArrayList<>(); }

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
        System.out.println(String.format(menu.tableFormat, "STT", "TÁC GIẢ", "TIÊU ĐỀ", "THỂ LOẠI", "NGÀY XUẤT BẢN"));
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}