//*********************************************************************************************
//
//	VowelCounter.java					Author: Mike Piekarz
//
//	Lab: # 3						Exercise: #3
//
// 	Prompt user to enter a string.  Provide user the count of each lowercase vowel and non-vowel 
//  characters. 
// 		
//*********************************************************************************************

//-----------------------------------------------------------------------------------------
// Exercise 3
//   Design and implement an application that reads a string from the user and then determines and
//   prints how many of each lowercase vowel (a, e, i, o, and u) appear in the entire string. Have a
//   separate counter for each vowel. Also count and print the number of non-vowel characters. Call
//   this VowelCounter.java
//-----------------------------------------------------------------------------------------


// Import the Scanner from the Java.util package
import java.util.Scanner;

public class VowelCounter {
		
	public static void main(String[] args) {
		
		// Declare variables
		String userInput;
		int aLowerCase = 0, eLowerCase = 0, iLowerCase = 0, oLowerCase = 0, uLowerCase = 0; 
		int upperCase = 0;
		char letter;
		int nonVowel = 0;
		Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter a word or a sentence
		System.out.print("Enter a word or a sentance and I will provide a count of each lowercase vowel and the total count of non-vowel characters in return: ");
		
		// Read user input and initialize the userInput variable
		userInput = scan.nextLine();
		
		//Remove white space to ensure blanks are not being accounted within the total for non-vowel characters
		userInput = userInput.replaceAll("\\s","");
		
				
		//	Loop through user's input and sum each lowercase vowel
		for (int count = 0; count < userInput.length(); count = count +1) {
			letter = userInput.charAt(count);
			if (letter == 'a')
					aLowerCase += 1;
			else if  (letter == 'e')
					eLowerCase += 1;
			else if  (letter == 'i')
				iLowerCase += 1;
			else if  (letter == 'o')
				oLowerCase = 1;
			else if  (letter == 'u')
				uLowerCase += 1;
			else if (letter == 'A'|| letter == 'E'||letter == 'I'||letter == 'O'||letter == 'U')
				upperCase +=1;
			else 
				nonVowel = nonVowel +1;
		}
		
		// Close scanner
		scan.close();
		
		// Provide user count of each lowecase vowel and total count of non-vowel characters		
		System.out.println("\nLowercase Vowel Count: \na = " + aLowerCase + "\ne = " + eLowerCase + "\ni = " + iLowerCase + "\no = " + oLowerCase + "\nu = " + uLowerCase 
					+ " \nNon-vowel count = " + nonVowel);
		
	
	}
}
		
	
	