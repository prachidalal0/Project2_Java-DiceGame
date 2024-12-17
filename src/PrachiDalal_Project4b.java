package Project4b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.awt.*;
import java.awt.event.*;

public class PrachiDalal_Project4b extends Application {

	//turn draw buttons on and off 
	//Declare vars
	String name;
	boolean rb1 = false;
	boolean rb2 = false; 
	boolean rb3 = false;
	boolean rb4 = false; 
	
	@Override
	public void start(Stage primaryStage) {
		
		//Create Hands Object to store game values
		Hands hand = new Hands();
		
		//instantiate node objects
		//instantiate welcome label 
		Label lWelcome = new Label("Play The 4-Dice-Draw-Poker Game!");		
		
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
		lDice.setVisible(false);
		
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
		Scene scene = new Scene(pane, 400, 710);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//instantiate diceVars label 
		Label lDiceVars = new Label();
		
		//add lDiceVars to pane
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
		
		//set visibility to false
		lHand.setVisible(false);
			
		//instantiate Hand Outcome label
		Label lHandLiteral = new Label("Hand Literal");
		
		//locate Hand Outcome label 
		lHandLiteral.setLayoutX(160);
		lHandLiteral.setLayoutY(300);
		
		//customize Hand Outcome label
		lHandLiteral.setFont(new Font("Comic Sans MS", 15));
		
		//set visibility of hand literal label to false
		lHandLiteral.setVisible(false);
		
		//instantiate Draw label 
		Label lDraw = new Label("Draw: ");
		
		//locate Draw label
		lDraw.setLayoutX(60);
		lDraw.setLayoutY(355);
		
		//customize draw label 
		lDraw.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lDraw.setFont(new Font("Comic Sans MS", 15));
		lDraw.setVisible(false);
		
		//create radio buttons	
		//instantiate radio button to draw 
		RadioButton b1 = new RadioButton(" ");
		
		//customize radio button 
		b1.setStyle("-fx-base:rgba(210, 169, 249)");
		b1.setMinWidth(20);
		b1.setMaxWidth(20);
		b1.setMinHeight(20);
		b1.setMaxHeight(20);
		b1.setVisible(false);
		
		//instantiate radio button to draw 
		RadioButton b2 = new RadioButton(" ");
		
		//customize radio button 
		b2.setStyle("-fx-base:rgba(210, 169, 249)");
		b2.setMinWidth(20);
		b2.setMaxWidth(20);
		b2.setMinHeight(20);
		b2.setMaxHeight(20);
		b2.setVisible(false);
		
		//instantiate radio button to draw 
		RadioButton b3 = new RadioButton(" ");
		
		//customize radio button 
		b3.setStyle("-fx-base:rgba(210, 169, 249)");
		b3.setMinWidth(20);
		b3.setMaxWidth(20);
		b3.setMinHeight(20);
		b3.setMaxHeight(20);
		b3.setVisible(false);
		
		//instantiate radio button to draw 
		RadioButton b4 = new RadioButton(" ");
		
		//customize radio button 
		b4.setStyle("-fx-base:rgba(210, 169, 249)");
		b4.setMinWidth(20);
		b4.setMaxWidth(20);
		b4.setMinHeight(20);
		b4.setMaxHeight(20);
		b4.setVisible(false);
		
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
		button2.setVisible(false);
	
		//instantiate second dice label 
		Label lDice2 = new Label("Dice: ");
		
		//locate second dice label 
		lDice2.setLayoutX(60);
		lDice2.setLayoutY(475);
		
		//customize second dice label 
		lDice2.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lDice2.setFont(new Font("Comic Sans MS", 15));
		
		//set dice value visibility to false
		lDice2.setVisible(false);

		//instantiate second diceVars label 
		Label lDiceVars2 = new Label();
		
		//locate second diceVars label
		lDiceVars2.setLayoutX(132);
		lDiceVars2.setLayoutY(475);
		
		//customize second diceVars
		lDiceVars2.setFont(new Font("Comic Sans MS", 15));
		
		//add objects to the pane
		pane.getChildren().addAll(lHandLiteral, lDraw, button2, lDice2, lDiceVars2, hbox2);
		
		//set dice value visibility to false
		lDiceVars2.setVisible(false);
		
		//instantiate final hand label 
		Label lHand2 = new Label("Hand: ");
		
		//locate final hand label 
		lHand2.setLayoutX(60);
		lHand2.setLayoutY(525);
		
		//customize final hand label 
		lHand2.setStyle("-fx-background-color:rgba(243, 180, 204)");
		lHand2.setFont(new Font("Comic Sans MS", 15));
		
		//set hand label visibility to false
		lHand2.setVisible(false);
	
		//instantiate second hand literal label 
		Label lHandLiteral2 = new Label("Hand Literal");
		
		//customize second hand literal label 
		lHandLiteral2.setLayoutX(160);
		lHandLiteral2.setLayoutY(525);
		lHandLiteral2.setFont(new Font("Comic Sans MS", 15));
		lHandLiteral2.setVisible(false);
	
		//instantiate play again button 
		Button button3 = new Button("Play Again?");
		
		//locate play again button 
		button3.setLayoutX(153);
		button3.setLayoutY(575);
		
		//customize play again buttom 
		button3.setStyle("-fx-base:rgba(250, 109, 140)");
		Font font3 = Font.font("Comic Sans MS", FontWeight.BOLD, 13);
		button3.setFont(font3);
		
		//set button visibility to false
		button3.setVisible(false);
		
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
		
		//push focus to button if name is entered 
		//use lambda replacement 
		tfName.setOnAction(e -> {
			name = tfName.getText();
			button.requestFocus();
		});
		
		//event handler to ensure name is entered
		button.setOnAction( e -> {
			if(tfName.getText().equals(""))
				JOptionPane.showMessageDialog(null, "Enter a name to start the game");
			
			//event handler to continue game
			else 
			{
				System.out.println("     \n" + "Name: " + tfName.getText());
				//set initial dice values to visible
				lDiceVars.setVisible(true);
				
				//invoke deDupe method to reset hands
				hand.deDupe();
				
				//invoke setDiceRolls method
				hand.setDiceRolls(hand.setDice());
				
				//store dice values into an array
				int[] diceResults = hand.getDiceRolls();
				String[] diceResultsString = new String[4];
				
				//create loop to set dice values into diceResults
				for(int i = 0; i<diceResults.length; i++)
				{
					diceResultsString[i] = diceResults[i]+"";
				}
	
				//print out dice values onto GUI
				lDiceVars.setText(diceResultsString[0] + "\t" + diceResultsString[1] + "\t" + 
				diceResultsString[2] + "\t" + diceResultsString[3]);
				
				System.out.println("dice: " + diceResultsString[0] + " " + diceResultsString[1] + " " +
						diceResultsString[2] + " " + diceResultsString[3]);
				
				//create copy of dice rolls to store unsorted values
				hand.setDiceRollsOrig(Arrays.copyOf(hand.getDiceRolls(), hand.getDiceRolls().length));
			  
				//if else statement to print correct hand value
			    if(hand.isStraight())
			    {
			    	lHandLiteral.setText("Straight");
			    }
			    else if(hand.is2Pair())
			    {
			    	lHandLiteral.setText("Two Pair");
			    }
			    else if(hand.is4Kind())
			    {
			    	lHandLiteral.setText("Four of a Kind");
			    }
			    else if(hand.is3Kind())
			    {
			    	lHandLiteral.setText("Three of a Kind");
			    }
			    else if(hand.is2kind())
			    {
			    	lHandLiteral.setText("Two of a Kind");
			    }
			    else
			    {
			    	lHandLiteral.setText("No Hands :(");
			    }
			   
			    System.out.println("hand value: " + lHandLiteral.getText());
			    //invoke deDupe method to reset dice hands
			    hand.deDupe();
			   
			    //set hand values to false
			    hand.setTwoPair(false);
			    hand.setTwoKind(false);
			    hand.setThreeKind(false);
			    hand.setFourKind(false);
			    hand.setStraight(false);
			}
			
			//make the rest of the nodes of the game visible
			button.setDisable(true);
			lDice.setVisible(true);
			lDiceVars2.setVisible(true);
			lDraw.setVisible(true);
			lHand.setVisible(true);
			lHandLiteral.setVisible(true);
			b1.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(true);
			b4.setVisible(true);
			button2.setVisible(true);
			tfName.setEditable(false);
			
		});
		
		//event handler for button2 for re rolled dice values
		button2.setOnAction( e -> {		
			
				//set rest of node visibility to true
				button3.setVisible(true);
				lDice2.setVisible(true);
				lHand2.setVisible(true);
				lHandLiteral2.setVisible(true);
				button3.setVisible(true);
			
				//disable button2 and radio buttons so they can no longer be pressed
				button2.setDisable(true);
				b1.setDisable(true);
				b2.setDisable(true);
				b3.setDisable(true);
				b4.setDisable(true);
				
				//reset hand values
			    hand.deDupe();
			    
			    //store dice results into an array
				int[] diceResults = hand.getDiceRollsOrig();
				
				//instantiate random class
				Random random = new Random();
			
				//if else statement to set random values to respective dice
				if(b1.isSelected())
					diceResults[0] = random.nextInt(6) + 1;
				if(b2.isSelected())
					diceResults[1] = random.nextInt(6) + 1;
				if(b3.isSelected())
					diceResults[2] = random.nextInt(6) + 1;
				if(b4.isSelected())
					diceResults[3] = random.nextInt(6) + 1;
				
				//store new dice values in array
				String[] diceResultsString = new String[4];
				
				//create loop to set dice values into diceResults
				for(int i = 0; i<diceResults.length; i++)
				{
					diceResultsString[i] = diceResults[i]+"";
				}
			
				//print dice values onto GUI
				lDiceVars2.setText(diceResultsString[0] + "\t" + diceResultsString[1] + "\t" + 
						diceResultsString[2] + "\t" + diceResultsString[3]);
				
				System.out.println("     \n" + "dice round two: " + diceResultsString[0] + " " + diceResultsString[1] + " " +
						diceResultsString[2] + " " + diceResultsString[3]);
				//System.out.println("Hands: " + lHandLiteral2.getText());
				//invoke setDiceRolls
				hand.setDiceRolls(diceResults);
				
				//create copy of dice rolls to store unsorted values
				hand.setDiceRollsOrig(Arrays.copyOf(hand.getDiceRolls(), hand.getDiceRolls().length));
				
				//if else statement to print correct hand value for second round
				if(hand.isStraight())
			    {
			    	lHandLiteral2.setText("Straight");
			    }
			    else if(hand.is2Pair())
			    {
			    	lHandLiteral2.setText("Two Pair");
			    }
			    else if(hand.is4Kind())
			    {
			    	lHandLiteral2.setText("Four of a Kind");
			    }
			    else if(hand.is3Kind())
			    {
			    	lHandLiteral2.setText("Three of a Kind");
			    }
			    else if(hand.is2kind())
			    {
			    	lHandLiteral2.setText("Two of a Kind");
			    }
			    else
			    {
			    	lHandLiteral2.setText("No Hands :(");
			    }
				
				System.out.println("hand value round two: " + lHandLiteral2.getText());
			    
				//invoke deDupe method to reset dice hands
				hand.deDupe();
				
				//set hand method values to false
			    hand.setTwoPair(false);
			    hand.setTwoKind(false);
			    hand.setThreeKind(false);
			    hand.setFourKind(false);
			    hand.setStraight(false);
		});
			
		//set event handler action for play again button
		button3.setOnAction( e -> 
		{
		
			//disable previous buttons and nodes
			button.setDisable(false);
			
			//set nodes back to not visible
			lDiceVars.setVisible(false);
			lDice.setVisible(false);
			lDiceVars2.setVisible(false);
			lDraw.setVisible(false);
			lHand.setVisible(false);
			lHandLiteral.setVisible(false);
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			b4.setVisible(false);
			button2.setVisible(false);
			tfName.setEditable(true);
			button3.setDisable(false);
			lDice2.setVisible(false);
			lHand2.setVisible(false);
			lHandLiteral2.setVisible(false);
			button3.setVisible(false);	
			button2.setDisable(false);
			b1.setDisable(false);
			b2.setDisable(false);
			b3.setDisable(false);
			b4.setDisable(false);		
			b1.setSelected(false);
			b2.setSelected(false);
			b3.setSelected(false);
			b4.setSelected(false);
		
			//set dice values back to nothing
			lDiceVars2.setText("");
		});
	
	//event handler to allow checked and unchecked buttons
	b1.setOnAction(e -> {
		if (rb1 == false) {
			rb1 = true;
		}
		else {
			rb1 = false;
		}
		//request focus to the button clicked
		b1.requestFocus();
	}); 
	
	//event handler to allow checked and unchecked buttons
	b2.setOnAction(e -> {
		
		if (rb2 == false) {
			rb2 = true;
		}
		else {
			rb2 = false;
		}
		//request focus to the button clicked
		b2.requestFocus();
	}); 
	
	//event handler to allow checked and unchecked buttons
	b3.setOnAction(e -> {
		
		if (rb3 == false) {
			rb3 = true;
		}
		else {
			rb3 = false;
		}
		//request focus to the button clicked
		b3.requestFocus();
	});
	
	//event handler to allow checked and unchecked buttons
	b4.setOnAction(e -> {
		
		if (rb4 == false) {
			rb4 = true;
		}
		else {
			rb4 = false;
		}
		//request focus to the button clicked
		b4.requestFocus();
	});
		
	}
	
	


	public static void main(String[] args) {
		launch(args);
		System.exit(0);
	}
}

//the object class
class Hands {

	//Declare Variables
	private int[] diceRolls = new int[4];
	private int[] diceRollsOrig = new int[4];

	private boolean twoKind;
	private boolean threeKind;
	private boolean fourKind;
	private boolean twoPair;
	private boolean straight;
	
	//instantiate scanner class
	private static  Scanner input = new Scanner(System.in);

	private String finalVerdict;
	
	//constructors
	Hands() {
		twoKind = false;
		threeKind = false; 
		fourKind = false; 
		twoPair = false; 
		straight = false;
		
	}
	
	public String twoString () {
		return diceRolls[0] + "/t" + diceRolls[1] + 
			"/t" + diceRolls[2] + "/t" + diceRolls[3];
	}
	
//*******primary methods*******
	
	//Getter for diceRolls
	public int[] getDiceRolls() {
		return diceRolls;
	}
	
	//Setter for diceRolls
	public void setDiceRolls(int[] newDiceRolls) {
		diceRolls = newDiceRolls;
	}	
	//Getter for diceRollsOrig
	public int[] getDiceRollsOrig() {
		return diceRollsOrig;
	}
	
	//setter for diceRollsOrig
	public void setDiceRollsOrig(int[] newDiceRollsOrig) {
		diceRollsOrig = newDiceRollsOrig;
	}
	
	//Getter for twoKind
	public boolean getTwoKind() {
		return twoKind;
	}
	
	//setter for twoKind
	public void setTwoKind(boolean newTwoKind) {
		twoKind = newTwoKind;
	}
	
	//Getter for threeKind
	public boolean getThreeKind() {
		return threeKind;
	}
	
	//setter for threeKind
	public void setThreeKind(boolean newThreeKind) {
		threeKind = newThreeKind;
	}
	
	//Getter for fourKind
	public boolean getFourKind() {
		return fourKind;
	}
	
	//setter for fourKind
	public void setFourKind(boolean newFourKind) {
		fourKind = newFourKind;
	}
	
	//Getter for twoPair
	public boolean getTwoPair() {
		return twoPair;
	}
	
	//setter for twoPair
	public void setTwoPair(boolean newTwoPair) {
		twoPair = newTwoPair;
	}
	
	//Getter for straight
	public boolean getStraight() {
		return straight;
	}
	
	//setter for straight
	public void setStraight(boolean newStraight) {
		straight = newStraight;
	}
	
	//Getter for straight
	public String getFinalVerdict() {
		return finalVerdict;
	}
	
	//setter for straight
	public void setFinalVerdict(String newFinalVerdict) {
		finalVerdict = newFinalVerdict;
	}
		
	 //method to generate random variables
	public int[] setDice() {
    //create instance of random class
    Random random = new Random();
    //create array of random integer values
    int[] setDice = new int[4];
    //for loop to generate random values in array
    for(int i = 0; i < setDice.length; i++) {
  	  setDice[i] = random.nextInt(6) + 1;
    }

    	return setDice;
} //end setDice
	
//method to print array values
public void print() {
	
	int[] dr = this.getDiceRolls();
	for(int i = 0; i < dr.length; i++) {
		
		System.out.print(dr[i] + " ");
	}
	   	System.out.print("     \n");
}//end prtDice

	public static int[] setArray(int a, int b, int c, int d) {

	//declare array inside method. array initializer statement
		int[] tempArray = {a, b, c, d};
		return tempArray;
	}  

//Method to evaluate dice values and if there is a 4-of-a-kind
public boolean is4Kind() {

//store values into sorted array   
diceRolls = Arrays.copyOf(diceRollsOrig, diceRollsOrig.length);

//sort values in array to make checking easier
Arrays.sort(diceRolls);
   
//for loop to check each index of the array
    for(int i = 0; i < diceRolls.length - 3; i++) {
        //if statement to see if index value is = to following index value
        if (diceRolls [i] == diceRolls[i + 1] && diceRolls[i] == diceRolls[i+2] && diceRolls [i] == diceRolls[i + 3]) {
            finalVerdict = "Is4Kind";
            this.setFourKind(true);
            return true;
        }
    }
        return false;
} //end is4Kind

//Method to evaluate dice values and if there is a 3-of-a-kind.
public boolean is3Kind() {

    diceRolls = Arrays.copyOf(diceRollsOrig, diceRollsOrig.length);
    Arrays.sort(diceRolls);
    //for loop to check each index of the array
    for(int i = 0; i < diceRolls.length - 2; i++) {
        //if statement to see if index 0 = index 1 = index 2
        if (diceRolls [i] == diceRolls[i + 1] && diceRolls[i] == diceRolls[i+2]) {
            finalVerdict = "Is3Kind";
            this.setThreeKind(true);
            return true;
        }
    }

    return false;
} //end is3Kind

//Method to evaluate dice values and if there is a 2-of-a-kind.
public boolean is2kind() {

    diceRolls = Arrays.copyOf(diceRollsOrig, diceRollsOrig.length);
    Arrays.sort(diceRolls);
    //for loop to check each index of the array
    for(int i = 0; i < diceRolls.length - 1; i++) {
        //if statement to see if index 0 = index 1
        if(diceRolls [i] == diceRolls[i + 1]) {
            finalVerdict = "Is2Kind";
            this.setTwoKind(true);
            return true;
        } // end if
    } //end for
    return false;

} //end is2Kind
        
//Method to evaluate dice values and if there is a 2-Pair
public boolean is2Pair() {

    //declare variables
    boolean firstPair = false;
    boolean secondPair = false;

    diceRolls = Arrays.copyOf(diceRollsOrig, diceRollsOrig.length);
    Arrays.sort(diceRolls);
    //for loop to check each index of the array
    for (int i = 0; i < diceRolls.length - 1; i++) {
	        // both pairs equal true, leave loop
	        if (firstPair && secondPair)
	        break;
	        // if statement to check index 0 = index 1
	        if (diceRolls[i] == diceRolls[i+1]) {
	        	firstPair = true;
		        //for loop to check each index of the array
		        for (int z = i + 2; z < diceRolls.length - 1; z++) {
			        //if statement to check index 0 + 2 = index 1 + 2
			        if (z != diceRolls.length) {
			        if (diceRolls[z] == diceRolls[z+1])
			        	secondPair = true;
			        }
		        }
	        }		
    //exit loop if second pair does not return true
    if (!secondPair)
    break;
    }
    
    if (firstPair && secondPair) this.setTwoPair(true);
    return twoPair;
} //end of is2Pair

//Method to evaluate dice values and if there is a straight
public boolean isStraight() {

    //declare variables
    boolean found = true;

    diceRolls = Arrays.copyOf(diceRollsOrig, diceRollsOrig.length);
    Arrays.sort(diceRolls);

    //for loop to check each index of the array
     for(int i = 0; i < diceRolls.length; i++) {

             if(i < diceRolls.length - 1) {

            	 //check to see if index 0 + 1 = index 1 etc.
                 if (diceRolls[i + 1] != diceRolls[i] + 1) {
                     found = false;
                     break;
                 }
             }
         }
         if(found) this.setStraight(found);
         return found;
} //end of isStraight 

//Method to start second round of game
public void secondRound() {

    //import scanner and random class
    Random random = new Random();

    //prompt user to input number of dice to re-roll
    System.out.println("     \n" + " ******* Second Round *******" + "     \n" + 
    "Press the number of dice to draw (re-roll) and then press enter"
    + "- up to 3 dice can be re-rolled: \r");

    //Gets user input on amount of dices to be re-rolled
    String numRerollString = input.nextLine();
    
    //transfer string into integer variable
    int numReroll = Integer.parseInt(numRerollString);

    //do while loop to store indexes chose into index of array
    do {
    	//making sure indexes inserted is do-able
    	if(numReroll == 0)
	        {
		        System.out.print("Nothing will be rerolled. Please press enter to start a new game.");
		        input.nextLine();
		        break;
	        }
	        else if(numReroll >= 1 && numReroll <= 3)
	        {
		        //prompting user to input indexes
		        System.out.print("     \n" +"Enter the index numbers (0 to 3) separated by a space of the dice you wish to re-draw: ");
		        String[] tempArrayString = input.nextLine().split(" ");
		        int[] rerollIndexes = new int[tempArrayString.length];
		        //for loop to check each index of the array
		        for(int i = 0; i<tempArrayString.length; i++)
			    {
			        //System.out.print("Test to make sure random number generation works:\n" + rerollIndexes[i] +
			        //" -----Original value\n");
			        rerollIndexes[i] = Integer.parseInt(tempArrayString[i]);
			        //System.out.println(rerollIndexes[i] + " ------New Value");
			     }
	
	        for(int index: rerollIndexes)
	        {
		        //System.out.println("Test To make sure number generation works:\n" + rerollIndexes[index] + " -----Original value");
		        diceRollsOrig[index] = random.nextInt(6) + 1;
		        //System.out.println(rerollIndexes[index] + "------New Value");
	        }
	        break;
	        }
	        else
	        	//making it known to user that the number of dice is not do-able
	        	System.out.println("That is not a valid number");
    }
    while(true);
    
} // end of secondRound method

//method for printing new random dice values
public void prtNewDie (int [] array2) {

    for (int x : array2) {
    //using printf
    System.out.printf("%d", x);
    System.out.print(" ");
    }
    System.out.print("     \n");
}//end of prtNewDie method

	//Method to set only the highest hand to true    
	public void deDupe() {
    
    if (this.getFourKind()) {
        this.setThreeKind(false);
        this.setTwoKind(false);
        this.setTwoPair(false);
    } else if (this.getThreeKind()) this.setTwoKind(false);

    else if (this.getTwoPair()) this.setTwoKind(false);
   
}

//Method to reset values of Boolean variables 
public void resetHands(){
    
    this.setTwoKind(false);
    this.setThreeKind(false);
    this.setFourKind(false);
    this.setTwoPair(false);
    this.setStraight(false);       
}
     
public static void cleanUp() {
	   
}
        
}
