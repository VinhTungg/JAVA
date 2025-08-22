package mystore.service.ProductService;

import static mystore.common.constants.*;

import mystore.models.Product.*;

import java.util.*;

public class ShowTableList {
    public static ArrayList<String> wrapText(String text, int maxWidth) {
        ArrayList<String> lines = new ArrayList<>();
        while (text.length() > maxWidth) {
            lines.add(text.substring(0, maxWidth));
            text = text.substring(maxWidth);
        }
        lines.add(text);
        return lines;
    }

    public static void printRow(String col1, String col2, String col3, String col4, String col5) {
        ArrayList<String> c1 = wrapText(col1, 10);
        ArrayList<String> c2 = wrapText(col2, 30);
        ArrayList<String> c3 = wrapText(col3, 20);
        ArrayList<String> c4 = wrapText(col4, 20);
        ArrayList<String> c5 = new ArrayList<>(Arrays.asList(col5.split("\n")));

        int maxLines = Math.max(c1.size(), Math.max(c2.size(), Math.max(c3.size(), Math.max(c4.size(), c5.size()))));

        for (int i = 0; i < maxLines; ++i) {
            System.out.printf(tableFormat,
                    i < c1.size() ? c1.get(i) : "",
                    i < c2.size() ? c2.get(i) : "",
                    i < c3.size() ? c3.get(i) : "",
                    i < c4.size() ? c4.get(i) : "",
                    i < c5.size() ? c5.get(i) : ""
            );
        }
    }
    public static void printTable(ArrayList<Product> Products) {
        System.out.println(String.format(tableFormat, "Số thứ tự", "Tên sản phẩm", "Giá bán", "Thương hiệu", "Thông tin thêm"));
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (Product p : Products) {
            if (p instanceof Book book)
                printRow(
                        Integer.toString(book.getId()), book.getName(), Integer.toString(book.getSellPrice()), book.getBrand(),
                        "- Thể loại: " + book.getGenre() + "\n" +
                        "- Tác giả: " + book.getAuthor() + "\n" +
                        "- Nhà xuất bản: " + book.getPublishingHouse() + "\n" +
                        "- Năm xuất bản: " + book.getPublishDate() + "\n" +
                        "- Ngôn ngữ: " + book.getLanguage()
                );
            else if (p instanceof Pen pen)
                printRow(
                        Integer.toString(pen.getId()), pen.getName(), Integer.toString(pen.getSellPrice()), pen.getBrand(),
                        "- Màu sắc: " + pen.getColor() + "\n" +
                        "- Chất liệu: " + pen.getMaterial() + "\n" +
                        "- Loại mực: " + pen.getType() + "\n" +
                        "- Độ mịn: " + pen.getSmoothness()
                );
            else if (p instanceof Notebook nb)
                printRow(
                        Integer.toString(nb.getId()), nb.getName(), Integer.toString(nb.getSellPrice()), nb.getBrand(),
                        "- Số trang: " + nb.getNumberOfPage() + "\n" +
                        "- Loại vở: " + nb.getType() + "\n" +
                        "- Màu sắc bìa: " + nb.getColor() + "\n" +
                        "- Chất liệu giấy: " + nb.getMaterial() + "\n" +
                        "- Kích thước: " + nb.getSize()
                );
            else if (p instanceof Pencil pc)
                printRow(
                        Integer.toString(pc.getId()), pc.getName(), Integer.toString(pc.getSellPrice()), pc.getBrand(),
                        "- Màu sắc: " + pc.getColor() + "\n" +
                        "- CHất liệu: " + pc.getMaterial() + "\n" +
                        "- Độ cứng: " + pc.getHardness()
                );

            System.out.println("------------------------------------------------------------------------------------------------------------------");
        }
    }
}
