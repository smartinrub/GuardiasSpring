package com.sergio.guardiasspringmvc.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sergio
 */
@Entity
@Table(name = "2ASIR")
public class Profesor implements Serializable {
    @Id
    @Column(name = "profesor")
    private String nombre;
    
    @Column(name = "primera")
    private String primera;
    
    @Column(name = "segunda")
    private String segunda;
    
    @Column(name = "tercera")
    private String tercera;
    
    @Column(name = "cuarta")
    private String cuarta;
    
    @Column(name = "quinta")
    private String quinta;
    
    @Column(name = "sexta")
    private String sexta;
    
    public String getNombre() {
        return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimera() {
        return primera;
    }

    public void setPrimera(String primera) {
        this.primera = primera;
    }

    public String getSegunda() {
        return segunda;
    }

    public void setSegunda(String segunda) {
        this.segunda = segunda;
    }

    public String getTercera() {
        return tercera;
    }

    public void setTercera(String tercera) {
        this.tercera = tercera;
    }

    public String getCuarta() {
        return cuarta;
    }

    public void setCuarta(String cuarta) {
        this.cuarta = cuarta;
    }

    public String getQuinta() {
        return quinta;
    }

    public void setQuinta(String quinta) {
        this.quinta = quinta;
    }

    public String getSexta() {
        return sexta;
    }

    public void setSexta(String sexta) {
        this.sexta = sexta;
    }
}
