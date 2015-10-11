package randomNumbersGuessingGame;

//Chayala Glazer

import java.util.*; //need scanner class and random class

public class RandomNumberGuessingGame {
	public static void main(String[] args) {
		// create a random class object
		Random randomNumber = new Random();

		int number; // to hold the random number
		number = randomNumber.nextInt(100) + 1;

		int guess; // to hold the user's guess

		Scanner input = new Scanner(System.in);

		System.out
				.println("A number was chosen between 1 to 100. Please guess the number.");// prompt
																							// the
																							// user
		guess = input.nextInt();

		// create a loop that will iterate until the user guesses the correct
		// number
		while (!(guess == number)) {
			while (guess < 1 || guess > 100) // input validation
			{
				System.out
						.println("Error! Please choose a number between 1 and 100.");
				guess = input.nextInt();
			}
			if (guess > number) // if the user guesses a number higher than the
								// correct number
			{
				System.out.println("Too high, try again.");
				System.out.println("Guess the number between 1 to 100");
				guess = input.nextInt();
			} else {
				System.out.println("Too low, try again."); // if the user
															// guesses a number
															// lower than the
															// correct number
				System.out.println("Guess the number between 1 to 100");
				guess = input.nextInt();
			}
		}
		// the loop ends when the user guesses the correct number!
		System.out.println("Great job! You guessed the number!");
		input.close();
	}
}
