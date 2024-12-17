package wk12_javafx;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFX_FlashCard extends Application {

	/*
	Create a JavaFX class, JavaFX_FlashCard, and an object class, Equation
	Implement a FlashCard application that gets the factor values for addition from Equation class
	Present the FlashCard app using Label, TextField, and GridPane
	*/

	
	@Override
	public void start(Stage primaryStage) {
		
		//Instatiate node objects
		Label lName = new Label("Name: ");
		
		TextField tfName = new TextField();
		
		//instantiate grid pane object and set object properties
		GridPane grid = new GridPane();
		
		//puts objects on grid
		grid.getChildren().addAll(lName, tfName);
		grid.setPadding(new Insets(20));
		grid.setHgap(10);
		grid.setVgap(20);
		
		//locate the children (nodes) on grid
		grid.setConstraints(lName, 0, 0);
		grid.setConstraints(tfName, 1, 0);
		
		//instantiate equation with object eq
		Equation eq = new Equation();
		eq.setXY();
		System.out.println(eq.getX() + " " + eq.getY());
		
		Label lProblem = new Label();
		lProblem.setText(eq.getX() + " + " + eq.getY() + " = ");
		grid.getChildren().add(lProblem);
		grid.setConstraints(lProblem, 0, 1);
		
		TextField tfResponse = new TextField();
		grid.getChildren().add(tfResponse);
		grid.setConstraints(tfResponse, 1, 1);
		tfResponse.setMaxWidth(50);
		
		Scene scene = new Scene(grid, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class Equation {
	//declare vars
	int x;
	int y; 	
	
	//Methods
	public void setXY() {
		Random random = new Random();
		x = random.nextInt(10);
		y = random.nextInt(10);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}


