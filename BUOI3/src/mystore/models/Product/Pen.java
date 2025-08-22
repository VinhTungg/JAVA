package mystore.models.Product;

import lombok.Getter;
import lombok.Setter;

import static mystore.common.constants.tableFormat;

@Getter
@Setter
public class Pen extends Product {
    private double smoothness;

    public Pen(int id, String name, int sellPrice, String brand, String color, String material, String type, double smoothness) {
        this.name = name;
        this.id = id;
        this.sellPrice = sellPrice;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.type = type;
        this.smoothness = smoothness;
    }

    @Override
    public String toString() {
        return  "- Số thứ tự: " + id + "\n" +
                "- Tên: " + name + "\n" +
                "- Giá bán: " + sellPrice + "\n" +
                "- Thương hiệu: " + brand + "\n" +
                "- Màu sắc: " + color + "\n" +
                "- Chất liệu: " + material + "\n" +
                "- Loại mực: " + type + "\n" +
                "- Độ mịn: " + smoothness + "\n" +
                "-----------------";
    }
}
