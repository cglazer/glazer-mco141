package circuitBoardProfit;

// Chayala Glazer
import javax.swing.JOptionPane; // importing ability to use dialog boxes

public class CircuitBoardProfit {
	public static void main(String[] args) {
		String inputString; // to read the numerical input
		double retailPrice; // retail price of a circuit board
		double profit; // profit is 40% of the retail price

		// find out the retail price
		inputString = JOptionPane
				.showInputDialog("What is the retail price of a circuit board? ");

		// convert the input to a type double
		retailPrice = Double.parseDouble(inputString);

		// calculate the profit
		profit = retailPrice * 0.4;

		// display the results
		JOptionPane.showMessageDialog(null,
				"The profit for a circuit board costing $" + retailPrice
						+ " is $" + profit + " per circuit board.");

		// End the program.
		System.exit(0);
	}
}