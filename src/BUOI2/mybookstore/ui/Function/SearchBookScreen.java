package BUOI2.mybookstore.ui.Function;

import java.text.Normalizer;
import java.util.regex.Pattern;
import BUOI2.mybookstore.managers.BookStoreManager;
import BUOI2.mybookstore.models.Book;

import static BUOI2.mybookstore.ui.Function.isValidValue.isValid;
import static BUOI2.mybookstore.ui.constants.*;

public class SearchBookScreen {
    public static String removeDiacritics(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");
    }

    public static BookStoreManager searchBook() {
        System.out.print("Nhập từ khóa bạn muốn tìm kiếm: ");
        sc.nextLine();
        String keyword = removeDiacritics(sc.nextLine()).toLowerCase();
        BookStoreManager foundBooks = new BookStoreManager();

        for (Book book : myAccountListBooks) {
            if (removeDiacritics(book.getTitle()).toLowerCase().contains(keyword) ||
                    removeDiacritics(book.getAuthor()).toLowerCase().contains(keyword) ||
                    removeDiacritics(book.getGenre()).toLowerCase().contains(keyword) ||
                    removeDiacritics(book.getPublishDate()).toLowerCase().contains(keyword))
            {
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
            if (choice == 0)
                isShowingFunction = false;
        }
    }
}
