package com.multipleinheritance;

public class MainBank {
 public static void main(String[] args) {
	 BankService bank = new BankService();

     bank.applyLoan();
     bank.applyInsurance();
     
}
}
