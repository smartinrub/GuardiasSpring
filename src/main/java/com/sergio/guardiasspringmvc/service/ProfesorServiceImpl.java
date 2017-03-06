package com.sergio.guardiasspringmvc.service;

import com.sergio.guardiasspringmvc.dao.ProfesorDAO;
import com.sergio.guardiasspringmvc.domain.Profesor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sergio
 */
@Service
public class ProfesorServiceImpl implements ProfesorService{
    
    @Autowired
    private ProfesorDAO profesorDAO;

    @Override
    @Transactional
    public List<Profesor> getAllProfesores() {
        return profesorDAO.getProfesores();
    }
    
}
