package mystore.service.UserService;

import mystore.common.AppContext;
import mystore.models.User.Role;
import mystore.models.User.User;

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
