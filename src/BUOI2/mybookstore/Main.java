package BUOI2.mybookstore;

import BUOI2.mybookstore.managers.AuthManager;
import BUOI2.mybookstore.ui.Admin.AdminMainScreen;
import BUOI2.mybookstore.ui.Admin.GuestMainScreen;
import BUOI2.mybookstore.ui.LoginScreen;
import BUOI2.mybookstore.ui.menu;

public class Main {
    public static void main(String[] args) {
        while (menu.running == true) {
            if (!menu.isLoggedIn) {
                LoginScreen.displayLoginMenu();
            }
            else {
                if (menu.authManager.getCurrentUserRole() == AuthManager.UserRole.ADMIN) {
                    AdminMainScreen.displayAdminMainMenu();
                }
                else if (menu.authManager.getCurrentUserRole() == AuthManager.UserRole.GUEST) {
                    GuestMainScreen.displayGuestMainMenu();
                }
            }
        }
    }
}