package penniesForPay;

//Chayala Glazer	

import java.util.Scanner;

public class PenniesForPay {
	public static void main(String[] args) {

		// find out how many days the user worked for
		int days;
		Scanner input = new Scanner(System.in);
		System.out.println("How many days did you work for?");
		days = input.nextInt();

		// input validation
		while (days <= 0) {
			System.out
					.println("Error! Please re-enter how many days you worked for?");
			days = input.nextInt();
		}

		// make a chart displaying the salary per day worked
		double pennies = 1;
		int day = 1;
		double total = 0;
		// use a loop to double the salary each progressive day worked
		while (day <= days) {
			// format the output to be displayed in dollar amount
			System.out
					.printf("Day " + day + "\t" + "$%,.2f\n", (pennies / 100));
			total += pennies; // to add the salary of each day
			day++; // to move on to the next day
			pennies *= 2; // to double the salary each progressive day
		}

		// display the final information
		System.out.printf("\nAfter working for " + days
				+ " days, you earned $%,.2f!\n", (total / 100));

		input.close();
	}
}