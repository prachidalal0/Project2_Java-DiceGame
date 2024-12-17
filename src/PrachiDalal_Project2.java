package Project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//driver or main class
class PrachiDalal_Project2 {
	
	//main method
	public static void main(String[] args) {

		//instantiate a Session object called session
		Session session = new Session();
		int iterations = 1;
		
		//invoke instructions method
		session.instructions();
		
		//create array for game iteration
		String[] results = new String[session.getGameCount()];
		
		//create loop to loop user inputed integrations
		for(int i = 0; i < session.getGameCount(); i++) {
			
			//print out which iteration game is on
			System.out.print("     \n" + "******* Starting game: " + iterations + " *******\n\n");
			
			//instantiate a Hands object called hands
			Hands hands = new Hands();		
	     		
			//invoke method to store setDiceRolls variables into diceRolls array
			hands.setDiceRolls(hands.setDice());
			
			//Make a copy of dice rolls to store unsorted values
			hands.setDiceRollsOrig(Arrays.copyOf(hands.getDiceRolls(), hands.getDiceRolls().length));
			
			//invoke method to print variables of array
			hands.print();
			
		    //invoke boolean methods and store into variables (figure out hand)
		    hands.is2kind();
		    hands.is3Kind();
		    hands.is4Kind();
		    hands.is2Pair();
		    hands.isStraight();
		    hands.deDupe();
		    
		    //invoke handSynatx method to print hands
		    session.handSyntax(hands);
			
		    //invoke secondRound method to get the values of second round of the game
		    hands.secondRound();
		    hands.deDupe();
		    
		    //print results of secondRound method
		    System.out.print("     \n");
		    hands.prtNewDie(hands.getDiceRollsOrig());
		    
		    //set set values of boolean results for second round
		    hands.resetHands();
		    
		    //Make a copy of Dice rolls original to store unsorted values
		    hands.setDiceRolls(Arrays.copyOf(hands.getDiceRollsOrig(), hands.getDiceRolls().length)); 
		    
		    //invoke boolean methods and store into variables for second round
		    hands.is2kind();
		    hands.is3Kind();
		    hands.is4Kind();
		    hands.is2Pair();
		    hands.isStraight();
		    hands.deDupe();
		    
		    //print results of hands at the end of the game
		    if(hands.is2kind())
		    {
		    	results[i] = "Game " + iterations + " is Two of a Kind";
		    }
		    else if(hands.is3Kind())
		    {
		    	results[i] = "Game " + iterations + " is Three of a Kind";
		    }
		    else if(hands.is4Kind())
		    {
		    	results[i] = "Game " + iterations + " is Four of a Kind";
		    }
		    else if(hands.is2Pair())
		    {
		    	results[i] = "Game " + iterations + " is Two Pairs";
		    }
		    else if(hands.isStraight())
		    {
		    	results[i] = "Game " + iterations + " is Straight of a Kind";
		    }
		    else
		    {
		    	results[i] = "Game " + iterations + " You lost!";
		    }
		    
		    hands.deDupe();
		    session.handSyntax(hands);
		   
		    //Increment iterations for loop
		    iterations++;

		} // end while
		
		//closing statements
		System.out.print("     \n");
		System.out.println("Thank you for playing " + session.getGameCount()
				+ " games!");
		System.out.println("Here are your results:");
		//enhanced for loop to print out the results of the game from the if statements
		for(String s: results)
		{
			System.out.println(s);
		}
		

	} // end main method
	
} // end class

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
