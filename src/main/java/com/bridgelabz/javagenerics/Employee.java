package com.bridgelabz.javagenerics;

public class Employee implements Comparable<Employee> {

	String name;
	double salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		return (int) (this.salary - emp.salary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
