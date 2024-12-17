package Project4a;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class PrachiDalal_Project4a extends Application {

	@Override
	public void start(Stage primaryStage) {
	
	//instantiate node objects
		//instantiate welcome label 
		Label lWelcome = new Label("Are You Ready To Play 4-Dice-Poker?!");		
		
		//locate the welcome label 
		lWelcome.setLayoutX(50);
		lWelcome.setLayoutY(80);
		
		//customize the welcome label 
		lWelcome.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lWelcome.setFont(new Font("Impact", 20));
		lWelcome.setLineSpacing(10);
		
		//instantiate name label 
		Label lName = new Label("Enter your name: ");
		
		//customize the welcome label
		lName.setStyle("-fx-background-color:rgba(243, 180, 204)");
		lName.setFont(new Font("Comic Sans MS", 13));
		
		//instantiate name text-box 
		TextField tfName = new TextField();
		
		//customize the name text-box 
		tfName.setMinWidth(107);
		tfName.setMaxWidth(50);
		tfName.setMaxHeight(10);
		tfName.setMinHeight(22);
		
		//instantiate the first roll button  
		Button button = new Button("Click to roll dice");
		
		//locate the first roll button 
		button.setLayoutX(141);
		button.setLayoutY(185);
		
		//customize the first roll button 
		button.setStyle("-fx-base:rgba(250, 109, 140)");
		Font font = Font.font("Comic Sans MS", FontWeight.BOLD, 13);
		button.setFont(font);
		
		//instantiate dice label 
		Label lDice = new Label("Dice: ");
		
		//locate dice label 
		lDice.setLayoutX(60);
		lDice.setLayoutY(245);
		
		//customize dice label 
		lDice.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lDice.setFont(new Font("Comic Sans MS", 15));
		
		//instantiate diceVar class with object dice
		diceVar dice = new diceVar();
		
		//invoke setDice method to set random dice values 
		dice.setDice();

		//instantiate hbox for name label and name text-box
		HBox hbox = new HBox(lName, tfName);
		
		//locate hbox
		hbox.setLayoutX(90);
		hbox.setLayoutY(135);
		
		//customize hbox
		hbox.setSpacing(15);
		
		//instantiate pane object 
		Pane pane = new Pane();
		
		//set pane object properties
		pane.setPadding(new Insets(20, 20, 20, 20));
		
		//puts objects on pane including hbox 
		pane.getChildren().addAll(lWelcome, hbox, button, lDice);
		
		
		//instantiate scene class to put pane on scene
		Scene scene = new Scene(pane, 400, 695);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//instantiate diceVars label 
		Label lDiceVars = new Label();
		
		//print out dice values using setText 
		lDiceVars.setText(dice.getDie1() + "        " + dice.getDie2() + "        " + dice.getDie3() + "        " + dice.getDie4());
		
		//puts object on pane  
		pane.getChildren().add(lDiceVars);
		
		//locate diceBars label 
		lDiceVars.setLayoutX(132);
		lDiceVars.setLayoutY(245);
		
		//customize diceVars Label 
		lDiceVars.setFont(new Font("Comic Sans MS", 15));
		
		//instantiate Hand label 
		Label lHand = new Label("Hand: ");
		
		//locate Hand label 
		lHand.setLayoutX(60);
		lHand.setLayoutY(300);
		
		//customize Hand label
		lHand.setStyle("-fx-background-color:rgba(243, 180, 204)");
		lHand.setFont(new Font("Comic Sans MS", 15));
		
		//puts object on pane 
		pane.getChildren().add(lHand);
	
		//instantiate Hand Outcome label 
		Label lHandLiteral = new Label("Pair");
		
		//locate Hand Outcome label 
		lHandLiteral.setLayoutX(130);
		lHandLiteral.setLayoutY(300);
		
		//customize Hand Outcome label
		lHandLiteral.setFont(new Font("Comic Sans MS", 15));
		
		//instantiate Draw label 
		Label lDraw = new Label("Draw: ");
		
		//locate Draw label
		lDraw.setLayoutX(60);
		lDraw.setLayoutY(355);
		
		//customize draw label 
		lDraw.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lDraw.setFont(new Font("Comic Sans MS", 15));
		
	//create radio buttons	
		//instantiate radio button to draw 
		RadioButton b1 = new RadioButton(" ");
	
		//customize radio button 
		b1.setStyle("-fx-base:rgba(210, 169, 249)");
		b1.setMinWidth(20);
		b1.setMaxWidth(20);
		b1.setMinHeight(20);
		b1.setMaxHeight(20);
		
		//instantiate radio button to draw 
		RadioButton b2 = new RadioButton(" ");
		
		//customize radio button 
		b2.setStyle("-fx-base:rgba(210, 169, 249)");
		b2.setMinWidth(20);
		b2.setMaxWidth(20);
		b2.setMinHeight(20);
		b2.setMaxHeight(20);
		
		//instantiate radio button to draw 
		RadioButton b3 = new RadioButton(" ");
		
		//customize radio button 
		b3.setStyle("-fx-base:rgba(210, 169, 249)");
		b3.setMinWidth(20);
		b3.setMaxWidth(20);
		b3.setMinHeight(20);
		b3.setMaxHeight(20);
		
		//instantiate radio button to draw 
		RadioButton b4 = new RadioButton(" ");
		
		//customize radio button 
		b4.setStyle("-fx-base:rgba(210, 169, 249)");
		b4.setMinWidth(20);
		b4.setMaxWidth(20);
		b4.setMinHeight(20);
		b4.setMaxHeight(20);
		
		//instantiate hbox for buttons
		HBox hbox2 = new HBox(b1, b2, b3, b4);
		
		//locate hbox
		hbox2.setLayoutX(135);
		hbox2.setLayoutY(355);
		
		//customize hbox
		hbox2.setSpacing(22);
		
		//instantiate button to roll dice the second time 
		Button button2 = new Button("Click to roll dice");
		
		//locate button 
		button2.setLayoutX(141);
		button2.setLayoutY(415);
		
		//customize button 
		button2.setStyle("-fx-base:rgba(250, 109, 140)");
		Font font2 = Font.font("Comic Sans MS", FontWeight.BOLD, 13);
		button2.setFont(font2);
	
		//instantiate second dice label 
		Label lDice2 = new Label("Dice: ");
		
		//locate second dice label 
		lDice2.setLayoutX(60);
		lDice2.setLayoutY(475);
		
		//customize second dice label 
		lDice2.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lDice2.setFont(new Font("Comic Sans MS", 15));
		
		//instantiate second diceVars label 
		Label lDiceVars2 = new Label();
		
		//print out dice values
		lDiceVars2.setText(dice.getDie1() + "        " + dice.getDie2() + "        " + dice.getDie3() + "        " + dice.getDie4());
		
		//locate second diceVars label 
		lDiceVars2.setLayoutX(132);
		lDiceVars2.setLayoutY(475);
		
		//customize second diceVars
		lDiceVars2.setFont(new Font("Comic Sans MS", 15));
		
		//add objects to the pane
		pane.getChildren().addAll(lHandLiteral, lDraw, button2, lDice2, lDiceVars2, hbox2);
		
		
		//instantiate final hand label 
		Label lHand2 = new Label("Final Hand: ");
		
		//locate final hand label 
		lHand2.setLayoutX(60);
		lHand2.setLayoutY(525);
		
		//customize final hand label 
		lHand2.setStyle("-fx-background-color:rgba(243, 180, 204)");
		lHand2.setFont(new Font("Comic Sans MS", 15));
	
		//instantiate second hand literal label 
		Label lHandLiteral2 = new Label("Pair");
		
		//locate second hand literal label 
		lHandLiteral2.setLayoutX(160);
		lHandLiteral2.setLayoutY(525);
		
		//customize second hand literal label 
		lHandLiteral2.setFont(new Font("Comic Sans MS", 15));
	
		//instantiate play again button 
		Button button3 = new Button("Play Again?");
		
		//locate play again button 
		button3.setLayoutX(153);
		button3.setLayoutY(575);
		
		//customize play again buttom 
		button3.setStyle("-fx-base:rgba(250, 109, 140)");
		Font font3 = Font.font("Comic Sans MS", FontWeight.BOLD, 13);
		button3.setFont(font3);
		
	//create images
		//instantiate ImageView class
		ImageView iv = new ImageView("https://upload.wikimedia.org/wikipedia/commons/2/2e/Dice-faces_32x32.jpg");
		
		//customize image 
		iv.setFitWidth(190);
		iv.setFitHeight(40);
		
		//locate image 
		iv.setLayoutX(10);
		iv.setLayoutY(20);
		
		//instantiate image view
		ImageView iv2 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/2/2e/Dice-faces_32x32.jpg");
		
		//customize image 
		iv2.setFitWidth(190);
		iv2.setFitHeight(40);
		
		//locate image 
		iv2.setLayoutX(200);
		iv2.setLayoutY(20);
		
		//instantiate image view
		ImageView iv3 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/2/2e/Dice-faces_32x32.jpg");
		
		//customize image 
		iv3.setFitWidth(190);
		iv3.setFitHeight(40);
		
		//locate image 
		iv3.setLayoutX(10);
		iv3.setLayoutY(630);
		
		//instantiate image view
		ImageView iv4 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/2/2e/Dice-faces_32x32.jpg");
		
		//customize image 
		iv4.setFitWidth(190);
		iv4.setFitHeight(40);
		
		//locate image 
		iv4.setLayoutX(200);
		iv4.setLayoutY(630);
		
		//add all objects to the pane so they can be seen 
		pane.getChildren().addAll(lHand2, lHandLiteral2, button3, iv, iv2, iv3, iv4);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
	//create class to make random dice values 
	class diceVar {
		
		//declare vars
		int die1;
		int die2;
		int die3;
		int die4;
		
		//Method to set random dice values 
		public void setDice() {
			
			//instantiate random class 
			Random random = new Random();
			
			//set each dice var = random number between 1-6
			die1 = random.nextInt(6) + 1;
			die2 = random.nextInt(6) + 1;
			die3 = random.nextInt(6) + 1;
			die4 = random.nextInt(6) + 1;
		}
		
		//return dice values (getter methods) 
		public int getDie1() {
			return die1;
		}
		
		public int getDie2() {
			return die2;
		}
		
		public int getDie3() {
			return die3;
		}
		
		public int getDie4() {
			return die4;
		}
	}

