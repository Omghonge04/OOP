package com.abstraction;

public class MainCalculator {
    public static void main(String[] args) {
		Calculator c1 = new SimpleCalculator();
		c1.add(3, 6);
		c1.multiply(4, 3);
		c1.subtract(6, 4);
		c1.divide(8, 4);
		
	}
}
