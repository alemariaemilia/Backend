
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

    public dtoProyecto() {
    }

    public dtoProyecto(String tituloP, String descripcionP, String imgP, String urlP) {
        this.tituloP = tituloP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.urlP = urlP;
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
}
