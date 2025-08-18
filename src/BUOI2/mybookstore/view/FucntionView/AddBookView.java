package BUOI2.mybookstore.view.FucntionView;

import BUOI2.mybookstore.models.Product.Book;
import BUOI2.mybookstore.service.ProductService.AddBook;

import static BUOI2.mybookstore.common.constants.*;
import static BUOI2.mybookstore.service.OtherService.isValidValue.*;

public class AddBookView {
    public static void displayAddBookMenu() {
        String title, author, genre, publishDate;
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập số sách muốn thêm: ");
        isValid();
        int num = sc.nextInt();
        if (num == 0) return;
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
            Book book = new Book(ListBooks.size() + 1, title, author, genre, publishDate);
            AddBook.addBook(book);
            System.out.println("Thêm sách thành công !");
            System.out.println();
        }
    }
}
