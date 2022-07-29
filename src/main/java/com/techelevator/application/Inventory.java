package com.techelevator.application;

import com.techelevator.item.Candy;
import com.techelevator.item.Gum;
import com.techelevator.item.Drink;
import com.techelevator.item.Munchy;
import com.techelevator.item.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class Inventory {

    private static String fileReader = "catering1.csv";
    private static File inventoryFile = new File(fileReader);


    public Map<String, Item> inventoryReader() {

        Map<String, Item> inventoryMap = new HashMap<>() {};
        try (Scanner scanInventory = new Scanner(inventoryFile)) {
            while (scanInventory.hasNextLine()) {
                String lineOfFile = scanInventory.nextLine();
                Item newItem;
                if (!lineOfFile.isEmpty()) {
                    String[] scanInventoryArray = lineOfFile.split(",");

                    if (scanInventoryArray[3].equalsIgnoreCase("Candy")) {
                        newItem = new Candy(scanInventoryArray[1], scanInventoryArray[0], new BigDecimal(scanInventoryArray[2]));
                        inventoryMap.put(scanInventoryArray[0], newItem);
                    } else if (scanInventoryArray[3].equalsIgnoreCase("Drink")) {
                        newItem = new Drink(scanInventoryArray[1], scanInventoryArray[0], new BigDecimal(scanInventoryArray[2]));
                        inventoryMap.put(scanInventoryArray[0], newItem);
                    } else if (scanInventoryArray[3].equalsIgnoreCase("Gum")) {
                       newItem = new Gum(scanInventoryArray[1], scanInventoryArray[0], new BigDecimal(scanInventoryArray[2]));
                        inventoryMap.put(scanInventoryArray[0], newItem);
                    } else if (scanInventoryArray[3].contains("Munchy")){
                        newItem = new Munchy(scanInventoryArray[1], scanInventoryArray[0], new BigDecimal(scanInventoryArray[2]));
                        inventoryMap.put(scanInventoryArray[0], newItem);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return inventoryMap;
    }
}



