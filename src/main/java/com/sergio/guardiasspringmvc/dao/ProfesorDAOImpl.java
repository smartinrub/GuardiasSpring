package com.sergio.guardiasspringmvc.dao;

import com.sergio.guardiasspringmvc.domain.Profesor;
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
    public List<Profesor> getProfesores() {
        try {
            Query query = em.createQuery("SELECT e FROM Profesor e");
            return query.getResultList();
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage());
        }
    }

}
