package mystore.service.UserService;

import mystore.common.AppContext;

public class Logout {
    public static void logout() {
        AppContext.setUser(null);
    }
}
