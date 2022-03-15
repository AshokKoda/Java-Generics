package com.bridgelabz.javagenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

	@Test
	// Test Case for the Integer where max_Value at First Position
	public void integerAtFirstPosition() {
		Logic log = new Logic();
		int actualResult = log.findMax(16, 15, 10);
		System.out.println("First Position is: " + actualResult);
		int expectedResult = 16;
		Assert.assertEquals(expectedResult, actualResult);
	}
}
