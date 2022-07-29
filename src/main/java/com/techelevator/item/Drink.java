package com.techelevator.item;

import java.math.BigDecimal;

public class Drink extends Item {
    public Drink(String itemName, String slotIdentifier, BigDecimal price) {
        super(itemName, slotIdentifier, price);
    }

    @Override
    public String getMessage() {
        return "Drinky, Drinky, Slurp Slurp!";
    }
}
