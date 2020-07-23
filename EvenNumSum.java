//*********************************************************************************************
//
//	AgeGues.java					Author: Mike Piekarz
//
//	Lab: # 3						Exercise: #2
//
// 	Prompt user to input a number and compute the sum of all even numbers between 2 and their 
//  inputed number
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 2
//   Design and implement an application that reads an integer value and prints the sum of all even
//   integers between 2 and the input value, inclusive. Print an error message if the input value is
//   less than 2 and have the user reenter the number. Prompt accordingly. Call this EvenNumSum.java
//-----------------------------------------------------------------------------------------


// Import the Scanner and Random class from the Java.util package
import java.util.Scanner;
import java.text.NumberFormat;

public class EvenNumSum {
	

	public static void main(String[] args) {
		
		// Declare variables 
		long num;
		long sum = 0, evenNum = 2;
		Scanner scan = new Scanner(System.in);
		
		// Obtain the number format class to parse numbers with a comma thousand separator 
		NumberFormat numFormat = NumberFormat.getInstance();
		
		// Prompt User to input a number 
		System.out.print("If you enter a number I can provide you the sum of all the even integers including your number (if even): ");
				
		// Read user input and initialize the num variable
		num = scan.nextInt();

		// Check to make sure number inputed is not less than 2.  If so, prompt user to enter a new number.
		while (num < 2){
			System.out.print("\nNo even numbers exits.  Please, enter in a number equal or greater than two. Enter new number here: ");
			num = scan.nextInt();
		}
		
		// Loop through and sum all even integers between two and number inputed by user. 
		while (evenNum <= num) {
			sum = sum + evenNum;
			evenNum = evenNum + 2;
		}	
		
		// Notify user the sum of all the even integers between 2 and their number (including their number if even).
		System.out.println("The sum of all even integers between 2 and " + num + " is: " + numFormat.format(sum) + ".");

		// Close Scanner
		scan.close();		
	}
}
