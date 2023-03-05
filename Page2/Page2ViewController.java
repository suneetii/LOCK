package Page2;

import Dependies_Zeline.MySQL_Connector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Page2ViewController {

    @FXML
    private TextField password;

    @FXML
    private TextField studentid;

    @FXML
    void close(ActionEvent event) {
        System.exit(1);

    }

    @FXML
    void submit(ActionEvent event) {
        java.sql.Connection con;
        con= MySQL_Connector.getConnection();
        java.sql.PreparedStatement pst;
        try{
            pst=con.prepareStatement("select * from user where username=?");
            pst.setString(1,studentid.getText());
            ResultSet res=pst.executeQuery();
            boolean count= false;
            String fxml_pass=password.getText();
            while(res.next()){
                count=true;
                String ori_pass=res.getString("password");
                if(fxml_pass.equals(ori_pass)){
                    //Toh page ko load krdo

                    show_msg("Welcome:Login Successful");
                    javafx.scene.Parent root= FXMLLoader.load(getClass().getResource("/Page5/Page5View.fxml"));
                    //OR
                    //Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("marks/card/MarksCard.fxml"));
                    javafx.scene.Scene scene = new javafx.scene.Scene(root);
                    javafx.stage.Stage stage=new javafx.stage.Stage();
                    stage.setScene(scene);
                    stage.show();
                }
                else{
                    //toh error
                    show_msg("Welcome:Login Unsuccessful");
                }
            }

        }
        catch (SQLException | IOException e) {
            e.printStackTrace();


        }
    }
    void show_msg(String msg){
        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("LOCKDOWN BROWSER");
        alert.setHeaderText("Our project says that");
        alert.setContentText(msg);
        alert.showAndWait();

    }

}
