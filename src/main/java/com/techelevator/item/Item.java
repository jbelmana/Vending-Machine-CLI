package com.techelevator.item;

import java.math.BigDecimal;

public abstract class Item {
    private String itemName;
    private String slotIdentifier;
    private BigDecimal price;
    private int quantity = 6;

    public Item(String itemName, String slotIdentifier, BigDecimal price){
        this.itemName = itemName;
        this.slotIdentifier = slotIdentifier;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decrementQuantity(){
        quantity--;
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
