package com.example.product.model;

import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import java.util.Objects;

public class Product {
    private Long id;
    private String code;
    private String name;
    private String description;
    private BigDecimal price;
    private final LocalDateTime createdOn;
    private Boolean status;

    public Product() {
        this.createdOn = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (!(object instanceof Product)) {
            return false;
        }

        Product product = (Product) object;

        return Objects.equals(this.id, product.id)
        && Objects.equals(this.code, product.code)
        && Objects.equals(this.name, product.name)
        && Objects.equals(this.description, product.description)
        && Objects.equals(this.price, product.price)
        && Objects.equals(this.createdOn, product.createdOn)
        && Objects.equals(this.status, product.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            this.id,
            this.code,
            this.name,
            this.description,
            this.price,
            this.createdOn,
            this.status
        );
    }

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}