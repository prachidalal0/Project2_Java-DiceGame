package Project3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//driver or main class
public class PrachiDalal_Project3 {

	//main method
	public static void main(String[] args) {

		//instantiate a Session object called session
				Session session = new Session();
				Poker_EH eh = new Poker_EH();
				int iterations = 1;
				
				//invoke instructions method
				session.instructions();
				
				//create array for game iteration
				String[] results = new String[session.getGameCount()];
				
				//create loop to loop user inputed integrations
				for(int i = 0; i < session.getGameCount(); i++) {
					
					eh.pauseGame();
					
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
				    hands.deDupe();
				    hands.secondRound();
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
				    
				    //invoke method that ensures only one hand is true
				    hands.deDupe();
				    
				    //invoke method to print out hands
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
		
	}

//class that controls values of hands and dice throughout the game
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
	      //Creates a Poker_EH Object
	      Poker_EH eh = new Poker_EH();
	      //prompt user to input number of dice to re-roll
	      System.out.println("     \n" + " ******* Second Round *******" + "     \n" + 
	      "Press the number of dice to draw (re-roll) and then press enter"
	      + "- up to 3 dice can be re-rolled: \r");

	      //Gets user input on amount of dices to be re-rolled
	      String numRerollString = input.nextLine();
	      String indexString = "";
	      int numReroll = 0;
	      boolean flag = false;
	      boolean flag2 = false;
	      do {
	    	  flag = eh.getEntry(numRerollString);
	    	  if(flag) {
	    		  numReroll = Integer.parseInt(numRerollString);
	    		  if(numReroll == 0)
			        {
				        System.out.print("Nothing will be rerolled. Please press enter to start a new game.");
				        input.nextLine();
			        }
			        else if(numReroll >= 1 && numReroll <= 3)
			        {
			        	for (int i = 0; i < numReroll; i++) {
			        	do {
			        		System.out.println("Please enter the index of dice you want to reroll: ");
			        		
			        		 indexString = input.nextLine();
			        		 if(eh.getEntry2(indexString, diceRollsOrig))
			        		 {
			        			 flag2 = true;
			        			 // diceRollsOrig[Integer.parseInt(indexString)] = random.nextInt(6) + 1;
			        			 break;}
			        		 else
			        			 ;
			        	}while(!flag2);

			        	}
			        	
			        }  
			        
	    	  }
	    	  else {
	    		  System.out.println("Press the number of dice to draw (re-roll) and then press enter"
	    			      + "- up to 3 dice can be re-rolled: \r");
	    		  numRerollString = input.nextLine();
	    		  
	    	  }
	      } while(!flag);   
	      
	  }
	  //method for printing new random dice values
	  public void prtNewDie (int [] array2) {

		  //enhanced for loop to print variables
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
	          
}

 class Session {
	
	//declare vars
	private int gameCount;
	
	//constructors
	public int getGameCount() 
	{
		return gameCount;
	}

	public void setGameCount(int gameCount) 
	{
		this.gameCount = gameCount;
	}
	
	//declare vars
	String playerName;
	
	public Session() { }

    //method to display instructions and prompt user to input their name and start game
    public void instructions () 
    {
    	Poker_EH eh = new Poker_EH();
        // Create input object of Scanner Class to read data from user
        Scanner input = new Scanner(System.in);

        //print instructions and name
        System.out.println("4-Dice_Draw_Poker is a poker game that uses dice instead of cards. \n" +
        "The computer will roll 4 dice and then identify the best hand. \n" +
        "The player can draw (re-roll) up to 3 dice to improve the hand. \n" +
        "Possible hands include 4-of-a-kind, 3-of-a-kind, 2-Pair, Pair, or a Straight. \n" +
        "     \n");

        //prompt user to enter their name
        System.out.print("Enter your name: ");

        //store input name into object
         playerName = input.next();

        //print name
        System.out.println("     \n" +
        "Hi " + playerName + "! Welcome to 4-Dice Draw Poker" +
        "     \n");
       
        //prompt user to enter the number of games
        System.out.print("Please enter the number of games you would like to play: ");
       
        //store user input into String variable
        String gameCountString = input.next();
        
        //create boolean variable that stores value of getGames
        boolean flag = false;
        
        //do while loop to keep prompting user to enter games if their input is incorrect
        do {
        	//stores value of getGames
        	flag = eh.getGames(gameCountString);
        	
        	//if flag is false
        	if(!flag){
        		
        		//prompt user again
        		System.out.print("Please enter the number of games you would like to play: ");
        		
        		//store this into String variable
     	        gameCountString = input.next();
        	}
        	
        	//if input is true
        	else
        		
        		//convert string into integer
        		gameCount = Integer.parseInt(gameCountString);
        }
        
        //continue loop if flag is false
        while (!flag);		
        
    		 //prompt user to start game
	        System.out.print("Press any letter-key and then enter to start the game and roll the dice. " + "     \n" );      
	        input.next();
    
	//invoke pausing game method
	//eh.pauseGame();

    //formatting
    //System.out.println("      ****** INITIAL HAND ******      ");

    }  //end instructions
    
    public void handSyntax (Hands hds) 
    {
    	
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

 class Poker_EH {
	/*
 * getEntry – prompts player entries, checks values against arguments, prints error messages to console.
 * pauseGame – pauses game for a specified number of seconds based on the argument sent.
 */
	
	public Poker_EH() {} 
		
	//method for EH of index and dice
	public boolean getEntry(String indexString) {
		//declare vars 
		boolean flag = false;
		
		//error message 
		String errmsg = "Please try again and choose a value between 0 and 3.";
		
			//try catch statements
			try 
			{	
				//convert string into integer
				int index = Integer.parseInt(indexString);
				
				//if the input is from 0 to 3
				if (index <= 3 && index >=0) 
				{
					//set flag to true
					flag = true;
				}
				else 
				{
					//set flag to false otherwise
					flag = false; 
					
					//if false, throw exception
					throw new IllegalArgumentException();	
				}
			}
			//catch statements for different exceptions 
			catch (InputMismatchException ime) 
			{
				//print error message if their is an exception thrown
				System.out.println(ime);
				System.out.println(errmsg);
				flag = false;
			}
			
			catch (NumberFormatException nfe) 
			{
				System.out.println(nfe);
				System.out.println(errmsg);
				flag = false;
			}
			
			catch (IllegalArgumentException iae) 
			{
				System.out.println(iae);
				System.out.println(errmsg);
				flag = false;
			}
			
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println(errmsg);
				flag = false;
			}
				
		//return boolean variable depending on input
		return flag;
	}
 	
	//method for getting EH of games
	public boolean getGames (String gameCountString) {
		//declare vars 
		boolean flag = false;
		
		//error message
		String errmsg = "Please enter a number between 1 and 99 to play.";
		
			//try catch statements
			try 
			{	
				//convert string into integer
				int gameCount = Integer.parseInt(gameCountString);
				
				//if the input is from 1 to 99
				if (gameCount > 0 && gameCount < 100) 
				{
					//set flag to true
					flag = true;
				}
				else 
				{
					//set flag to false otherwise
					flag = false; 
					
					//if false, throw exception
					throw new IllegalArgumentException();	
				}
			}
			
			//catch statements for different exceptions 
			catch (InputMismatchException ime) 
			{
				System.out.println(ime);
				
				//print error message if their is an exception thrown
				System.out.println(errmsg);
				flag = false;
			}
			
			catch (NumberFormatException nfe) 
			{
				System.out.println(nfe);
				System.out.println(errmsg);
				flag = false;
			}
			
			catch (IllegalArgumentException iae) 
			{
				System.out.println(iae);
				System.out.println(errmsg);
				flag = false;
			}
			
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println(errmsg);
				flag = false;
			}
			
		//return boolean variable depending on input
		return flag;
	}
	
	public boolean getEntry2(String indexString, int[] arr) {
		//declare vars 
		boolean flag = false;
		Random random = new Random();
		String errmsg = "Please try again and choose a value between 0 and 3.";
		
			try 
			{	
				int index = Integer.parseInt(indexString);
				if (index <= 3 && index >=0) 
				{
					flag = true;
					arr[index] = random.nextInt(6)+1;
				}
				else 
				{
					flag = false; 
					throw new IllegalArgumentException();	
				}
			}
			catch (InputMismatchException ime) 
			{
				System.out.println(ime);
				System.out.println(errmsg);
				flag = false;
			}
			
			catch (NumberFormatException nfe) 
			{
				System.out.println(nfe);
				System.out.println(errmsg);
				flag = false;
			}
			
			catch (IllegalArgumentException iae) 
			{
				System.out.println(iae);
				System.out.println(errmsg);
				flag = false;
			}
			
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println(errmsg);
				flag = false;
			}
				
		return flag;
	}
 			
//method to pause game
public void pauseGame() {
	
	//message output before pausing the game
	System.out.println("Rolling the dice...");
	System.out.println();
	
		//Pause using try-catch for InterruptedException class
		try { TimeUnit.SECONDS.sleep(5); 
		} 
		catch (InterruptedException ie) { Thread.currentThread().interrupt(); 
		}
	}


}


