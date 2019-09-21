package EAA;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class addUserCtrl implements Initializable {

    @FXML TextField nameBox;
    @FXML TextField phoneNum;
    @FXML TextField usernameBox;
    @FXML ChoiceBox<String> carrier;
    @FXML PasswordField passwordField;
    @FXML Button saveButton;
    @FXML Button cancel;


    private String name, pNumber, userName, carrier1, password;


    ObservableList list = FXCollections.observableArrayList();

    private void loadData() {
        list.removeAll(list);
        list.addAll("ATT", "Verizon", "T-Mobile");
        carrier.getItems().addAll(list);
    }

    public void onSave() {
        name = nameBox.getText();
        pNumber = phoneNum.getText();
        userName = usernameBox.getText();
        carrier1 = carrier.getValue();
        password = passwordField.getText();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
            bw.write("\n" +name+","+userName+","+pNumber+","+carrier1);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Name: " + name + ", Phone number: " + pNumber + ", Carrier: " + carrier1 +
                ", UserName: " + userName + ", Password: " + password);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();
    }
}
