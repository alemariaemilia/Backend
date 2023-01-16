
package com.portfolio.AME.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Alema
 */

public class dtoProyecto {
    @NotBlank
    private String tituloP;
    @NotBlank
    private String descripcionP; 
    @NotBlank
    private String imgP;
    @NotBlank
    private String urlP;
    @NotBlank
    private String inicioP;
    @NotBlank
    private String finalP;

    public dtoProyecto() {
    }

    public dtoProyecto(String tituloP, String descripcionP, String imgP, String urlP, String inicioP, String finalP) {
        this.tituloP = tituloP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.urlP = urlP;
        this.inicioP = inicioP;
        this.finalP = finalP;
    }

    public String getTituloP() {
        return tituloP;
    }

    public void setTituloP(String tituloP) {
        this.tituloP = tituloP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }

    public String getUrlP() {
        return urlP;
    }

    public void setUrlP(String urlP) {
        this.urlP = urlP;
    }

    public String getInicioP() {
        return inicioP;
    }

    public void setInicioP(String inicioP) {
        this.inicioP = inicioP;
    }

    public String getFinalP() {
        return finalP;
    }

    public void setFinalP(String finalP) {
        this.finalP = finalP;
    }
    
    
}
