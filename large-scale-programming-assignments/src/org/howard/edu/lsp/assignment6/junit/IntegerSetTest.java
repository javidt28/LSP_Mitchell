package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

	IntegerSet testSet1 = new IntegerSet();
	IntegerSet testSet2 = new IntegerSet();
	IntegerSet testSet3 = new IntegerSet();

	@Test
	@DisplayName("Test case for clear on an empty integer set")
	public void testClear() {
		testSet1.clear();
		assertTrue(testSet1.length() == 0);
	}
	
	@Test
	@DisplayName("Test case for clear method")
	public void testClear2() {
		testSet1.add(0);
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.clear();
		assertTrue(testSet1.length() == 0);
	}
	
	
	@Test
	@DisplayName("Test case for length on an empty integer set")
	public void testlength() {
		int setLength = testSet1.length();
		assertTrue(setLength == 0);
	}
	
	
	@Test
	@DisplayName("Test case for length on integer set")
	public void testlength2() {
		testSet1.add(0);
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		int setLength = testSet1.length();
		assertTrue(setLength == 4);
	}

	@Test
	@DisplayName("Test Case for isEmpty Method")
	public void testEmpty1() {
		testSet1.add(0);
		assertFalse(testSet1.isEmpty());
	}

	@Test
	@DisplayName("Test Case for isEmpty Method on empty integerSet")
	public void testEmpty2() {
		assertTrue(testSet1.isEmpty());
	}
	

	@Test
	@DisplayName("Test Case for isEmpty Method after clearing integerSet")
	public void testEmpty3() {
		testSet1.add(4);
		testSet1.clear();
		assertTrue(testSet1.isEmpty());
	}
	
	@Test
	@DisplayName("Test Case for Equal Method on two equal integerSets")
	public void testEqual1() {
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		
		testSet2.add(1);
		testSet2.add(3);
		testSet2.add(3);
		testSet2.add(4);
		testSet2.add(5);;
		
		assertTrue(testSet1.equals(testSet2));
	};
	
	@Test
	@DisplayName("Test Case for Equal Method on two unequal integerSets")
	public void testEqual2() {
		testSet1.add(0);
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		
		testSet2.add(0);
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		
		assertFalse(testSet1.equals(testSet2));
	};
	
	@Test
	@DisplayName("Test Case for Equal Method on two integerSets of unequal length")
	public void testEqual3() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(4);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		
		assertTrue(testSet1.equals(testSet2));
	};
	
	@Test
	@DisplayName("Test Case for if the set contains the value")
	public void testContains() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		assertTrue(testSet1.contains(3));

	}
			
	@Test
	@DisplayName("Test Case for if the value is not in the set")
	public void testContains2() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		assertFalse(testSet1.contains(9));

	}
	
}

