import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		double firstNumber, secondNumber, result = 0;
		String operation;
		Scanner input = new Scanner (System.in);

		System.out.println("Simple calculator");

		System.out.print("First number: ");
		firstNumber = input.nextDouble();

		System.out.print("Please enter an operation: ");
		operation = input.next();

		while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/") && !operation.equals("%")) {
			System.out.print("Please enter a valid operation: ");
			operation = input.next();
		}

		System.out.print("Second number: ");
		secondNumber = input.nextDouble();

		while (secondNumber == 0) {
			System.out.print("Please pick a non-zero number: ");
			secondNumber = input.nextDouble();
		}

		if (operation.equals("+")) {
			result = firstNumber + secondNumber;
		}
		else if (operation.equals("-")) {
			result = firstNumber - secondNumber;
		}
		else if (operation.equals("*")) {
			result = firstNumber * secondNumber;
		}
		else if (operation.equals("/")) {
			result = firstNumber / secondNumber;
		}
		else if (operation.equals("%")) {
			result = firstNumber % secondNumber;
		}

		System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);

		input.close();
	}




}


