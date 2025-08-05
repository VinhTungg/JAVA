package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.Account.MyAccount;
import BUOI2.mybookstore.ui.constants;

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
        constants.idBook = sc.nextInt();
        while (constants.idBook < 1 || constants.idBook > MyAccount.myAccount.getListBooks().size()) {
            if (constants.idBook == 0) {return;}
            System.out.print("Không tìm thấy sách để xóa, vui lòng nhập lại: ");
            constants.idBook = sc.nextInt();
        }
        MyAccount.myAccount.removeBook(MyAccount.myAccount.getListBooks().get(constants.idBook - 1));
        System.out.println("Xóa sách thành công !");
        System.out.println();
        constants.idBook = 0;
    }
}
