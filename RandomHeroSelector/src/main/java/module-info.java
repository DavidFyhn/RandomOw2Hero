module dk.easv.randomheroselector {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.randomheroselector to javafx.fxml;
    exports dk.easv.randomheroselector;
}