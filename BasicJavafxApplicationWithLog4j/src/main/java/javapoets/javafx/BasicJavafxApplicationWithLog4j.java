package javapoets.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BasicJavafxApplicationWithLog4j extends Application {

    private static final Logger logger = LogManager.getLogger();  // Log4j logger @see src\main\resources\log4j2.xml 

    @Override
    public void start(Stage primaryStage) throws Exception {
        logger.debug("start(" + primaryStage + ")");
        logger.info("Javapoets Basic JavaFX Application with Log4j");
        primaryStage.setTitle("Javapoets™ Basic JavaFX Application with Log4j");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        logger.debug("main(" + args + ")");

        launch(args);
    }

}