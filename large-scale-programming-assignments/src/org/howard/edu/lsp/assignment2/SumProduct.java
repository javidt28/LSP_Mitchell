package org.howard.edu.lsp.assignment2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class calculate the sum and product of tokens detected from the user input.
 * @author javid
 *
 */
public class SumProduct {
	/**
	 * This is a method that accepts and processes input lines until the user enters a terminating newline character.
	 * The user input is expected to be a string consisting of digits and space characters. 
	 * Each digit sequence is a token detected by the scanner and is converted into a number. 
	 * The program scans the string and prints the tokens along with the sum and product of those tokens.
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {   
        Boolean endProgram = false; // This will be used as the loop condition
        
        while(!endProgram) { // Loop while endProgram is not true
        	
        	// Initialize variables to store sum & product
        	int sumTotal = 0; 
        	int sumProduct = 1;
        	
        	// Reading input using `Scanner`
    		System.out.println("String?");
			Scanner scanner = new Scanner(System.in);
            String[] tokens = scanner.nextLine().split(" ");
            
            // Check if "Goodbye" is in the tokens array and update endProgram
            endProgram = Arrays.asList(tokens).contains("Goodbye"); 
            if (endProgram) { // if endProgram is true then terminate the program
            	break;
            }
            
            // In this block of code we're iterating through the tokens array calculating the sum, product and printing the tokens.
            System.out.println("Tokens:");
            for (String i : tokens) {
            	System.out.println(i);
            	sumTotal += Integer.parseInt(i);
            	sumProduct *= Integer.parseInt(i);
            	}
                System.out.println("Sum: " +sumTotal);
                System.out.println("Product: " +sumProduct);
            }
        }
}
