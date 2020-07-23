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
	//
	//-----------------------------------------------------------------------------------------
	
public class Box {
	private static int size = 5;

	public static void main(String[] args) {
		// Declare and instantiate a object reference variable boxDrawer
		Box boxDrawer = new Box();

		// Call printbox method
		boxDrawer.printbox(size);
	}


	//-----------------------------------------------------------------------------------------
	// Create printbox method
	//-----------------------------------------------------------------------------------------
	public void printbox(int size) {

		// Declare and initialize the count and rCount variable
		int count = 0 ;
		int rCount = size;

		//  Print * in same line the number of time per the size variable
		while (rCount != 0) {
			while (count<size) {
				System.out.print("*");
				count++;
			}
			// Set print area to a new line and perform this till number of lines equal the size variable
			System.out.println("");
			rCount--;
			count=0;
		}

	}

}
