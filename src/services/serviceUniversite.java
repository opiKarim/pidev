/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.IUniversite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Universite;
import util.MyConnection;

/**
 *
 * @author Nabil
 */
public class serviceUniversite implements IUniversite {

    
    public Connection myConnection = MyConnection.getInstance();
    @Override
    public void ajouterUniversite(Universite U) {
      String request = "INSERT INTO `universite`(`idUni`, `nom`, `email`, `adresse`, `imguni`, `mdpuni`) VALUES ('"+U.getIdUni()+"','"+U.getNom()+"','"+U.getEmail()+"','"+U.getAdresse()+"','"+U.getImguni()+"','"+U.getMdpuni()+"')";
        try {
            Statement st = myConnection.createStatement();
             st.executeUpdate(request);
              System.out.println("Societe ajoutee avec succes");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }    }

    @Override
    public List<Universite> afficherUniversite() {
  List<Universite> ListU = new ArrayList<>();
    String request1 = "SELECT * FROM `universite`";
        try {
            Statement st = myConnection.createStatement();
            ResultSet rs = st.executeQuery(request1);
             while (rs.next()){
               Universite U= new Universite();
                U.setIdUni(rs.getString(1));
                U.setNom(rs.getString("nom"));
                U.setEmail(rs.getString("email"));
                U.setAdresse(rs.getString("adresse"));
                U.setImguni(rs.getString("imgUni"));
                U.setMdpuni(rs.getString("mdpUni"));
               ListU.add(U);
             }
        } catch (SQLException ex) {
     System.err.println(ex.getMessage());
        }
    
        return ListU;    }

    @Override
    public void supprimerUniversite(Universite U) {
      String request2="DELETE FROM `universite` WHERE `idUni`='"+U.getIdUni()+"'";
        try{
            Statement st = myConnection.createStatement();
              st.executeUpdate(request2);
              
              System.out.println("Universite supprimee avec succes");
           
        }
        catch(SQLException ex){  
            System.err.println(ex.getMessage());
        }       }

    @Override
    public void modifierUniversite(Universite U, String idUni) {
 try{      
      String request3="UPDATE `universite` SET `nom`='"+U.getNom()+"',`email`='"+U.getEmail()+"',`adresse`='"+U.getAdresse()+"',`imguni`='"+U.getImguni()+"',`mdpuni`='"+U.getMdpuni()+"' WHERE `idUni` = "+idUni ; 
         
            Statement st = myConnection.createStatement();
       st.executeUpdate(request3);
        System.out.println("suniversite modifie avec succes");
   
     }
     catch(SQLException ex){
     System.err.println(ex.getMessage());
     } 
    }
    
}
