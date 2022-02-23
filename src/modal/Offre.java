/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.sql.Date;

/**
 *
 * @author Ihebowski
 */
public class Offre {
    private int id;
    private String titre;
    private String type;
    private Date dateFin;
    
    //join
    private int idRecruteur;

    public Offre() {
    }

    public Offre(int id, String titre, String type, Date dateFin, int idRecruteur) {
        this.id = id;
        this.titre = titre;
        this.type = type;
        this.dateFin = dateFin;
        this.idRecruteur = idRecruteur;
    }

    public Offre(int id, String titre, String type, Date dateFin) {
        this.id = id;
        this.titre = titre;
        this.type = type;
        this.dateFin = dateFin;
    }

    public Offre(String titre, String type, Date dateFin) {
        this.titre = titre;
        this.type = type;
        this.dateFin = dateFin;
    }

    public Offre(String titre, String type, Date dateFin, int idRecruteur) {
        this.titre = titre;
        this.type = type;
        this.dateFin = dateFin;
        this.idRecruteur = idRecruteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getIdRecruteur() {
        return idRecruteur;
    }

    public void setIdRecruteur(int idRecruteur) {
        this.idRecruteur = idRecruteur;
    }

    @Override
    public String toString() {
        return "offre{" + "id=" + id + ", titre=" + titre + ", type=" + type + ", dateFin=" + dateFin + ", idRecruteur=" + idRecruteur + '}';
    }
  
}
