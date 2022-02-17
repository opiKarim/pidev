/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Test;
import entities.questions;
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
public class QuestionCrud {
    
    
        public void ajouterQuestion(questions q){
        try {
            String req = "INSERT INTO questions (contenu,testid,reponses,reponsecorrect,note) VALUES('?','?')";
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setString(1, q.getContenu());
            pst.setInt(2, q.getTestid());
            pst.setArray(3, q.getReponses());
            pst.setInt(4, q.getResponsecorrect());
            pst.setFloat(5, q.getNote());
            
            pst.executeUpdate();
            System.out.println("question à été ajouté avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
            
    }
    public void modifierQuestion(questions q, int id){
        try {
            String req = "UPDATE INTO questions SET contenu=? , testid=?, reponses=? , reponsecorrect=? , note=? WHERE id="+id;
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setString(1, q.getContenu());
            pst.setInt(2, q.getTestid());
            pst.setString(3, q.getReponses());
            pst.setInt(4, q.getResponsecorrect());
            pst.setFloat(5, q.getNote());;
            pst.executeUpdate();
            System.out.println("Question à été modifié avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
              
    }
    public void supprimerQuestion( int id){
        try {
            String req = "DELETE FROM questions WHERE id="+id;
            
            PreparedStatement pst= new MyConnection().getConnexion().prepareStatement(req);
            pst.setInt(1, id);
           
            pst.executeUpdate();
            System.out.println("Question à été supprimer avec success");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public List<questions> afficherQuestions(){
        List<Test> mylist= new ArrayList<>();
        try {
                       
            String sql ="select * from questions";
            Statement st= new MyConnection().getConnexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                questions q= new questions();
                q.setId(rs.getInt(1));
                q.setContenu(rs.getString("contenu"));
                q.setReponses(rs.getString("reponses"));
                q.setTestid(rs.getInt("testid"));
                q.setResponsecorrect(rs.getInt("reponsecorrect"));
                q.setNote(rs.getFloat("note"));
                mylist.add(q);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TestCrud.class.getName()).log(Level.SEVERE, null, ex);
        
    }
        
       
     return mylist;
     }
}
