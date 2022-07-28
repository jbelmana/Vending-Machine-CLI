package com.techelevator.application;

import java.math.BigDecimal;

public abstract class Item {
    private String itemName;
    private String slotIdentifer;
    private BigDecimal price;
    private int qauntityAvailable;

    public Item(String itemName, String slotIdentifer, BigDecimal price, int qauntityAvailable) {
        this.itemName = itemName;
        this.slotIdentifer = slotIdentifer;
        this.price = price;
        qauntityAvailable = 6;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSlotIdentifer() {
        return slotIdentifer;
    }

    public void setSlotIdentifer(String slotIdentifer) {
        this.slotIdentifer = slotIdentifer;
    }

    public BigDecimal getPrice() {
        return price;                                   //might need new math
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQauntityAvailable() {
        return qauntityAvailable;
    }

    public void setQauntityAvailable(int qauntityAvailable) {
        this.qauntityAvailable = qauntityAvailable;
    }

    public abstract String getMessage();
}
