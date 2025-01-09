package com.spring_graphql.service;

import com.spring_graphql.record.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    public List<Product> productList() {
        List<Product> productList = addProductList();
        return productList != null ? productList : new ArrayList<>();
    }

    public Product searchByCategory(String category) {
        Optional<Product> productOpt = addProductList().stream()
                .filter(product -> product.category().equals(category))
                .findFirst(); // Find the first matching product
        return productOpt.orElse(null);
    }

    public List<Product> addProductList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", "Category1", "100", "4.5"));
        products.add(new Product("Product2", "Category2", "200", "4.0"));
        products.add(new Product("Product3", "Category1", "150", "4.7"));
        products.add(new Product("Product4", "Category3", "300", "3.8"));
        products.add(new Product("Product5", "Category2", "120", "4.9"));
        products.add(new Product("Product6", "Category1", "50", "4.2"));
        products.add(new Product("Product7", "Category3", "500", "4.3"));
        products.add(new Product("Product8", "Category2", "250", "4.1"));
        products.add(new Product("Product9", "Category1", "80", "4.6"));
        products.add(new Product("Product10", "Category3", "120", "3.9"));
        return products;
    }
}
