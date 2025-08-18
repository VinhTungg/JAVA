package BUOI2.mybookstore.common;

import BUOI2.mybookstore.models.Product.Book;
import BUOI2.mybookstore.models.User.User;

import java.util.ArrayList;

public class AppContext {
    private static User user = null;
    private static ArrayList<Book> listBook = new ArrayList<>();

    public static ArrayList<Book> getListBook() { return listBook; }
    public static User getUser() { return user; }

    public static void setUser(User user) { AppContext.user = user; }
}
