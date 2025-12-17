package demo;

import entities.*;
import models.*;
import java.time.LocalDate;

public class AdminApp {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Jake The Dog");
        person.setEmail("jakethedog@landofooo.com");
        person.setCpf("334.678.543-90");
        person.setBirthDate(LocalDate.of(1998, 11, 18));

        Product product = new Product();

        product.setName("Pancake");
        product.setQuantity(12);
        product.setPrice(1.99d);
        product.setStatus(true);

        PersonModel personModel = new PersonModel();
        ProductModel productModel = new ProductModel();

        personModel.create(person);
        productModel.create(product);

        System.out.println(personModel.findAll());
        System.out.println(productModel.findAll());

        System.out.println(personModel.findById(person));
        System.out.println(productModel.findById(product));

        person.setName("Cake");
        person.setEmail("cakethecat@ooo.com");

        product.setName("Apple pie");
        product.setStatus(false);

        personModel.update(person);
        productModel.update(product);

        System.out.println(personModel.findById(person));
        System.out.println(productModel.findById(product));

        personModel.delete(person);
        productModel.delete(product);

        personModel.create(person);
        productModel.create(product);

        Person anotherPerson = new Person();

        anotherPerson.setName("Finn Mertens");
        anotherPerson.setEmail("finn@landofooo.com");
        anotherPerson.setCpf("111.222.333-44");
        anotherPerson.setBirthDate(LocalDate.of(2001, 3, 14));

        Product anotherProduct = new Product();

        anotherProduct.setName("Enchiridion");
        anotherProduct.setQuantity(1);
        anotherProduct.setPrice(999.99d);
        anotherProduct.setStatus(true);

        personModel.create(anotherPerson);
        productModel.create(anotherProduct);

        personModel.close();
        productModel.close();
    }
}