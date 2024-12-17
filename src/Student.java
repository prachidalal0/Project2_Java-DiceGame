package JavaTutoring;

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

public class Student extends Application {

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
		Label lWelcome = new Label("Play The 4-Dice-Draw-Poker Game!");		
		lWelcome.setLayoutX(80);
		lWelcome.setLayoutY(80);
		lWelcome.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lWelcome.setFont(new Font("Comic Sans MS", 15));
		
		Label lName = new Label("Enter your name: ");
		//locate the children
		lName.setLayoutX(87);
		lName.setLayoutY(135);
		lName.setStyle("-fx-background-color:rgba(243, 180, 204)");
		lName.setFont(new Font("Comic Sans MS", 13));
		
		TextField tfName = new TextField();
		tfName.setLayoutX(206);
		tfName.setLayoutY(130);
		tfName.setMinWidth(107);
		tfName.setMaxWidth(50);
		
		Button button = new Button("Click to roll dice");
		button.setLayoutX(141);
		button.setLayoutY(185);
		button.setStyle("-fx-base:rgba(250, 109, 140)");
		Font font = Font.font("Comic Sans MS", FontWeight.BOLD, 13);
		button.setFont(font);
		
		
		Label lDice = new Label("Dice: ");
		lDice.setLayoutX(60);
		lDice.setLayoutY(245);
		lDice.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lDice.setFont(new Font("Comic Sans MS", 15));
		lDice.setVisible(false);
		
		//diceVar dice = new diceVar();
		//dice.setDice();
		//System.out.println(dice.getDie1() + dice.getDie2() + dice.getDie3() + dice.getDie4());
	
		Pane pane = new Pane();
		pane.setPadding(new Insets(20, 20, 20, 20));
		pane.getChildren().addAll(lWelcome, lName, tfName, button, lDice);
		
		Scene scene = new Scene(pane, 400, 710);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Label lDiceVars = new Label();
		pane.getChildren().add(lDiceVars);
		lDiceVars.setLayoutX(132);
		lDiceVars.setLayoutY(245);
		lDiceVars.setFont(new Font("Comic Sans MS", 15));
		
		Label lHand = new Label("Hand: ");
		lHand.setLayoutX(60);
		lHand.setLayoutY(300);
		lHand.setStyle("-fx-background-color:rgba(243, 180, 204)");
		lHand.setFont(new Font("Comic Sans MS", 15));
		pane.getChildren().add(lHand);
		lHand.setVisible(false);
	
		Label lHandLiteral = new Label("Hand Literal");
		lHandLiteral.setLayoutX(160);
		lHandLiteral.setLayoutY(300);
		lHandLiteral.setFont(new Font("Comic Sans MS", 15));
		lHandLiteral.setVisible(false);
		
		Label lDraw = new Label("Draw: ");
		lDraw.setLayoutX(60);
		lDraw.setLayoutY(355);
		lDraw.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lDraw.setFont(new Font("Comic Sans MS", 15));
		lDraw.setVisible(false);
		
		RadioButton b1 = new RadioButton(" ");
		b1.setLayoutX(125);
		b1.setLayoutY(355);
		b1.setStyle("-fx-base:rgba(210, 169, 249)");
		b1.setMinWidth(20);
		b1.setMaxWidth(20);
		b1.setMinHeight(20);
		b1.setMaxHeight(20);
		b1.setVisible(false);
		
		RadioButton b2 = new RadioButton(" ");
		b2.setLayoutX(170);
		b2.setLayoutY(355);
		b2.setStyle("-fx-base:rgba(210, 169, 249)");
		b2.setMinWidth(20);
		b2.setMaxWidth(20);
		b2.setMinHeight(20);
		b2.setMaxHeight(20);
		b2.setVisible(false);
		
		RadioButton b3 = new RadioButton(" ");
		b3.setLayoutX(215);
		b3.setLayoutY(355);
		b3.setStyle("-fx-base:rgba(210, 169, 249)");
		b3.setMinWidth(20);
		b3.setMaxWidth(20);
		b3.setMinHeight(20);
		b3.setMaxHeight(20);
		b3.setVisible(false);
		
		RadioButton b4 = new RadioButton(" ");
		b4.setLayoutX(260);
		b4.setLayoutY(355);
		b4.setStyle("-fx-base:rgba(210, 169, 249)");
		b4.setMinWidth(20);
		b4.setMaxWidth(20);
		b4.setMinHeight(20);
		b4.setMaxHeight(20);
		b4.setVisible(false);
		
		
		Button button2 = new Button("Click to roll dice");
		button2.setLayoutX(141);
		button2.setLayoutY(415);
		button2.setStyle("-fx-base:rgba(250, 109, 140)");
		Font font2 = Font.font("Comic Sans MS", FontWeight.BOLD, 13);
		button2.setFont(font2);
		button2.setVisible(false);
	
		Label lDice2 = new Label("Dice: ");
		lDice2.setLayoutX(60);
		lDice2.setLayoutY(475);
		lDice2.setStyle("-fx-background-color:rgba(174, 219, 254)");
		lDice2.setFont(new Font("Comic Sans MS", 15));
		lDice2.setVisible(false);

		Label lDiceVars2 = new Label();
		//lDiceVars2.setText(dice.getDie1() + "        " + dice.getDie2() + "        " + dice.getDie3() + "        " + dice.getDie4());
		lDiceVars2.setLayoutX(132);
		lDiceVars2.setLayoutY(475);
		lDiceVars2.setFont(new Font("Comic Sans MS", 15));
		pane.getChildren().addAll(lHandLiteral, lDraw, b1, b2, b3, b4, button2, lDice2, lDiceVars2);
		lDiceVars2.setVisible(false);
		
		Label lHand2 = new Label("Hand: ");
		lHand2.setLayoutX(60);
		lHand2.setLayoutY(525);
		lHand2.setStyle("-fx-background-color:rgba(243, 180, 204)");
		lHand2.setFont(new Font("Comic Sans MS", 15));
		lHand2.setVisible(false);
	
		Label lHandLiteral2 = new Label("Hand Literal");
		lHandLiteral2.setLayoutX(160);
		lHandLiteral2.setLayoutY(525);
		lHandLiteral2.setFont(new Font("Comic Sans MS", 15));
		lHandLiteral2.setVisible(false);
	
		Button button3 = new Button("Play Again?");
		button3.setLayoutX(153);
		button3.setLayoutY(575);
		button3.setStyle("-fx-base:rgba(250, 109, 140)");
		Font font3 = Font.font("Comic Sans MS", FontWeight.BOLD, 13);
		button3.setFont(font3);
		button3.setVisible(false);
		
		ImageView iv2 = new ImageView("https://www.freeclipartnow.com/d/42353-1/dice.jpg");
		iv2.setFitWidth(100);
		iv2.setFitHeight(100);
		iv2.setLayoutX(20);
		iv2.setLayoutY(20);
		
		pane.getChildren().addAll(lHand2, lHandLiteral2, button3, iv2);
		
		tfName.setOnAction(e -> {
			name = tfName.getText();
			button.requestFocus();
		});
		
		
		button.setOnAction( e -> {
			if(tfName.getText().equals(""))
				JOptionPane.showMessageDialog(null, "Enter a name to start the game");
			else 
			{
				//hand = new Hands();
				lDiceVars.setVisible(true);
				hand.deDupe();
				hand.setDiceRolls(hand.setDice());
				int[] diceResults = hand.getDiceRolls();
				String[] diceResultsString = new String[4];
				for(int i = 0; i<diceResults.length; i++)
				{
					diceResultsString[i] = diceResults[i]+"";
				}
				//lDice.setText(hand.getDiceRolls()[0]);
				lDiceVars.setText(diceResultsString[0] + "\t" + diceResultsString[1] + "\t" + 
				diceResultsString[2] + "\t" + diceResultsString[3]);
				//button.setVisible(false);
				
				hand.setDiceRollsOrig(Arrays.copyOf(hand.getDiceRolls(), hand.getDiceRolls().length));
			    
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
			    hand.deDupe();
			    hand.setTwoPair(false);
			    hand.setTwoKind(false);
			    hand.setThreeKind(false);
			    hand.setFourKind(false);
			    hand.setStraight(false);
			}
			
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
		
		button2.setOnAction( e -> {		
				button3.setVisible(true);
				lDice2.setVisible(true);
				lHand2.setVisible(true);
				lHandLiteral2.setVisible(true);
				button3.setVisible(true);
			
				button2.setDisable(true);
				b1.setDisable(true);
				b2.setDisable(true);
				b3.setDisable(true);
				b4.setDisable(true);
				
			    hand.deDupe();
				int[] diceResults = hand.getDiceRollsOrig();
				Random random = new Random();
				if(b1.isSelected())
					diceResults[0] = random.nextInt(6) + 1;
				if(b2.isSelected())
					diceResults[1] = random.nextInt(6) + 1;
				if(b3.isSelected())
					diceResults[2] = random.nextInt(6) + 1;
				if(b4.isSelected())
					diceResults[3] = random.nextInt(6) + 1;
				
				String[] diceResultsString = new String[4];
				for(int i = 0; i<diceResults.length; i++)
				{
					diceResultsString[i] = diceResults[i]+"";
				}
				lDiceVars2.setText(diceResultsString[0] + "\t" + diceResultsString[1] + "\t" + 
						diceResultsString[2] + "\t" + diceResultsString[3]);
				
				hand.setDiceRolls(diceResults);
			  // hand.resetHands();
				hand.setDiceRollsOrig(Arrays.copyOf(hand.getDiceRolls(), hand.getDiceRolls().length));
				
				
			    
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
				hand.deDupe();
			    hand.setTwoPair(false);
			    hand.setTwoKind(false);
			    hand.setThreeKind(false);
			    hand.setFourKind(false);
			    hand.setStraight(false);
		});
			
		button3.setOnAction( e -> 
		{
		
			button.setDisable(false);
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
		
			lDiceVars2.setText("");
			
		});
		
	b1.setOnAction(e -> {
			
			if (rb1 == false) {
				rb1 = true;
			}
			else {
				rb1 = false;
			}
			/*
			status = "freshman";
			System.out.println(status); */
			b1.requestFocus();
		}); 
	
	b2.setOnAction(e -> {
		
		if (rb2 == false) {
			rb2 = true;
		}
		else {
			rb2 = false;
		}
		/*
		status = "freshman";
		System.out.println(status); */
		b2.requestFocus();
	}); 
	
	b3.setOnAction(e -> {
		
		if (rb3 == false) {
			rb3 = true;
		}
		else {
			rb3 = false;
		}
		/*
		status = "freshman";
		System.out.println(status); */
		b3.requestFocus();
	});
	
	b4.setOnAction(e -> {
		
		if (rb4 == false) {
			rb4 = true;
		}
		else {
			rb4 = false;
		}
		/*
		status = "freshman";
		System.out.println(status); */
		b4.requestFocus();
	});
	}


	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Welcome to the dice game!");
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

//user specific class
class Session {
	
	private int gameCount;
	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}

	String playerName;
	
	Session() { }

  //method to display instructions and prompt user to input their name and start game
  public void instructions () {

      // Create input object of Scanner Class to read data from user
      Scanner input = new Scanner(System.in);

      //print instructions and name
      System.out.println("4-Dice_Draw_Poker is a poker game that uses dice instead of cards. \n" +
      "The computer will roll 4 dice and then identify the best hand. \n" +
      "The player can draw (re-roll) up to 3 dice to improve the hand. \n" +
      "Possible hands include 4-of-a-kind, 3-of-a-kind, 2-Pair, Pair, or a Straight. \n" +
      "     \n");

      System.out.print("Enter your name: ");

      //store input name into object
       playerName = input.next();

      //print name
      System.out.println("     \n" +
      "Hi " + playerName + "! Welcome to 4-Dice Draw Poker" +
      "     \n");
      
      System.out.print("Please enter the number of games you would like to play: ");
      String gameCountString = input.next();
      gameCount = Integer.parseInt(gameCountString);

      //prompt user to start game
      System.out.print("Press any letter-key and then enter to start the game and roll the dice. ");

      input.next();

      //formatting
      System.out.println("      ****** INITIAL HAND ******      ");

  }  //end instructions
  
  public void handSyntax (Hands hds) {
  	
  	//formatting
      System.out.println("     \n" + "IS-4-KIND" + " " + " " + "IS-STRAIGHT" + " " + " " + "IS-3-KIND" + " " + " "
      + "IS-2-PAIR"  + " " + " " + "IS-2-KIND" + "     \n");
      
      //print boolean results using printf
      System.out.printf("%B", hds.getFourKind());
      System.out.print("         ");
      System.out.printf("%B", hds.getStraight());
      System.out.print("       ");
      System.out.printf("%B", hds.getThreeKind());
      System.out.print("      ");
      System.out.printf("%B", hds.getTwoPair());
      System.out.print("     ");
      System.out.printf("%B%n", hds.getTwoKind());
  }
	
}

