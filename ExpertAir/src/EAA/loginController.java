package EAA;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public Button LogIn;

    private String userName;
    private String pass;

    public void handleLogIn() throws IOException {
        userName = username.getText();
        pass = password.getText();

        if(userName.equals("w") && pass.equals("z")) {
            System.out.println("User: " + userName + " logged in with password: " + pass);
            loadHome();
        } else {
            System.out.println("User: " + userName + " tried to login with password: " + pass);
        }
    }

    public void loadHome() throws IOException {
        Stage current = (Stage) LogIn.getScene().getWindow();
        current.close();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Nav.fxml"));

        stage.setTitle("Expert Air Advice - Home");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Loading info");
    }
}
