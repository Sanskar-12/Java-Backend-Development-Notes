package org.example;

import java.util.ArrayList;
import java.util.List;

// Product Service will do application logic
public class ProductService {

    List<Product> list = new ArrayList<>();

    ProductDb db = new ProductDb();

    public void addProduct(Product p) {
//        list.add(p);

        db.save(p);
    }

    public List<Product> getAllProducts() {
        return list;
    }

    public Product getOneProduct(String name) {
        for(Product p : list) {
            if(p.getName().equals(name)) {
                return p;
            }
        }

        return null;
    }

    public List<Product> getProductWithText(String text) {
        String lowerCaseText = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : list) {
            if(p.getName().toLowerCase().contains(lowerCaseText) || p.getPlace().toLowerCase().contains(lowerCaseText) || p.getType().toLowerCase().contains(lowerCaseText)) {
                prods.add(p);
            }
        }

        return prods;
    }
}
