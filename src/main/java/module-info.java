module guzmjo.JanKenPon {
    requires javafx.controls;
    requires javafx.fxml;

    opens guzmjo.JanKenPon to javafx.fxml;
    exports guzmjo.JanKenPon;
}
