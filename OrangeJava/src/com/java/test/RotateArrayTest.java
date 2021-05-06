package com.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.java.groom.array.FindInRotatedArray;

public class RotateArrayTest {

	FindInRotatedArray arrayTest;

	@Before
	public void setUp() throws Exception {
		arrayTest = new FindInRotatedArray();
	}

	@Test
	public void test() {
		int[] input = new int[] { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4 };
		assertEquals(arrayTest.search(input, 4), 9);
		assertEquals(arrayTest.search(input, 100), -1);
		assertEquals(arrayTest.search(input, 10), 5);
		assertEquals(arrayTest.search(input, 1), 6);
		assertEquals(arrayTest.search(input, 5), 0);
	}

}
