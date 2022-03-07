/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.Duration;
import model.Cours;
import model.Evenement;
import model.LikeCours;
import org.controlsfx.control.Notifications;
import services.serviceCours;
import services.serviceEvenement;

/**
 * FXML Controller class
 *
 * @author Khawla
 */
public class LikeCoursController extends Application implements Initializable {

    private JFXTextField btn_filtrerEvents;
    
    ObservableList<Cours> obList;
    serviceCours coursService = new serviceCours();
    @FXML
    private AnchorPane anchor;
    @FXML
    private JFXListView<Cours> listView;
    @FXML
    private Circle btnClose;
    private JFXComboBox<String> cb_cat;
    @FXML
    private Pane pane;
    @FXML
    private ImageView back;
    
    Label  label = new Label("");
    private void handleSearch(ActionEvent event) {
    filter();
   }

    private void filtrer(ActionEvent event) {
        filterByDesc();
    }

    @FXML
    private void backAction(MouseEvent event) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("interfaceCategorie.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();

                        stage.setScene(scene);
                new animatefx.animation.ZoomIn(root).play();
        stage.show();
    }

    /**
     * Initializes the controller class.
     */
    int etat=0;
    class XCell extends ListCell<Cours> {
        Pane hbox = new Pane();
        //Label label = new Label("(empty)");
        Pane pane = new Pane();
        Button button = new Button("Like");
        
   
        
        
        //
        //
        Cours lastItem;
        private ImageView imageView = new ImageView();
        public XCell() {
            super();
       
      
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println(lastItem + " : " + event);
                    
                   
                    
                
                        
                    
                    
                    if(coursService.likeCours(1, lastItem.getId(), 1)== true) {
                            
                           Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerte");
            alert.setHeaderText(null);
            alert.setContentText("Votre like a ete enregistrer avec succes merci bcp:)");
            button.setText(" I Like");
              button.setStyle("-fx-background-radius:5;\n" +"    -fx-background-color: #fff;\n" +"        -fx-text-fill:  green;\n" +"        -fx-border-width:2px;\n" +
         "   -fx-border-color: green ;\n"+
"        -fx-border-style:solid;\n" +
"            -fx-border-radius:5px;"
                    );       
           
            
                               alert.showAndWait();
 
                        }
                        

                    
                    
                    
                   else  if(coursService.dislikeCours(lastItem.getId(), 0)== true) {
                         Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerte");
            alert.setHeaderText(null);
            etat = 1;
            alert.setContentText("Votre Dislike a ete enregistrer");
               button.setText("I Dislike");
               coursService.dislikeCours(lastItem.getId(),0);
              button.setStyle("     -fx-background-radius:5;\n" +
"    -fx-background-color: #fff;\n" +
"        -fx-text-fill:  red;\n" +
"        -fx-border-width:2px;\n" +
         "   -fx-border-color: red ;\n"+
"        -fx-border-style:solid;\n" +
"            -fx-border-radius:5px;"
                    );       
              coursService.dislikeCours(lastItem.getId(), 0);
            
            alert.showAndWait();
                    }

       
                    
                    
                    
      
   

        
          
                        
                                      
                      }});             
    
                   
        }
@Override
   protected void updateItem(Cours item, boolean empty) {
   super.updateItem(item, empty);
   setText(null);  // No text in label of super class
   if (empty) {
                lastItem = null;
                setGraphic(null);
            } else {
           lastItem = item;
           Label Title = new Label("Title : "+item.getTitre());
           Title.setLayoutX(120);
           Title.setLayoutY(50);
           
           
           
           
           Label Prix = new Label("\n Description :"+item.getDescription());
           
           
  
           Prix.setLayoutX(120);
           Prix.setLayoutY(50);
           
 
        
        
  

          

           
           
       

 
           button.setLayoutX(120);
           button.setLayoutY(50);
           button.prefHeight(500);
           button.prefWidth(500);
           button.setLayoutX(800);
           button.setLayoutY(50);
           button.setLayoutX(500);
           button.setLayoutY(50);
           button.setPrefHeight(50);
           button.setPrefWidth(201);
           button.setStyle("     -fx-background-radius:5;\n" +
"    -fx-background-color: #fff;\n" +
"        -fx-text-fill:  #E75480;\n" +
"        -fx-border-width:2px;\n" +
         "   -fx-border-color: #E75480 ;\n"+
"        -fx-border-style:solid;\n" +
"            -fx-border-radius:5px;"
                    );       
           
           
      
         //  if(item.getImagepath() == null ){
           //    System.out.println("null image");
             //  return ;
           //}
          //imageView.setImage(new Image("http://localhost:8080/pidev-integration/web/uploads/images/events/"+item.getImagepath(),120, 120, true, true));
                        
           for(LikeCours lc :coursService.afficherCoursLikerParCours(lastItem.getId())) {
               System.out.println(""+lastItem);
               if(lastItem.getId() == lc.getIdcours()) {
             
            button.setText("Already Like");
                 button.setStyle("     -fx-background-radius:5;\n" +
"    -fx-background-color: #fff;\n" +
"        -fx-text-fill:  green;\n" +
"        -fx-border-width:2px;\n" +
         "   -fx-border-color: green ;\n"+
"        -fx-border-style:solid;\n" +
"            -fx-border-radius:5px;"
                    );      
           
            
 

               }

               if(lc.getLikeEtat()==0) {
            button.setText("Already Dislike");
                 button.setStyle("     -fx-background-radius:5;\n" +
"    -fx-background-color: #fff;\n" +
"        -fx-text-fill:  red;\n" +
"        -fx-border-width:2px;\n" +
         "   -fx-border-color: red ;\n"+
"        -fx-border-style:solid;\n" +
"            -fx-border-radius:5px;"
                    );      
           
            
 

               }
                
           }
          StackPane sp = new StackPane();
          Pane pane = new Pane();
          Pane pane2 = new Pane();
          pane.getChildren().add(imageView);
          pane2.getChildren().addAll(Title,Prix,button,label);
          sp.getChildren().addAll(pane,pane2);
              setGraphic(sp);
            }
   
   
        }
    }
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    obList = coursService.afficherCoursActive(1);
    
                 serviceCours sCours = new serviceCours();

                 
                 
                 
              
            
    
 
              listView.setOnMouseClicked(me -> {
                        System.out.println(coursService.afficherCoursLikerParCours(listView.getSelectionModel().getSelectedItem().getId()));

              });
//      cb_cat.setItems(option);
     
      
//      new AutoCompleteComboBoxListener<>(cb_cat);

    
                 for(Cours cActiver :obList)  {
                         System.out.println("etat =>"+cActiver.isEtat());
                     listView.setItems(obList);
                     
                                  }
        listView.setCellFactory(new Callback<ListView<Cours>, ListCell<Cours>>() {
            @Override
            public ListCell<Cours> call(ListView<Cours> param) {
                return new XCell();
                
            }
        });
       StackPane pane = new StackPane();
        //pane.getChildren().add(lv);
       //   Pane.getChildren().add(pane);
           
    }
    
    
    
    
    
    
    private void handleMouseAction(MouseEvent event) throws IOException {
         
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    }
SortedList<Cours> sortedData;
FilteredList<Cours> filteredList ;
    //Metier Relation
    public void filter() {  
       filteredList = new FilteredList<>(obList,b->true);
       filteredList.setPredicate(evenement-> {
        if(cb_cat.getValue() == null || cb_cat.getValue().isEmpty()) {
                                
                         return true;
                }
                String lowerCaseFilter =cb_cat.getValue().toLowerCase();
                if(evenement.getTitre().toLowerCase().indexOf(lowerCaseFilter)!=-1 ) {
                  return true;
               }
               else{
                                        
                    return false;
                }

            });
       listView.setItems(filteredList);
      
    }
   public void filterByDesc() {  
        filteredList = new FilteredList<>(obList,b->true);
        btn_filtrerEvents.textProperty().addListener((observable,oldValue,newValue) ->{
        if(btn_filtrerEvents.getText().isEmpty()) {
        }
        filteredList.setPredicate(evenement-> {
        if(newValue == null || newValue.isEmpty()) {
                                
                         return true;
                }
      
                String lowerCaseFilter =newValue.toLowerCase();
                if(evenement.getDescription().toLowerCase().indexOf(lowerCaseFilter)!=-1 ) {
                    
                    return true;
                    
                }
            else{
                                        
                    return false;
                }

            });
            
        });
  listView.setItems(filteredList);
      
    }
   
   
  
   
  
    }
    



 //Metier Relation
         
  
    



    

   

