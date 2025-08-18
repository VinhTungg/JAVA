package BUOI2.mybookstore.service.UserService;

import BUOI2.mybookstore.view.FucntionView.AddBookView;
import BUOI2.mybookstore.view.FucntionView.RemoveBookView;
import BUOI2.mybookstore.view.FucntionView.SearchBookView;
import BUOI2.mybookstore.view.FucntionView.ShowListBookScreen;
import BUOI2.mybookstore.view.FucntionView.UpdateBookScreen;
import static BUOI2.mybookstore.common.constants.*;
import static BUOI2.mybookstore.service.OtherService.isValidValue.isValid;

public class Menu {
    public void AdminMenuService() {
        isValid();
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                isLoggedIn = false;
                Logout.logout();
                break;
            case 1:
                AddBookView.displayAddBookMenu();
                break;
            case 2:
                RemoveBookView.eraseBook();
                break;
            case 3:
                UpdateBookScreen.updateBook();
                break;
            case 4:
                isShowingFunction = true;
                SearchBookView.displayResults();
                break;
            case 5:
                isShowingFunction = true;
                ShowListBookScreen.displayListBookMenu();
                break;
        }
    }
    public void GuestMenuService() {
        isValid();
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                isLoggedIn = false;
                Logout.logout();
                break;
            case 1:
                isShowingFunction = true;
                SearchBookView.displayResults();
                break;
            case 2:
                isShowingFunction = true;
                ShowListBookScreen.displayListBookMenu();
                break;
        }
    }
}
