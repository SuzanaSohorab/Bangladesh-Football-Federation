module com.example.bff_management {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.bff_management to javafx.fxml;
    exports com.example.bff_management;
    opens com.example.bff_management.suzana_java.suzana_controller to javafx.fxml;
}