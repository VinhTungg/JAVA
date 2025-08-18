package BUOI2.mybookstore.service.ProductService;

import static BUOI2.mybookstore.common.constants.*;
import BUOI2.mybookstore.models.Product.Book;

import java.util.ArrayList;

public class ShowList {
    public static void printAllBooks(ArrayList<Book> books) {
        System.out.println(String.format(tableFormat, "Số thứ tự", "Tiêu đề", "Tác giả", "Thể loại", "Ngày xuất bản"));
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
