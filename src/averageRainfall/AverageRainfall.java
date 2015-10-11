package averageRainfall;

//Chayala Glazer

import java.util.Scanner;//to use the scanner class

public class AverageRainfall {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int years;
		System.out
				.println("For how many years would you like to know the average rainfall?");
		years = keyboard.nextInt();

		double rainfall;
		double totalRainfall = 0; // to add the rainfall for each month
		int totalMonths = 0; // to add up how many months

		while (years < 1) // to ensure input validation
		{
			System.out
					.println("Please re-enter for how many years you would like to know the average rainfall. You must enter at least 1.");
			years = keyboard.nextInt();
		}

		for (int year = 1; year <= years; year++) // the outer loop will iterate
													// once per year
		{
			for (int months = 1; months <= 12; months++, totalRainfall += rainfall, totalMonths++)
			// the inner loop will iterate once for every month, 12 times per
			// year
			{
				System.out
						.println("How many inches of rainfall did it rain in year "
								+ year + ", month " + months + "?");
				rainfall = keyboard.nextDouble();
				while (rainfall < 0)// input validation
				{
					System.out
							.println("Error! Please do not input a negative value. How many inches of rainfall did it rain in year "
									+ year + ", month " + months + "?");
					rainfall = keyboard.nextDouble();
				}
			}
		}
		double average;
		average = totalRainfall / totalMonths; // to find the average rainfall
												// per month
		System.out
				.printf("In total, after a period of "
						+ totalMonths
						+ " months of rainfall, it rained %,5.2f inches, an average of %,4.2f inches of rain per month.",
						totalRainfall, average);
		keyboard.close();
	}
}