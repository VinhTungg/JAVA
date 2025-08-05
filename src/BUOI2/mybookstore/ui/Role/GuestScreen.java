package BUOI2.mybookstore.ui.Role;

import static BUOI2.mybookstore.ui.Function.SearchBookScreen.displayResults;
import static BUOI2.mybookstore.ui.Function.ShowListBookScreen.displayListBookMenu;
import static BUOI2.mybookstore.ui.Function.isValidValue.isValid;
import static BUOI2.mybookstore.ui.constants.authManager;
import static BUOI2.mybookstore.ui.constants.*;

public class GuestScreen {
    public static void displayGuestMainMenu() {
        System.out.println("========== Tiệm sách của Tùng ==========");
        System.out.println("========== Vai trò: GUEST ==========");
        System.out.println();
        System.out.println("Danh sách chức năng");
        System.out.println("1. Tìm kiếm sách");
        System.out.println("2. Xem danh sách sách");
        System.out.println("0. Thoát");
        isValid();
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                isLoggedIn = false;
                authManager.Logout();
                break;
            case 1:
                isShowingFunction = true;
                displayResults();
                break;
            case 2:
                isShowingFunction = true;
                displayListBookMenu();
                break;
        }
    }
}
