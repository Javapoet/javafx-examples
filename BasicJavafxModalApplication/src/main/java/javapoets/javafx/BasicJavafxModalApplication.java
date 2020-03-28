package javapoets.javafx;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

/*
 * Stage Modality:
 * You can set the modality of a JavaFX Stage (window). The modality determines if the window will block other windows opened by the same application.
 * You set the window modality of a JavaFX Stage via its initModality() method.
 */
public class BasicJavafxModalApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Javapoets™ Basic JavaFX Application with a Modal Window");

        Stage stage = new Stage();

        // Set the Stage modality.
        stage.initModality(Modality.APPLICATION_MODAL);  // will block all other windows (stages) opened by this JavaFX application
        //stage.initModality(Modality.WINDOW_MODAL);  // will block the window (Stage) that "owns" this newly created Stage, and only that
        //stage.initModality(Modality.NONE);  // will not block any other windows opened in this application

        stage.initStyle(StageStyle.DECORATED);  // a standard window with OS decorations (title bar and minimize / maximize / close buttons), and a white background
        //stage.initStyle(StageStyle.UNDECORATED);  // a standard window without OS decorations, and a white background
        //stage.initStyle(StageStyle.TRANSPARENT);  // an undecorated window with transparent background
        //stage.initStyle(StageStyle.UNIFIED);  // like a decorated stage, except it has no border between the decoration area and the main content area
        //stage.initStyle(StageStyle.UTILITY);  // a decorated window, but with minimal decorations

        stage.initOwner(primaryStage); // A JavaFX Stage can be owned by another Stage.

        primaryStage.show();

        stage.showAndWait();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}