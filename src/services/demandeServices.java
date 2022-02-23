/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modal.Demande;
import modal.Offre;
import utils.myConnection;

/**
 *
 * @author Ihebowski
 */
public class demandeServices {
    Connection connection;

    public demandeServices() {
        connection = myConnection.getInstance().getConnection();
    }
    
    public Demande getDemandeById(int id){
        Demande d = new Demande();
        try { 
            String req0 = "SELECT * FROM demande WHERE id = "+id;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(req0);
            while(rs.next()){
                d.setId(rs.getInt(1));
                d.setDescription(rs.getString(2));
                d.setPathCv(rs.getString(3));
                d.setIdOffre(rs.getInt(4));
                d.setIdEtudiant(rs.getInt(5));
            }
        } catch (SQLException ex) {
            System.err.printf(ex.getMessage());
        }
        return d;
    }
      
    public void ajouterDemande(Demande d){
        try {
            String req1 = "INSERT INTO demande (description,pathCv,idOffre,idEtudiant) "
                    + "VALUES(?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(req1);
            pst.setString(1, d.getDescription());
            pst.setString(2, d.getPathCv());
            pst.setInt(3, d.getIdOffre());
            pst.setInt(4, d.getIdEtudiant());
            pst.executeUpdate();
            System.out.printf("Demande added.");
        } catch (SQLException ex) {
            System.err.printf(ex.getMessage());
        }
    }
    
    public void modifierDemande(Demande d){
        try {
            String req2 = "UPDATE demande SET description = ? , pathCv = ? "
                    + "WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(req2);
            pst.setInt(1, d.getId());
            pst.setString(2, d.getDescription());
            pst.setString(3, d.getPathCv());
            pst.executeUpdate();
            System.out.println("Demande Updated.");

        }catch(Exception ex) {
            System.err.printf(ex.getMessage());
        } 
    }
    
    public void deleteDemande(Demande d){
            try {
               String req3 ="DELETE FROM demande WHERE id = ?";
               PreparedStatement pst = connection.prepareStatement(req3);
               pst.setInt(1, d.getId());
               pst.executeUpdate();
               System.out.println("Demande Deleted.");

            }catch(Exception ex) {
                System.err.printf(ex.getMessage());
            }
    }
    
    public List<Demande> afficherDemande(){
        List<Demande> DemandeList = new ArrayList<>();
        try { 
            String req4 = "SELECT * FROM demande";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(req4);
            while(rs.next()){
                Demande o = new Demande();
                o.setId(rs.getInt(1));
                o.setDescription(rs.getString(2));
                o.setPathCv(rs.getString(3));
                o.setIdOffre(rs.getInt(4));
                o.setIdEtudiant(rs.getInt(5));
                DemandeList.add(o);
            }
        } catch (SQLException ex) {
            System.err.printf(ex.getMessage());
        }
        return DemandeList;
    }
    
    public List<Demande> afficherDemandeByOfferId(Offre o){
        List<Demande> DemandeList = new ArrayList<>();
        try { 
            String req4 = "SELECT * FROM demande WHERE idOffre = "+o.getId();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(req4);
            while(rs.next()){
                Demande d = new Demande();
                d.setId(rs.getInt(1));
                d.setDescription(rs.getString(2));
                d.setPathCv(rs.getString(3));
                d.setIdOffre(rs.getInt(4));
                d.setIdEtudiant(rs.getInt(5));
                DemandeList.add(d);
            }
        } catch (SQLException ex) {
            System.err.printf(ex.getMessage());
        }
        return DemandeList;
    }
}
