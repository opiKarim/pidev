/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Categorie;
import model.Cours;
import services.serviceCategorie;
import services.serviceCours;

/**
 *
 * @author Nabil
 */
public class Easy2 extends Application{
   private double xOffset = 0;
        private double yOffset = 0;
        private BorderPane p;

        
        
        
     
   
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("/views/Acceuil.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        
        root.setOnMousePressed(((MouseEvent event) -> {
            xOffset = event.getSceneX();
            yOffset = event.getScreenY();
        }));
        
        root.setOnMouseDragged((MouseEvent event)->{
            stage.setX(event.getSceneX() - xOffset);
            stage.setY(event.getSceneY() - yOffset);
        });
                        stage.setScene(scene);
                new animatefx.animation.ZoomIn(root).play();

        stage.show();
        
        
       
 
    }
    
    
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        launch(args);

        
    }
        
        
    
        
        
        
      //  serviceCategorie serviceCategorie = new serviceCategorie();
     //   Categorie cat = new Categorie("Sicene", "Sicene");
        
        
     //   serviceCategorie.ajouterCategorie(cat);
     //serviceCategorie.supprimerCategorie(1);
     
     //serviceCategorie.modifierCategorie(cat,46);
     
    // for (Categorie c : serviceCategorie.afficherCategorie()) {
     //    System.out.println("Categories =\n"+c);
     //}
     
    //    long millis=System.currentTimeMillis();  
    //    java.sql.Date date=new java.sql.Date(millis); 
    // serviceCours serCours = new serviceCours();
   //  Cours cours1 = new Cours("Java", "java oop ", 52, date, "plusplus", 0);   
   //  Cours cours2= new Cours("Python", "Python oop ", 30, date, "plusplus", 0);
   //  Cours cours3= new Cours("Symfony", "Symfony oop ", 40, date, "plusplus", 0);

   //  serCours.ajouterCours(cours1);
   //      serCours.ajouterCours(cours2);
  //   serCours.ajouterCours(cours3);

//     serCours.supprimerCours(1);

       // serCours.modifierCours(new Cours("chapitre1","osdkq",4,date,"undefini",0),7);
        
     // for (Cours c : serCours.afficherCours()) {
      //   System.out.println("Cours =\n"+c);
   //  }
      
      
      //Like cours 
      // if like == 0 ray dislike otherwise ==1 ray like
      
    //  int iduser = 2;
    //  int idcours =2;
      //int likeEtat = 1;
    //  int likeEtat = 0;
     // serCours.likeCours(2, 2,1);//like
    //  serCours.likeCours(iduser, idcours, likeEtat);//Dislike
      
     //serCours.countDislike();
     // serCours.countLikes();
      
     
    // serCours.statLikeParRapportCours();
     
     //JOIN
    
     //for(Cours cours : serCours.afficherCoursParCategorie(1)) {
       //  System.out.println("Cours titre : \n"+cours.getTitre()+"\n Cours description : \n"+cours.getDescription()+" \n"+cours.getDatecreate()+"\n "+cours.getDuree());
     //}
    //}
    
    
    
    //ACTIVER COURS
   // cours3.setEtat(true);
    //serCours.traiterCours(cours3);
    
    
    //DESACTIVER COURS
 //   cours3.setEtat(false);
 //   serCours.traiterCours(cours3);
    
    //COURS LIKER
  //  for(Cours cours : serCours.afficherCoursLiker()) {
  //       System.out.println("Cours titre : \n"+cours.getTitre()+"\n Cours description : \n"+cours.getDescription()+" \n"+cours.getDatecreate()+"\n "+cours.getDuree());
  //   }
  //  }
    
    
    
}
