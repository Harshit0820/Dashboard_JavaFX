module com.example.dashboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dashboard to javafx.fxml;
    exports com.example.dashboard;
}