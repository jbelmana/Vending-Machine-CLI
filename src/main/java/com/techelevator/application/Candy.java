package com.techelevator.application;

import java.math.BigDecimal;

public class Candy extends Item{
    public Candy(String itemName, String slotIdentifer, BigDecimal price, int qauntityAvailable) {
        super(itemName, slotIdentifer, price, qauntityAvailable);
    }

    @Override
    public String getMessage(){
        return "Sugar, Sugar, so Sweet!";
    }
}
