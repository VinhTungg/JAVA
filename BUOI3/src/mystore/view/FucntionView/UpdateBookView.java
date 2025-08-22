package mystore.view.FucntionView;

import mystore.models.Product.*;
import mystore.service.ProductService.Update;

import static mystore.view.FucntionView.ShowListProductView.displayListBookMenu;
import static mystore.service.OtherService.isValidValue.isValid;
import static mystore.common.constants.*;

public class UpdateBookView {
    public static void updateBook() {
        displayListBookMenu();
        if (listProducts.isEmpty()) return;
        System.out.println("Nhấn 0 để quay lại.");
        System.out.print("Nhập id sách muốn cập nhật: ");
        isValid();
        idBook = sc.nextInt();
        while (idBook < 1 || idBook > listProducts.size()) {
            if (idBook == 0) return;
            System.out.print("Không tìm thấy sách để cập nhật, vui lòng nhập lại: ");
            isValid();
            idBook = sc.nextInt();
            sc.nextLine();
        }
        Product productToUpdate = listProducts.get(idBook - 1);
        System.out.print("Nhập tên sản phẩm: ");
        String newName = sc.nextLine().trim();
        if (newName.isEmpty()) { newName = productToUpdate.getName(); }
        System.out.print("Nhập giá bán: ");
        String newSellPrice = sc.nextLine().trim();
        if (newSellPrice.isEmpty()) { newSellPrice = String.valueOf(productToUpdate.getSellPrice()); }
        System.out.print("Nhập thương hiệu: ");
        String newBrand = sc.nextLine().trim();
        if (newBrand.isEmpty()) { newBrand = productToUpdate.getBrand(); }

        if (productToUpdate instanceof Book) {
            System.out.print("Nhập thể loại: ");
            String newGenre = sc.nextLine().trim();
            if (newGenre.isEmpty()) { newGenre = ((Book) productToUpdate).getGenre(); }
            System.out.print("Nhập tác giả: ");
            String newAuthor = sc.nextLine().trim();
            if (newAuthor.isEmpty()) { newAuthor = ((Book) productToUpdate).getAuthor(); }
            System.out.print("Nhập nhà xuất bản: ");
            String newPublishingHouse = sc.nextLine().trim();
            if (newPublishingHouse.isEmpty()) { newPublishingHouse = ((Book) productToUpdate).getPublishingHouse(); }
            System.out.print("Nhập năm xuất bản: ");
            String newPublishDate = sc.nextLine().trim();
            if (newPublishDate.isEmpty()) { newPublishDate = ((Book) productToUpdate).getPublishDate(); }
            System.out.print("Nhập ngôn ngữ: ");
            String newLanguage = sc.nextLine().trim();
            if (newLanguage.isEmpty()) { newLanguage = ((Book) productToUpdate).getLanguage(); }

            Update.updateBook((Book) productToUpdate, newName, Integer.parseInt(newSellPrice), newBrand, newAuthor, newGenre, newPublishDate, newPublishingHouse, newLanguage);
        }

        else if (productToUpdate instanceof Pen) {
            System.out.print("Nhập màu sắc: ");
            String newColor = sc.nextLine().trim();
            if (newColor.isEmpty()) { newColor = productToUpdate.getColor(); }
            System.out.print("Nhập chất liệu: ");
            String newMaterial = sc.nextLine().trim();
            if (newMaterial.isEmpty()) { newMaterial = productToUpdate.getMaterial(); }
            System.out.print("Nhập loại mực: ");
            String newType = sc.nextLine().trim();
            if (newType.isEmpty()) { newType = productToUpdate.getType(); }
            System.out.print("Nhập độ mịn: ");
            String newSmoothness = sc.nextLine().trim();
            if (newSmoothness.isEmpty()) { newSmoothness = String.valueOf(((Pen) productToUpdate).getSmoothness()); }

            Update.updatePen((Pen) productToUpdate, newName, Integer.parseInt(newSellPrice), newBrand, newColor, newMaterial, newType, Double.parseDouble(newSmoothness));
        }

        else if (productToUpdate instanceof Notebook) {
            System.out.print("Nhập số trang: ");
            String newNumberOfPage = sc.nextLine().trim();
            if (newNumberOfPage.isEmpty()) { newNumberOfPage = String.valueOf(((Notebook) productToUpdate).getNumberOfPage()); }
            System.out.print("Nhập loại vở: ");
            String newType = sc.nextLine().trim();
            if (newType.isEmpty()) { newType = productToUpdate.getType(); }
            System.out.print("Nhập màu sắc bìa: ");
            String newColor = sc.nextLine().trim();
            if (newColor.isEmpty()) { newColor = productToUpdate.getColor(); }
            System.out.println("Nhập chất liệu giấy: ");
            String newMaterial = sc.nextLine().trim();
            if (newMaterial.isEmpty()) { newMaterial = productToUpdate.getMaterial(); }
            System.out.print("Nhập kích cỡ: ");
            String newSize = sc.nextLine().trim();
            if (newSize.isEmpty()) { newSize = ((Notebook) productToUpdate).getSize(); }

            Update.updateNotebook((Notebook) productToUpdate, newName, Integer.parseInt(newSellPrice), newBrand, Integer.parseInt(newNumberOfPage), newType, newColor, newMaterial, newSize);
        }

        else if (productToUpdate instanceof Pencil) {
            System.out.print("Nhập màu sắc: ");
            String newColor = sc.nextLine().trim();
            if (newColor.isEmpty()) { newColor = productToUpdate.getColor(); }
            System.out.print("Nhập chất liệu: ");
            String newMaterial = sc.nextLine().trim();
            if (newMaterial.isEmpty()) { newMaterial = productToUpdate.getMaterial(); }
            System.out.print("Nhập độ cứng: ");
            String newHardness = sc.nextLine().trim();
            if (newHardness.isEmpty()) { newHardness = String.valueOf(((Pencil) productToUpdate).getHardness()); }

            Update.updatePencil((Pencil) productToUpdate, newName, Integer.parseInt(newSellPrice), newBrand, newColor, newMaterial, newHardness);
        }
    }
}
