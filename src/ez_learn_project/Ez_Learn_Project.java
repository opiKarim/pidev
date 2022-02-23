/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ez_learn_project;

import java.sql.Date;
import modal.Demande;
import modal.Offre;
import services.demandeServices;
import services.offreServices;

/**
 *
 * @author Ihebowski
 */
public class Ez_Learn_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        //Offre
        offreServices os = new offreServices();
        
        //Creation
        //Offre o2 = new Offre("test44", "test44", new Date(2022,01,01), 2);
        //os.ajouterOffre(o2);
        
        //Edit
        //Offre o3 = new Offre(6,"Stage 3-mois", "stage", new Date(2022,01,01));
        //os.modifierOffre(o3);
        
        //Delete
        //os.deleteOffre(2);
        
        //DisplayById
        //System.out.println(os.getOffreById(5));
        
        //DisplayByIdRecruterId
        //System.out.println(os.afficherOffreByRecruterId(2));
        
        //Display
        System.out.println(os.afficherOffre());
        
        //Demande
        demandeServices ds = new demandeServices();
        
        //Creation
        //demande d1= new Demande("test1", "dd/dd.pdf", 1, 1);
        //ds.ajouterDemande(d1);
        
        //Edit
        //demande d2= new Demande("test11","local/files/cv.pdf",'1','1');
        //ds.modifierDemande(d2, 1);
        
        //Delete
        //ds.deleteDemande(2);
        
        //DisplayByIdOffre
        //System.out.println(ds.afficherDemandeByOfferId(o2));
        
        //DisplayById
        //System.out.println(ds.getDemandeById(8));
        
        //Display
        System.out.println(ds.afficherDemande());

    }
    
}
