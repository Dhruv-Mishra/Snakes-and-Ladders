module com.example.approj {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;


    opens com.example.approj to javafx.fxml;
    exports com.example.approj;
}