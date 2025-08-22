package mystore.models.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    protected int id;

    protected String name;

    protected int sellPrice;

    protected String brand;

    protected String color;

    protected String material;

    protected String type;
}
