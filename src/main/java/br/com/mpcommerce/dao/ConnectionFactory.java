package br.com.mpcommerce.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
   private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mpcommerce");

   public EntityManager getConnection() {
       return emf.createEntityManager();
   }
}