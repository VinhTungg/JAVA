package BUOI2.mybookstore.view.FucntionView;

import BUOI2.mybookstore.service.ProductService.RemoveBook;

import static BUOI2.mybookstore.common.constants.*;
import static BUOI2.mybookstore.service.ProductService.RemoveBook.updateIdBook;
import static BUOI2.mybookstore.view.FucntionView.ShowListBookScreen.*;
import static BUOI2.mybookstore.service.OtherService.isValidValue.*;

public class RemoveBookView {

    public static void eraseBook() {
        displayListBookMenu();
        if (ListBooks.isEmpty()) return;
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập id sách muốn xóa: ");
        isValid();
        idBook = sc.nextInt();
        while (idBook < 1 || idBook > ListBooks.size()) {
            if (idBook == 0) return;
            System.out.print("Không tìm thấy sách để xóa, vui lòng nhập lại: ");
            isValid();
            idBook = sc.nextInt();
        }
        RemoveBook.removeBook(idBook);
        System.out.println("Xóa sách thành công !");
        System.out.println();
        updateIdBook();
        idBook = 0;
    }
}
