package com.techelevator.item;

import java.math.BigDecimal;

public class Gum extends Item {

    public Gum(String itemName, String slotIdentifier, BigDecimal price) {
        super(itemName, slotIdentifier, price);
    }


    @Override
    public String getMessage() {
        return "Chewy, Chewy, Lots O bubbles!";
    }

}
