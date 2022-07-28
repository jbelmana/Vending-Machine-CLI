package com.techelevator.application;

import java.math.BigDecimal;

public class Gum extends Item{

    public Gum(String itemName, String slotIdentifer, BigDecimal price, int qauntityAvailable) {
        super(itemName, slotIdentifer, price, qauntityAvailable);
    }

    @Override
    public String getMessage() {
        return "Chewy, Chewy, Lots O bubbles!";
    }

}
