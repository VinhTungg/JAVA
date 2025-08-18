package BUOI2.mybookstore.service.ProductService;

import BUOI2.mybookstore.common.AppContext;
import BUOI2.mybookstore.models.Product.Book;

public class AddBook {
    public static void addBook(Book book) {
        AppContext.getListBook().add(book);
    }
}
