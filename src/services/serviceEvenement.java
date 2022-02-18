/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.IEvenement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Evenement;
import util.MyConnection;

/**
 *
 * @author Nabil
 */
public class serviceEvenement implements IEvenement {

    
    public Connection myConnection = MyConnection.getInstance();
    @Override
    public void ajouterEvenement(Evenement Ev) {
      String request = "INSERT INTO `evenement`(`idEvent`, `idOrg`, `description`, `date`, `heure`, `lien`, `imgEv`) VALUES ('"+Ev.getIdEvent()+"','"+Ev.getIdOrg()+"','"+Ev.getDescription()+"','"+Ev.getDate()+"','"+Ev.getHeure()+"','"+Ev.getLien()+"','"+Ev.getImgEv()+"')";
        try {
            Statement st =myConnection.createStatement();
             st.executeUpdate(request);
              System.out.println("Event ajoutee avec succes");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }    }

    @Override
    public List<Evenement> afficherEvenement() {
        List<Evenement> ListEv = new ArrayList<>();
        String request1 = "SELECT * FROM `evenement`";
        try {
            Statement st = myConnection.createStatement();
            ResultSet rs = st.executeQuery(request1);
             while (rs.next()){
               Evenement Ev= new Evenement();
                Ev.setIdEvent(rs.getInt(1));
                Ev.setIdOrg(rs.getString("idOrg"));
                Ev.setDescription(rs.getString("description"));
                Ev.setDate(rs.getDate("date"));
                Ev.setHeure(rs.getString("heure"));
                Ev.setLien(rs.getString("lien"));
                Ev.setImgEv(rs.getString("imgEv"));
               ListEv.add(Ev);
             }
        } catch (SQLException ex) {
     System.err.println(ex.getMessage());
        }
    
        return ListEv; 
    }

    @Override
    public void supprimerEvenement(int id ) {
      String request2="DELETE FROM evenement WHERE idEvent="+id;
        try{
            Statement st = myConnection.createStatement();
              st.executeUpdate(request2);
              
              System.out.println("Event supprimee avec succes");
           
        }
        catch(SQLException ex){  
            System.err.println(ex.getMessage());
        }     }

    @Override
    public void modifierEvenement(Evenement Ev,int idE) {
     try{      
      
      String request3="UPDATE `evenement` SET `idOrg`='"+Ev.getIdOrg()+"',`description`='"+Ev.getDescription()+"',`date`='"
              +Ev.getDate()+"',`heure`='"+Ev.getHeure()+"',`lien`='"+Ev.getLien()+"', `imgEv`='"+Ev.getImgEv()+"' WHERE `idEvent` = "+idE ; 

            Statement st = myConnection.createStatement();
       st.executeUpdate(request3);
        System.out.println("evenement modifie avec succes");
   
     }
     catch(SQLException ex){
         
     System.err.println(ex.getMessage());
     } 
    } 
    
}
