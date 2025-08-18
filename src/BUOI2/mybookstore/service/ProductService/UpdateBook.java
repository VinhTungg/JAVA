package BUOI2.mybookstore.service.ProductService;

import BUOI2.mybookstore.models.Product.Book;

public class UpdateBook {
    public static void updateBook(Book bookToUpdate, String newTitle, String newAuthor, String newGenre, String newPublishDate) {
        bookToUpdate.setTitle(newTitle);
        bookToUpdate.setAuthor(newAuthor);
        bookToUpdate.setGenre(newGenre);
        bookToUpdate.setPublishDate(newPublishDate);
    }
}
