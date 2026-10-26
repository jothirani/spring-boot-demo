package com.build.stock;

import java.util.Scanner; 

public class StockManagementSystem { 
    private static StockManager manager = new StockManager(); 
    private static Scanner scanner = new Scanner(System.in); 
 
    public static void main(String[] args) { 
        boolean running = true; 
        while (running) { 
            displayMenu(); 
            int choice = -1; 
             
            // Input validation for menu choice 
            if (scanner.hasNextInt()) { 
                choice = scanner.nextInt(); 
            } else { 
                System.out.println("Invalid input. Please enter a number."); 
                scanner.next(); // Clear the invalid input 
                continue; 
            } 
            scanner.nextLine(); // Consume newline 
 
            switch (choice) { 
                case 1: 
                    addItemMenu(); 
                    break; 
                case 2: 
                    updateItemMenu(); 
                    break; 
                case 3: 
                    manager.viewAllStock(); 
                    break; 
                case 4: 
                    running = false; 
                    System.out.println("Exiting Stock Management System. Goodbye!"); 
                    break; 
                default: 
                    System.out.println("Invalid choice. Please select an option between 1 and 4."); 
            } 
        } 
        scanner.close(); 
    } 
 
    private static void displayMenu() { 
        System.out.println("\n--- Stock Management System ---"); 
        System.out.println("1. Add New Item"); 
        System.out.println("2. Update Item Quantity"); 
        System.out.println("3. View All Stock"); 
        System.out.println("4. Exit"); 
        System.out.print("Enter your choice: "); 
    } 
 
    private static void addItemMenu() { 
        System.out.print("Enter item name: "); 
        String name = scanner.nextLine(); 
 
        System.out.print("Enter initial quantity: "); 
        int quantity = 0; 
        if (scanner.hasNextInt()) { 
            quantity = scanner.nextInt(); 
        } else { 
            System.out.println("Invalid quantity input. Operation cancelled."); 
            scanner.nextLine(); 
            return; 
        } 
 
        System.out.print("Enter item price: "); 
        double price = 0.0; 
        if (scanner.hasNextDouble()) { 
            price = scanner.nextDouble(); 
        } else { 
            System.out.println("Invalid price input. Operation cancelled."); 
            scanner.nextLine(); 
            return; 
        } 
         
        scanner.nextLine(); // Consume remaining newline 
 
        manager.addItem(name, quantity, price); 
    } 
 
    private static void updateItemMenu() { 
        System.out.print("Enter name of item to update: "); 
        String name = scanner.nextLine(); 
 
        System.out.print("Enter new quantity: "); 
        int newQuantity = -1; 
        if (scanner.hasNextInt()) { 
            newQuantity = scanner.nextInt(); 
        } else { 
            System.out.println("Invalid quantity input. Operation cancelled."); 
        } 
        scanner.nextLine(); // Consume remaining newline 
         
        if (newQuantity != -1) { 
            manager.updateStock(name, newQuantity); 
        } 
    } 
} 
