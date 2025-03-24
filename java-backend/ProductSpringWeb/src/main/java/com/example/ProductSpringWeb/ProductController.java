package com.example.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products") // products route will call below method
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name) {
        return service.getOneProduct(name);
    }

}
