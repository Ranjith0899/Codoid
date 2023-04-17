package task.one;

import java.util.Scanner;

public class CustomExceptions extends Exception {

	//custom exception for throwing exception if age is less than 18
	public CustomExceptions(int age){
		if (age<=18) {
		System.err.println("Age Requirement does not meet");
		System.exit(0);
	    }
		else{ System.out.println("You are eligable for Voting");
		}
	}	
	// scanner to get age data from user
	public static Scanner s = new Scanner(System.in);
    public static void main (String[] args ) throws CustomExceptions {
    	// To Indicate user to enter his age
    	System.out.println("Enter Your age");
    	int i = s.nextInt();
		throw new CustomExceptions(i);
    	
	
    }
}
