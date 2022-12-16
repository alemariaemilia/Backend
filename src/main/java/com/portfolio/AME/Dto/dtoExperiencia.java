
package com.portfolio.AME.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imgE;

    // Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        
    }
    // Getters & Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }
    

}