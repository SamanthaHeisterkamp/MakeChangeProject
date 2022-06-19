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
		sc.close();

		if (itemPrice < customerPay) {
			custChange = customerPay - itemPrice;
			System.out.println("Your change is: ");
			cashRegister(custChange);
		}

		if (itemPrice > customerPay) {
			System.out.println("Please provide the appropriate amount.");
			owe = itemPrice - customerPay;
			customerOwe(owe);
		}

		else if (itemPrice == customerPay) {
			exactAmount();
		}

	}

	public static void cashRegister(double custChange) {

		if (custChange >= 100) {
			int changeHundred = (int) (custChange / 100);
			System.out.println(changeHundred + " Hundred dollar bills.");
		}
			custChange = custChange % 100;
		if (custChange >= 50) {
			int changeFifty = (int) (custChange / 50);
			System.out.println(changeFifty + " Fifty dollar bills.");
		}
			custChange = custChange % 50;
			if (custChange >= 20) {
				int changeTwenty = (int) (custChange / 20);
				System.out.println(changeTwenty + " Twenty dollar bills.");
		}
			custChange = custChange % 20;
			if (custChange >= 10) {
				int changeTen = (int) (custChange / 10);
				System.out.println(changeTen + " Ten dollar bills.");
			}
			custChange = custChange % 10;
			if (custChange >= 5) {
				int changeFive = (int) (custChange / 5);
				System.out.println(changeFive + " Five dollar bills.");
			}
			custChange = custChange % 5;
			if (custChange >= 1) {
				int changeOne = (int) (custChange / 1);
				System.out.println(changeOne + " One dollar bills.");
			}
			custChange = custChange % 1;
			if (custChange >= .25) {
				int changeQuarter = (int)(custChange / .25);
				System.out.println(changeQuarter + " Quarters.");
			}
			custChange = (custChange % .25);
			if (custChange >= .10) {
				int changeDime = (int) (custChange / .10);
				System.out.println(changeDime + " Dimes");
				custChange = custChange % .10;
			}
			if (custChange >= .05) {
				int changeNickel = (int) (custChange / .05);
				System.out.println(changeNickel + " Nickels.");
				custChange = custChange % .05;
			}
			if (custChange >= .01) {
				custChange += 0.005;
				int changePenny = (int) (custChange / .01);
				System.out.println(changePenny + " Pennies.");
				custChange = custChange % .01;
			}
		}


	

	public static void exactAmount() {
		System.out.println("Thank you for providing the exact amount!");
	}

	public static void customerOwe(double y) {
		System.err.print("You owe " + y);
		
	}
//		Display an appropriate message if the customer provided
//		too little money or the exact amount.

	// If the amount tendered is more than the cost of the
	// item, display the number of bills and coins that
	// should be given to the customer.
}
