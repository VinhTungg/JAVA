package mystore.view.FucntionView;

import mystore.models.Product.Product;
import mystore.service.ProductService.Search;
import mystore.service.ProductService.ShowDefaultList;
import mystore.service.ProductService.ShowTableList;

import java.util.ArrayList;

import static mystore.service.ProductService.Search.removeDiacritics;
import static mystore.service.OtherService.isValidValue.isValid;
import static mystore.common.constants.*;

public class SearchProductView {

    public static ArrayList<Product> search() {
        System.out.print("Nhập từ khóa bạn muốn tìm kiếm: ");
        sc.nextLine();
        String keyword = removeDiacritics(sc.nextLine()).toLowerCase();
        return Search.searchProducts(keyword);
    }
    public static void displayResults() {
        while (isShowingFunction) {
            ArrayList<Product> foundBooks = search();
            if (foundBooks.isEmpty()) {
                System.out.println("Không tìm thấy sản phẩm !");
            } else {
                System.out.println("Nhập dạng muốn hiển thị\n1. Dạng bảng\n2. Dạng danh sách");
                isValid();
                int choice = sc.nextInt();
                while (choice < 1 || choice > 2) {
                    System.out.print("Vui lòng nhập chức năng khả dụng: ");
                    isValid();
                    choice = sc.nextInt();
                }
                if (choice == 1)
                    ShowTableList.printTable(foundBooks);
                else
                    ShowDefaultList.printDefaultList(foundBooks);
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
