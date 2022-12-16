package com.portfolio.AME.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Alema
 */


public class dtoBanner {
    @NotBlank
    private String tituloB;
    @NotBlank
    private String imgB;

    public dtoBanner() {
    }

    public dtoBanner(String tituloB, String imgB) {
        this.tituloB = tituloB;
        this.imgB = imgB;
    }

    public String getTituloB() {
        return tituloB;
    }

    public void setTituloB(String tituloB) {
        this.tituloB = tituloB;
    }

    public String getImgB() {
        return imgB;
    }

    public void setImgB(String imgB) {
        this.imgB = imgB;
    }

}
