package com.example.approj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
import javafx.scene.paint.Color;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        StackPane root = new StackPane();
        Scene scene = new Scene(fxmlLoader.load(), 350, 630);
        stage.initStyle(StageStyle.UNDECORATED);
        Controller x=fxmlLoader.getController();
        x.arrow_animation();
        x.stage_assign(stage);
        stage.setTitle("Snake Game");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}