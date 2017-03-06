package com.sergio.guardiasspringmvc.model;

import javax.validation.constraints.NotNull;

/**
 *
 * @author sergio
 */
public class Hora {
    
    @NotNull(message = "Debe elegir una hora")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
