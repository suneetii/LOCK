package Page7;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class Page7ViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void student(ActionEvent event) {
        javafx.scene.Parent root= null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Page2/Page2View.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //OR
        //Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("marks/card/MarksCard.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        javafx.stage.Stage stage=new javafx.stage.Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void teacher(ActionEvent event) {
        javafx.scene.Parent root= null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Page1/Page1View.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //OR
        //Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("marks/card/MarksCard.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        javafx.stage.Stage stage=new javafx.stage.Stage();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void close(ActionEvent event) {
    System.exit(1);
    }
    @FXML
    void initialize() {

    }

}

//CONNECTORS--**
/*javafx.scene.Parent root=FXMLLoader.load(getClass().getResource("/Home/HomeView.fxml")); 
	//OR
	//Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("marks/card/MarksCard.fxml")); 
	javafx.scene.Scene scene = new javafx.scene.Scene(root);
	javafx.stage.Stage stage=new javafx.stage.Stage();
	stage.setScene(scene);
	stage.show();
}*/