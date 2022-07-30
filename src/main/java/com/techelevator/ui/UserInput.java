package com.techelevator.ui;

import com.techelevator.application.Audit;
import com.techelevator.application.Money;
import com.techelevator.item.Item;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

import static com.techelevator.application.Money.balanceString;
import static com.techelevator.application.Money.getBalance;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * <p>
 * Dependencies: None
 */

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("(D) Display Items");
        System.out.println("(P) Purchase");
        System.out.println("(E) Exit");
        System.out.println();
        System.out.print("Please select an option: ");
        String selectedOption = scanner.nextLine();
        return selectedOption;
    }

    public static String getPurchaseScreenOption() {
        System.out.println("(M) Feed Money");
        System.out.println("(S) Select Item");
        System.out.println("(F) Finish Transaction");
        System.out.println();
        System.out.println(balanceString());
        System.out.println("Please select an option: ");
        String selectedOption = scanner.nextLine();
        return selectedOption;
    }


    public static void getMoneyFeederOption() {
        System.out.println("Please input U.S Currency in the amount of $1.00, $5.00, $10.00 and $20.00: ");
        String scan = scanner.nextLine();
        int selectedOption = Integer.parseInt(scan);
        BigDecimal previousBalance = Money.getBalance();
        try {
            if (selectedOption == 1) {
                Money.addMoney(new BigDecimal("1.00"));
                System.out.println(Money.balanceString());
                Audit.timedAudit("FEED MONEY: ", previousBalance, Money.getBalance());
            } else if (selectedOption == 5) {
                Money.addMoney(new BigDecimal("5.00"));
                System.out.println(Money.balanceString());
                Audit.timedAudit("FEED MONEY: ", previousBalance, Money.getBalance());
            } else if (selectedOption == 10) {
                Money.addMoney(new BigDecimal("10.00"));
                System.out.println(Money.balanceString());
                Audit.timedAudit("FEED MONEY: ", previousBalance, Money.getBalance());
            } else if (selectedOption == 20) {
                Money.addMoney(new BigDecimal("20.00"));
                System.out.println(Money.balanceString());
                Audit.timedAudit("FEED MONEY: ", previousBalance, Money.getBalance());
            }else {
                System.out.println("Please Insert Valid Currency");
            }
        } catch (Exception e) {
            System.out.println("Please Insert Valid Currency");
        }
    }


    public static String selectItemSlot() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select an item: ");
        String slot = scan.nextLine();
        return slot;
    }
}





