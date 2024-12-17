package w13_javaFX_event_handling;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class JavaFX_Events_Roll_Dice extends Application {

	@Override
	public void start(Stage primaryStage) {
		Dice dice = new Dice();
		
		Button bRollDice = new Button("Click to Roll Dice");
		bRollDice.setLayoutX(140); bRollDice.setLayoutY(80);
		
		Label lDie1 = new Label("0");
		Label lDie2 = new Label("0");
		
		HBox hbox = new HBox(lDie1, lDie2);
		hbox.setSpacing(10);
		hbox.setLayoutX(140); hbox.setLayoutY(140);
		
		Button bPlayAgain = new Button("Play Again");
		bPlayAgain.setLayoutX(140); bPlayAgain.setLayoutY(200);
		
		Pane pane = new Pane(bRollDice, hbox, bPlayAgain);
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// End of GUI, start of Event Handlers 
		
		bRollDice.setOnAction( e -> {
			int die1 = dice.getDiceValue();
			int die2 = dice.getDiceValue();
			
			String sDie1 = Integer.toString(die1);
			String sDie2 = Integer.toString(die2);
			
			lDie1.setText(sDie1);
			lDie2.setText(sDie2);
			
			bPlayAgain.requestFocus();
		});
		
		bPlayAgain.setOnAction(e -> {
			//reset the screen 
			lDie1.setText(" ");
			lDie2.setText(" ");
			
			bRollDice.requestFocus();
		});
		
	}

	public static void main(String[] args) {
		launch(args);
		System.exit(0);
	}
}

class Dice { 
	Random random = new Random();
	
	public int getDiceValue() { 
		return random.nextInt(6) + 1;
	}
}