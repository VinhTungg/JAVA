package mystore.common;

import mystore.models.Product.Product;
import mystore.models.User.User;

import java.util.ArrayList;

public class AppContext {
    private static User user = null;
    private static ArrayList<Product> listProduct = new ArrayList<>();

    public static ArrayList<Product> getListProducts() { return listProduct; }
    public static User getUser() { return user; }

    public static void setUser(User user) { AppContext.user = user; }
}
