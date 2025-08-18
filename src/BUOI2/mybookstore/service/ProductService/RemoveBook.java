package BUOI2.mybookstore.service.ProductService;

import static BUOI2.mybookstore.common.constants.ListBooks;

public class RemoveBook {
    public static void updateIdBook() {
        for (int i = 0; i < ListBooks.size(); ++i) {
            ListBooks.get(i).setId(i + 1);
        }
    }

    public static void removeBook(int id) {
        ListBooks.remove(id - 1);
    }
}
