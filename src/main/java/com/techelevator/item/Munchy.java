package com.techelevator.item;

import java.math.BigDecimal;

public class Munchy extends Item{
    public Munchy(String itemName, String slotIdentifier, BigDecimal price, int quantityAvailable) {
        super(itemName, slotIdentifier, price, quantityAvailable);
    }
    String message = "Munchy, Munchy, So Good!";
    @Override
    public String getMessage(){
        return message;
    }
}
