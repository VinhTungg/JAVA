package mystore.service.ProductService;

import mystore.models.Product.Book;
import mystore.models.Product.Notebook;
import mystore.models.Product.Pen;
import mystore.models.Product.Pencil;

public class Update {
    public static void updateBook(Book bookToUpdate, String newName, int newSellPrice, String brand, String newAuthor, String newGenre, String newPublishDate, String newPublishingHouse, String newLanguage) {
        bookToUpdate.setName(newName);
        bookToUpdate.setSellPrice(newSellPrice);
        bookToUpdate.setBrand(brand);
        bookToUpdate.setAuthor(newAuthor);
        bookToUpdate.setGenre(newGenre);
        bookToUpdate.setPublishDate(newPublishDate);
        bookToUpdate.setPublishingHouse(newPublishingHouse);
        bookToUpdate.setLanguage(newLanguage);
    }

    public static void updateNotebook(Notebook notebookToUpdate, String newName, int newSellPrice, String newBrand, int newNumberOfPage, String newType, String newColor, String newMaterial, String newSize) {
        notebookToUpdate.setName(newName);
        notebookToUpdate.setSellPrice(newSellPrice);
        notebookToUpdate.setBrand(newBrand);
        notebookToUpdate.setNumberOfPage(newNumberOfPage);
        notebookToUpdate.setType(newType);
        notebookToUpdate.setColor(newColor);
        notebookToUpdate.setMaterial(newMaterial);
        notebookToUpdate.setSize(newSize);
    }

    public static void updatePen(Pen penToUpdate, String newName, int newSellPrice, String newBrand, String newColor, String newMaterial, String newType, double newSmoothness) {
        penToUpdate.setName(newName);
        penToUpdate.setSellPrice(newSellPrice);
        penToUpdate.setBrand(newBrand);
        penToUpdate.setType(newType);
        penToUpdate.setColor(newColor);
        penToUpdate.setMaterial(newMaterial);
        penToUpdate.setSmoothness(newSmoothness);
    }

    public static void updatePencil(Pencil pencilToUpdate, String newName, int newSellPrice, String newBrand, String newColor, String newMaterial, String newHardness) {
        pencilToUpdate.setName(newName);
        pencilToUpdate.setSellPrice(newSellPrice);
        pencilToUpdate.setBrand(newBrand);
        pencilToUpdate.setColor(newColor);
        pencilToUpdate.setMaterial(newMaterial);
        pencilToUpdate.setHardness(newHardness);
    }
}
