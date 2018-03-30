package assign3;
import java.util.Random;

/*   Name: Adam Mohr
 * 	 Section: 301
 * 	 Lab Teacher: Jason Mombourquette
 * 	 Purpose of Program: Simulates a dice betting game using loops.
 * 	 Assignment Number #3
 *   Date: Friday, April 6th 2018
 */

public class Die {
	private int dieValue;  // Holds the value of the ONE die.
	private Random randomNumbers = new Random();
	
	public Die() {  // Default constructor.
		
	}
	
	public void rollDie() {  // Generate a random value for die.
		dieValue = randomNumbers.nextInt (6) + 1;
	}
	
	public void displayDie() {  // Displays the value of die.
		
	}
	
	public int getValue() {  // Returns value of die.
		return dieValue;
	}
}
