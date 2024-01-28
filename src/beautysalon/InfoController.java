/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package beautysalon;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Perfl
 */
public class InfoController implements Initializable {

    @FXML
    private Label lable2;
    @FXML
    private Label lable3;
    @FXML
    private Label lable4;
    @FXML
    private Label lable5;
    @FXML
    private Label lable7;
    @FXML
    private Label lable6;
    @FXML
    private Label lable8;
    @FXML
    private TextField box1;
    @FXML
    private TextField box3;
    @FXML
    private TextField box2;
    @FXML
    private TextField box4;
    @FXML
    private TextField box6;
    @FXML
    private TextField box5;
    @FXML
    private Button button1;
    @FXML
    private Label lable1;
    @FXML
    private Label LError;
@FXML
    private Button btn0;

   
    @FXML
    private void getStarted(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("choose.fxml"));
        Stage window = (Stage)btn0.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void signUp(ActionEvent event) throws IOException {
      
            
            String firstName= box1.getText();
             String lastName= box2.getText();
              String age= box3.getText();
               String IdNumber= box4.getText();
                String email= box5.getText();
                 String phoneNumber= box6.getText();
                 
                 
                 try{
                     
                     FileWriter Writer = new FileWriter("information.txt",true);
                     PrintWriter Write=new PrintWriter(Writer);
      Write.print(""+firstName+" "+lastName+" "+IdNumber+" "+email+" "+phoneNumber+" "+age+" ");
      Write.print(System.getProperty("line.separator"));
      Write.close();
                     Writer.close();
                     JOptionPane.showMessageDialog(null, "success");
                    
                    
                    
                 }
                 
                     
                 catch (Exception e){
                     
                       JOptionPane.showMessageDialog(null, "Error");
                     
                 }
        }
        
    
}
