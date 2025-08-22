package mystore.view.FucntionView;

import mystore.service.ProductService.ShowTableList;

import static mystore.service.OtherService.isValidValue.isValid;
import static mystore.common.constants.*;

public class ShowListProductView {
    public static void displayListBookMenu() {
        if (listProducts.isEmpty()) {
            System.out.println("Không có sản phẩm trong danh sách !");
        } else {
            ShowTableList.printTable(listProducts);
        }
        if (isShowingFunction) System.out.println("Nhấn 0 để quay lại.");
        while (isShowingFunction) {
            isValid();
            int choice = sc.nextInt();
            if (choice == 0) {
                isShowingFunction = false;
            } else {
                System.out.print("Chức năng không hợp lệ, vui lòng nhập lại: ");
            }
        }
    }
}
