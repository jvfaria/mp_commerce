package br.com.mpcommerce.dao;

import br.com.mpcommerce.models.Category;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;
import java.util.Objects;
public class CategoryDAO {
    private EntityManager getEntityManager() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mpcommerce");
        EntityManager em = null;

        try {
            em = new ConnectionFactory().getConnection();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            emf.close();
        }
        return em;
    }

    public Category save(Category category) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            System.out.println("Saving category...");
            if(Objects.isNull(category.getId())) {
                em.persist(category);
                em.getTransaction().commit();
            } else {
                category = em.merge(category);
            }
        }catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }

        return category;
    }

    public List<Category> findAll() {
        EntityManager em = getEntityManager();

        try {
            Query query = em.createQuery("from Category", Category.class);
            List<Category> categories = query.getResultList();
            return categories;
        }finally {
            em.close();
        }
    }


}
