package mystore.view;

import mystore.common.AppContext;
import mystore.models.User.Role;
import mystore.service.UserService.Menu;

public class MenuView {
    public static void displayMenuView() {
        int fucntionCount = 1;
        System.out.println("========== Cửa hàng của Tùng ==========");
        System.out.println("========== Vai trò: " + AppContext.getUser().getRole() + " ==========");
        System.out.println();
        System.out.println("Danh sách chức năng");
        if (AppContext.getUser().getRole() == Role.ADMIN) {
            System.out.println(fucntionCount++ + ". Thêm sản phẩm mới");
            System.out.println(fucntionCount++ + ". Xóa sản phẩm");
            System.out.println(fucntionCount++ + ". Sửa sản phẩm");
        }
        System.out.println(fucntionCount++ + ". Tìm kiếm sản phẩm");
        System.out.println(fucntionCount++ + ". Xem danh sách sản phẩm");
        System.out.println("0. Đăng xuất");
        Menu menuService = new Menu();
        if (AppContext.getUser().getRole() == Role.ADMIN)
            menuService.AdminMenuService();
        else
            menuService.GuestMenuService();
    }
}
