package wk12_javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFX_Circle2_Line extends Application {
	/*
	Copy JavaFX_Circle to JavaFX_Circle_Line
	Add a second node – a line
	Place the line in a Pane
	Put the Pane in a second scene
	Put the second scene on a second stage
	*/


	@Override
	public void start(Stage primaryStage) {
		// This is our first scene
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
		scene.setFill(Color.ORANGE);
		primaryStage.setTitle("My first JavaFX Circle Graph");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// This is our second scene
		Line line = new Line();
		line.setStartX(100);
		line.setEndX(300);
		line.setStartY(150);
		line.setEndY(150);
		line.setStrokeWidth(5);
		
		Label lLine = new Label("A Line");
		lLine.setFont(new Font("Calibria", 45));
		lLine.setLayoutX(180);
		lLine.setLayoutY(180);
		
		Pane pane = new Pane(line, lLine);
		
		Scene scene2 = new Scene(pane, 400, 300);
		Stage stage2 = new Stage();
		stage2.setX(1300);
		stage2.setY(200);
		stage2.setScene(scene2);
		stage2.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}