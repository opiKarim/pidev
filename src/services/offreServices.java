/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Offre;
import utils.myConnection;

/**
 *
 * @author Ihebowski
 */
public class offreServices {
    Connection connection;

    public offreServices() {
        connection = myConnection.getInstance().getConnection();
    }
    
    public Offre getOffreById(int id){
        Offre o = new Offre();
        try { 
            String req0 = "SELECT * FROM offre WHERE id = "+id;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(req0);
            while(rs.next()){
                o.setId(rs.getInt(1));
                o.setTitre(rs.getString(2));
                o.setType(rs.getString(3));
                o.setDateFin(rs.getDate(4));
                o.setIdRecruteur(rs.getInt(5));
            }
        } catch (SQLException ex) {
            System.err.printf(ex.getMessage());
        }
        return o;
    }
    
    public void ajouterOffre(Offre o){
        try {
            String req1 = "INSERT INTO offre (titre,type,dateFin,idRecruteur) "
                    + "VALUES(?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(req1);
            pst.setString(1, o.getTitre());
            pst.setString(2, o.getType());
            pst.setDate(3, o.getDateFin());
            pst.setInt(4, o.getIdRecruteur());
            pst.executeUpdate();
            System.out.printf("Offre added.");
        } catch (SQLException ex) {
            System.err.printf(ex.getMessage());
        }
    }
    
    public void modifierOffre(Offre o){
        try {
            String req2 = "UPDATE offre SET titre = ? , type = ? , dateFin = ? "
                    + "WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(req2);
            pst.setString(1, o.getTitre());
            pst.setString(2, o.getType());
            pst.setDate(3, o.getDateFin());
            pst.setInt(4, o.getId());
            pst.executeUpdate();
            System.out.println("Offre Updated.");

        }catch(Exception ex) {
            System.err.printf(ex.getMessage());
        } 
    }
    
    public void deleteOffre(Offre o){
            try {
               String req3 ="DELETE FROM offre WHERE id=?";
               PreparedStatement pst = connection.prepareStatement(req3);
               pst.setInt(1, o.getId());
               pst.executeUpdate();
               System.out.println("Offre Deleted.");

            }catch(Exception ex) {
                System.err.printf(ex.getMessage());
            }
    }
    
    public List<Offre> afficherOffre(){
        List<Offre> OffreList = new ArrayList<>();
        try { 
            String req4 = "SELECT * FROM offre";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(req4);
            while(rs.next()){
                Offre o = new Offre();
                o.setId(rs.getInt(1));
                o.setTitre(rs.getString(2));
                o.setType(rs.getString(3));
                o.setDateFin(rs.getDate(4));
                o.setIdRecruteur(rs.getInt(5));
                OffreList.add(o);
            }
        } catch (SQLException ex) {
            System.err.printf(ex.getMessage());
        }
        return OffreList;
    }
    
    public List<Offre> afficherOffreByRecruterId(int id){
        List<Offre> OffreList = new ArrayList<>();
        try { 
            String req4 = "SELECT * FROM offre WHERE idRecruteur = "+id;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(req4);
            while(rs.next()){
                Offre o = new Offre();
                o.setId(rs.getInt(1));
                o.setTitre(rs.getString(2));
                o.setType(rs.getString(3));
                o.setDateFin(rs.getDate(4));
                o.setIdRecruteur(rs.getInt(5));
                OffreList.add(o);
            }
        } catch (SQLException ex) {
            System.err.printf(ex.getMessage());
        }
        return OffreList;
    }
}
