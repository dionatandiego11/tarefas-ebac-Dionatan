module br.com.deresende.mod35 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.persistence;


    opens br.com.deresende.mod35 to javafx.fxml;
    opens br.com.deresende.domain.jpa to hibernate.core;
    exports br.com.deresende.mod35;

}