package org.example;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataProvider {
    private static EntityManagerFactory entityManagerFactory = null;

    static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("data.odb");
        }
        return entityManagerFactory;
    }

}
