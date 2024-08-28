package com.coderscampus;
import java.util.Random;
import java.util.Scanner; 
public class RandomNumber {

	
	public static void main(String args[]) {
		
		int numberOfChances = 5;	
		int theRandomNumber;						
			Scanner scan = new Scanner(System.in);
			Random ran = new Random();			
			theRandomNumber = ran.nextInt(100) + 1;	
			System.out.println("Choose a number between 1 and 100:");					
		
					
				
	
		while (numberOfChances > 0) {
			System.out.println("What is your guess?");
			int convertedInput = scan.nextInt();
		
		if (convertedInput < 1 || convertedInput > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			continue;
		}		
		if (convertedInput == theRandomNumber) {
			System.out.println("You guesses the correct number!");
			break;
			
		} else if (convertedInput < theRandomNumber) {
			System.out.println("Sorry, " + convertedInput + " was the wrong number please try higher");		
		} else {
			System.out.println("Sorry, " + convertedInput + " was the wrong number please try lower");	 
		}
		numberOfChances--;
		}
		if (numberOfChances == 0);	
			System.out.println("Sorry, you've run out of chances the correct answer is " + theRandomNumber);							
				
			
			
	scan.close();}		
	}
