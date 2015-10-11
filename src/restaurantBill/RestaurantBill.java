package restaurantBill;

//Chayala Glazer
import java.util.Scanner; //Needed for the Scanner class

public class RestaurantBill {
	public static void main(String[] args) {
		// Create a scanner object to read the user's input
		Scanner input = new Scanner(System.in);

		// find out how much the user paid for his meal
		double charge; // to hold the charge of the meal which may be include a
						// decimal
		System.out.print("What is the charge for your meal? ");
		charge = input.nextDouble();

		// display the information back to the user
		System.out.println("The charge for your meal is $" + charge + ".");

		double tax; // the cost of tax for the meal
		tax = charge * .0675; // tax is 6.75% of the meal charge
		System.out.println("The tax for your meal is $" + tax + ".");

		double taxTotal; // the cost of the meal with tax
		taxTotal = charge + tax; // total of the charge of the meal with tax

		double tip; // cost of the tip is 15% of the charge of the meal
					// including tax
		tip = taxTotal * .15;
		System.out.println("The tip charge for your meal is $" + tip + ".");

		double bill; // total bill includes meal charge, tax, and tip.
		bill = taxTotal + tip;
		System.out.println("Your total bill is $" + bill + ".");
		input.close();
	}
}
