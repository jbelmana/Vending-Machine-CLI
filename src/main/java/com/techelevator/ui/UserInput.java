package com.techelevator.ui;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("option = " + option);
        if (option.equals("d")) {
   //         System.out.println(Inventory.get); //display inventory
        } else if (option.equals("p")) {

            } else if(purchaseMenuInput.equalsIgnoreCase("S")) {
     //           BigDecimal currentBalance = money.getBalance();

            }


        } else if (option.equals("e")) {
            return "exit";
        } else {
            return "";
        }


        return selectedOption;
    }

}


