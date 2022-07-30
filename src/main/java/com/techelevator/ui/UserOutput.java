package com.techelevator.ui;

import com.techelevator.application.Money;
import com.techelevator.item.Item;

import java.util.Map;

public class UserOutput {
    public static void displayMessage(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public static void displayHomeScreen() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayItemScreen() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Display Items");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayInventory(Map<String, Item> inventoryMap) {
        for (String mapItem : inventoryMap.keySet()) {
            System.out.println(inventoryMap.get(mapItem).getSlotIdentifier() + ": " + inventoryMap.get(mapItem).getItemName()
                    + "- $" + inventoryMap.get(mapItem).getPrice() + " Available: " + inventoryMap.get(mapItem).getQuantity());
        }
    }

    public static void displayPurchaseScreen() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Welcome");
        System.out.println("***************************************************");
        System.out.println();
    }


}


