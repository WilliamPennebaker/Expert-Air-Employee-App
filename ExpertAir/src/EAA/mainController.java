package EAA;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class mainController implements Initializable {

    @FXML Button LogOut;
    @FXML Button home;
    @FXML MenuItem addUser;
    @FXML StackPane stackPane;

    public void home() {
        if(!stackPane.getChildren().isEmpty()) {
            stackPane.getChildren().remove(0);
        }
    }

    public void addUser() throws IOException {
        /*Parent root = FXMLLoader.load(Main.class.getResource("addUser.fxml"));
        if(!stackPane.getChildren().isEmpty()) {
            stackPane.getChildren().remove(0);
            stackPane.getChildren().add(0, root);
        } else {
            stackPane.getChildren().add(0, root);
        }*/
        System.out.println("Loading");
        Parent root = FXMLLoader.load(Main.class.getResource("addUser.fxml"));

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Add user");
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    public void manageUser() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("manageUser.fxml"));
        if(!stackPane.getChildren().isEmpty()) {
            stackPane.getChildren().remove(0);
            stackPane.getChildren().add(0, root);
        } else {
            stackPane.getChildren().add(0, root);
        }
    }

    public void handleLogOut() throws IOException {
        Stage current = (Stage) LogOut.getScene().getWindow();
        current.close();

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/EAA/login.fxml"));
        stage.setTitle("Expert Air Advice - Login");
        stage.setScene(new Scene(root));
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
