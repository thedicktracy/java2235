module com.cabrerap5rev2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires java.desktop;

    opens com.cabrerap5rev2 to javafx.fxml;
    exports com.cabrerap5rev2;
}