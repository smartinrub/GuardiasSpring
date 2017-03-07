package com.sergio.guardiasspringmvc.dao;

import java.util.List;

/**
 *
 * @author sergio
 */
public interface ProfesorDAO {
    
    public List<String> getProfesoresByHora(String nombreHora);
}
