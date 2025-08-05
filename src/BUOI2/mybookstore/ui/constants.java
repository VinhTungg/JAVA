package BUOI2.mybookstore.ui;

import BUOI2.mybookstore.Account.MyAccount;
import BUOI2.mybookstore.managers.AuthManager;
import BUOI2.mybookstore.managers.BookStoreManager;
import BUOI2.mybookstore.models.Book;

import java.util.List;
import java.util.Scanner;

public class constants {
    public static boolean running = true;
    public static boolean isLoggedIn = false;
    public static AuthManager authManager = new AuthManager();
    public static String tableFormat = "| %-10s | %-17s | %-17s | %-17s | %-17s |";
    public static int idBook = 0;
    public static boolean isShowingFunction = false;
    public static Scanner sc = new Scanner(System.in);
    public static BookStoreManager myAccount = MyAccount.myAccount;
    public static List<Book> myAccountListBooks = MyAccount.myAccount.getListBooks();
}