module com.cis2235.cabrerap7rev3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.cis2235.cabrerap7rev3 to javafx.fxml;
    exports com.cis2235.cabrerap7rev3;
}