package BUOI2.mybookstore.ui.Function;

import static BUOI2.mybookstore.ui.Function.isValidValue.isValid;
import static BUOI2.mybookstore.ui.constants.*;

public class ShowListBookScreen {
    public static void displayListBookMenu() {
        if (myAccountListBooks.isEmpty()) {
            System.out.println("Không có sách trong danh sách !");
        } else {
            myAccount.printAllBooks(myAccountListBooks);
        }
        if (isShowingFunction) System.out.println("Nhấn 0 để quay lại.");
        while (isShowingFunction) {
            isValid();
            int choice = sc.nextInt();
            if (choice == 0) {
                isShowingFunction = false;
            } else {
                System.out.print("Chức năng không hợp lệ, vui lòng nhập lại: ");
            }
        }
    }
}
