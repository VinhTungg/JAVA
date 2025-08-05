package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.models.Book;
import BUOI2.mybookstore.Account.AdminAccount;
import java.util.Scanner;

public class AddBookScreen {
    public static void displayAddBookMenu() {
        String title, author, genre, publishDate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập số sách muốn thêm: ");
        while (!sc.hasNextInt()) {
            System.out.println("Lỗi dữ liệu !");
            System.out.print("Vui lòng nhập lại số: ");
            sc.next();
        }
        int num = sc.nextInt();
        if (num == 0) { return; }
        sc.nextLine();
        for (int i = 0; i < num; ++i) {
            System.out.println("Sách thứ " + (i + 1) + ":");
            System.out.print("Nhập tên sách: ");
            title = sc.nextLine().trim();
            System.out.print("Nhập tên tác giả: ");
            author = sc.nextLine().trim();
            System.out.print("Nhập thể loại sách: ");
            genre = sc.nextLine().trim();
            System.out.print("Nhập ngày xuất bản: ");
            publishDate = sc.nextLine().trim();
            Book book = new Book(AdminAccount.myAccount.getListBooks().size() + 1, title, author, genre, publishDate);
            AdminAccount.myAccount.addBook(book);
            System.out.println("Thêm sách thành công !");
            System.out.println();
        }
    }
}
