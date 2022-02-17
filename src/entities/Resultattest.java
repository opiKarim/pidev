/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author karim
 */
public class Resultattest {
    private int id;
    private int idtest;
    private int idetudiant;
    private float score;

    public Resultattest(int id, int idtest, int idetudiant, float score) {
        this.id = id;
        this.idtest = idtest;
        this.idetudiant = idetudiant;
        this.score = score;
    }

    public Resultattest(int idtest, int idetudiant, float score) {
        this.idtest = idtest;
        this.idetudiant = idetudiant;
        this.score = score;
    }
    public Resultattest(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdtest(int idtest) {
        this.idtest = idtest;
    }

    public void setIdetudiant(int idetudiant) {
        this.idetudiant = idetudiant;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public int getIdtest() {
        return idtest;
    }

    public int getIdetudiant() {
        return idetudiant;
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Resultattest{" + "id=" + id + ", idtest=" + idtest + ", idetudiant=" + idetudiant + ", score=" + score + '}';
    }
    
}
