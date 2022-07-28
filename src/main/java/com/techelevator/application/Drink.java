package com.techelevator.application;

import java.math.BigDecimal;

public class Drink extends Item{
    public Drink(String itemName, String slotIdentifer, BigDecimal price, int qauntityAvailable) {
        super(itemName, slotIdentifer, price, qauntityAvailable);
    }

    @Override
    public String getMessage() {
        return "Drinky, Drinky, Slurp Slurp!";
    }
}
