package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.Account.AdminAccount;
import BUOI2.mybookstore.managers.LibraryManager;
import BUOI2.mybookstore.models.Book;
import BUOI2.mybookstore.ui.menu;

import java.util.Scanner;

public class SearchBookScreen {
    public static LibraryManager searchBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập từ khóa bạn muốn tìm kiếm: ");
        String keyword = sc.nextLine().toLowerCase();
        LibraryManager foundBooks = new LibraryManager();

        for (Book book : AdminAccount.myAccount.getListBooks()) {
            if (book.getTitle().toLowerCase().contains(keyword) ||
                    book.getAuthor().toLowerCase().contains(keyword) ||
                    book.getGenre().toLowerCase().contains(keyword) ||
                    book.getPublishDate().toLowerCase().contains(keyword)) {
                foundBooks.getListBooks().add(book);
            }
        }

        return foundBooks;
    }
    public static void displayResults() {
        Scanner sc = new Scanner(System.in);
        while (menu.isShowingFunction) {
            LibraryManager foundBooks = searchBook();
            if (foundBooks.getListBooks().isEmpty()) {
                System.out.println("Không tìm thấy sách !");
            } else {
                foundBooks.printAllBooks(foundBooks.getListBooks());
            }
            System.out.println("1. Tìm kiếm khác.");
            System.out.println("0. Quay lại.");
            while (!sc.hasNextInt()) {
                System.out.println("Lỗi dữ liệu !");
                System.out.print("Vui lòng nhập lại: ");
                sc.next();
            }
            int choice = sc.nextInt();
            while (choice < 0 || choice > 1) {
                System.out.print("Chức năng không hợp lệ, vui lòng nhập lại: ");
                choice = sc.nextInt();
            }
            if (choice == 1) continue;
            else if (choice == 0) {menu.isShowingFunction = false; break;}
        }
    }
}
