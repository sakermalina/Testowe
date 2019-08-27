package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        Scene scene = new Scene(root);

        



        primaryStage.setTitle("Projekt czat");
        primaryStage.setScene(scene);
        primaryStage.setHeight(600.0);
        primaryStage.setWidth(900.0);
        primaryStage.getIcons().add(new Image("sample/comments.png"));
        primaryStage.setOnCloseRequest((e)->{Controller.zamknijProgram();});


        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
