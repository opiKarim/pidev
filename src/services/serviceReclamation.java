/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import model.Reclamation;
import interfaces.IReclamation;
import java.sql.Date;
import java.sql.ResultSet;
import util.MyConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Nabil
 */
public class serviceReclamation implements IReclamation {
    @Override
    public void ajouterReclamation(Reclamation R){
        String request ="INSERT INTO `reclamation`(`idrec`, `type`, `description`, `idetudiant`, `idcours`, `daterec`) VALUES ('"+R.getIdrec()+"','"+R.getType()+"','"+R.getDescription()+"','"+R.getIdetudiant()+"','"+R.getIdcours()+"','"+R.getDaterec()+"')" ;
        try {
            Statement st = new MyConnection().getCnx().createStatement();
            st.executeUpdate(request);
            System.out.println("Reclamation ajoutee avec succes");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    @Override
    public List<Reclamation> afficherReclamation(){
        List<Reclamation> myListR =new ArrayList<>();
        String request1= "SELECT * FROM `reclamation`";
        Statement st;
        
        try {
            st = new MyConnection().getCnx().createStatement();
              ResultSet rs = st.executeQuery(request1);
              while (rs.next()){
                Reclamation R = new Reclamation();
                R.setIdrec(rs.getInt(1));
                R.setType(rs.getString("type"));
                R.setDescription(rs.getString("description"));
                R.setIdetudiant(rs.getString("idetudiant"));
                R.setIdcours(rs.getString("idcours"));
                R.setDaterec(rs.getDate("daterec").toLocalDate());
                myListR.add(R);
              }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    
        return myListR;
}
    @Override
 public void modifierReclamation(Reclamation R, int id){
     try{      
      String request3="UPDATE `reclamation` SET `type`='"+R.getType()+"',`description`='"+R.getDescription()+"',`idetudiant`='"+R.getIdetudiant()+"',`idcours`='"+R.getIdcours()+"', `daterec`='"+R.getDaterec()+"' WHERE `idrec` = "+id ; 
         
 Statement st=new MyConnection().getCnx().createStatement();
       st.executeUpdate(request3);
        System.out.println("reclamation modifie avec succes");
   
     }
     catch(SQLException ex){
     }
    }
   
    
    @Override
    public void supprimerReclamation(Reclamation R) {
     String request2="DELETE FROM `reclamation` WHERE `idrec`='"+R.getIdrec()+"'";
        try{
              Statement st=new MyConnection().getCnx().createStatement();
              st.executeUpdate(request2);
              
              System.out.println("Reclamation supprimé avec succès");
           
        }
        catch(SQLException ex){  
        }    }

}
