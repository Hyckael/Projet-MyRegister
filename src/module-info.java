module MyRegister {
	requires javafx.controls;
	requires org.hibernate.orm.core;
	
	opens application to javafx.graphics, javafx.fxml;
}
