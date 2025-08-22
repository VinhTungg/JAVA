package mystore.service.ProductService;

import mystore.models.Product.Product;

import java.lang.reflect.Field;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static mystore.common.constants.listProducts;

public class Search {
    public static String removeDiacritics(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");
    }

    public static ArrayList<Field> getAllFields(Class<?> type) {
        ArrayList<Field> fields = new ArrayList<>();
        while (type != null) {
            fields.addAll(Arrays.asList(type.getDeclaredFields()));
            type = type.getSuperclass();
        }
        return fields;
    }


    public static ArrayList<Product> searchProducts(String keyword) {
        ArrayList<Product> foundProducts = new ArrayList<>();
        for (Product p : listProducts) {
            ArrayList<Field> fields = getAllFields(p.getClass());
            boolean matched = false;

            for (Field field : fields) {
                field.setAccessible(true);
                try {
                    Object value = field.get(p);
                    if (value != null) {
                        String fieldValue = removeDiacritics(value.toString().toLowerCase());
                        if (fieldValue.contains(keyword.toLowerCase().trim())) {
                            matched = true;
                            break;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            if (matched) {
                foundProducts.add(p);
            }
        }

        return foundProducts;
    }
}
