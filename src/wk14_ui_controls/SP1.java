package wk14_ui_controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SP1 extends Application {
	
	// GUI only, no events
	
	String name;
	String year;
	String status;
	String output;
	
	boolean fr_On = false;

	@Override
	public void start(Stage primaryStage) {
		
		TextField tfName = new TextField("Name");
		
		TextField tfYear = new TextField("Year");
		
		RadioButton fr = new RadioButton("Freshman");
		RadioButton so = new RadioButton("Sophomore");
		RadioButton jr = new RadioButton("Junior");
		RadioButton sr = new RadioButton("Senior");
		RadioButton gr = new RadioButton("Graduate");
		
		VBox vbox = new VBox(fr, so, jr, sr, gr);
		vbox.setSpacing(10);
		
		Button submit = new Button("Submit");
		
		Text tOut = new Text();
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(tfName, tfYear, vbox, submit, tOut);
		grid.setPadding(new Insets(20, 20, 20, 20));
		grid.setHgap(20);
		grid.setVgap(20);
		
		grid.setConstraints(tfName, 1, 1);
		grid.setConstraints(tfYear, 1, 2);
		grid.setConstraints(vbox, 1, 3);
		grid.setConstraints(submit, 1, 4);
		grid.setConstraints(tOut, 1, 5);
		
		Scene scene = new Scene(grid);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	//Event Handling Below ***************************************
		
		tfName.setOnAction( e -> {
			name = tfName.getText();
			System.out.println(name);
			tfYear.requestFocus();
		});
		
		tfName.setOnKeyPressed(e -> {
			
		});
		
		
		fr.setOnAction(e -> {
			
			if (fr_On == false) {
				fr_On = true;
				System.out.println("freshman is on");
			}
			else {
				fr_On = false;
				System.out.println("freshman is off");
			}
			/*
			status = "freshman";
			System.out.println(status); */
			submit.requestFocus();
		}); 
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}