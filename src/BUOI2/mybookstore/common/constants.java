package BUOI2.mybookstore.common;

import BUOI2.mybookstore.models.Product.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class constants {
    public static boolean running = true;
    public static boolean isLoggedIn = false;
    public static String tableFormat = "| %-10s | %-30s | %-20s | %-20s | %-20s |";
    public static int idBook = 0;
    public static boolean isShowingFunction = false;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Book> ListBooks = AppContext.getListBook();
}