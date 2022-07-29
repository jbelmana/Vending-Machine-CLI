package com.techelevator.item;

import java.math.BigDecimal;

public class Candy extends Item{
    public Candy(String itemName, String slotIdentifier, BigDecimal price, int quantityAvailable) {
        super(itemName, slotIdentifier, price, quantityAvailable);
    }
    String message = "Sugar, Sugar, so Sweet!";

    @Override
    public String getMessage(){
        return message;
    }
}
