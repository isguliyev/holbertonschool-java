package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicLong;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

@Repository
public class ProductRepository {
    private AtomicLong productCount;
    private List<Product> products = new ArrayList<Product>();

    public ProductRepository() {
        this.products = new ArrayList<Product>();
        this.productCount = new AtomicLong(1);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<Product>(this.products);
    }

    public Product getProductById(Long id) {
        if (id == null) {
            throw new NullPointerException("Cannot find product: id is null");
        }

        if (id < 1) {
            throw new IllegalArgumentException("Cannot find product: id is less than 1");
        }

        return this.products.stream()
            .filter((product) -> Objects.equals(product.getId(), id))
            .findFirst()
            .orElseThrow(
                () -> new RuntimeException("Cannot find product: no product with id=%d".formatted(id))
            );
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new NullPointerException("Cannot add product: product is null");
        }

        product.setId(this.productCount.getAndIncrement());
        this.products.add(product);
    }

    public void updateProduct(Product product) {
        if (product == null) {
            throw new NullPointerException("Cannot update product: product is null");
        }

        if (product.getId() == null) {
            throw new IllegalArgumentException("Cannot update product: product id is null");
        }

        if (product.getId() < 1) {
            throw new IllegalArgumentException("Cannot update product: product id is less than 1");
        }

        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getId().equals(product.getId())) {
                this.products.set(i, product);
                return;
            }
        }

        throw new RuntimeException(
            "Cannot update product: no product with id=%d".formatted(product.getId())
        );
    }

    public void removeProductById(Long id) {
        if (id == null) {
            throw new NullPointerException("Cannot remove product by id: id is null");
        }

        if (id < 1) {
            throw new IllegalArgumentException("Cannot remove product by id: id is less than 1");
        }

        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getId() == id) {
                this.products.remove(i);
                return;
            }
        }

        throw new RuntimeException(
            "Cannot remove product by id: no product with id=%d".formatted(id)
        );
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void addProductList(List<Product> listOfProducts) {
        if (listOfProducts == null) {
            throw new NullPointerException("Cannot add product list: product list is null");
        }

        listOfProducts.forEach(this::addProduct);
    }
}