package conversionProgram;

//Chayala Glazer

import java.util.*;

public class ConversionProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double distance;

		// ask the user to input a distance
		System.out.println("Please enter a distance in meters.");
		distance = input.nextDouble();

		while (distance <= 0) // input validation
		{
			System.out.println("Error! Please enter positive number.");
			System.out.println("Please enter a distance in meters.");
			distance = input.nextDouble();
		}

		// empty space for nice formatting
		System.out.println();
		menu(); // call the menu method
		System.out.println(); // empty space
		int choice = 0;// initiate variable

		while (!(choice == 4))// i want the loop to terminate when the user
								// enters 4
		{
			System.out
					.println("Enter your choice of conversion. For example, enter 1 if you'd like your distance to be converted to kilometers.");
			choice = input.nextInt();
			if (!(choice == 1 || choice == 2 || choice == 3 || choice == 4)) // input
																				// validation
				System.out.println("Error! Please choose 1, 2, 3, or 4.");
			else if (choice == 1)
				showKilometers(distance);// call the showKilometers method
			else if (choice == 2) {
				showInches(distance); // call the showInches method
			} else if (choice == 3)// else if was used in case the user entered
									// 4
			{
				showFeet(distance); // call the showFeet method
			}
		}
		System.out.println("Bye!");
		input.close();
	}

	/**
	 * The menu method displays choices of conversions for the user
	 */

	public static void menu() {
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
	}

	/**
	 * the showKilometers method does the calculations and output to the user if
	 * the user enters 1
	 */

	public static void showKilometers(double distance) {
		double kilometers;
		kilometers = distance * .001;
		System.out.printf(distance + " in kilometers is %2.3f \n", kilometers);
	}

	/**
	 * the showInches method does the calculations and output to the user if the
	 * user enters 2
	 */

	public static void showInches(double distance) {
		double inches;
		inches = distance * 39.37; // calculate
		System.out.printf(distance + " in inches is %4.2f \n", inches);
	}

	/**
	 * the showFeet method does the calculations and output to the user if the
	 * user enters 3
	 */

	public static void showFeet(double distance) {
		double feet;
		feet = distance * 3.281;
		System.out.printf(distance + " in feet is %3.2f \n", feet);
	}

}
