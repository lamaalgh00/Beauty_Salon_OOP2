/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package beautysalon;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Perfl
 */
public class ServiceController implements Initializable {

    @FXML
    private AnchorPane pane2;
    @FXML
    private Label wlabel;
    @FXML
    private Label servicel;
    @FXML
    private Button okB;
    @FXML
    private Button cancelB;
    @FXML
    private Label hairL;
    @FXML
    private Label nailL;
    @FXML
    private Label faceL;
    @FXML
    private CheckBox CHhair1;
    @FXML
    private CheckBox CHhair2;
    @FXML
    private CheckBox CHhair3;
    @FXML
    private CheckBox CHnail1;
    @FXML
    private CheckBox CHnail2;
    @FXML
    private CheckBox CHnail3;
    @FXML
    private CheckBox CHface1;
    @FXML
    private CheckBox CHface2;
    @FXML
    private CheckBox CHface3;
    @FXML
    private ImageView logo;
int price=0;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
        
public void  actionPerformed(ActionEvent e)throws IOException{
  
     if(CHhair1.isSelected()){
     price+=50;
     }
    
    
     if(CHhair2.isSelected()){
     price+=100;
     }
    
     if(CHhair3.isSelected()){
     price+=80;
     }
    
     if(CHnail1.isSelected()){
     price+=50;
     }
    
     if(CHnail2.isSelected()){
     price+=50;
     }
    
     if(CHnail3.isSelected()){
     price+=100;
     }
    
     if(CHface1.isSelected()){
     price+=200;
     }
    
     if(CHface2.isSelected()){
     price+=100;
     }
    
     if(CHface3.isSelected()){
     price+=150;
     }
    
try{
         FileWriter output=new FileWriter("Customer.txt",true);
      PrintWriter Write=new PrintWriter(output);
      Write.print(price+" ");

      
      Write.close();}
       catch (Exception f){
           JOptionPane.showMessageDialog(null, "Error");
               }
    
}
        
        public void print(ActionEvent e)throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("bell2.fxml"));
        Stage window = (Stage)cancelB.getScene().getWindow();
        window.setScene(new Scene(root));
        
        }
    }
