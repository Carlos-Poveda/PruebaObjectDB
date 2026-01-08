package org.example;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main {
    static void main() {
        Game game = new Game("ngvirsbv","descrip","girsbv",1000);
        EntityManager entityManager = DataProvider.getEntityManagerFactory().createEntityManager();
//        try {
//            entityManager.getTransaction().begin();
//            // SAVE
//            entityManager.persist(game);
//
//            entityManager.getTransaction().commit();
//        }
//        finally {
//            entityManager.close();
//        }

        // FIND ALL
        try {
            TypedQuery<Game> query = entityManager.createQuery("select g from Game g",Game.class);
            List<Game> games = query.getResultList();
            for (Game g : games) {
                System.out.println(g);
            }
        }
        finally {
            entityManager.close();
        }
    }
}
