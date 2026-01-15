package com.example.jpa_h2_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.FetchType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonManagedReference
    @OneToMany(
        mappedBy = "customer",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Phone> phones;
    @JsonManagedReference
    @OneToMany(
        mappedBy = "customer",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Address> addresses;
    private String data;

    public Customer() {
        this.phones = new ArrayList<Phone>();
        this.addresses = new ArrayList<Address>();
    }

    public Long getId() {
        return this.id;
    }

    public List<Phone> getPhones() {
        return this.phones;
    }

    public List<Address> getAddresses() {
        return this.addresses;
    }

    public String getData() {
        return this.data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setData(String data) {
        this.data = data;
    }
}