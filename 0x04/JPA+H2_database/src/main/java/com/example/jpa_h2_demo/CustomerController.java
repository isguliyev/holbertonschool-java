package com.example.jpa_h2_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer) {
        if (customer.getPhones() != null) {
            for (Phone phone : customer.getPhones()) {
                phone.setCustomer(customer);
            }
        }

        if (customer.getAddresses() != null) {
            for (Address address : customer.getAddresses()) {
                address.setCustomer(customer);
            }
        }

        return this.customerRepository.save(customer);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers() {
        return this.customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer findCustomerById(@PathVariable("id") Long id) {
        return this.customerRepository.findById(id).orElseThrow(
            () -> new RuntimeException(
                String.format("Connot find Customer: no customer with id=%d", id)
            )
        );
    }

    @DeleteMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeCustomerById(@PathVariable("id") Long id) {
        this.customerRepository.deleteById(id);
    }

    @PutMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomerById(@PathVariable("id") Long id, @RequestBody Customer customer) {
        customer.setId(id);
        this.customerRepository.save(customer);
    }
}