package BUOI2.mybookstore;

import BUOI2.mybookstore.managers.AuthManager;
import BUOI2.mybookstore.ui.Admin.AdminMainScreen;
import BUOI2.mybookstore.ui.Admin.GuestMainScreen;
import BUOI2.mybookstore.ui.LoginScreen;
import BUOI2.mybookstore.ui.constants;

public class Main {
    public static void main(String[] args) {
        while (constants.running == true) {
            if (!constants.isLoggedIn) {
                LoginScreen.displayLoginMenu();
            }
            else {
                if (constants.authManager.getCurrentUserRole() == AuthManager.UserRole.ADMIN) {
                    AdminMainScreen.displayAdminMainMenu();
                }
                else if (constants.authManager.getCurrentUserRole() == AuthManager.UserRole.GUEST) {
                    GuestMainScreen.displayGuestMainMenu();
                }
            }
        }
    }
}