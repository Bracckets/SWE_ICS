module com.example.ics_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ics_project to javafx.fxml;
    exports com.example.ics_project;
}