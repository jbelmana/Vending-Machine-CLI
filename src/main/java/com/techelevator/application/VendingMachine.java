package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine {
    public void run() {
        while (true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();
            System.out.println(choice);

            if (choice.equals("d")) {
                System.out.println("You Pressed d");
                UserOutput.displayItemScreen();
                //System.out.println(Inventory.get); //display inventory
            } else if (choice.equals("p")) {
                System.out.println("You Pressed p");
                UserOutput.displayPurchaseScreen();
            } else if (choice.equals("e")) {
                //BigDecimal currentBalance = money.getBalance();
                System.out.println("You Pressed e");
                System.out.println("Good bye");
                System.exit(0);
            } else {
                System.out.println("You Pressed the wrong thing");

            }
           /* if(choice.equals("display")) {
                // display the items
            }
            else if(choice.equals("purchase")) {
                // make a purchase

            }
            else if(choice.equals("exit")) {
                // good bye
                System.out.println("Good bye");
                System.exit(0);
                break;
            }*/
        }
    }
}
