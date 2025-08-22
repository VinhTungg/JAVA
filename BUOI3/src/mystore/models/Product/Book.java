package mystore.models.Product;

import mystore.common.constants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends Product {
    private String author, genre, publishDate, publishingHouse, language;

    public Book(int id, String name, int sellPrice, String brand, String author, String genre, String publishDate, String publishingHouse, String language) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.author = author;
        this.genre = genre;
        this.publishDate = publishDate;
        this.sellPrice = sellPrice;
        this.publishingHouse = publishingHouse;
        this.language = language;
    }

    @Override
    public String toString() {
        return  "- Số thứ tự: " + id + "\n" +
                "- Tên: " + name + "\n" +
                "- Giá bán: " + sellPrice + "\n" +
                "- Thương hiệu: " + brand + "\n" +
                "- Thể loại: " + genre + "\n" +
                "- Tác giả: " + author + "\n" +
                "- Nhà xuất bản: " + publishingHouse + "\n" +
                "- Năm xuất bản: " + publishDate + "\n" +
                "- Ngôn ngữ: " + language + "\n" +
                "-----------------";
    }
}