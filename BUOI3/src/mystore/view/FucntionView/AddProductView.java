package mystore.view.FucntionView;

import mystore.models.Product.Book;
import mystore.models.Product.Notebook;
import mystore.models.Product.Pen;
import mystore.models.Product.Pencil;
import mystore.service.ProductService.Addition;

import static mystore.common.constants.*;
import static mystore.service.OtherService.isValidValue.*;

public class AddProductView {
    public static void displayAddBookMenu() {
        String name, brand, color, material, type, author, genre, publishDate, publishingHouse, language, hardness, size;
        int numberOfPage, sellPrice;
        double smoothness;
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập số sản phẩm muốn thêm: ");
        isValid();
        int num = sc.nextInt();
        sc.nextLine();
        if (num == 0) return;

        for (int i = 0; i < num; ++i) {
            System.out.print("Nhập loại sản phầm: ");
            String typeProduct = sc.nextLine().trim().toLowerCase();
            while (!typeProduct.equals("book") && !typeProduct.equals("pen") && !typeProduct.equals("notebook") && !typeProduct.equals("pencil")) {
                System.out.print("Không có loại sản phẩm này, vui lòng nhập lại: ");
                typeProduct = sc.nextLine().trim().toLowerCase();
            }
            System.out.println("Sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Nhập tên sản phẩm: ");
            name = sc.nextLine().trim();
            System.out.print("Nhập giá bán: ");
            isValid();
            sellPrice = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập thương hiệu: ");
            brand = sc.nextLine().trim();
            switch (typeProduct) {
                case "book" -> {
                    System.out.print("Nhập thể loại: ");
                    genre = sc.nextLine().trim();
                    System.out.print("Nhập tác giả: ");
                    author = sc.nextLine().trim();
                    System.out.print("Nhập nhà xuất bản: ");
                    publishingHouse = sc.nextLine().trim();
                    System.out.print("Nhập năm xuất bản: ");
                    publishDate = sc.nextLine().trim();
                    System.out.print("Nhập ngôn ngữ: ");
                    language = sc.nextLine().trim();

                    Addition.addBook(new Book(i + 1, name, sellPrice, brand, author, genre, publishDate, publishingHouse, language));
                }
                case "pen" -> {
                    System.out.print("Nhập màu sắc: ");
                    color = sc.nextLine().trim();
                    System.out.print("Nhập chất liệu: ");
                    material = sc.nextLine().trim();
                    System.out.print("Nhập loại mực: ");
                    type = sc.nextLine().trim();
                    System.out.print("Nhập độ mịn: ");
                    smoothness = Double.parseDouble(sc.nextLine().trim());

                    Addition.addPen(new Pen(i + 1, name, sellPrice, brand, color, material, type, smoothness));
                }
                case "notebook" -> {
                    System.out.print("Nhập số trang: ");
                    numberOfPage = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Nhập loại vở: ");
                    type = sc.nextLine().trim();
                    System.out.print("Nhập màu sắc bìa: ");
                    color = sc.nextLine().trim();
                    System.out.print("Nhập chất liệu giấy: ");
                    material = sc.nextLine().trim();
                    System.out.print("Nhập kích cỡ: ");
                    size = sc.nextLine().trim();

                    Addition.addNotebook(new Notebook(i + 1, name, sellPrice, brand, numberOfPage, type, color, material, size));
                }
                case "pencil" -> {
                    System.out.print("Nhập màu sắc: ");
                    color = sc.nextLine().trim();
                    System.out.print("Nhập chất liệu: ");
                    material = sc.nextLine().trim();
                    System.out.print("Nhập độ cứng: ");
                    hardness = sc.nextLine().trim();

                    Addition.addPencil(new Pencil(i + 1, name, sellPrice, brand, color, material, hardness));
                }
            }
        }
    }
}
