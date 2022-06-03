package com.example.java_project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //ID's
    //Buttons
    @FXML
    private Button btUncom;

    @FXML
    private Button btCom;

    @FXML
    private Button btSettings;

    //Checkboxen
    @FXML
    private CheckBox cbEM;

    @FXML
    private CheckBox cbEdu;

    @FXML
    private CheckBox cbTeams;

    //handleButtonClicks
    @FXML
    void handleButtonClicks(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}




