import java.text.DecimalFormat;
import java.util.Scanner;

public class InLab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		float costOfMeal, tipPercentage, costOfTip;
		DecimalFormat tipRound = new DecimalFormat("##.##");
		
		System.out.println("Welcome to Adam's tip calculator!!\n");
		
		System.out.print("Enter meal cost: $");
		costOfMeal = input.nextFloat();
		
		System.out.print("Enter the tip % : ");
		tipPercentage = input.nextFloat();
		
		System.out.println("");
		
		System.out.println("Meal Cost: $" + costOfMeal);
		
		costOfTip = costOfMeal * (tipPercentage / 100);
		System.out.println("Tip $" + tipRound.format(costOfTip));
		
		System.out.println("");
		
		costOfMeal = costOfMeal + costOfTip;
		System.out.println("You have spent $" + tipRound.format(costOfMeal) + " for this meal");
		
		input.close();
	}

}
