package BUOI2.mybookstore.ui.Admin;

import BUOI2.mybookstore.ui.Function.SearchBookScreen;
import BUOI2.mybookstore.ui.Function.ShowListBookScreen;
import BUOI2.mybookstore.ui.constants;

import java.util.Scanner;

public class GuestMainScreen {
    public static Scanner sc = new Scanner(System.in);
    public static void displayGuestMainMenu() {
        System.out.println("========== Tiệm sách của Tùng ==========");
        System.out.println("========== Vai trò: GUEST ==========");
        System.out.println();
        System.out.println("Danh sách chức năng");
        System.out.println("1. Tìm kiếm sách");
        System.out.println("2. Xem danh sách sách");
        System.out.println("0. Thoát");
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                constants.isLoggedIn = false;
                constants.authManager.Logout();
                break;
            case 1:
                constants.isShowingFunction = true;
                SearchBookScreen.displayResults();
                break;
            case 2:
                constants.isShowingFunction = true;
                ShowListBookScreen.displayListBookMenu();
                break;
        }
    }
}
