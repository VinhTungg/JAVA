package BUOI2.mybookstore.ui;

import BUOI2.mybookstore.managers.AuthManager;

public class menu {
    public static boolean running = true;
    public static boolean isLoggedIn = false;
    public static AuthManager authManager = new AuthManager();
    public static String tableFormat = "| %-10s | %-17s | %-17s | %-17s | %-17s |";
    public static int idBook = 0;
    public static boolean isShowingFunction = false;
}