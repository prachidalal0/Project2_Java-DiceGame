package wk12_javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class JavaFX_Button_RB extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		RadioButton rb1 = new RadioButton("100");
		RadioButton rb2 = new RadioButton("200");
		RadioButton rb3 = new RadioButton("300");
		RadioButton rb4 = new RadioButton("400");
		
		rb1.setStyle("-fx-base: cyan");
		rb2.setStyle("-fx-base: yellow");
		rb3.setStyle("-fx-base: pink");
		
		//text is always in string 
		rb3.setText("301");
		
		Button button = new Button("Click me");
		button.setLayoutX(20); button.setLayoutY(150);
		button.setStyle("-fx-base: blue");
		Font font = Font.font("Times New Roman", FontWeight.BOLD, 20);
		button.setFont(font);
		
		VBox vbox = new VBox(rb1, rb2, rb3, rb4);
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(20,20,20,20));
		
		Pane pane = new Pane(vbox, button);
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
