package models;

import entities.Person;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.ArrayList;

public class PersonModel {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("admin-jpa");

    public void create(Person person) {
        if (person == null) {
            System.err.println("person is null");
            return;
        }

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            entityManager.persist(person);
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    public void update(Person person) {
        if (person == null) {
            System.err.println("person is null");
            return;
        }

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            entityManager.merge(person);
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    public void delete(Person person) {
        if (person == null) {
            System.err.println("person is null");
            return;
        }

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.find(person.getClass(), person.getId()));
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    public Person findById(Person person) {
        if (person == null) {
            System.err.println("person is null");
            return null;
        }

        Person result = null;

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            result = entityManager.find(person.getClass(), person.getId());
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

        return result;
    }

    public List<Person> findAll() {
        List<Person> people = new ArrayList<Person>();

        try (EntityManager entityManager = entityManagerFactory.createEntityManager();) {
            entityManager.getTransaction().begin();
            people = entityManager.createNativeQuery("SELECT * FROM Person", Person.class).getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

        return people;
    }

    public void close() {
        entityManagerFactory.close();
    }
}