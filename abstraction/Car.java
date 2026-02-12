package com.abstraction;

public class Car implements Vehicle {
	@Override
   public void start() {
       System.out.println("Car is starting with a key or push button.");
   }

   @Override
   public void stop() {
       System.out.println("Car is stopping by applying brakes.");
   }
}
