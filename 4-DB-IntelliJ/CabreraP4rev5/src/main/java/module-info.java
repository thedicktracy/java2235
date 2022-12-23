module com.cabrerap4rev5.cabrerap4rev5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.cabrerap4rev5.cabrerap4rev5 to javafx.fxml;
    exports com.cabrerap4rev5.cabrerap4rev5;
}