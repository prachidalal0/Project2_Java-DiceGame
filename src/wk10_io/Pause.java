package wk10_io;
import java.util.Arrays;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Pause 
{
		public static void main(String[] args) 
		{
			
			int[] roll1;
			
			Roll roll = new Roll();
			roll1 = roll.getRoll();
			//Arrays.sort(roll1);
			System.out.println("Rolling the dice...");
			System.out.println();
			
			// Pause using try-catch for InterruptedException class
			try { TimeUnit.SECONDS.sleep(2); 
			} 
			catch (InterruptedException ie) { Thread.currentThread().interrupt(); 
			}

			System.out.println(roll1[0] + " " + roll1[1] + " " + roll1[2]);

		}

}

	class Roll {
		
		int[] roll = new int[3];
		
		public int[] getRoll() {
			Random random = new Random();
			for (int i = 0; i < 3; i++ ) {
				roll[i] = random.nextInt(6) + 1;
			}
			return roll;
		}
	}

