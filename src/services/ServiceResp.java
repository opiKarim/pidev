package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modeles.Responsable;
import modeles.User;
import utils.DataSource;

public class ServiceResp implements IService {
    Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public void add(Object u) {
        Responsable e = (Responsable) u;
        try {
            String req = "INSERT INTO `Responsable`(`nom`, `prenom`, `tel`, `email`, `pwd`, `carte_banq`,`role` ,`universite`) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, e.getNom());
            ps.setString(2, e.getPrenom());
            ps.setInt(3, e.getPhone());
            ps.setString(4, e.getEmail());
            ps.setString(5, e.getPwd());
            ps.setString(6, e.getCarte_banq());
            ps.setString(7, e.getRole().toString());
            ps.setString(8, e.getUniversite());

            ps.executeUpdate();
            System.out.println("Responsable Ajoutée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public Object getById(int id) {
        Responsable u = new Responsable();
        try {
            String req = "SELECT * FROM `Responsable` where id = " + id;
            // Statement st = cnx.createStatement();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {
                Responsable us = new Responsable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8));
                u = us;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return u;
    }

    @Override
    public List getAll() {
        List<Responsable> list = new ArrayList<>();
        try {
            String req = "SELECT * FROM `Responsable`";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Responsable e = new Responsable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(9));
                list.add(e);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    }

    @Override
    public boolean update(Object u) {
        try {
            String req = "update `etudiant` set nom = ?, prenom = ?, phone = ?, email = ?, pwd = ?, carte_banq = ?, universite = ? where   id = ?";
            PreparedStatement ps = cnx.prepareStatement(req);
            Responsable e = (Responsable) u;

            ps.setString(1, e.getNom());
            ps.setString(2, e.getPrenom());
            ps.setInt(3, e.getPhone());
            ps.setString(4, e.getEmail());
            ps.setString(5, e.getPwd());
            ps.setString(6, e.getCarte_banq());
            ps.setString(7, e.getRole().toString());
            ps.setString(8, e.getUniversite());
            ps.setInt(9, e.getId());

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(Object u) {
        Responsable e = (Responsable) u;

        String req = "delete from Responsable where id = ?";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, e.getId());
            ps.executeUpdate();
            System.out.println("Responsable supprimer");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
