package com.techelevator.item;

import java.math.BigDecimal;

public class Gum extends Item{

    public Gum(String itemName, String slotIdentifier, BigDecimal price, int quantityAvailable) {
        super(itemName, slotIdentifier, price, quantityAvailable);
    }
    String message = "Chewy, Chewy, Lots O bubbles!";
    @Override
    public String getMessage() {
        return message;
    }

}
