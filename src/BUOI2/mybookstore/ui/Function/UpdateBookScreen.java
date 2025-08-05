package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.models.Book;

import static BUOI2.mybookstore.ui.Function.ShowListBookScreen.displayListBookMenu;
import static BUOI2.mybookstore.ui.Function.isValidValue.isValid;
import static BUOI2.mybookstore.ui.constants.*;

public class UpdateBookScreen {
    public static void updateBook() {
        displayListBookMenu();
        if (myAccountListBooks.isEmpty()) return;
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập id sách muốn cập nhật: ");
        isValid();
        idBook = sc.nextInt();
        while (idBook < 1 || idBook > myAccountListBooks.size()) {
            if (idBook == 0) return;
            System.out.print("Không tìm thấy sách để cập nhật, vui lòng nhập lại: ");
            isValid();
            idBook = sc.nextInt();
        }
        sc.nextLine();
        Book bookToUpdate = myAccountListBooks.get(idBook - 1);
        System.out.print("Nhập tên sách: ");
        String newTitle = sc.nextLine();
        if (newTitle.isEmpty()) { newTitle = bookToUpdate.getTitle(); }
        System.out.print("Nhập tên tác giả: ");
        String newAuthor = sc.nextLine();
        if (newAuthor.isEmpty()) { newAuthor = bookToUpdate.getAuthor(); }
        System.out.print("Nhập tên thể loại: ");
        String newGenre = sc.nextLine();
        if (newGenre.isEmpty()) { newGenre = bookToUpdate.getGenre(); }
        System.out.print("Nhập ngày xuất bản: ");
        String newPublishDate = sc.nextLine();
        if (newPublishDate.isEmpty()) { newPublishDate = bookToUpdate.getPublishDate(); }
        myAccount.updateBook(bookToUpdate, newTitle, newAuthor, newGenre, newPublishDate);
        System.out.println("Cập nhật sách thành công !");
        System.out.println();
    }
}
