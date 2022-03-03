package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer>();
	
	
	// Default Constructor
	public IntegerSet() {
	}

	
	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	};
	
	// Returns the length of the set
	public int length() {
		int setLength = set.size();
				return setLength;
	}; 

	/*
     * Returns true if the 2 sets are equal, false otherwise;
	* Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b) {
		
	}; 


}
