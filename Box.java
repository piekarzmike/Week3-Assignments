//*********************************************************************************************
//
//	AgeGues.java					Author: Mike Piekarz
//
//	Lab: # 3						Exercise: #4
//
// 	Print out to the screen a set of * (star) characters with size rows and size column
// 		
//*********************************************************************************************

	//-----------------------------------------------------------------------------------------
	// Exercise 4
	//	Create a project with a class called Box (w/ main) that contains the following instance variable:
	//		int size = 0;
	//	Then add a method to this class named printBox with no parameters and void return type, that
	//	prints out to the screen a set of * (star) characters with size rows and size columns. Enter code
	//	in the main method to create a Box object, change its size to 5 (using the dot operator), and
	//	then invoke its printBox method. Run the program and fix any errors you may have.
	//-----------------------------------------------------------------------------------------
	
public class Box {
	private static int size = 0;
	
	public static void main(String[] args) {
		// Declare and instantiate a object reference variable called Box1
		Box Box1 = new Box();
		
		// Set the size of the object reference variable Box!
		Box1.size = 5;

		// Call printBox method
		Box1.printBox();
	}
	
	//-----------------------------------------------------------------------------------------
	// Create printBox method
	//-----------------------------------------------------------------------------------------
	public static void printBox() {
		// Declare and initialize the count and rowCount variable
		int colCount = 0 ;
		int rowCount = size;

		//  Print * out in a pattern in accordance with it's size
		while (rowCount != 0) {
			while (colCount < size) {
				System.out.print("*"); //  Print * in same line per the number of times stated in the size variable
				colCount++;
			}
			// Set print area to next line
			System.out.println("");
			rowCount--;
			colCount=0; // Resets count variable to zero
		}
		
	}

}
