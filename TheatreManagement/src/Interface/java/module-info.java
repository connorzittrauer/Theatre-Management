module com.example.theatremanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.theatremanagement to javafx.fxml;
    exports com.example.theatremanagement;
    exports com.example.theatremanagement.controllers;
    opens com.example.theatremanagement.controllers to javafx.fxml;
}