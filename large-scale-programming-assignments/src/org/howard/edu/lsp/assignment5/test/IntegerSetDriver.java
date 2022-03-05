package org.howard.edu.lsp.assignment5.test;


import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;

/**
 * This class is used to instantiate and invoke methods
 * in my implementation of the solution to prove that it works.
 * 
 * @author Javid Mitchell
 *
 */

public class IntegerSetDriver {
	
	
	/**
	 * This main method is used to instantiate the methods
	 * imported from the IntegerSet.java file.
	 * 
	 * Various robust test cases are performed in this method
	 * to test the correctness of the solution.
	 * 
	 * Input cases and output solutions are printed to the screen.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		
		/**
		 * Test Group 1: Custom test case.
		 * Works as expected:
		 * Methods called on IntegerSet 1: Add,isEmpty,Clear,Length
		 */
		System.out.println("TEST GROUP 1");
		IntegerSet test_set1 = new IntegerSet();
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		
		System.out.println("Add method on IntegerSet 1: " + test_set1.toString());
		int set1_length = test_set1.length();
		boolean empty = test_set1.isEmpty();
		System.out.println("Length method on IntegerSet 1: " + set1_length);
		System.out.println("Is empty method on IntegerSet 1: " + empty + "\n");
		
		test_set1.clear();
		System.out.println("Clear method on IntegerSet 1: " + test_set1.toString());
		set1_length = test_set1.length();
		empty = test_set1.isEmpty();
		System.out.println("Length method on IntegerSet 1 after clear: " + set1_length);
		System.out.println("Is empty method on IntegerSet 1 after clear: " + empty + "\n");
		
		test_set1.add(1);
		test_set1.add(2);
		test_set1.add(3);
		test_set1.add(4);
		test_set1.add(5);
		
		System.out.println("################################################################################ \n");
		
		/**
		 * Test Group 2: Custom test case.
		 * Works as predicted:
		 * Methods called on IntegerSet 1: Add, Equals, Remove
		 */
		System.out.println("TEST GROUP 2");
		IntegerSet test_set2 = new IntegerSet();
		test_set2.add(1);
		test_set2.add(2);
		test_set2.add(3);
		test_set2.add(4);
		test_set2.add(5);
		
		System.out.println("IntegerSet 1: " + test_set1.toString());
		System.out.println("Add method on IntegerSet 2: " + test_set2.toString());
		System.out.println("Equals method on IntegerSet 1 and IntegerSet 2: "  + test_set1.equals(test_set2) + "\n");
		
		test_set2.remove(4);
		test_set2.remove(5);
		
		System.out.println("Remove method on IntegerSet 2: " + test_set2.toString());
		System.out.println("Equals method on IntegerSet 1 and IntegerSet 2 after remove: " + test_set1.equals(test_set2) + "\n");
		
		System.out.println("################################################################################ \n");
		
		/**
		 * Test Group 3: Custom test case - Checks for smallest and largest element in empty IntegerSet
		 * Works as predicted:
		 * Methods called on IntegerSet 1: Add, Smallest, Largest, Clear
		 */
		System.out.println("TEST GROUP 3");
		IntegerSet test_set3 = new IntegerSet();
		test_set3.add(1);
		test_set3.add(2);
		test_set3.add(8);
		test_set3.add(7);
		System.out.println("Add method on IntegerSet 3: " + test_set3.toString());
		
		try {
			System.out.println("Smallest method on IntegerSet 3: " + test_set3.smallest());
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Largest method on IntegerSet 3: " + test_set3.largest() + "\n");
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		test_set3.clear();
		System.out.println("Clear method on IntegerSet 3: " + test_set3.toString());
		
		try {
			System.out.println(test_set3.smallest());
		}
		catch (IntegerSetException e) {
			System.out.println("Smallest method on IntegerSet 3 when empty. IntegerSetException: " + e.getMessage());
		}
		
		try {
			System.out.println(test_set3.largest());
		}
		catch (IntegerSetException e) {
			System.out.println("Largest method on IntegerSet 3 when empty. IntegerSetException: " + e.getMessage() + "\n");
		}
		
		
		System.out.println("################################################################################ \n");
		
		
		/**
		 * Test Group 4: Custom test case.
		 * Works as expected:
		 * Methods called on IntegerSet 1: Add, Union, Difference, Intersection
		 */
		System.out.println("TEST GROUP 4");
		IntegerSet test_set4 = new IntegerSet();
		test_set4.add(9);
		test_set4.add(3);
		test_set4.add(5);
		test_set4.add(4);
		System.out.println("Add method on IntegerSet 4: " + test_set4.toString());
		
		IntegerSet test_set5 = new IntegerSet();
		test_set5.add(9);
		test_set5.add(3);
		test_set5.add(12);
		test_set5.add(34);
		System.out.println("Add method on IntegerSet 5: " + test_set5.toString() + "\n");
		
		test_set4.union(test_set5);
		System.out.println("Union method on IntegerSet 4 with IntegerSet 5: " + test_set4.toString());
		
		test_set4.diff(test_set5);
		System.out.println("Difference method on IntegerSet 4 with IntegerSet 5: " + test_set4.toString()+ "\n");
		
		test_set4.add(9);
		test_set4.add(3);
		System.out.println("IntegerSet set back to original: " + test_set4.toString());
		
		test_set4.intersect(test_set5);
		System.out.println("Intersection method on IntegerSet 4 with IntegerSet 5: " + test_set4.toString());
		
		
	};
}
