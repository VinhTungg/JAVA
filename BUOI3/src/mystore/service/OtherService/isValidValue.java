package mystore.service.OtherService;

import static mystore.common.constants.sc;

public class isValidValue {
    public static void isValid() {
        while (!sc.hasNextInt()) {
            System.out.println("Lỗi dữ liệu !");
            System.out.print("Vui lòng nhập một số hợp lệ: ");
            sc.next();
        }
    }
}
