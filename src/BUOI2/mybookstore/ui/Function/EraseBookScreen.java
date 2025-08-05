package BUOI2.mybookstore.ui.Function;

import static BUOI2.mybookstore.ui.constants.*;
import static BUOI2.mybookstore.ui.Function.ShowListBookScreen.*;
import static BUOI2.mybookstore.ui.Function.isValidValue.*;

public class EraseBookScreen {
    public static void updateIdBook() {
        for (int i = 0; i < myAccountListBooks.size(); ++i) {
            myAccountListBooks.get(i).setId(i + 1);
        }
    }
    public static void eraseBook() {
        displayListBookMenu();
        if (myAccountListBooks.isEmpty()) return;
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập id sách muốn xóa: ");
        isValid();
        idBook = sc.nextInt();
        while (idBook < 1 || idBook > myAccountListBooks.size()) {
            if (idBook == 0) return;
            System.out.print("Không tìm thấy sách để xóa, vui lòng nhập lại: ");
            isValid();
            idBook = sc.nextInt();
        }
        myAccount.removeBook(myAccountListBooks.get(idBook - 1));
        System.out.println("Xóa sách thành công !");
        System.out.println();
        updateIdBook();
        idBook = 0;
    }
}
