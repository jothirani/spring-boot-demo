package com.build.stock;

import java.util.ArrayList; 
import java.util.List; 
 
public class StockManager { 
    private List<StockItem> inventory; 
 
    public StockManager() { 
        this.inventory = new ArrayList<>(); 
    } 
 
    /** 
     * Adds a new item to the inventory. 
     */ 
    public void addItem(String name, int quantity, double price) { 
        // Check if item already exists 
        for (StockItem item : inventory) { 
            if (item.getName().equalsIgnoreCase(name)) { 
 System.out.println("Error: Item " + name + " already exists. Use the update function instead."); 
                return; 
            } 
        } 
 
        StockItem newItem = new StockItem(name, quantity, price); 
        inventory.add(newItem); 
        System.out.println("Successfully added: " + newItem); 
    } 
 
    /** 
     * Updates the quantity of an existing item. 
     * Returns true if successful, false otherwise. 
     */ 
    public boolean updateStock(String name, int newQuantity) { 
        for (StockItem item : inventory) { 
            if (item.getName().equalsIgnoreCase(name)) { 
                if (newQuantity >= 0) { 
                    item.setQuantity(newQuantity); 
                    System.out.println("Stock updated for " + name + ". New quantity: " + 
newQuantity); 
                    return true; 
                } else { 
                    System.out.println("Error: Quantity cannot be negative."); 
                    return false; 
                } 
            } 
        } 
        System.out.println("Error: Item " + name + " not found in stock."); 
        return false; 
    } 
 
    /** 
     * Prints all items in the inventory. 
     */ 
    public void viewAllStock() { 
        if (inventory.isEmpty()) { 
            System.out.println("\n*** Inventory is currently empty. ***"); 
            return; 
        } 
 
        System.out.println("\n*** Current Stock Inventory ***"); 
        for (StockItem item : inventory) { 
            System.out.println(item); 
        } 
        System.out.println("*********************************\n"); 
    } 
} 