package BUOI2.mybookstore.service.UserService;

import BUOI2.mybookstore.common.AppContext;

public class Logout {
    public static void logout() {
        AppContext.setUser(null);
    }
}
