package com.abstraction;

public class PartTimeEmployee implements Employee{
	 public void calculateSalary() {
	        int hours = 20;
	        int rate = 500;
	        int salary = hours * rate;
	        System.out.println("Part Time Salary: " + salary);
	    }
}
