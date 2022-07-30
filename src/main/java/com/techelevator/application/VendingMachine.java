package com.techelevator.application;

import com.techelevator.item.Item;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;


import java.math.BigDecimal;
import java.util.Map;

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
                System.exit(0);
            } else {
                System.out.println("You Pressed the wrong thing");

            }
        }
    }

    public void getPurchaseOptions() {
        while (true) {
            UserOutput.displayPurchaseScreen();
            String choice = UserInput.getPurchaseScreenOption();
            if (choice.equalsIgnoreCase("M")) {
                UserInput.getMoneyFeederOption();
            } else if (choice.equalsIgnoreCase("S")) {
                UserOutput.displayInventory(inventoryMap);
                String item = UserInput.selectItemSlot();
                dispenseItem(item);
            } else if (choice.equalsIgnoreCase("F")) {
                System.out.println(Money.change());
                Audit.timedAudit("CHANGE GIVEN:" , Money.getBalance(), new BigDecimal("0"));
            } else {
                System.out.println("You Pressed the wrong thing");
            }
        }
    }


    public static void dispenseItem(String item) {
        try {
            if (inventory.getItemHashMap().containsKey(item)){
                Item newitem = inventory.getItemHashMap().get(item);
                newitem.decrementQuantity();
                BigDecimal price = newitem.getPrice();
                System.out.println("You have selected: " + newitem.getItemName() + " for $" + (getBalance().subtract(price)));
                System.out.println(newitem.getMessage());
                System.out.println();
                Audit.timedAudit(newitem.getItemName(), Money.getBalance(), (getBalance().subtract(price)));
            }
        } catch (Exception e) {
            System.out.println("Item slot doesn't exist.");
        }
    }
}
