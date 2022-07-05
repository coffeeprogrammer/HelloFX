module dev.coffeeprog.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.coffeeprog.hellofx to javafx.fxml;
    exports dev.coffeeprog.hellofx;
}