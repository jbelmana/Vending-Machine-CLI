package com.techelevator.item;

import java.math.BigDecimal;

public class Munchy extends Item{
    public Munchy(String itemName, String slotIdentifier, BigDecimal price) {
        super(itemName, slotIdentifier, price);
    }

    @Override
    public String getMessage(){
        return "Munchy, Munchy, So Good!";
    }
}
