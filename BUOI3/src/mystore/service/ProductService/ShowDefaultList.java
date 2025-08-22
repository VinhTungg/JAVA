package mystore.service.ProductService;

import mystore.models.Product.*;

import java.util.ArrayList;

public class ShowDefaultList {
    public static void printDefaultList(ArrayList<Product> Products) {
        System.out.println("Danh sách sản phẩm tìm kiếm được: ");
        for (Product p : Products) {
            if (p instanceof Book book)
                System.out.println(book);
            else if (p instanceof Pen pen)
                System.out.println(pen);
            else if (p instanceof Pencil pencil)
                System.out.println(pencil);
            else if (p instanceof Notebook nb)
                System.out.println(nb);
        }
    }
}
