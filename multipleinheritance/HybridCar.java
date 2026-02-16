package com.multipleinheritance;

public class HybridCar implements ElectricVehicle , FuelVehicle {
	
	public void chargeBattery() {
      System.out.println("Charging the battery of the hybrid car...");
  }
   
	@Override
	 public void fillFuel() {
        System.out.println("Filling fuel in the hybrid car...");
    }

}
