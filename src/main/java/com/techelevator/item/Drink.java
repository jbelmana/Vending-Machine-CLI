package com.techelevator.item;

import java.math.BigDecimal;

public class Drink extends Item{
    public Drink(String itemName, String slotIdentifier, BigDecimal price, int quantityAvailable) {
        super(itemName, slotIdentifier, price, quantityAvailable);
    }
    String message = "Drinky, Drinky, Slurp Slurp!";
    @Override
    public String getMessage() {
        return message;
    }
}
