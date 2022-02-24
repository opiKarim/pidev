/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.time.LocalDate;
import model.Reclamation;
import model.reponse;
import model.societe;
import services.serviceSociete;
import services.serviceReclamation;
import services.servicereponse;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nabil
 */
public class Easy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // MyConnection mc = new MyConnection();
        // TODO code application logic here
       Reclamation R = new Reclamation("technique", "oolala", "aaaa", "aaa");
       Reclamation s = new Reclamation("universitaire", "azerty", "mmmmm", "zezez");
       serviceReclamation src = new serviceReclamation();
//       src.ajouterReclamation(s);
//        System.out.println(src.afficherReclamation());
     //  src.modifierReclamation(s,101);
     //  System.out.println(src.afficherReclamation()); 
       
       /** societe S = new societe("55","esprit","nab@esp.tn","ariana","src/img/pdp","1234");
        societe M = new societe("022","msb","nab@esp.tn","ariana","src/img/pdp","1234");
        serviceSociete ss = new serviceSociete();
        ss.ajouterSociete(S);
      System.out.println(ss.afficherSociete());
      ss.modifierSociete(M,"55");
      System.out.println(ss.afficherSociete()); */
 reponse RR = new reponse(103, "je avzzz");
     reponse RPP = new reponse(2020, "ooo");
     servicereponse srp= new servicereponse();
//    srp.ajouterReponse(RPP);
//    srp.ajouterReponse(RR);
       // System.out.println(srp.afficherReponse());
//       LocalDate entree =LocalDate.parse(R.getDaterec(),DateTimeFormatter.ISO_LOCAL_DATE);
//       LocalDate sortie =LocalDate.parse(RR.getDaterep(),DateTimeFormatter.ISO_LOCAL_DATE);
  s.setDaterec(LocalDate.of(2022, Month.JUNE, 4));
Period daysBetween = Period.between(RPP.getDaterep(),s.getDaterec());
        int per = daysBetween.getDays()+daysBetween.getMonths()*30;
        System.out.println(RPP.getDaterep());
        System.out.println(s.getDaterec());
        System.out.println("period "+ per);
        System.out.println(daysBetween);
       
    }
    
}
