module com.example.gamo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gamo to javafx.fxml;
    exports com.example.gamo;
}