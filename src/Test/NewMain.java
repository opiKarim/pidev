/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import modeles.Enseignant;
import modeles.Etudiant;
import modeles.Role;
import modeles.User;
import services.ServiceEns;
import services.ServiceEtudiant;
import services.ServiceUser;

/**
 *
 * @author ramyy
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menu menu = new Menu();
        Menu menu = new Menu();
        ServiceUser sU = new ServiceUser();
        ServiceEtudiant sEt = new ServiceEtudiant();
        ServiceEns sEn = new ServiceEns();
        // User u = new User("Rami", "bd", 55646466, "mail@mail", "motps", "aaaaa");
        // Etudiant e = new Etudiant("hana", "bd", 55646466, "mail@mail", "motps",
        // "aaaaa","info",3,100);
        // se.add(e);
        // User user = new User("Baha", "", 69696969, "bahaeddine.douss@esprit.tn ", "motps", "aaaaa");
        User user = new User("Ramyy", "", 69696969, "mouhamedrami.bendhia@esprit.tn ", "motps", "aaaaa");
        Enseignant ens = new Enseignant(1000,"ahmed","mahmoud",2066666,"@gmail.com","motdpass","66654", "Esprit", "Math");

        switch (Integer.valueOf(menu.start())) {
            case 1:
                System.out.println(sU.Search("tel","56"));
                break;
            case 2:
                switch (Integer.valueOf(menu.Add())) {
                    case 1:
                        sU.add(menu.AddUser());
                        break;
                    case 2:
                        sEt.add(menu.AddEtudiant());
                        break;
                    default:
                        break;
                }
            case 3:
                menu.updateUser();
                break;
            case 4:
                menu.deleteUser();
            case 5:
                String subject = "This mail sent from Ez-learning";
                String body = "Testing..";
                SendEmail mail = new SendEmail(user, subject, body);
                System.out.println("*************");
                break;
            case 6:
                System.out.println(sEn.addCours(ens));
                break;
            case 7:
                User hana = new User("hana","mensia",5555555,"hana.mensia@esprit.tn","hahahaha","fsdssvd");
                sU.add(hana);
                hana.resetPassword();

            default:
                break;
        }

    }

}
