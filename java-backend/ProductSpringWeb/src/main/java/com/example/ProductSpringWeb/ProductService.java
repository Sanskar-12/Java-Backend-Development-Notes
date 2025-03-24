package com.example.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// Product Service will do application logic
@Component
public class ProductService {

    @Autowired
    ProductDB db;

    List<Product> list = new ArrayList<>();

//
//    public void addProduct(Product p) {
////        list.add(p);
//
//        db.save(p);
//    }

    public List<Product> getAllProducts() {
       return db.findAll();
    }

    public Product getOneProduct(String name) {
        return db.findByName(name);
    }
//
//    public List<Product> getProductWithText(String text) {
//        String lowerCaseText = text.toLowerCase();
//        List<Product> prods = new ArrayList<>();
//
//        for(Product p : list) {
//            if(p.getName().toLowerCase().contains(lowerCaseText) || p.getPlace().toLowerCase().contains(lowerCaseText) || p.getType().toLowerCase().contains(lowerCaseText)) {
//                prods.add(p);
//            }
//        }
//
//        return prods;
//    }
}
