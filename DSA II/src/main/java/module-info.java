module com.caessuman3020.inventorysystemmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires fontawesomefx;


    opens com. caessuman3020.inventorysystemmanagement to javafx.fxml;
    exports com.caessuman3020.inventorysystemmanagement;
}