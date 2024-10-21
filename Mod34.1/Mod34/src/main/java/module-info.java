module br.com.deresende.mod34 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;

    opens br.com.deresende.mod34 to javafx.fxml;
    exports br.com.deresende.mod34;
}