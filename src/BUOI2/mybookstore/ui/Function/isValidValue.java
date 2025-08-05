package BUOI2.mybookstore.ui.Function;

import static BUOI2.mybookstore.ui.constants.sc;

public class isValidValue {
    public static void isValid() {
        while (!sc.hasNextInt()) {
            System.out.println("Lỗi dữ liệu !");
            System.out.print("Vui lòng nhập một số hợp lệ: ");
            sc.next();
        }
    }
}
