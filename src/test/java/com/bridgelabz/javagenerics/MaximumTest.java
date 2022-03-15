package com.bridgelabz.javagenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

	@Test
	// Test Case for the Integer where max_Value at First Position
	public void integerAtFirstPosition() {
		MaximumLogic log = new MaximumLogic();
		int actualResult = log.findMax(16, 15, 10);
		System.out.println("First Position is: " + actualResult);
		int expectedResult = 16;
		Assert.assertEquals(expectedResult, actualResult);
	}

	@Test
	// Test Case for the Integer where max_Value at second Position
	public void integerAtSecondPosition() {
		MaximumLogic log = new MaximumLogic();
		int actualResult = log.findMax(10, 15, 11);
		System.out.println("Second Position is: " + actualResult);
		int expectedResult = 15;
		Assert.assertEquals(expectedResult, actualResult);
	}
}
