package com.example.bff_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class loginViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> enterRoleCombobox;
    @javafx.fxml.FXML
    private TextField enterPasswordTF;
    @javafx.fxml.FXML
    private TextField enterEmailTF;

    @javafx.fxml.FXML
    public void initialize() {
        enterRoleCombobox.getItems().addAll("President","Treasurer");
    }

    @FXML
    public void loginBTN(ActionEvent actionEvent) throws IOException {

        String selectedRole = enterRoleCombobox.getValue();

        if (selectedRole.equals("President")){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.
                    getResource("/com/example/bff_management/suzana_fxml/president/president_dashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage= (Stage)((Node)(actionEvent.getSource())).getScene().getWindow();
            stage.setTitle("President!");
            stage.setScene(scene);
            stage.show();

        } else if (selectedRole.equals("Treasurer")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.
                    getResource("/com/example/bff_management/suzana_fxml/treasurer/treasurer_dashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage= (Stage)((Node)(actionEvent.getSource())).getScene().getWindow();
            stage.setTitle("Treasurer");
            stage.setScene(scene);
            stage.show();

        }


    }
}