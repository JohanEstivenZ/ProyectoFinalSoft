module org.example.proyectofinalsoft {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proyectofinalsoft to javafx.fxml;
    exports org.example.proyectofinalsoft;
    exports org.example.proyectofinalsoft.controllers;
    opens org.example.proyectofinalsoft.controllers to javafx.fxml;
    exports org.example.proyectofinalsoft.entities;
    opens org.example.proyectofinalsoft.entities to javafx.fxml;
}