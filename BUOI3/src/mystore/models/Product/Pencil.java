package mystore.models.Product;

import lombok.Getter;
import lombok.Setter;
import static mystore.common.constants.tableFormat;

@Getter
@Setter
public class Pencil extends Product {
    private String hardness;

    public Pencil(int id, String name, int sellPrice, String brand, String color, String material, String hardness) {
        this.name = name;
        this.id = id;
        this.sellPrice = sellPrice;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return  "- Số thứ tự: " + id + "\n" +
                "- Tên: " + name + "\n" +
                "- Giá bán: " + sellPrice + "\n" +
                "- Thương hiệu: " + brand + "\n" +
                "- Màu sắc: " + color + "\n" +
                "- CHất liệu: " + material + "\n" +
                "- Độ cứng: " + hardness + "\n" +
                "-----------------";
    }
}
