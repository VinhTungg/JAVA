package BUOI2.mybookstore.ui.Role;

import static BUOI2.mybookstore.ui.Function.AddBookScreen.displayAddBookMenu;
import static BUOI2.mybookstore.ui.Function.EraseBookScreen.eraseBook;
import static BUOI2.mybookstore.ui.Function.SearchBookScreen.displayResults;
import static BUOI2.mybookstore.ui.Function.ShowListBookScreen.displayListBookMenu;
import static BUOI2.mybookstore.ui.Function.UpdateBookScreen.updateBook;
import static BUOI2.mybookstore.ui.Function.isValidValue.isValid;
import static BUOI2.mybookstore.ui.constants.*;

public class AdminScreen {
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
        isValid();
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                isLoggedIn = false;
                authManager.Logout();
                break;
            case 1:
                displayAddBookMenu();
                break;
            case 2:
                eraseBook();
                break;
            case 3:
                updateBook();
                break;
            case 4:
                isShowingFunction = true;
                displayResults();
                break;
            case 5:
                isShowingFunction = true;
                displayListBookMenu();
                break;
        }
    }
}
