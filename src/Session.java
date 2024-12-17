package Project2;

import java.util.Scanner;

public class Session {
	

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
        String name = input.next();

        //print name
        System.out.println("     \n" +
        "Hi " + name + "! Welcome to 4-Dice Draw Poker" +
        "     \n");
        
        System.out.print("Please enter the number of games you would like to play: ");
        
        input.next();

        //prompt user to start game
        System.out.print("Press any letter-key and then enter to start the game and roll the dice. ");

        input.next();

        //formatting
        System.out.println("      ****** INITIAL HAND ******      " +
        "     \n");

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
