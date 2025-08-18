package BUOI2.mybookstore.service.ProductService;

import BUOI2.mybookstore.models.Product.Book;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.regex.Pattern;

import static BUOI2.mybookstore.common.constants.ListBooks;

public class SearchBook {
    public static String removeDiacritics(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");
    }

    public static ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : ListBooks) {
            if (removeDiacritics(book.getTitle()).toLowerCase().contains(keyword) ||
                    removeDiacritics(book.getAuthor()).toLowerCase().contains(keyword) ||
                    removeDiacritics(book.getGenre()).toLowerCase().contains(keyword) ||
                    removeDiacritics(book.getPublishDate()).toLowerCase().contains(keyword))
            {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }
}
