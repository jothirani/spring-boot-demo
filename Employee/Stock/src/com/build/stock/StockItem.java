package com.build.stock;

public class StockItem { 
    private String name; 
    private int quantity; 
    private double price; 
 
    public StockItem(String name, int quantity, double price) { 
        this.name = name; 
        this.quantity = quantity; 
        this.price = price; 
    } 
 
    // Getters 
    public String getName() { 
        return name; 
    } 
 
    public int getQuantity() { 
        return quantity; 
    } 
 
    public double getPrice() { 
        return price; 
    } 
 
    // Setter for quantity (to update stock) 
    public void setQuantity(int quantity) { 
        this.quantity = quantity; 
    } 
 
    // Override toString for easy printing 
    @Override 
    public String toString() { 
        return "Item: " + name + " | Quantity: " + quantity + " | Price: $" + String.format("%.2f", 
price); 
    } 
} 
