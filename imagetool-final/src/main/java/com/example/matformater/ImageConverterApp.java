package com.example.matformater;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ImageConverterApp extends Application {
    @FXML
    private Pane contextArea;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ImageConverterApp.class.getResource("views/compress-photos.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Format Images With Ease");
        stage.setScene(scene);
        stage.show();
        String[] inputFormats = javaxt.io.Image.InputFormats;
        String[] outputFormats = javaxt.io.Image.OutputFormats;

        System.out.println(outputFormats);
    }
    public static void main(String[] args) {
        launch();
    }
}
