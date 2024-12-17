package w13_javaFX_event_handling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OKButton_EH_Lambda extends Application {
	
	/*
	Copy OKButton_EH to OKButton_EH_Lambda
	Convert OKButton_EH to lambda expression
	Comment out the event handler classes
	Comment out the event handler instantiation and registration statements
	Add requestFocus statements
	*/

	/*
	** Put print on click on the graph
	Create 2 new Label objects – okLabel, xlLabel
	Move the 2 buttons to Pane, set location coordinates, delete hbox
	Show title, buttons on graph
	Show labels on graph when clicked
	*/

	
	@Override
	public void start(Stage primaryStage) {
		
		//create okay button (step one) create action / event node
		Button okButton = new Button("OK");
		
		//(step 3) instantiate object for EH method
		//OKButtonEventHandler okBEH = new OKButtonEventHandler();
		
		//(step 4) link okay button node with EH method / object / event with action
		//okButton.setOnAction(okBEH);
		
		Button xlButton = new Button("XL");
		//XLButtonEventHandler2 xlBEH = new XLButtonEventHandler2();
		//xlButton.setOnAction(xlBEH);
		
		Label lOK = new Label(" ");
		lOK.setLayoutX(80); lOK.setLayoutY(38);
		
		Label lXL = new Label(" ");
		lXL.setLayoutX(80); lXL.setLayoutY(83);
		
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(okButton, xlButton);
		vbox.setPadding(new Insets(30, 30, 30, 30));
		vbox.setSpacing(20);
		
		Pane pane = new Pane();
		pane.getChildren().addAll(vbox, lOK, lXL);
		
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//End GUI, start EventHandling ***********************************************************************************
		
		okButton.setOnAction(e -> {
			//resets screen before action 
			lXL.setText(" ");
			//System.out.println("OK was clicked - Lambda");
			lOK.setText("OK was clicked");
			lXL.requestFocus();
		});
		
		xlButton.setOnAction(e -> {
			//resets screen before action
			lOK.setText(" ");
			//System.out.println("XL was clicked - Lambda");
			lXL.setText("XL was clicked");
			lOK.requestFocus();
		});
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
/*
//(step 2) create event handler class
class OKButtonEventHandler implements EventHandler <ActionEvent> {
	public void handle(ActionEvent e) {
		System.out.println("OK button was clicked");
	}
}

class XLButtonEventHandler2 implements EventHandler <ActionEvent> {
	public void handle(ActionEvent e) {
		System.out.println("XL button was clicked");
	}
}
*/










