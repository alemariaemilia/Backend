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
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloB;
    private String imgB;

    public Banner() {
    }

    public Banner(String tituloB, String imgB) {
        this.tituloB = tituloB;
        this.imgB = imgB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
