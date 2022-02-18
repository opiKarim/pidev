/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy1;

import model.Evenement;
import services.serviceEvenement;

/**
 *
 * @author Nabil
 */
public class Easy1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /** MyConnection mc = new MyConnection();*/
       /** Universite U = new Universite("33","esprit","nab@esp.tn","ariana","src/img/pdp","1234");
        Universite M = new Universite("20","esb","nab@esp.tn","ariana","src/img/pdp","1234");
        serviceUniversite ss = new serviceUniversite();
        ss.ajouterUniversite(U);
      System.out.println(ss.afficherUniversite());
      ss.modifierUniversite(M,"33");
      System.out.println(ss.afficherUniversite());
      ss.supprimerUniversite(M);
      System.out.println(ss.afficherUniversite());*/
       
        
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis); 
        
   
        Evenement Ev = new Evenement("Rania","dsqdsq",date,"bin/bash/pdp","19694","a");
        Evenement Eii = new Evenement("insat","nab@esp.tdz",date,"/img/pdp","33333","Rania");
        serviceEvenement se = new serviceEvenement();
        //se.ajouterEvenement(Ev);
        //se.ajouterEvenement(Eii);
        //System.out.println(se.afficherEvenement());
        se.modifierEvenement(Ev,103);
        //System.out.println(se.afficherEvenement());
       // se.supprimerEvenement(94);
        System.out.println(se.afficherEvenement());
     
    }
    
}
