package EAA;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class manageUserCtrl implements Initializable {

    @FXML TableView tableView = new TableView();
    @FXML TableColumn<String, User> name;
    @FXML TableColumn<String, User> login;
    @FXML TableColumn<String, User> phone;
    @FXML TableColumn<String, User> carrier;

    private void loadTable() {
        name.setCellValueFactory(new PropertyValueFactory<>("userName"));
        login.setCellValueFactory(new PropertyValueFactory<>("name"));
        phone.setCellValueFactory(new PropertyValueFactory<>("phoneNum"));
        carrier.setCellValueFactory(new PropertyValueFactory<>("carrier"));
    }

    BufferedReader br;

    private void readFile() {
        String FieldDelimiter = ",";
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line = br.readLine()) != null) {
                String[] fields = line.split(FieldDelimiter, -1);

                User user = new User(fields[0], fields[1], fields[2], fields[3]);
                tableView.getItems().add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableView.getItems().removeAll();
        readFile();
        loadTable();
    }
}
