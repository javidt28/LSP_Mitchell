package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
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
	
	@Test
	@DisplayName("Test Case for if the set contains the value")
	public void testLargest() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		assertTrue(testSet1.contains(3));

	}
	
	@Test
	@DisplayName("Test Case for Largest Method")
	public void testLargestMethod1() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		int largest_num = 0;
		
		try {
			largest_num = testSet1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest_num == 5);
	};
	
	@Test
	@DisplayName("Test Case for Largest Method with equal numbers in integerSet")
	public void testLargest2() {
		testSet1.add(1);
		testSet1.add(1);

		int largest_num = 0;
		
		try {
			largest_num = testSet1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest_num == 1);
	};
	
	@Test
	@DisplayName("Test Case for Largest Method with negative numbers")
	public void testLargest3() {
		testSet1.add(-1);
		testSet1.add(-6);

		int largest_num = 0;
		
		try {
			largest_num = testSet1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}

		assertTrue(largest_num == 0);
	};
	
	@Test
	@DisplayName("Test Case for Largest Method on empty integerSet")
	public void testLargest4() {
		int largest_num = 0;
		
		try {
			largest_num = testSet1.largest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest_num == 0);
	};
	
	@Test
	@DisplayName("Test Case for Smallest Method")
	public void testSmallest1() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		int smallest_num = 0;
		
		try {
			smallest_num = testSet1.smallest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		
		assertTrue(smallest_num == 1);
	};
	
	@Test
	@DisplayName("Test Case for Smallest Method with equal numbers in integerSet")
	public void testSmallest2() {
		testSet1.add(5);
		testSet1.add(5);
		int smallest_num = 0;
		
		try {
			smallest_num = testSet1.smallest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(smallest_num == 5);
	};
	
	@Test
	@DisplayName("Test Case for Smallest Method with negative numbers")
	public void testSmallest3() {
		testSet1.add(-4);
		testSet1.add(-5);
		int smallest_num = 0;
		
		try {
			smallest_num = testSet1.smallest();
		}
		catch (IntegerSetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(smallest_num == -5);
	};
	
	@Test
	@DisplayName("Test Case for Add Method")
	public void testAdd1() {
		testSet1.add(2);
		assertFalse(testSet1.isEmpty());
	};
	
	@Test
	@DisplayName("Test Case for add with String instead of integer")
	public void testAdd2() {
		testSet1.add('s');
		assertFalse(testSet1.isEmpty());
	};
	
	@Test
	@DisplayName("Test Case for Remove Method")
	public void testRemove() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		testSet2.add(5);
		
		testSet2.remove(5);
		
		
		assertFalse(testSet1.equals(testSet2));
	};
	
	@Test
	@DisplayName("Test Case for Remove duplicates")
	public void testRemove2() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		testSet2.add(4);
		testSet2.add(4);
		
		testSet2.remove(4);
		
		
		assertTrue(testSet1.equals(testSet2));
	};
	
	@Test
	@DisplayName("Test Case for Removeing a number not in integerSet")
	public void testRemove3() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		
		testSet2.add(1);
		testSet2.add(2);
		testSet2.add(3);
		
		testSet2.remove(6);
		
		
		assertTrue(testSet1.equals(testSet2));
	};
	
	@Test
	@DisplayName("Test Case 1 for Union Method")
	public void testUnion1() {
		testSet1.add(9);
		testSet1.add(3);
		testSet1.add(5);
		testSet1.add(4);
		
		testSet2.add(9);
		testSet2.add(3);
		testSet2.add(12);
		testSet2.add(34);
		
		testSet1.union(testSet2);
		
		testSet3.add(9);
		testSet3.add(3);
		testSet3.add(5);
		testSet3.add(4);
		testSet3.add(12);
		testSet3.add(34);
		
		assertTrue(testSet1.equals(testSet3));
	};
	
	@Test
	@DisplayName("Test Case 2 for Union Method with two equal integerSets")
	public void testUnion2() {
		testSet1.add(5);
		testSet1.add(4);
		
		testSet2.add(5);
		testSet2.add(4);
		
		testSet1.union(testSet2);
		
		testSet3.add(5);
		testSet3.add(4);

		assertTrue(testSet1.equals(testSet3));
	};
	
	@Test
	@DisplayName("Test Case for Union Method with an empty and a non empty integerSet")
	public void testUnion3() {
		testSet1.add(5);
		testSet1.add(4);
		
		testSet1.union(testSet2);
		
		testSet3.add(5);
		testSet3.add(4);

		assertTrue(testSet1.equals(testSet3));
	};
	
	
	
	@Test
	@DisplayName("Test Case for Intersect Method")
	public void testIntersect() {
		testSet1.add(9);
		testSet1.add(3);
		testSet1.add(5);
		testSet1.add(4);
		
		
		testSet2.add(9);
		testSet2.add(3);
		testSet2.add(12);
		testSet2.add(34);
		
		testSet1.intersect(testSet2);
		
		testSet3.add(9);
		testSet3.add(3);
		
		assertTrue(testSet1.equals(testSet3));
	};
	
	@Test
	@DisplayName("Test Case for Intersect Method between two integerSets with no intersection")
	public void testIntersect2() {
		testSet1.add(5);
		testSet1.add(4);
		
		
		testSet2.add(12);
		testSet2.add(34);
		
		testSet1.intersect(testSet2);
		
		assertTrue(testSet1.equals(testSet3));
	};
	
	@Test
	@DisplayName("Test Case for Difference Method")
	public void testDiff() {
		testSet1.add(9);
		testSet1.add(3);
		testSet1.add(5);
		testSet1.add(4);
		
		
		testSet2.add(9);
		testSet2.add(3);
		testSet2.add(12);
		testSet2.add(34);
		
		testSet1.diff(testSet2);
		
		testSet3.add(5);
		testSet3.add(4);
		
		assertTrue(testSet1.equals(testSet3));
	};
	
	@Test
	@DisplayName("Test Case for Difference Method on integerSets with no common integers")
	public void testDiff2() {
		testSet1.add(9);
		testSet1.add(3);
		testSet1.add(5);
		testSet1.add(4);
		
		
		testSet2.add(12);
		testSet2.add(34);
		
		testSet1.diff(testSet2);
		
		testSet3.add(9);
		testSet3.add(3);
		testSet3.add(5);
		testSet3.add(4);
		
		assertTrue(testSet1.equals(testSet3));
	};
	
	@Test
	@DisplayName("Test Case for toString Method")
	public void testString1() {
		testSet1.add(9);
		testSet1.add(3);
		testSet1.add(5);
		testSet1.add(4);
		
		String str1 = testSet1.toString();
		String str2 = "[9, 3, 5, 4]";
		
		assertTrue(str1.equals(str2));
	}
	
	@Test
	@DisplayName("Test Case for toString Method on empty integerSet")
	public void testString2() {
		
		String str1 = testSet1.toString();
		String str2 = "[]";
		
		assertTrue(str1.equals(str2));
	}
}

