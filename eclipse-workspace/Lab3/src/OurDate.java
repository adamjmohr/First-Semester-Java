import java.util.Scanner;

public class OurDate {
	
	// Declare instance variables
	int hours;
	int minutes;
	int seconds;
	Scanner input = new Scanner (System.in);
	
	public void inputHour() {
		System.out.println("Enter the hour: ");
		hours = input.nextInt();
	}
	
	public void inputMinute() {
		System.out.println("Enter the minute: ");
		minutes = input.nextInt();
	}
	
	public void inputSecond() {
		System.out.println("Enter the second: ");
		seconds = input.nextInt();
	}
	
	public void displayTime() {
		System.out.println(hours + ": " + minutes + ": " + seconds);
	}
	
	public int calculateTime() {
		return ((seconds - 0) + ((minutes - 0) * 60 )) + ((hours - 12) * 360);
	}

	public static void main(String[] args) {
		

		
//		int month = 1;
//		int day = 1;
//		int year = 2000;
//		int calcDays;
//		
//		
//		
//		System.out.println("Initial date is " + year + "/" + month + "/" + day);
//		System.out.println("Enter a year: ");
//		year = input.nextInt();
//		System.out.println("Enter a month: ");
//		month = input.nextInt();
//		System.out.println("Enter a day: ");
//		day = input.nextInt();
//		System.out.println("Date is " +  year + "/" + month + "/" + day);
////		calcDays = year * ;
//		System.out.println("There are " + calcDays + " days");
//		input.close();

	}

}
