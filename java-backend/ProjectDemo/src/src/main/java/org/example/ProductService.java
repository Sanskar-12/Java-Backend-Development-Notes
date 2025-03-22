package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> list = new ArrayList<>();

    public void addProduct(Product p) {
        list.add(p);
    }

    public List<Product> getAllProducts() {
        return list;
    }

}
