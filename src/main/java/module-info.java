module com.mycompany.csc211.project1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.csc211.project1 to javafx.fxml;
    exports com.mycompany.csc211.project1;
}
