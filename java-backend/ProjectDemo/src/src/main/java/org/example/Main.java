package org.example;

import java.util.ArrayList;
import java.util.List;

// Main will be the entry point and will call Product Service for its work
public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // Product Service to add the product
        service.addProduct(new Product("Dell","Laptop","Black Table",2020));
        service.addProduct(new Product("Logi","Black Mouse","Table",2020));
        service.addProduct(new Product("Samsung","Phone","White Table",2020));
        service.addProduct(new Product("Earphone","Black wire","Kitchen",2020));


        // Get all the products
//        List<Product> products = service.getAllProducts();
//        for(Product p : products) {
//            System.out.println(p);
//        }

        // Get one product
//        Product product = service.getOneProduct("Dell");
//        System.out.println(product);

        // Get Product with text
        List<Product> list = service.getProductWithText("black");
        for(Product p : list) {
            System.out.println(p);
        }
    }
}