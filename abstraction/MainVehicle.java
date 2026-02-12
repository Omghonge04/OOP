package com.abstraction;

public class MainVehicle {
   public static void main(String[] args) {
	 Car c = new Car();
	 Bike b = new Bike();
	 
	 c.start();
	 c.stop();
	 
	 System.out.println();
	 
	 b.start();
	 b.stop();
}
}
