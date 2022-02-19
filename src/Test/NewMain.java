/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import modeles.Etudiant;
import modeles.User;
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
        ServiceEtudiant sE = new ServiceEtudiant();
        // User u = new User("Rami", "bd", 55646466, "mail@mail", "motps", "aaaaa");
        // Etudiant e = new Etudiant("hana", "bd", 55646466, "mail@mail", "motps",
        // "aaaaa","info",3,100);
        // se.add(e);
        User user = new User("Baha", "Bou terma", 69696969, "bahaeddine.douss@esprit.tn ", "motps", "aaaaa");

        switch (Integer.valueOf(menu.start())) {
            case 5:
                System.out.println(sE.getAll());
                break;
            case 2:
                switch (Integer.valueOf(menu.Add())) {
                    case 1:
                        sU.add(menu.AddUser());
                        break;
                    case 2:
                        sE.add(menu.AddEtudiant());
                        break;
                    default:
                        break;
                }
            case 3:
                menu.updateUser();
                break;
            case 4:
                menu.deleteUser();
            case 1:
                String subject = "YA3TIK 3asssbaa";
                String body = "8======D";
                SendEmail mail = new SendEmail(user, subject, body);
                System.out.println("*************");
                break;

            default:
                break;
        }

    }

}
