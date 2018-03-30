package lab3;

import java.util.Scanner;

public class OurDate {
	
	private int month = 1;
	private int day = 1;
	private int year = 2000;
	private Scanner input = new Scanner (System.in);
	
	public void inputDay () {
		System.out.println("Enter a day: ");
		day = input.nextInt();
	}
	
	public void inputMonth () {
		System.out.println("Enter a month: ");
		month = input.nextInt();
	}
	
	public void inputYear () {
		System.out.println("Enter a year: ");
		year = input.nextInt();
	}
	
	public void displayDate() {
		System.out.println(year + "/" + month + "/" + day);
	}
	
	public int calcDays() {
		int days = day-1;
		days += ((month-1)*30);
		days += ((year -2000) * (12*30));
		
		return days;
	}

//	public static void main(String[] args) {
//		
//
//	}
	
	

}
