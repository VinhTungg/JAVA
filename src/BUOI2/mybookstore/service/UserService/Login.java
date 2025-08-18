package BUOI2.mybookstore.service.UserService;

import BUOI2.mybookstore.common.AppContext;
import BUOI2.mybookstore.models.User.Role;
import BUOI2.mybookstore.models.User.User;

public class Login {
    public boolean checkLogin(User user) {
        if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
            user.setRole(Role.ADMIN);
            AppContext.setUser(user);
            return true;
        }
        return false;
    }
}
