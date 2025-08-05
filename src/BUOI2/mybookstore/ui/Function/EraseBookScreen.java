package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.Account.AdminAccount;
import BUOI2.mybookstore.ui.menu;

import java.util.Scanner;

public class EraseBookScreen {
    public static void eraseBook() {
        Scanner sc = new Scanner(System.in);
        ShowListBookScreen.displayListBookMenu();
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập id sách muốn xóa: ");
        while (!sc.hasNextInt()) {
            System.out.println("Lỗi dữ liệu !");
            System.out.print("Vui lòng nhập một số hợp lệ: ");
            sc.next();
        }
        menu.idBook = sc.nextInt();
        while (menu.idBook < 1 || menu.idBook > AdminAccount.myAccount.getListBooks().size()) {
            if (menu.idBook == 0) {return;}
            System.out.print("Không tìm thấy sách để xóa, vui lòng nhập lại: ");
            menu.idBook = sc.nextInt();
        }
        AdminAccount.myAccount.removeBook(AdminAccount.myAccount.getListBooks().get(menu.idBook - 1));
        System.out.println("Xóa sách thành công !");
        System.out.println();
        menu.idBook = 0;
    }
}
