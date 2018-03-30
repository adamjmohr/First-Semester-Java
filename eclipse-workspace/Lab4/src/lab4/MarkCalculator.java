package lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MarkCalculator {

	private double labMark, hybridMark, testMark, finalMark, theoryGrade, practicalGrade, finalGrade; // Declare variables.
	private DecimalFormat percentRound = new DecimalFormat("##.##");  // Set decimal format for grade percentages.
	private Scanner input = new Scanner (System.in);
	
	MarkCalculator() {
		
		System.out.println("Welcome to the CST8101 Final Mark Calculator\n");
		
	}
	
	public void getValues() {
		
		System.out.print("Enter your Lab Assignments mark out of 25: ");  // Receive input for marks.
		labMark = input.nextDouble();
		
		System.out.print("Enter your Hybrid Activities / Quizzes mark out of 20: ");
		hybridMark = input.nextDouble();
		
		System.out.print("Enter your Test mark out of 25: ");
		testMark = input.nextDouble();
		
		System.out.print("Enter your Final Assessment (Exam) mark out of 30: ");
		finalMark = input.nextDouble();
		
		System.out.println("");
	}
	
	public void calculateGrades() {
		
		theoryGrade = (testMark + finalMark) / 55 * 100;  // Calculate grades. 
		practicalGrade = (hybridMark + labMark) / 45 * 100;
		finalGrade = (labMark + hybridMark + testMark + finalMark) / 100 * 100;
		
	}
	
	public void displayGrades() {
		
		System.out.println("Theory grade: " + percentRound.format(theoryGrade) +"%");  // Output grade percentages using the decimal format.
		System.out.println("Practical grade: " + percentRound.format(practicalGrade) + "%");
		System.out.println("Final grade: " + percentRound.format(finalGrade) + "%");
		
	}

}
