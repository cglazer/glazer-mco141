package fileNumbers;

// Chayala Glazer

import java.util.Scanner;
import java.io.*; //to use the File I/O method

public class FileNumbers {
	// we will be using the file I/O method to read/write data to a file
	public static void main(String[] args) throws IOException {
		// open the file
		File file = new File("Numbers.txt");
		Scanner inputFile = new Scanner(file);

		// initiate variables
		int sum = 0;
		int count = 0;
		int lowestNumber = inputFile.nextInt();
		int highestNumber = inputFile.nextInt();

		// read the file
		while (inputFile.hasNext()) {
			// read each value
			int number = inputFile.nextInt();
			// calculate the sum of all numbers
			sum += number;
			// count how many numbers there were in the list
			count++;
			// to find the lowest/highest numbers from the list
			if (number < lowestNumber)
				lowestNumber = number;
			if (number > highestNumber)
				highestNumber = number;
		}
		// calculate the average as a whole number for nice output
		int average = sum / count;

		// display the average, highest number, and the smallest number
		System.out.println("The average is " + average);
		System.out.println("The largest number is " + highestNumber);
		System.out.println("The smallest number is " + lowestNumber);

		// write the output to a file
		PrintWriter outputFile = new PrintWriter("OutputFile.txt");
		outputFile.println("The average of the numbers on the list is "
				+ average);
		outputFile.println("The largest number is " + highestNumber);
		outputFile.println("The smallest number is " + lowestNumber);

		// close the files
		inputFile.close();
		outputFile.close();
	}
}
