
package com.portfolio.AME.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Alema
 */

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloP;
    private String descripcionP;
    private String imgP;
    private String urlP;

    public Proyecto() {
    }

    public Proyecto(String tituloP, String descripcionP, String imgP, String urlP) {
        this.tituloP = tituloP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.urlP = urlP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
