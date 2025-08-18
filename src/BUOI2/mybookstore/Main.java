package BUOI2.mybookstore;

import BUOI2.mybookstore.view.LoginView;
import BUOI2.mybookstore.view.MenuView;

import static BUOI2.mybookstore.common.constants.*;

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