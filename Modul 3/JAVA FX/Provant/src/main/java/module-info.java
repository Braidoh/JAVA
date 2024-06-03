module fx.provant {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens fx.provant to javafx.fxml;
    exports fx.provant;
}