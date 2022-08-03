package com.techelevator.application;

import com.techelevator.item.Item;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;


import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;

import static com.techelevator.application.Money.balance;
import static com.techelevator.application.Money.getBalance;

public class VendingMachine {

    private static Inventory inventory = new Inventory();
    private Map<String, Item> inventoryMap = inventory.inventoryReader();

    public void run() {
        while (true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();
            System.out.println(choice);
            if (choice.equalsIgnoreCase("D")) {
                UserOutput.displayItemScreen();
                UserOutput.displayInventory(inventoryMap);
            } else if (choice.equalsIgnoreCase("P")) {

                UserOutput.displayPurchaseScreen();
                getPurchaseOptions();
            } else if (choice.equalsIgnoreCase("E")) {
                System.out.println("Good bye");
                System.out.println();
                System.exit(0);
            } else {
                System.out.println();
                System.err.println("You pressed the wrong thing");
                System.out.println();

            }
        }
    }

    public void getPurchaseOptions() {
        while (true) {
            String choice = UserInput.getPurchaseScreenOption();
            if (choice.equalsIgnoreCase("M")) {
                UserInput.getMoneyFeederOption();
            } else if (choice.equalsIgnoreCase("S")) {
                UserOutput.displayInventory(inventoryMap);
                String item = UserInput.selectItemSlot().toUpperCase();
                dispenseItem(item);
            } else if (choice.equalsIgnoreCase("F")) {
                System.out.println(Money.change());
                UserOutput.displayHomeScreen();
                UserInput.getHomeScreenOption();
            } else {
                System.out.println();
                System.err.println("You pressed the wrong thing");
                System.out.println();
            }
        }
    }


    public static void dispenseItem(String item) {
        try {
            if (inventory.getItemHashMap().containsKey(item)){
                Item newitem = inventory.getItemHashMap().get(item);
                BigDecimal price = newitem.getPrice();
                if(Money.getBalance().compareTo(price) == -1){
                    System.err.println("You don't have enough money!");
                    System.out.println();
                    return;
                }
                if(newitem.getQuantity() == 0){
                    System.err.println("NO LONGER AVAILABLE");
                    System.out.println();
                    return;
                }
                newitem.decrementQuantity();
                System.out.println("You have selected: " + newitem.getItemName() + " for $" + newitem.getPrice());
                System.out.println(newitem.getMessage());
                System.out.println();
                Audit.timedAudit(newitem.getItemName(), Money.getBalance(), (getBalance().subtract(price)));
                Money.spendMoney(price);
            }
        } catch (Exception e) {
            System.out.println("Item slot doesn't exist.");
        }
    }
}
