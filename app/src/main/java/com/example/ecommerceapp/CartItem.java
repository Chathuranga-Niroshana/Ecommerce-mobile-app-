package com.example.ecommerceapp;

// CartItem.java
public class CartItem {
    private String itemId;
    private String itemName;
    private double itemPrice;
    private int itemImageResourceId;

    public CartItem(String itemId, String itemName, double itemPrice, int itemImageResourceId) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImageResourceId = itemImageResourceId;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemImageResourceId() {
        return itemImageResourceId;
    }

    public CartItem() {
    }
}
