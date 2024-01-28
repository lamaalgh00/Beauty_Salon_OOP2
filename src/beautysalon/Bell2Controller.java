/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package beautysalon;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Perfl
 */
public class Bell2Controller implements Initializable {

    @FXML
    private TextArea txt1;
    @FXML
    private TextArea txt2;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ViewReceipt();
    }    
    public void ViewReceipt()
    {
        try
        {
           
            Scanner s = new Scanner(new File("information.txt"));
            while (s.hasNext())
            {
                String line = s.nextLine();
                txt1.appendText( line );
            }
        }
        catch (FileNotFoundException ex)
        {
            System.err.println(ex);
        }
    
    
        try
        {
           
            Scanner s = new Scanner(new File("Customer.txt"));
            while (s.hasNext())
            {
                String line = s.nextLine();
                txt2.appendText( line );
            }
        }
        catch (FileNotFoundException ex)
        {
            System.err.println(ex);
        }
    }
}
