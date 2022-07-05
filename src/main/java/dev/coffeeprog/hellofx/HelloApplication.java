package dev.coffeeprog.hellofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click me");
        Button exit = new Button("Exit");
        exit.setOnAction(e -> {
            System.out.println("exiting");
            System.exit(0);
        } );

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("hello world");
            }
        });
        VBox root = new VBox();
        //root.getChildren().add(btn);
        root.getChildren().addAll(btn, exit);
        Scene scene = new Scene(root,500,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}