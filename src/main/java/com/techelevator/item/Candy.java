package com.techelevator.item;

import java.math.BigDecimal;

public class Candy extends Item {

    public Candy(String itemName, String slotIdentifier, BigDecimal price) {
        super(itemName, slotIdentifier, price);
    }

    @Override
    public String getMessage() {
        return "Sugar, Sugar, so Sweet!";
    }
}
