package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * The class implements a number of methods 
 * to solve the given problem.
 * 
 * @author Javid Mitchell
 *
 */
public class IntegerSet {
	
	/**
	 * Variable used to store the result of the solutions.
	 * Can be accessed from all methods.
	 */
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * The clear method clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};
	
	/**
	 * The length method gets the length of the set
	 * 
	 * @return - integer representing length of set
	 */
	public int length() {
		int set_length = set.size();
		return  set_length;
	};
	
	/**
	 * The equals method determines whether two sets are equal
	 * 
	 * @param b - IntegerSet to be compared
	 * @return - boolean representing whether two sets are equal
	 */
	public boolean equals(IntegerSet b) {
		if (this.length() == b.length()) {
			for (int i = 0; i < set.size(); i++) {
				if (!b.contains(set.get(i))) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * The contains method checks whether a set contains a value
	 * 
	 * @param value - Integer to search for in IntegerSet
	 * @return - boolean representing whether the set contains the value
	 */
	public boolean contains(int value) {
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) == value) {
				return true;
			}
		}
		return false;
	};
	
	/**
	 * The largest method checks for the largest value in the set.
	 * Throws an exception of the set is empty
	 * 
	 * @return - integer value representing the largest value in the set.
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException{
		if(set.size() == 0){
			throw new IntegerSetException("IntegerSet is empty!");
		}
		int max_val = 0;
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) >= max_val) {
				max_val = set.get(i);
			}
		}
		return max_val;
	};
	
	
	/**
	 * The smallest method checks for the smallest value in the set.
	 * Throws an exception of the set is empty
	 * 
	 * @return - integer value representing the smallest value in the set.
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException{
		if(set.size() == 0){
			throw new IntegerSetException("IntegerSet is empty!");
		}
		int min_val = set.get(0);
		for (int i = 1; i < set.size(); i++) {
			if (set.get(i) <= min_val) {
				min_val = set.get(i);
			}
		}
		return min_val;
	};
	
	
	/**
	 * The add method adds integer values to the set.
	 * 
	 * @param item - integer value to add to the set
	 */
	public void add(int item) {
		if (!this.contains(item)) {
			set.add(item);
		}
	};
	
	
	/**
	 * The add method adds integer values to the set.
	 * 
	 * @param item - integer value to be added to set.
	 */
	public void remove(int item) {
		if (this.contains(item)) {
			set.removeAll(Arrays.asList(item));
		}
	};
	
	
	/**
	 * The union method finds the union of two sets.
	 * 
	 * @param intSetb - IntegerSet to union with.
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> set_b = intSetb.getAllElements();
		
		
		for (int i = 0; i < set_b.size(); i++) {
			if (!this.contains(set_b.get(i))) {
				this.add(set_b.get(i));
			}
		}
		
	};
	
	
	/**
	 * The intersect method finds the intersection of two sets.
	 * 
	 * @param intSetb - IntegerSet to intersect with.
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> set_b = intSetb.getAllElements();
		List<Integer> new_set = new ArrayList<Integer>();
		
		for (int i = 0; i < set_b.size(); i++) {
			if (this.contains(set_b.get(i))) {
				new_set.add(set_b.get(i));
			}
		}
		set = new_set;
	};
	
	
	/**
	 * The method finds the difference between two sets.
	 * 
	 * @param intSetb - IntegerSet to do difference with.
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> set_b = intSetb.getAllElements();
		set.removeAll(set_b);
	};
	
	
	/**
	 * The isEmpty method checks whether the set is empty or not
	 * 
	 * @return - boolean value representing whether the set is empty or not
	 */
	public boolean isEmpty() {
		if (this.length() == 0) {
			return true;
		}
		return false;
	};
	
	
	/**
	 * The toString method converts the set to a String value
	 * 
	 * @return - String representing the set
	 */
	public String toString() {
		String printedList = set.toString();
		return printedList;
	};
	
	/**
	 * The getAllElements method gets all the elements in the IntegerSet and places them into an array
	 * 
	 * @return - List representing the IntegerSet
	 */
	public List<Integer> getAllElements(){
		return set;
	};

}