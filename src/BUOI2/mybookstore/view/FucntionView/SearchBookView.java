package BUOI2.mybookstore.view.FucntionView;

import BUOI2.mybookstore.models.Product.Book;
import BUOI2.mybookstore.service.ProductService.SearchBook;
import BUOI2.mybookstore.service.ProductService.ShowList;

import java.util.ArrayList;

import static BUOI2.mybookstore.service.ProductService.SearchBook.removeDiacritics;
import static BUOI2.mybookstore.service.OtherService.isValidValue.isValid;
import static BUOI2.mybookstore.common.constants.*;

public class SearchBookView {

    public static ArrayList<Book> search() {
        System.out.print("Nhập từ khóa bạn muốn tìm kiếm: ");
        sc.nextLine();
        String keyword = removeDiacritics(sc.nextLine()).toLowerCase();
        return SearchBook.searchBook(keyword);
    }
    public static void displayResults() {
        while (isShowingFunction) {
            ArrayList<Book> foundBooks = search();
            if (foundBooks.isEmpty()) {
                System.out.println("Không tìm thấy sách !");
            } else {
                ShowList.printAllBooks(foundBooks);
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
