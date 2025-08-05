package BUOI2.mybookstore.managers;

public class AuthManager {

    public enum UserRole {
        ADMIN, GUEST
    }

    private UserRole currentUserRole;

    public AuthManager() {
        this.currentUserRole = UserRole.GUEST;
    }

    public boolean Login(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            this.currentUserRole = UserRole.ADMIN;
            return true;
        }
        return false;
    }

    public void Logout() {
        this.currentUserRole = UserRole.GUEST;
    }

    public UserRole getCurrentUserRole() { return this.currentUserRole; }
}