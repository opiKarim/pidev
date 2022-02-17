/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import services.TestCrud;
import utils.MyConnection;

/**
 *
 * @author karim
 */
public class MainClass {
    public static void main(String[] args) {
        //MyConnection mc= new MyConnection();
        
        TestCrud tc= new TestCrud();
       // tc.ajouterTest
        System.out.println(tc.afficherTests());
    }
            
}
