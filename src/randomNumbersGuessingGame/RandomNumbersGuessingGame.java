package randomNumbersGuessingGame;

//Chayala Glazer

import java.util.*; //need scanner class and random class

public class RandomNumbersGuessingGame {
	public static void main(String[] args) {
		// create a random class object
		Random randomNumber = new Random();

		int number; // to hold the random number
		number = randomNumber.nextInt(100) + 1;

		int guess; // to hold the user's guess

		Scanner input = new Scanner(System.in);

		System.out
				.println("A number was chosen between 1 to 100. Please guess the number.");
		guess = input.nextInt();

		while (!(guess == number)) {
			while (guess < 1 || guess > 100) {
				System.out
						.println("Error! Please choose a number between 1 and 100.");
				guess = input.nextInt();
			}
			if (guess > number) {
				System.out.println("Too high, try again.");
				System.out.println("Guess the number between 1 to 100");
				guess = input.nextInt();
			} else {
				System.out.println("Too low, try again.");
				System.out.println("Guess the number between 1 to 100");
				guess = input.nextInt();
			}
		}
		System.out.println("Great job!");
		input.close();
	}
}
