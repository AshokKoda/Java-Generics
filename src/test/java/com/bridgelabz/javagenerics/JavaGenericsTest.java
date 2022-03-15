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
	}
}
