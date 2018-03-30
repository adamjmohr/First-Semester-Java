import java.util.Scanner;

public class LabTest {
	private int value1, value2, value3;
	private Scanner input = new Scanner (System.in);

	public LabTest () {  // Default constructor. 
		value1 = 0;
		value2 = 0;
	}

	public void getValues() {

		System.out.print("Enter the first value: ");
		value1 = input.nextInt();
		while(value1 < 1) {
			System.out.print("Invalid entry...Enter the first value: ");
			value1 = input.nextInt();
		}

		System.out.print("Enter the second value: ");
		value2 = input.nextInt();
		while(value2 < 1) {
			System.out.print("Invalid entry...Enter the second value: ");
			value2 = input.nextInt();
		}

		if (value1 > value2) {
			value3 = value1 % value2;
		}
		if (value2 > value1) {
			value3 = value2 % value1;
		}
	}

	public void display() {
		if (value1 > value2) {
			System.out.println(value1 + " % " + value2 + " = " + value3);
		}
		if (value2 > value1) {
			value3 = value2 % value1;
			System.out.println(value2 + " % " + value1 + " = " + value3);
		}
	}
}
