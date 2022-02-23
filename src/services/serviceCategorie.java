/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.ICategorie;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Categorie;
import model.Cours;
import util.MyConnection;


/**
 *
 * @author Nabil
 */
public class serviceCategorie implements ICategorie {
    
    public Connection myConnection = MyConnection.getInstance();

    @Override
    public void ajouterCategorie(Categorie Cat) {
      String request = "INSERT INTO `categorie`( `domaine`, `nomcat`) VALUES ('"+Cat.getDomaine()+"','"+Cat.getNomcat()+"')";
        try {
            Statement st = myConnection.createStatement();
             st.executeUpdate(request);
              System.out.println("Categorie ajoutee avec succes");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }     }

    @Override
    public List<Categorie> afficherCategorie() {
        List<Categorie> ListCat = new ArrayList<>();
        String request1 = "SELECT * FROM `categorie`";
        try {
            Statement st = myConnection.createStatement();
            ResultSet rs = st.executeQuery(request1);
             while (rs.next()){
               Categorie Cat= new Categorie();
               Cat.setIdcat(rs.getInt(1));
               Cat.setDomaine(rs.getString("domaine"));
                Cat.setNomcat(rs.getString("nomcat"));
              
               ListCat.add(Cat);
             }
        } catch (SQLException ex) {
     System.err.println(ex.getMessage());
        }
    
        return ListCat;     //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerCategorie(int id) {
String request2="DELETE FROM `categorie` WHERE `idcat`='"+id+"'";
        try{
            Statement st = myConnection.createStatement();
              st.executeUpdate(request2);
              
              System.out.println("Categorie supprimee avec succes");
           
        }
        catch(SQLException ex){  
            System.err.println(ex.getMessage());
        }     }
@Override
    public void modifierCategorie(Categorie cat,int id) {
     try{      
      
      String request3="UPDATE `categorie` SET `nomcat`='"+cat.getNomcat()+"',`domaine`='"
              +cat.getDomaine()+
            "' WHERE `idcat` = "+id ; 

            Statement st = myConnection.createStatement();
       st.executeUpdate(request3);
        System.out.println("evenement modifie avec succes");
   
     }
     catch(SQLException ex){
         
     System.err.println(ex.getMessage());
     } 
    }
    
}
