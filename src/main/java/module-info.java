module com.example.setproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.setproject to javafx.fxml;
    exports com.example.setproject;
}