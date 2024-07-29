package com.inventory;

public class InventoryTest {
    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        System.out.println("Inventory after adding products:");
        printInventory(inventory);
        Product updatedProduct = new Product("P002", "Smartphone", 25, 479.99);
        inventory.updateProduct("P002", updatedProduct);
        System.out.println("Inventory after updating product P002:");
        printInventory(inventory);
        inventory.deleteProduct("P003");
        System.out.println("Inventory after deleting product P003:");
        printInventory(inventory);
    }
    public static void printInventory(Inventory inventory) {
        inventory.products.forEach((key, product) -> {
            System.out.println("Product ID: " + product.getProductId()
                    + ", Name: " + product.getProductName()
                    + ", Quantity: " + product.getQuantity()
                    + ", Price: $" + product.getPrice());
        });
        System.out.println();
    }
}
