module Mainrun {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.pdfbox;
    requires org.apache.poi.poi;
    requires java.sql;
    requires org.apache.poi.ooxml;


    opens com.example.controlador.lexilogos to javafx.fxml;
    exports com.example.controlador.lexilogos;
    exports com.example.controlador.lexilogos.controller;
    opens com.example.controlador.lexilogos.controller to javafx.fxml;
    exports com.example.controlador.lexilogos.model;
    opens com.example.controlador.lexilogos.model to javafx.fxml;
}