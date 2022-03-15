package com.bridgelabz.javagenerics;

import org.junit.Test;

public class JavaGenericsTest {

	@Test
	public void findIntMax() {
		Logic logic = new Logic();
		
		int a = (int) (Math.random() * 1000);
		Integer b = (int) (Math.random() * 1000);
		Integer c = (int) (Math.random() * 1000);
		System.out.println(logic.findMax(a, b, c));
		System.out.println("-----------------------------");
		
		float x = (float) (Math.random() * 1000);
		float y = (float) (Math.random() * 1000);
		float z = (float) (Math.random() * 1000);
		System.out.println(logic.findMax(x, y, z));
		System.out.println("-----------------------------");
	}
}
