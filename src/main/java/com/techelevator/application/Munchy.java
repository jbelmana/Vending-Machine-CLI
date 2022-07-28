package com.techelevator.application;

import java.math.BigDecimal;

public class Munchy extends Item{
    public Munchy(String itemName, String slotIdentifer, BigDecimal price, int qauntityAvailable) {
        super(itemName, slotIdentifer, price, qauntityAvailable);
    }

    @Override
    public String getMessage(){
        return "Munchy, Munchy, So Good!";
    }
}
