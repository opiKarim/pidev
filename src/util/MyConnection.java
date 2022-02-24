/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nabil
 */
public class MyConnection {
            final String url="jdbc:mysql://127.0.0.1:3306/ez";
            final String login="root";
            final String pwd="";
            Connection cnx ;
    public MyConnection() {
                try {
                   cnx = DriverManager.getConnection(url, login, pwd);
                 System.out.println("Connexion etablie");
                } catch (SQLException ex) {
                 System.err.println(ex.getMessage());
                }
       
    }
   public Connection getCnx(){
   return cnx ;
   }         
           
}
