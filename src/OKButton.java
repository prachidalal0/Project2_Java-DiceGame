package w13_javaFX_event_handling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OKButton extends Application {
	
	/*
	Copy OKButton.java from eLearning and paste into wk13 pkg
	Test OKButton to show that it creates a GUI with an OK button
	Implement event handling class, OKButtonEventHandling, so when OKButton is pressed, “OK was clicked” is printed on console
	Put the Button in VBox, VBox in Scene, etc.

	Implement a second Button node, XLButton, with text “XL”
	Add to VBox
	Create event handling so when XLButton is pressed, it prints to console “XL was clicked”
	*/

	@Override
	public void start(Stage primaryStage) {
		
		//create okay button (step one) create action / event node
		Button okButton = new Button("OK");
		
		//(step 3) instantiate object for EH method
		OKButtonEventHandler okBEH = new OKButtonEventHandler();
		
		//(step 4) link okay button node with EH method / object / event with action
		okButton.setOnAction(okBEH);
		
		Button xlButton = new Button("XL");
		XLButtonEventHandler xlBEH = new XLButtonEventHandler();
		xlButton.setOnAction(xlBEH);
		
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(okButton, xlButton);
		vbox.setPadding(new Insets(30, 30, 30, 30));
		vbox.setSpacing(20);
		
		Scene scene = new Scene(vbox, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

//(step 2) create event handler class
class OKButtonEventHandler implements EventHandler <ActionEvent> {
	public void handle(ActionEvent e) {
		System.out.println("OK button was clicked");
	}
}

class XLButtonEventHandler implements EventHandler <ActionEvent> {
	public void handle(ActionEvent e) {
		System.out.println("XL button was clicked");
	}
}











