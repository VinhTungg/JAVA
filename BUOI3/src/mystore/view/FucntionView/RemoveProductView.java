package mystore.view.FucntionView;

import mystore.service.ProductService.Removement;

import static mystore.common.constants.*;
import static mystore.service.ProductService.Removement.updateId;
import static mystore.view.FucntionView.ShowListProductView.*;
import static mystore.service.OtherService.isValidValue.*;

public class RemoveProductView {

    public static void eraseBook() {
        displayListBookMenu();
        if (listProducts.isEmpty()) return;
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập id sản phẩm muốn xóa: ");
        isValid();
        idBook = sc.nextInt();
        while (idBook < 1 || idBook > listProducts.size()) {
            if (idBook == 0) return;
            System.out.print("Không tìm thấy sản phẩm để xóa, vui lòng nhập lại: ");
            isValid();
            idBook = sc.nextInt();
        }
        Removement.removeProducts(idBook);
        System.out.println("Xóa sản phẩm thành công !");
        System.out.println();
        updateId();
        idBook = 0;
    }
}
