package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// In the cash register we will calculate the amount of change
		// tendered. We will also notify the attendant how many of each piece
		// of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed
		// to make the change for the customer. Change should be provided
		// using the largest bill and coin denominations as possible.
		// Denominations that are not used should not be displayed.
		// The user is prompted asking for the price of the item.
		double itemPrice = 0;
		double customerPay = 0;
		double custChange = 0;
		double owe = 0;
		System.out.println("Please enter the price of the item: ");
		itemPrice = sc.nextDouble();

		// The user is then prompted asking how much money was
		// tendered by the customer.
		System.out.println("How much did the customer pay with?");
		customerPay = sc.nextDouble();

		if (itemPrice < customerPay)
			custChange = customerPay - itemPrice;
		System.out.println("Your change is: $" + custChange);
		cashRegister(custChange);
		System.out.println("Your exact change is ");
		if (itemPrice == customerPay)
			exactAmount();
		if (itemPrice > customerPay)
			System.out.println("Please provide the appropriate amount.");
		owe = itemPrice - customerPay;
		System.out.println("You owe " + owe);

	}

	public static void cashRegister(double custChange) {
		System.out.println("you are in the register" + custChange);

	}
	public static void exactAmount() {
	System.out.println("Thank you for providing the exact amount!");

//		Display an appropriate message if the customer provided
//		too little money or the exact amount.

	// If the amount tendered is more than the cost of the
	// item, display the number of bills and coins that
	// should be given to the customer.
}
}