package wk12_javafx;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFX_FlashCard_Pane extends Application {

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
		Pane pane = new Pane();
		
		//puts objects on grid
		pane.getChildren().addAll(lName, tfName);
		//grid.setPadding(new Insets(20));
		//grid.setHgap(10);
		//grid.setVgap(20);
		
		//locate the children (nodes) on grid
		//grid.setConstraints(lName, 0, 0);
		//grid.setConstraints(tfName, 1, 0);
		
		lName.setLayoutX(50); lName.setLayoutY(50);
		tfName.setLayoutX(150); tfName.setLayoutY(50);
		
		//instantiate equation with object eq
		Equation2 eq = new Equation2();
		eq.setXY();
		System.out.println(eq.getX() + " " + eq.getY());
		
		Label lProblem = new Label();
		lProblem.setText(eq.getX() + " + " + eq.getY() + " = ");
		pane.getChildren().add(lProblem);
		lProblem.setLayoutX(50); lProblem.setLayoutY(120);

		//grid.getChildren().add(lProblem);
		//grid.setConstraints(lProblem, 0, 1);
		
		TextField tfResponse = new TextField();
		pane.getChildren().add(tfResponse);
		tfResponse.setLayoutX(120); tfResponse.setLayoutY(120);
		//grid.getChildren().add(tfResponse);
		//grid.setConstraints(tfResponse, 1, 1);
		tfResponse.setMinWidth(150);
		tfResponse.setMaxWidth(50);
		
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class Equation2 {
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


