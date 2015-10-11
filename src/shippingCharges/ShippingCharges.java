package shippingCharges;

//Chayala Glazer

import javax.swing.JOptionPane; //needed for JOptionPane

public class ShippingCharges {
	public static void main(String[] args) {
		// This program will display the shipping charges for a package.

		String inputWeight, inputMiles; // variables so the user can input the
										// information
		double weight, miles; // variables to hold the information in numerical
								// form

		inputWeight = JOptionPane
				.showInputDialog("What is the weight of your package in pounds?");
		weight = Double.parseDouble(inputWeight); // to convert to numeric form

		inputMiles = JOptionPane
				.showInputDialog("How many miles does the package need to be shipped?");
		miles = Double.parseDouble(inputMiles); // to convert to numeric form

		double cost, price;// , rate;
		// find out what the weight of the package will cost
		if (weight <= 2)
			cost = 1.1;
		else if (weight <= 6)
			cost = 2.2;
		else if (weight <= 10)
			cost = 3.7;
		else
			cost = 3.8;

		// find out what the amount of shipping miles will add to the cost of
		// the package
		if (miles <= 500)
			price = cost;
		else
			price = (miles % 500 == 0) ? cost * (miles / 500) : cost
					* (miles / 500 - ((miles % 500) / 500) + 1);

		// display the shipping charges
		JOptionPane.showMessageDialog(null, "Your package will cost $" + price
				+ " to ship.");
		System.exit(0);
	}
}