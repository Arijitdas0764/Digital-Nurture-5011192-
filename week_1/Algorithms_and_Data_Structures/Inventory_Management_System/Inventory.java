package Java_FSE.week_1.Algorithms_and_Data_Structures.Inventory_Management_System;

import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    //Add a product in the inventory
    public void addProduct(Product product) {
        System.out.println("Added Product ID: "+ product.getProductId());
        inventory.put(product.getProductId(), product);
    }

    //Update the product in the inventory
    public void updateProduct(Product product) {
        System.out.println("Updated Product ID: "+ product.getProductId());
        inventory.put(product.getProductId(), product);
    }

    //Delete a product from the inventory
    public void deleteProduct(int productId) {
        System.out.println("Deleted Product ID: "+ productId);
        inventory.remove(productId);
    }

    //To print the details of a product based on product ID
    public void printProductDetails(int productId) {
        Product product = inventory.get(productId);

        if (product != null) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Price: " + product.getPrice());
        } 
        else{
            System.out.println("Product not found with ID: "+ productId);
        }
    }
}