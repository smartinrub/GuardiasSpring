package com.sergio.guardiasspringmvc.service;

import com.sergio.guardiasspringmvc.dao.ProfesorDAO;
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
    @Transactional(readOnly = true)
    public List<String> getProfesoresByHora(String nombreHora) {
        return profesorDAO.getProfesoresByHora(nombreHora);
    }
    
}
