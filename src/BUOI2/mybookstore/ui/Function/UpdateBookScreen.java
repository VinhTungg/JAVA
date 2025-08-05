package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.Account.AdminAccount;
import BUOI2.mybookstore.models.Book;
import BUOI2.mybookstore.ui.menu;

import java.util.Scanner;

public class UpdateBookScreen {
    public static void updateBook() {
        Scanner sc = new Scanner(System.in);
        ShowListBookScreen.displayListBookMenu();
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập id sách muốn cập nhật: ");
        while (!sc.hasNextInt()) {
            System.out.println("Lỗi dữ liệu !");
            System.out.print("Vui lòng nhập một số hợp lệ: ");
            sc.next();
        }
        menu.idBook = sc.nextInt();
        while (menu.idBook < 1 || menu.idBook > AdminAccount.myAccount.getListBooks().size()) {
            if (menu.idBook == 0) { return; }
            System.out.print("Không tìm thấy sách để cập nhật, vui lòng nhập lại: ");
            menu.idBook = sc.nextInt();
        }
        sc.nextLine();
        Book bookToUpdate = AdminAccount.myAccount.getListBooks().get(menu.idBook - 1);
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
        AdminAccount.myAccount.updateBook(bookToUpdate, newTitle, newAuthor, newGenre, newPublishDate);
        System.out.println("Cập nhật sách thành công !");
        System.out.println();
    }
}
