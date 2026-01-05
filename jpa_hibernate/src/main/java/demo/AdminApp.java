package demo;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import models.PersonModel;
import models.ProductModel;

import entities.Person;
import entities.Product;

import java.time.LocalDate;

public class AdminApp {
    public static void main(String[] args) {
        try (
            EntityManagerFactory entityManagerFactory
            = Persistence.createEntityManagerFactory("admin-jpa")
        ) {
            PersonModel personModel = new PersonModel(entityManagerFactory);
            ProductModel productModel = new ProductModel(entityManagerFactory);

            Person person = new Person();
            person.setName("person");
            person.setEmail("email@mail.com");
            person.setCpf("000.000.000-00");
            person.setBirthDate(LocalDate.now());

            Product product = new Product();
            product.setName("product");
            product.setQuantity(0);
            product.setPrice(0.0d);
            product.setStatus(true);

            personModel.create(person);
            productModel.create(product);

            System.out.println(personModel.findById(person.getId()));
            System.out.println(productModel.findById(product.getId()));

            person.setCpf("111.111.111-11");
            product.setStatus(false);

            person = personModel.update(person);
            product = productModel.update(product);

            personModel.deleteById(person.getId());
            productModel.deleteById(product.getId());

            System.out.println(personModel.findAll());
            System.out.println(productModel.findAll());

            person.setId(null);
            product.setId(null);

            personModel.create(person);
            productModel.create(product);

            System.out.println(personModel.findAll());
            System.out.println(productModel.findAll());
        }
    }
}