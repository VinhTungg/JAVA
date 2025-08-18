package BUOI2.mybookstore.models.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String username, password;

    private Role role;

    public User() { }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
