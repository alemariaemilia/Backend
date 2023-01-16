
package com.portfolio.AME.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Alema
 */

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imgE;
    @NotBlank
    private String inicioE;
    @NotBlank
    private String finalE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String imgE, String inicioE, String finalE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        this.inicioE = inicioE;
        this.finalE = finalE;

    }

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
    
    public String getInicioE() {
        return inicioE;
    }

    public void setInicioE(String inicioE) {
        this.inicioE = inicioE;
    }

    public String getFinalE() {
        return finalE;
    }

    public void setFinalE(String finalE) {
        this.finalE = finalE;
    }

}
