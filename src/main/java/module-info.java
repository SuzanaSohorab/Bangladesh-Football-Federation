module com.example.bff_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bff_management to javafx.fxml;
    exports com.example.bff_management;
}