package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.Account.MyAccount;
import BUOI2.mybookstore.managers.BookStoreManager;
import BUOI2.mybookstore.models.Book;
import BUOI2.mybookstore.ui.constants;

import java.util.Scanner;

public class SearchBookScreen {
    public static BookStoreManager searchBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập từ khóa bạn muốn tìm kiếm: ");
        String keyword = sc.nextLine().toLowerCase();
        BookStoreManager foundBooks = new BookStoreManager();

        for (Book book : MyAccount.myAccount.getListBooks()) {
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
        while (constants.isShowingFunction) {
            BookStoreManager foundBooks = searchBook();
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
            else if (choice == 0) {
                constants.isShowingFunction = false; break;}
        }
    }
}
