package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // Product Service to add the product
        service.addProduct(new Product("Dell","Laptop","Table",2020));
        service.addProduct(new Product("Logi","Mouse","Table",2020));
        service.addProduct(new Product("Samsung","Phone","White Table",2020));
        service.addProduct(new Product("Earphone","wire","Kitchen",2020));


        // Get all the products
        List<Product> products = service.getAllProducts();
        for(Product p : products) {
            System.out.println(p);
        }


    }
}