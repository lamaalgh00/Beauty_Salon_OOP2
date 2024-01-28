/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package beautysalon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Perfl
 */
public class ChooseController implements Initializable {

    @FXML
    private ImageView image1;
    @FXML
    private Label label2111;
    @FXML
    private Button button11;
    @FXML
    private RadioButton rad31;
    @FXML
    private ToggleGroup menu;
    @FXML
    private RadioButton rad11;
    @FXML
    private RadioButton rad21;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void select(ActionEvent event) throws IOException {
        if(rad11.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("info.fxml"));
        Stage window = (Stage)button11.getScene().getWindow();
        window.setScene(new Scene(root));
        }
        else if(rad21.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("Prices.fxml"));
        Stage window = (Stage)button11.getScene().getWindow();
        window.setScene(new Scene(root));
        }
        else if(rad31.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("service.fxml"));
        Stage window = (Stage)button11.getScene().getWindow();
        window.setScene(new Scene(root));
        }
    }
}
