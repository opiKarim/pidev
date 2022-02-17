/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Test;
import java.sql.Connection;
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
public class TestCrud {
   

    public void ajouterTest(Test t){
        try {
            String req = "INSERT INTO test (titre,description) VALUES('?','?')";
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setString(1, t.getTitre());
            pst.setString(2, t.getDescription());
            pst.executeUpdate();
            System.out.println("Test à été ajouté avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
            
    }
    public void modifierTest(Test t, int id){
        try {
            String req = "UPDATE INTO test SET titre=? , description=? WHERE id="+id;
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setString(1, t.getTitre());
            pst.setString(2, t.getDescription());
            pst.executeUpdate();
            System.out.println("Test à été modifié avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
              
    }
    public void supprimerTest( int id){
        try {
            String req = "DELETE FROM test WHERE id="+id;
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setInt(1, id);
           
            pst.executeUpdate();
            System.out.println("Test à été supprimer avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public List<Test> afficherTests(){
        List<Test> mylist= new ArrayList<>();
        try {
                       
            String sql ="select * from test";
            Statement st= new MyConnection().getConnexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                Test t= new Test();
                t.setId(rs.getInt(1));
                t.setTitre(rs.getString("titre"));
                t.setDescription(rs.getString("description"));
                mylist.add(t);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TestCrud.class.getName()).log(Level.SEVERE, null, ex);
        
    }
        
       
     return mylist;
     }

}
