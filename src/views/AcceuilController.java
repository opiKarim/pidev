/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AcceuilController implements Initializable {

    @FXML
    private JFXButton btnC;
    @FXML
    private JFXButton btnE;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GOCOURS(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("interfaceCategorie.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();

                        stage.setScene(scene);
                new animatefx.animation.ZoomIn(root).play();
        stage.show();
    }

    @FXML
    private void GOEVENT(ActionEvent event) throws IOException {
              Parent root = FXMLLoader.load(getClass().getResource("InterfaceUnivEvenement.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();

                        stage.setScene(scene);
                new animatefx.animation.ZoomIn(root).play();
        stage.show();
    }
    
}
