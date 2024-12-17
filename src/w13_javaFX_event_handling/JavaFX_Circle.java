package wk12_javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

	public class JavaFX_Circle extends Application {
		/*
		Copy FirstJavaFX class to JavaFX_Circle class
		Add a circle shape to the graph with radius 100
		Position the circle in the center of the scene using setCenterX and setCenterY methods
		Make the circle blue with a red outline using setFill and setStroke methods
		Add a label that says “A Circle”
		Add a title that says “My First JavaFX Scene”
		*/

		@Override
		public void start(Stage primaryStage) {
			
			Circle circle = new Circle(100);
			circle.setCenterX(300);
			circle.setCenterY(300);
			circle.setFill(Color.BLUE);
			circle.setStroke(Color.RED);
			circle.setStrokeWidth(10);
			
			Label lCircle = new Label("A Circle");
			lCircle.setLayoutX(270);
			lCircle.setLayoutY(170);
			
			Label lTitle = new Label("My first JavaFX Circle Graph");
			lTitle.setLayoutX(220);
			lTitle.setLayoutY(60);
			
			
			Group group = new Group(circle, lCircle, lTitle);
			Scene scene = new Scene(group, 600, 600);
			primaryStage.setTitle("My first JavaFX Circle Graph");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}

		public static void main(String[] args) {
			launch(args);
		}
	}


