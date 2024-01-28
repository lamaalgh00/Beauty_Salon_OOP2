
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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Perfl
 */
public class BeautySalonController implements Initializable {

    @FXML
    private Button getStarted;
       @FXML
    private MenuBar Fl;
        @FXML
    private MenuItem Close;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
       
    }    

    @FXML
    private void getStarted(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("choose.fxml"));
        Stage window = (Stage)getStarted.getScene().getWindow();
        window.setScene(new Scene(root));
    }
  
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

