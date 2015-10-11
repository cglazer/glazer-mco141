package bodyMassIndex;

//Chayala Glazer

import javax.swing.JOptionPane; //needed for JOptionPane

//This program tells a person if he/she is overweight or underweight for his/her height.

public class BodyMassIndex {
	public static void main(String[] args) {
		double weight, height; // variables to hold the person's weight and
								// height

		String inputWeight, inputHeight; // to hold the numerical values as
											// string

		// get the person's weight in pounds
		inputWeight = JOptionPane
				.showInputDialog("What is your weight in pounds?");
		weight = Double.parseDouble(inputWeight);

		// get the person's height in pounds
		inputHeight = JOptionPane
				.showInputDialog("What is your height in inches?");
		height = Double.parseDouble(inputHeight);

		// calculate the person's BMI
		double bmi; // to hold the person's BMI
		bmi = weight * 703 / Math.pow(height, 2.0);

		// categorize and display the BMI to the person as underweight,
		// overweight, or optimal weight
		if (bmi < 18.5)
			JOptionPane.showMessageDialog(null, "You are underweight.");
		else if (bmi <= 25)
			JOptionPane.showMessageDialog(null, "You have an optimal weight.");
		else
			JOptionPane.showMessageDialog(null, "You are overweight");

		System.exit(0);
	}
}