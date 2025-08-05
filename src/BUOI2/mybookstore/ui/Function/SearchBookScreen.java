package BUOI2.mybookstore.ui.Function;

import BUOI2.mybookstore.managers.BookStoreManager;
import BUOI2.mybookstore.models.Book;
import BUOI2.mybookstore.ui.constants;

import static BUOI2.mybookstore.ui.Function.isValidValue.isValid;
import static BUOI2.mybookstore.ui.constants.*;

public class SearchBookScreen {
    public static BookStoreManager searchBook() {
        System.out.print("Nhập từ khóa bạn muốn tìm kiếm: ");
        sc.nextLine();
        String keyword = sc.nextLine().toLowerCase();
        BookStoreManager foundBooks = new BookStoreManager();

        for (Book book : myAccountListBooks) {
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
        while (isShowingFunction) {
            BookStoreManager foundBooks = searchBook();
            if (foundBooks.getListBooks().isEmpty()) {
                System.out.println("Không tìm thấy sách !");
            } else {
                foundBooks.printAllBooks(foundBooks.getListBooks());
            }
            System.out.println("1. Tìm kiếm khác.");
            System.out.println("0. Quay lại.");
            isValid();
            int choice = sc.nextInt();
            while (choice < 0 || choice > 1) {
                System.out.print("Chức năng không hợp lệ, vui lòng nhập lại: ");
                isValid();
                choice = sc.nextInt();
            }
            if (choice == 1) continue;
            else if (choice == 0) {
                constants.isShowingFunction = false; break;}
        }
    }
}
