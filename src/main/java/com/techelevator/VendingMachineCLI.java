package com.techelevator;


import com.techelevator.application.VendingMachine;

public class VendingMachineCLI {

	public static void main(String[] args) {
		//command line interface

		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.run();
	}
}
