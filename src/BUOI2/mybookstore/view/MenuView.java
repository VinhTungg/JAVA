package BUOI2.mybookstore.view;

import BUOI2.mybookstore.common.AppContext;
import BUOI2.mybookstore.models.User.Role;
import BUOI2.mybookstore.service.UserService.Menu;

public class MenuView {
    public static void displayMenuView() {
        int fucntionCount = 1;
        System.out.println("========== Tiệm sách của Tùng ==========");
        System.out.println("========== Vai trò: " + AppContext.getUser().getRole() + " ==========");
        System.out.println();
        System.out.println("Danh sách chức năng");
        if (AppContext.getUser().getRole() == Role.ADMIN) {
            System.out.println(fucntionCount++ + ". Thêm sách mới");
            System.out.println(fucntionCount++ + ". Xóa sách");
            System.out.println(fucntionCount++ + ". Sửa sách");
        }
        System.out.println(fucntionCount++ + ". Tìm kiếm sách");
        System.out.println(fucntionCount++ + ". Xem danh sách sách");
        System.out.println("0. Đăng xuất");
        Menu menuService = new Menu();
        if (AppContext.getUser().getRole() == Role.ADMIN)
            menuService.AdminMenuService();
        else
            menuService.GuestMenuService();
    }
}
