/* doesn't work with source level 1.8:
module com.mycompany.calculator1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.calculator1 to javafx.fxml;
    exports com.mycompany.calculator1;
}
*/
