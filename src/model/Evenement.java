/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Nabil
 */
public class Evenement {
    private int idEvent ;
    private String idOrg ; 
    private String description;
    private Date date;
    private String heure;
    private String lien;
    private String imgEv;

    public Evenement() {
    }

    public Evenement(int idEvent, String idOrg, String description, Date date, String heure, String lien, String imgEv) {
        this.idEvent = idEvent;
        this.idOrg = idOrg;
        this.description = description;
        this.date = date;
        this.heure = heure;
        this.lien = lien;
        this.imgEv = imgEv;
    }

    public Evenement(String idOrg, String description, Date date, String heure, String lien, String imgEv) {
        this.idOrg = idOrg;
        this.description = description;
        this.date = date;
        this.heure = heure;
        this.lien = lien;
        this.imgEv = imgEv;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(String idOrg) {
        this.idOrg = idOrg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public String getImgEv() {
        return imgEv;
    }

    public void setImgEv(String imgEv) {
        this.imgEv = imgEv;
    }

    @Override
    public String toString() {
        return "Evenement{" + "idEvent=" + idEvent + ", idOrg=" + idOrg + ", description=" + description + ", date=" + date + ", heure=" + heure + ", lien=" + lien + ", imgEv=" + imgEv + '}';
    }
    
   
}
