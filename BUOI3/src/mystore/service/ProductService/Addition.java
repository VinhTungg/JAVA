package mystore.service.ProductService;

import static mystore.common.constants.*;
import mystore.models.Product.Book;
import mystore.models.Product.Notebook;
import mystore.models.Product.Pen;
import mystore.models.Product.Pencil;

public class Addition {
    public static void addBook(Book book) { listProducts.add(book); }

    public static void addNotebook(Notebook notebook) { listProducts.add(notebook); }

    public static void addPen(Pen pen) { listProducts.add(pen); }

    public static void addPencil(Pencil pencil) { listProducts.add(pencil); }
}
