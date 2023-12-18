module javafx_image_converter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.base;
    requires java.desktop;
    requires javaxt.core;

    opens com.example.matformater.controller to javafx.fxml;
    opens com.example.matformater to javafx.fxml, javafx.graphics;
}