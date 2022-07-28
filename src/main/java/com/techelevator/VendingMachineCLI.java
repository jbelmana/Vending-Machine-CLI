package com.techelevator;


import com.techelevator.application.VendingMachine;

import java.util.Scanner;

public class VendingMachineCLI {

	public static void main(String[] args) {
		//command line interface

		VendingMachine vendingMachine = new VendingMachine();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Taste Elevator vending machine!");
		System.out.println("Please select one of the following options: ");
		System.out.println("(D) Display Vending Items");
		System.out.println("(P) Purchase");
		System.out.println("(E) Exit");
		String mainOption = scanner.nextLine();

		vendingMachine.run();
	}
}
