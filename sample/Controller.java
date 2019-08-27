package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    Button Button;
    @FXML
    Label Label;
    @FXML
    StackPane StackPane;

    public void ButtonClicked(){
        Label.setText("Dołączanie do czatu...");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Label.setText("Lobby");


    }
    public static void zamknijProgram(){
        Platform.exit();
        System.exit(0);
    }


}

