/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Resultattest;
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
public class ResultatCrud {
    
        public void ajouterResultat(Resultattest rt){
        try {
            String req = "INSERT INTO test (idtest,idetudiant,score) VALUES('?','?','?')";
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setInt(1, rt.getIdtest());
            pst.setInt(2, rt.getIdetudiant());
            pst.setFloat(3, rt.getScore());
            pst.executeUpdate();
            System.out.println("Resultat à été ajouté avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
            
    }
    public void modifierTest(Resultattest rt, int id){
        try {
            String req = "UPDATE INTO resultattest SET idtest=? , idetudiant=?, score=? WHERE id="+id;
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setInt(1, rt.getIdtest());
            pst.setInt(2, rt.getIdetudiant());
            pst.setFloat(3, rt.getScore()); 
            pst.executeUpdate();
            System.out.println("Test à été modifié avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
              
    }
    public void supprimerTest( int id){
        try {
            String req = "DELETE FROM resultattest WHERE id="+id;
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setInt(1, id);
           
            pst.executeUpdate();
            System.out.println("Resultat à été supprimer avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public List<Resultattest> afficherResultattest(){
        List<Resultattest> mylist= new ArrayList<>();
        try {
                       
            String sql ="select * from resultattest";
            Statement st= new MyConnection().getConnexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                Resultattest rt= new Resultattest();
                rt.setId(rs.getInt(1));
                rt.setIdtest(rs.getInt("idtest"));
                rt.setIdetudiant(rs.getInt("idetudiant"));
                rt.setScore(rs.getInt("score"));

                mylist.add(rt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TestCrud.class.getName()).log(Level.SEVERE, null, ex);
        
    }
        
       
     return mylist;
     }
}
