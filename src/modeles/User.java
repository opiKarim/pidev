/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

/**
 *
 * @author Faty
 */
public class User {
    protected int id_user;
    protected String nom;
    protected String prenom;
    protected int phone;
    protected String email;
    protected String pwd;
    protected String carte_banq;
    protected Role role;

    public User() {
    }

    public User(int id_user) {
        this.id_user = id_user;
    }

    public User(int id_user, String nom, String prenom, int phone, String email, String pwd, String carte_banq) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.email = email;
        this.pwd = pwd;
        this.carte_banq = carte_banq;
        this.role = Role.empty;
    }

    public User(String nom, String prenom, int phone, String email, String pwd, String carte_banq) {
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.email = email;
        this.pwd = pwd;
        this.carte_banq = carte_banq;
        this.role = Role.empty;
    }

    @Override
    public String toString() {
        return "{" +
                " id_user='" + getId_user() + "'" +
                ", nom='" + getNom() + "'" +
                ", prenom='" + getPrenom() + "'" +
                ", phone='" + getPhone() + "'" +
                ", email='" + getEmail() + "'" +
                ", pwd='" + getPwd() + "'" +
                ", carte_banq='" + getCarte_banq() + "'" +
                ", role='" + getRole() + "'" +
                "}";
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getId_user() {
        return this.id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCarte_banq() {
        return this.carte_banq;
    }

    public void setCarte_banq(String carte_banq) {
        this.carte_banq = carte_banq;
    }

}
