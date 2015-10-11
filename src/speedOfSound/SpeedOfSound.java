package speedOfSound;

//Chayala Glazer

import java.util.Scanner;

public class SpeedOfSound {
	public static void main(String[] args) {
		String medium; // to hold the input
		double distance; // to hold the distance
		double time; // to hold the time

		// create a scanner object to read input
		Scanner keyboard = new Scanner(System.in);

		// ask the user to choose air, water, or steel
		System.out
				.print("For which of the following mediums would you like to know how fast sound travels: air, water, or steel? ");
		medium = keyboard.nextLine();

		// find out the distance that the sound should travel
		System.out
				.print("How far (in feet) would you like the sound to travel in the given medium? ");
		distance = keyboard.nextDouble();

		// calculate the speed the sound will travel
		if (distance > 0) {
			switch (medium) {
			case "air":
				time = distance / 1100;
				System.out.println("It will take " + time
						+ " seconds for the sound to travel.");
				break;
			case "water":
				time = distance / 4900;
				System.out.println("It will take " + time
						+ " seconds for the sound to travel.");
				break;
			case "steel":
				time = distance / 16400;
				System.out.println("It will take " + time
						+ " seconds for the sound to travel.");
				break;
			default: // to ensure input validation
				System.out
						.println("You have not made a valid input. Please rerun the program and enter air, water, or steel.");
			}
		} else
			// input validation
			System.out
					.println("Error! Your distance input was invalid. Please try again.");
		keyboard.close();
	}
}