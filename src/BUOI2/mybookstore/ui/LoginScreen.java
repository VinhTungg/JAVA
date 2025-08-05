package BUOI2.mybookstore.ui;

import static BUOI2.mybookstore.ui.Function.isValidValue.isValid;
import static BUOI2.mybookstore.ui.constants.*;

public class LoginScreen {
    public static void displayLoginMenu() {
        System.out.println("=========== Chào mừng đến với hiệu sách Tùng đẹp trai ==========");
        System.out.println();
        System.out.println("1. Đăng nhập.");
        System.out.println("2. Tiếp tục như là khách.");
        System.out.println("0. Dừng chương trình.");
        isValid();
        int choice = sc.nextInt();
        sc.nextLine();
        String username, password;
        while (choice == 1) {
            System.out.print("Nhập tên tài khoản: ");
            username = sc.nextLine();
            if (username.trim().isEmpty()) {
                System.out.println("Tên tài khoản không được bỏ trống !");
                continue;
            }
            System.out.print("Nhập mật khẩu: ");
            password = sc.nextLine();
            if (password.trim().isEmpty()) {
                if (username.isEmpty()) {
                    System.out.println("Mật khẩu không được để trống !");
                    continue;
                }
            }
            if (authManager.Login(username, password)) {
                isLoggedIn = true;
                System.out.println("Chào mừng admin !");
                break;
            } else {
                System.out.println("Tài khoản hoặc mật khẩu không chính xác !");
            }
        }
        if (choice == 2) {
            isLoggedIn = true;
            System.out.println("Bạn đã đăng nhập với tư cách là khách.");
        }
        else if (choice == 0) {
            constants.running = false;
            System.out.println("Hẹn gặp lại quý khách !");
        }
    }
}
