package com.techelevator.item;

import java.math.BigDecimal;

public abstract class Item {
    private String itemName;
    private String slotIdentifier;
    private BigDecimal price;

    public Item(String itemName, String slotIdentifier, BigDecimal price) {
        this.itemName = itemName;
        this.slotIdentifier = slotIdentifier;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSlotIdentifier() {
        return slotIdentifier;
    }

    public void setSlotIdentifier(String slotIdentifier) {
        this.slotIdentifier = slotIdentifier;
    }

    public BigDecimal getPrice() {
        return price;                                   //might need new math
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public abstract String getMessage();
}
