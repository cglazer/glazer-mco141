package twentyOne;

//Chayala Glazer

import javax.swing.JOptionPane; //to use the JOptionPane
import java.util.Random; // to use the random class

public class TwentyOne {
	/**
	 * This program generates the card game "Twenty One" where a player can play
	 * against the computer.
	 */
	public static void main(String[] args) {
		rules(); // call the rules method

		String playAgain;
		String draw;

		do // a loop which will iterate each time the player plays the game
		{
			int player1Points = 0, player2points = 0, points; // variable
																// initiated
																// within the
																// loop so it
																// goes back to
																// 0 at the
																// beginning of
																// each game

			do // a loop which will iterate each time the player draws a card
			{
				JOptionPane.showMessageDialog(null, "Press OK to draw a card.");
				points = drawCard(); // call the drawCard method and place the
										// returning value as the variable
										// "points"
				player1Points += points; // add the total points for player1
				JOptionPane.showMessageDialog(null, "You now have "
						+ player1Points + " points."); // display the points to
														// the user
				player2points = computerLogic(player2points); // call the
																// computerLogic
																// method to
																// allow the
																// computer to
																// deal a card
				draw = drawAgain(player1Points); // call the drawAgain method
			} while ((draw.equals("y")) || (draw.equals("Y")));

			do // as long as the computer doesn't have 15 points, it will draw
				// another card
			{
				player2points = computerLogic(player2points); // call the
																// computerLogic
																// method
			} while (player2points < 15);

			winner(player1Points, player2points); // call the winner method to
													// hear who the winner is
			playAgain = JOptionPane
					.showInputDialog("Would you like to play again? y=yes, press any key to exit.");
		} while ((playAgain.equals("y")) || (playAgain.equals("Y")));

		System.exit(0); // close the JOptionPane
	}

	/**
	 * This method lists the rules for the game.
	 */
	public static void rules() {
		System.out.println("Welcome to Twenty One!");
		System.out.println(); // empty line for easy reading
		System.out
				.println("You will be playing a card game against the computer. The object of the game is to get as close to 21 points as possible, ");
		System.out
				.println("but if you exceed 21 points, you lose. Here's how you play: You will deal a card from a deck of 52 cards. An Ace will earn ");
		System.out
				.println("you 1 point, numbers 2-10 will earn you it's numerical value and Jack, Queen, and King, will each earn you 10 points. After ");
		System.out
				.println("you deal a card, it will be the computer's turn to deal a card. You will then be given the option to continue dealing, or ");
		System.out
				.println("to freeze. If you continue dealing, you are risking exceeding the 21 points and losing. However, you may deal a small number ");
		System.out
				.println("to get closer to 21 points and win the computer. The computer will continue dealing once it reaches 15 or over. It's all up to ");
		System.out.println("you! Good luck, and I hope you win!"); // many lines
																	// were used
																	// for clear
																	// formatting
	}

	/**
	 * This method draws a card from the deck, finds its points value and
	 * displays the number and suit of the card to the player.
	 * 
	 * @return The points the card is worth.
	 */
	public static int drawCard() {
		int points; // to hold the point-value of the card
		int suitCode;// , faceCardCode;
		String suit; // to hold the suit of the card

		Random rand = new Random(); // create a random object to genearate a
									// random number
		points = rand.nextInt(13) + 1; // generate a random card-number

		suitCode = rand.nextInt(4); // generate a random suit

		switch (suitCode) // set the random number representing a suit as a
							// String
		{
		case 0:
			suit = "hearts";
			break;
		case 1:
			suit = "clubs";
			break;
		case 2:
			suit = "diamonds";
			break;
		case 3:
			suit = "spades";
			break;
		default: // the compiler doesn't know that suit was for sure
					// initialized. So, although this default should never be
					// used, it is here for the compiler.
			suit = "Error";
		}
		if (points > 10)// J,Q,K, are all worth 10 points
		{
			switch (points) // name the numbers above 10
			{
			case 11:
				JOptionPane.showMessageDialog(null, "The card picked is a J "
						+ suit + ".");
				break;
			case 12:
				JOptionPane.showMessageDialog(null, "The card picked is a Q "
						+ suit + ".");
				break;
			case 13:
				JOptionPane.showMessageDialog(null, "The card picked is a K "
						+ suit + ".");
			}
			points = 10;
		} else if (points == 1)
			JOptionPane.showMessageDialog(null, "The card picked is a A "
					+ suit + "."); // the card worth 1 point is called an Ace
		else
			JOptionPane.showMessageDialog(null, "The card picked is a "
					+ points + " " + suit + ".");

		return points; // return the points of the card to main
	}

	/**
	 * This method will display the computer's logic.
	 * 
	 * @param player2points
	 *            The total points of the player.
	 * @return The new total points of the player.
	 */
	public static int computerLogic(int player2points) {
		int points;

		if (player2points < 15)// the computer will only draw again if it has
								// less than 15 points
		{
			JOptionPane.showMessageDialog(null,
					"The computer will now draw a card.");
			points = drawCard(); // calls the drawCard method.
			player2points += points; // recalculate the computer's points
			JOptionPane.showMessageDialog(null, "The computer now has "
					+ player2points + " points.");
		} else
			JOptionPane.showMessageDialog(null,
					"The computer will no longer draw cards.");
		return player2points;
	}

	/**
	 * This method will calculate if the player can draw again and then give him
	 * the option.
	 * 
	 * @param player1Points
	 *            The player's total points
	 * @return The answer to whether or not the user would like to draw another
	 *         card
	 */
	public static String drawAgain(int player1Points) {
		String draw = "n";
		if (player1Points >= 21)// the player can only draw again if he has less
								// than 21 points
			JOptionPane
					.showMessageDialog(null,
							"You've reached the maximum! You may no longer draw cards.");
		else
			draw = JOptionPane
					.showInputDialog("Would you like to draw another card? y=yes, press any key to freeze");

		return draw;
	}

	/**
	 * This method will define the winner and diplay the winner to the user.
	 * 
	 * @param player1Points
	 *            The total points of the player
	 * @param player2points
	 *            The total points of the computer
	 */
	public static void winner(int player1Points, int player2points) {
		if (player1Points > 21 && player2points > 21)
			JOptionPane.showMessageDialog(null,
					"Sorry, there is no winner to this game.");
		else if (player1Points == player2points)
			JOptionPane.showMessageDialog(null,
					"The game is a tie. You and the computer both win!");
		else if (player1Points == 21)
			JOptionPane.showMessageDialog(null, "You won! Great Job!");
		else if (player2points == 21 || player1Points > 21)
			JOptionPane.showMessageDialog(null,
					"Sorry, the computer won this game.");
		else if (player2points > 21 || player1Points > player2points)
			JOptionPane.showMessageDialog(null, "You won! Great Job!");
		else
			JOptionPane.showMessageDialog(null,
					"Sorry, the computer won this game.");

	}

}