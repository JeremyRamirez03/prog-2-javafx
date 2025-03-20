module co.edu.uniquindio.notificacion.notificacionapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.notificacion.notificacionapp to javafx.fxml;
    exports co.edu.uniquindio.notificacion.notificacionapp;
}