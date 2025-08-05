package BUOI2.mybookstore.ui.Admin;

import BUOI2.mybookstore.ui.Function.*;
import BUOI2.mybookstore.ui.menu;

import java.util.Scanner;

public class AdminMainScreen {
    public static Scanner sc = new Scanner(System.in);
    public static void displayAdminMainMenu() {
        System.out.println("========== Tiệm sách của Tùng ==========");
        System.out.println("========== Vai trò: ADMIN ==========");
        System.out.println();
        System.out.println("Danh sách chức năng");
        System.out.println("1. Thêm sách mới");
        System.out.println("2. Xóa sách");
        System.out.println("3. Sửa sách");
        System.out.println("4. Tìm kiếm sách");
        System.out.println("5. Xem danh sách sách");
        System.out.println("0. Đăng xuất");
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                menu.isLoggedIn = false;
                menu.authManager.Logout();
                break;
            case 1:
                AddBookScreen.displayAddBookMenu();
                break;
            case 2:
                EraseBookScreen.eraseBook();
                break;
            case 3:
                UpdateBookScreen.updateBook();
                break;
            case 4:
                menu.isShowingFunction = true;
                SearchBookScreen.displayResults();
                break;
            case 5:
                menu.isShowingFunction = true;
                ShowListBookScreen.displayListBookMenu();
                break;
        }
    }
}
