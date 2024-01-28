
package beautysalon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;


public class BeautySalon extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Beauty Salon.fxml"));
        
        Scene scene = new Scene(root);
        Menu file = new Menu("File");
        MenuItem item = new MenuItem("Exit");
         file.getItems().addAll(item);
         
        stage.setTitle("Beauty Salon");
        stage.setScene(scene);
        stage.show();
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        launch(args);
        
        
    }
    
}
