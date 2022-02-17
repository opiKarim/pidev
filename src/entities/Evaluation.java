/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author karim
 */
public class Evaluation {
    private int id;
    private int idformation;
    private int idformateur;
    private float eval;
    private int total;

    public Evaluation(int id, int idformation, int idformateur, float eval, int total) {
        this.id = id;
        this.idformation = idformation;
        this.idformateur = idformateur;
        this.eval = eval;
        this.total = total;
    }

    public Evaluation(int idformation, int idformateur, float eval, int total) {
        this.idformation = idformation;
        this.idformateur = idformateur;
        this.eval = eval;
        this.total = total;
    }

        
    public Evaluation(){
    }

    public int getId() {
        return id;
    }

    public int getIdformation() {
        return idformation;
    }

    public int getIdformateur() {
        return idformateur;
    }

    public float getEval() {
        return eval;
    }

    public int getTotal() {
        return total;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setIdformation(int idformation) {
        this.idformation = idformation;
    }

    public void setIdformateur(int idformateur) {
        this.idformateur = idformateur;
    }

    public void setEval(float eval) {
        this.eval = eval;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    

    @Override
    public String toString() {
        return "Evaluation{" + "id=" + id + ", idformation=" + idformation + ", idformateur=" + idformateur + ", eval=" + eval + '}';
    }
    
    
}
