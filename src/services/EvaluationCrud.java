/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Evaluation;
import entities.Test;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.MyConnection;

/**
 *
 * @author karim
 */
public class EvaluationCrud {
        public void ajouterEvaluation(Evaluation e){
        try {
            String req = "INSERT INTO evaluation (idformation,idformateur,eval,total) VALUES('?','?','?','?')";
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setInt(1, e.getIdformation());
            pst.setInt(2, e.getIdformateur());
            pst.setFloat(3, e.getEval());
            pst.setInt(4, e.getTotal());
            
            pst.executeUpdate();
            System.out.println("Evaluation à été ajouté avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
            
    }
    public void modifierEvaluation(Evaluation e, int id){
        int total;
        float ratecrr;
        float rate;
        try {
            String reqtot="Select * FROM evaluation WHERE id="+id;
            Statement st= new MyConnection().getConnexion().createStatement();            
            ResultSet rs=st.executeQuery(reqtot);
            
            total=rs.getInt("total");
            ratecrr=rs.getFloat("eval");
            rate=e.getEval();
            rate=((ratecrr*total)+rate)/(total+1);
            total=total+1;
            
            String req = "UPDATE INTO evaluation SET idformation=? , idformateur=?, eval="+rate+", total="+total+" WHERE id="+id;
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setInt(1, e.getIdformation());
            pst.setInt(2, e.getIdformateur());
            pst.setFloat(3, e.getEval());

            pst.executeUpdate();
            System.out.println("Evaluation à été modifié avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
              
    }
    public void supprimerEvaluation( int id){
        try {
            String req = "DELETE FROM evaluation WHERE id="+id;
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setInt(1, id);
           
            pst.executeUpdate();
            System.out.println("Evaluation à été supprimer avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public List<Evaluation> afficherEvaluations(){
        List<Evaluation> mylist= new ArrayList<>();
        try {
                       
            String sql ="select * from evaluation";
            Statement st= new MyConnection().getConnexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                Evaluation e= new Evaluation();
                e.setId(rs.getInt(1));
                e.setIdformation(rs.getInt("idformateur"));
                e.setIdformateur(rs.getInt("idformation"));
                e.setEval(rs.getFloat("eval"));
                mylist.add(e);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        
    }
        
       
     return mylist;
     }
}
