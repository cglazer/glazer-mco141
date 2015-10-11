package stocks;

//Chayala Glazer

public class Stocks {
	public static void main(String[] args) {
		double share = 31.64; // paid per share
		int sharesPurchased = 1200; // number of shares purchased
		double stockCost; // cost of the stock in total
		stockCost = share * sharesPurchased;

		System.out.println("Aviva paid $" + stockCost + " for the stock.");

		double commission = .02; // Aviva paid 2% commission to her broker
		double commissionTotal; // commission Aviva paid for the stock to her
								// broker
		commissionTotal = commission * stockCost;

		System.out.println("Aviva paid $" + commissionTotal
				+ " commission to her broker when she bought the stock.");

		int sold = 1200; // number of shares sold
		double sharePrice = 32.69; // price Aviva sold each share for
		double stockIncome; // amount that Aviva sold the stock for
		stockIncome = sold * sharePrice;

		System.out.println("Aviva sold the stock for $" + stockIncome + ".");

		commission = .02; // Aviva paid 2% commission to her broker for the
							// amount she recieved for the stock
		double salesCommission; // Amount of commission Aviva paid to her broker
								// for selling the stock
		salesCommission = commission * stockIncome;

		System.out.println("Aviva paid $" + salesCommission
				+ " to her broker when she sold her stock.");

		double totalExpenses; // including commission, the amount Aviva spent
								// buying her stock
		totalExpenses = stockCost + commissionTotal;
		double totalIncome; // After paying commision, the amount Aviva kept as
							// profit after selling her stock
		totalIncome = stockIncome - salesCommission;
		double outcome; // Aviva's loss after buying and selling the stock and
						// paying her broker both times
		outcome = totalExpenses - totalIncome;

		System.out
				.println("Aviva lost $"
						+ outcome
						+ " after buying and selling her stock and paying her broker both times.");
	}
}