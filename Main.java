package mastermindd;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        mastermindd.GameController controller;
        controller = new mastermindd.GameController();
        ((mastermindd.GameController) controller).startTimer();
        primaryStage.setResizable(false);
        VBox layout = controller.createGameLayout();
        Scene scene = new Scene(layout, 800, 600);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/mastermindd/style.css")).toExternalForm());
        primaryStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/mastermindd/idea.png"))));
        primaryStage.setTitle("Mastermind Game - With Superminds✨♥ ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


    }




