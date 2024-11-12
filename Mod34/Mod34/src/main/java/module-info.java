module br.com.deresende.mod34 {
    //requires javafx.controls;
    //requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.persistence;

    opens br.com.deresende.mod34 to javafx.fxml;
    //exports br.com.deresende.mod34;
}