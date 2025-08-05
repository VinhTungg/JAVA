package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.Account.AdminAccount;

import java.util.Scanner;
import static BUOI2.mybookstore.ui.menu.isShowingFunction;

public class ShowListBookScreen {
    public static void displayListBookMenu() {
        if (AdminAccount.myAccount.getListBooks().isEmpty()) {
            System.out.println("Không có sách trong danh sách !");
        } else {
            AdminAccount.myAccount.printAllBooks(AdminAccount.myAccount.getListBooks());
        }
        if (isShowingFunction) System.out.println("Nhấn 0 để quay lại.");
        while (isShowingFunction) {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 0) {
                isShowingFunction = false;
            } else {
                System.out.print("Chức năng không hợp lệ, vui lòng nhập lại: ");
            }
        }
    }
}
