/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ihebowski
 */
public class myConnection {
    private String url ="jdbc:mysql://localhost:3306/ez";
    private String login = "root";
    private String password = "";
    Connection cnx;
    public static myConnection instance;
    
    private myConnection() {
        try {
            cnx = DriverManager.getConnection(url, login, password);
            System.out.println("Connected");
        } catch(Exception ex) {
            System.err.println("Error : "+ex.getMessage());
        }
    }
    
    public Connection getConnection(){
        return cnx;
    }
    
    public static myConnection getInstance(){
        if(instance == null){
            instance = new myConnection();
        }
            return instance;  
    }
}
