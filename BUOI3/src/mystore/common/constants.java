package mystore.common;

import mystore.models.Product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class constants {
    public static boolean running = true;
    public static boolean isLoggedIn = false;
    public static String tableFormat = "| %-10s | %-25s | %-15s | %-15s | %-30s |%n";
    public static int idBook = 0;
    public static boolean isShowingFunction = false;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> listProducts = AppContext.getListProducts();
}