package com.techelevator.application;

import com.techelevator.item.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Inventory {

    private static String fileReader = "catering.csv";
    private static File inventoryFile = new File(fileReader);



    public Map<String , List<Item>> inventoryReader (){


        Map<String, List<Item>> inventoryMap = new TreeMap<>(){};

        try(Scanner scanInventory = new Scanner(inventoryFile)){
            while(scanInventory.hasNextLine()){
                String line = scanInventory.nextLine();
                if(!line.isEmpty()){
                    String []
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inventoryMap;
    }
}



