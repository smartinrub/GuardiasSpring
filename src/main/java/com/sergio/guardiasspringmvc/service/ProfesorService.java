package com.sergio.guardiasspringmvc.service;

import java.util.List;

/**
 *
 * @author sergio
 */
public interface ProfesorService {
    
    public List<String> getProfesoresByHora(String nombreHora);
}
