package wk12_javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFX_Pane_HBox extends Application {

	/*
	Create a JavaFX graph, JavaFX_HBox, that has 3 circles
	Present circles in a horizontal row
	Use Pane (as your parent or root) and HBox objects
	Manage using the following:
	getChildren().add();  // add a 4th circle
	setSpacing() on HBox
	setPadding() on HBox
	setAlignment() on HBox
	setLayoutX, Y() on Pane
	*/

	@Override
	public void start(Stage primaryStage) {
		
		// Create nodes
		Circle c1 = new Circle(20);
		Circle c2 = new Circle(20);
		Circle c3 = new Circle(20);
		Circle c4 = new Circle(50);
		
		HBox hbox = new HBox(c1, c2, c3);
		hbox.getChildren().add(c4);
		
		hbox.setSpacing(10);
		hbox.setLayoutX(120);
		hbox.setLayoutY(140);
		hbox.setAlignment(Pos.CENTER);
		
		Rectangle rect = new Rectangle();
		hbox.getChildren().add(rect);
		rect.setWidth(20);
		rect.setHeight(30);
		
		Pane pane = new Pane(hbox);
		//pane.setPadding(new Insets(20, 50, 10, 50));
		
		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}