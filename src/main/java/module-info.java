module com.mycompany.gamehub_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.gamehub_project to javafx.fxml;
    exports com.mycompany.gamehub_project;
}
