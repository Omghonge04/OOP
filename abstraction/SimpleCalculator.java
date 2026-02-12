package com.abstraction;

public class SimpleCalculator implements Calculator {
	@Override
    public void add(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void subtract(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void multiply(double a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void divide(double a, double b) {
        
            System.out.println("Division: " + (a / b));
        }
    

    }

