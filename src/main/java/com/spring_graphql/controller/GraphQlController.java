package com.spring_graphql.controller;

import com.spring_graphql.record.Product;
import com.spring_graphql.service.ProductService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GraphQlController {
    private final ProductService productService;

    public GraphQlController(ProductService productService){
        this.productService=productService;
    }

    @QueryMapping
    ResponseEntity<?> searchProductByCategory(@Argument String category){
        Product product= productService.searchByCategory(category);
        if(product==null){
            throw new NullPointerException("Product not found");
        }
        return ResponseEntity.ok(product);
    }

    @QueryMapping
    ResponseEntity<List<Product>> allProducts(){
        List<Product> list=productService.productList();
        return    ResponseEntity.ok(list);
    }

//    @QueryMapping
//    public List<Product> allProducts() {
//        // Return a list of products
//        return List.of(
//                new Product("Product1", "Category1", "100", "4.5"),
//                new Product("Product2", "Category2", "200", "4.0"),
//                new Product("Product3", "Category1", "150", "4.7")
//        );
//    }
}
