package com.multipleinheritance;

public class MainPayment {
  public static void main(String[] args) {
	PaymentGateway p = new PaymentGateway();
	p.payUsingUPI();
	p.payUsingCard();
}
}
