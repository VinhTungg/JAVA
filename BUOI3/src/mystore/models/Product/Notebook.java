package mystore.models.Product;

import lombok.Getter;
import lombok.Setter;

import static mystore.common.constants.tableFormat;

@Getter
@Setter
public class Notebook extends Product {
    private int numberOfPage;

    private String size;

    public Notebook(int id, String name, int sellPrice, String brand, int numberOfPage, String type, String color, String material, String size) {
        this.name = name;
        this.id = id;
        this.sellPrice = sellPrice;
        this.brand = brand;
        this.numberOfPage = numberOfPage;
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return  "- Số thứ tự: " + id + "\n" +
                "- Tên: " + name + "\n" +
                "- Giá bán: " + sellPrice + "\n" +
                "- Thương hiệu: " + brand + "\n" +
                "- Số trang: " + numberOfPage + "\n" +
                "- Loại vở: " + type + "\n" +
                "- Màu sắc bìa: " + color + "\n" +
                "- Chất liệu giấy: " + material + "\n" +
                "- Kích thước: " + size + "\n" +
                "-----------------";
    }
}
