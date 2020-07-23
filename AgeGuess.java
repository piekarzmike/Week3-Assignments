//*********************************************************************************************
//
//	AgeGuess.java					Author: Mike Piekarz
//
//	Lab: # 3						Exercise: #1
//
// 	Prompt user to enter an age guess and compare to a pseudo-random number.
//  Prompt user to guess again if guess does not match.
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
//	Exercise 1
//	  In the AgeGuess.java program from the previous lab, insert a while loop so that the user
//	  has to keep guessing the age until he or she gets it right.	
//-----------------------------------------------------------------------------------------


// Import the Scanner and Random class from the Java.util package
import java.util.Scanner;
import java.util.Random;

public class AgeGuess {
	
	public static void main(String[] args) {
		
		// Declare variables 
		int age;
		int ageGuess;
		Random randomNum = new Random();
		Scanner scan = new Scanner(System.in);

		// Initialize age Variable to a random number between 0 to 100
		age = randomNum.nextInt(101);

		// Prompt user to input their age guess
		System.out.print("Take a guess at my age and enter your guess here (Hint - age is between 0 & 100): ");

		// Read user's input and initialize the ageGuess variable
		ageGuess = scan.nextInt();

		// Check to ensure user's input is within 0 & 100
		if (ageGuess < 0 || ageGuess > 100){
			System.out.println("\nSomeone did not pay attention to the hint.  Please, try again and remember your guess must be between 0 & 100.");
			System.exit(0);
		}

		// Check to see if user guessed wrong. If so, prompt user to guess again and provide a hint if their guess was higher (older) or lower (younger)
		while (ageGuess != age) {
			System.out.println("\nYou guessed wrong please try again!!");  //Prompt user of guess was wrong
			if (ageGuess > age) {
				System.out.print("I will give you a hint... Your age guess of " +ageGuess + " makes me older. Enter new guess here: "); //provide hint to user (older)
			}
			else {
				System.out.print("I will give you a hint... Your age guess of " +ageGuess + " makes me younger. Enter new guess here: "); // provide hint to user (younger)
			}
			ageGuess = scan.nextInt();
		}

		// Check to see if user's age guessed correctly and notify user their guess was correct.
		if (ageGuess == age){
			System.out.println("\nWOW... I am shocked you guessed correctly.  I am " + age + " years old.");
		}

		// Close Scanner
		scan.close();

	}
}
