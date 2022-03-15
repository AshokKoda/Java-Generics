package com.javagenerics;

import org.junit.Test;

public class MaximumTest {

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

		String s1 = "hello";
		String s2 = "How";
		String s3 = "are you?";
		System.out.println(logic.findMax(s1, s2, s3));
		System.out.println("-----------------------------");
		
		Employee e1 = new Employee("a", 10000);
		Employee e2 = new Employee("b", 50000);
		Employee e3 = new Employee("c", 30000);
		System.out.println(logic.findMax(e1, e2, e3));
	}
}
