package com.sergio.guardiasspringmvc.domain;

import javax.validation.constraints.NotNull;

/**
 *
 * @author sergio
 */
public class Opcion {

    @NotNull(message = "Por favor elige una opción")
    private String opcionElegida;

    public String getOpcionElegida() {
        return opcionElegida;
    }

    public void setOpcionElegida(String opcionElegida) {
        this.opcionElegida = opcionElegida;
    }

}
