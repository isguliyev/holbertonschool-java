package models;

import entities.Product;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.ArrayList;

public class ProductModel {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("admin-jpa");

    public void create(Product product) {
        if (product == null) {
            System.err.println("product is null");
            return;
        }

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            entityManager.persist(product);
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    public void update(Product product) {
        if (product == null) {
            System.err.println("product is null");
            return;
        }

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            entityManager.merge(product);
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    public void delete(Product product) {
        if (product == null) {
            System.err.println("product is null");
            return;
        }

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.find(product.getClass(), product.getId()));
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    public Product findById(Product product) {
        if (product == null) {
            System.err.println("product is null");
            return null;
        }

        Product result = null;

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            result = entityManager.find(product.getClass(), product.getId());
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

        return result;
    }

    public List<Product> findAll() {
        List<Product> products = new ArrayList<Product>();

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            products = entityManager.createNativeQuery("SELECT * FROM Product", Product.class).getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

        return products;
    }

    public void close() {
        entityManagerFactory.close();
    }
}