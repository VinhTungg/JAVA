package mystore;

import mystore.view.LoginView;
import mystore.view.MenuView;

import static mystore.common.constants.*;

public class Main {
    public static void main(String[] args) {
        while (running) {
            if (!isLoggedIn) {
                LoginView.displayLoginMenu();
            }
            else {
                MenuView.displayMenuView();
            }
        }
    }
}