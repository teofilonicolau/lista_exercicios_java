module com.example.listadeexerciciosjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listadeexerciciosjava to javafx.fxml;
    exports com.example.listadeexerciciosjava;
}