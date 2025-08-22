package mystore.service.ProductService;

import static mystore.common.constants.listProducts;

public class Removement {
    public static void updateId() {
        for (int i = 0; i < listProducts.size(); ++i) {
            listProducts.get(i).setId(i + 1);
        }
    }

    public static void removeProducts(int id) {
        listProducts.remove(id - 1);
    }
}
