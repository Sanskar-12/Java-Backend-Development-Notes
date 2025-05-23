package com.example.ProductSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		ProductService service = context.getBean(ProductService.class);
		List<Product> list = service.getAllProducts();
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
