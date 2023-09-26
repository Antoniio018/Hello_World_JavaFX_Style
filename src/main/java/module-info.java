module es.ieslosmontecillos.hello_world {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.hello_world to javafx.fxml;
    exports es.ieslosmontecillos.hello_world;
}