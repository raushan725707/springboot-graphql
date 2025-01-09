package com.spring_graphql.controller;

import com.spring_graphql.record.Product;
import com.spring_graphql.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/{category}")
    ResponseEntity<?> searchProductByCategory(@PathVariable String category){
      Product product= productService.searchByCategory(category);
      if(product==null){
          throw new NullPointerException("Product not found");
      }
      return ResponseEntity.ok(product);
    }

    @GetMapping
    ResponseEntity<?> allProducts(){
     return    ResponseEntity.ok(productService.productList());
    }


}
