package org.example;
import javax.persistence.EntityManager;

public class Main {
    static void main() {
        Game game = new Game("ngvirsbv","descrip","girsbv",1000);
        EntityManager entityManager = DataProvider.getEntityManagerFactory().createEntityManager();
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(game);

            entityManager.getTransaction().commit();
        }
        finally {
            entityManager.close();
        }
    }
}
