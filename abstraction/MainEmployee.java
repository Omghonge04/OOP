package com.abstraction;

public class MainEmployee {
	public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        
        e1.calculateSalary();
        e2.calculateSalary();
    }
}
