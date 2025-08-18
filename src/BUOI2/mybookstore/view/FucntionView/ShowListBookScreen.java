package BUOI2.mybookstore.view.FucntionView;

import BUOI2.mybookstore.service.ProductService.ShowList;

import static BUOI2.mybookstore.service.OtherService.isValidValue.isValid;
import static BUOI2.mybookstore.common.constants.*;

public class ShowListBookScreen {
    public static void displayListBookMenu() {
        if (ListBooks.isEmpty()) {
            System.out.println("Không có sách trong danh sách !");
        } else {
            ShowList.printAllBooks(ListBooks);
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
