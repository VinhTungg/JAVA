package BUOI2.mybookstore;

import BUOI2.mybookstore.managers.AuthManager;

import static BUOI2.mybookstore.ui.LoginScreen.displayLoginMenu;
import static BUOI2.mybookstore.ui.Role.AdminScreen.displayAdminMainMenu;
import static BUOI2.mybookstore.ui.Role.GuestScreen.displayGuestMainMenu;
import static BUOI2.mybookstore.ui.constants.*;

public class Main {
    public static void main(String[] args) {
        while (running) {
            if (!isLoggedIn) {
                displayLoginMenu();
            }
            else {
                if (authManager.getCurrentUserRole() == AuthManager.UserRole.ADMIN) {
                    displayAdminMainMenu();
                }
                else if (authManager.getCurrentUserRole() == AuthManager.UserRole.GUEST) {
                    displayGuestMainMenu();
                }
            }
        }
    }
}