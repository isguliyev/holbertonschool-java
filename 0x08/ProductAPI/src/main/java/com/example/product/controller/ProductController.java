package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/products")
public class  ProductController {
    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getAllProducts(@PathVariable("id") Long id) {
        return productRepository.getProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        this.productRepository.addProduct(product);
        return product;
    }

    @PostMapping("/addProductList")
    public List<Product> addProductList(@RequestBody List<Product> products) {
        this.productRepository.addProductList(products);
        return products;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable("id") Long id) {
        product.setId(id);
        this.productRepository.updateProduct(product);
        return product;
    }

    @DeleteMapping("/{id}")
    public void removeProductById(@PathVariable("id") Long id) {
        this.productRepository.removeProductById(id);
    }
}