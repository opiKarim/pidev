/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karim
 */
public class MyConnection {
    private String url ="jdbc:mysql://localhost:3306/ez";
    private String login = "root";
    private String password = "";
    Connection connexion;
    
    public MyConnection() {
        try {
            connexion=DriverManager.getConnection(url, login, password);
            System.out.println("Connexion succeed");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnexion(){
        
        return connexion;
    }
}

