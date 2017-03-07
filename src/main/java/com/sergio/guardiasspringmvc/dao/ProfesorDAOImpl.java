package com.sergio.guardiasspringmvc.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sergio
 */
@Repository
public class ProfesorDAOImpl implements ProfesorDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<String> getProfesoresByHora(String nombreHora) {
        try {
            Query query = em.createQuery("SELECT e.nombre FROM Profesor e WHERE e." + nombreHora + "=:hora");
            query.setParameter("hora", "Libre");
            return query.getResultList();
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage());
        }
    }

}
