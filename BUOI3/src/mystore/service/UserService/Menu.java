package mystore.service.UserService;

import mystore.view.FucntionView.AddProductView;
import mystore.view.FucntionView.RemoveProductView;
import mystore.view.FucntionView.SearchProductView;
import mystore.view.FucntionView.ShowListProductView;
import mystore.view.FucntionView.UpdateBookView;
import static mystore.common.constants.*;
import static mystore.service.OtherService.isValidValue.isValid;

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
                AddProductView.displayAddBookMenu();
                break;
            case 2:
                RemoveProductView.eraseBook();
                break;
            case 3:
                UpdateBookView.updateBook();
                break;
            case 4:
                isShowingFunction = true;
                SearchProductView.displayResults();
                break;
            case 5:
                isShowingFunction = true;
                ShowListProductView.displayListBookMenu();
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
                SearchProductView.displayResults();
                break;
            case 2:
                isShowingFunction = true;
                ShowListProductView.displayListBookMenu();
                break;
        }
    }
}
