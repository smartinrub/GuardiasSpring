package com.sergio.guardiasspringmvc.domain;

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
public class Profesor {
    @Id
    @Column(name = "profesor")
    private String nombre;
    
    @Column(name = "primera")
    private String primeraHora;
    
    @Column(name = "segunda")
    private String segundaHora;
    
    @Column(name = "tercera")
    private String terceraHora;
    
    @Column(name = "cuarta")
    private String cuartaHora;
    
    @Column(name = "quinta")
    private String quintaHora;
    
    @Column(name = "sexta")
    private String sextaHora;
    
    public String getNombre() {
        return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimeraHora() {
        return primeraHora;
    }

    public void setPrimeraHora(String primeraHora) {
        this.primeraHora = primeraHora;
    }

    public String getSegundaHora() {
        return segundaHora;
    }

    public void setSegundaHora(String segundaHora) {
        this.segundaHora = segundaHora;
    }

    public String getTerceraHora() {
        return terceraHora;
    }

    public void setTerceraHora(String terceraHora) {
        this.terceraHora = terceraHora;
    }

    public String getCuartaHora() {
        return cuartaHora;
    }

    public void setCuartaHora(String cuartaHora) {
        this.cuartaHora = cuartaHora;
    }

    public String getQuintaHora() {
        return quintaHora;
    }

    public void setQuintaHora(String quintaHora) {
        this.quintaHora = quintaHora;
    }

    public String getSextaHora() {
        return sextaHora;
    }

    public void setSextaHora(String sextaHora) {
        this.sextaHora = sextaHora;
    }
}
