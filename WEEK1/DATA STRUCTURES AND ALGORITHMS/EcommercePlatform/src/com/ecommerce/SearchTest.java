package com.ecommerce;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Chair", "Furniture"),
            new Product("P005", "Desk", "Furniture")
        };

        Product result = LinearSearch.linearSearch(products, "P003");
        System.out.println("Linear Search Result: " + (result != null ? result.getProductName() : "Product not found"));

        result = BinarySearch.binarySearch(products, "P003");
        System.out.println("Binary Search Result: " + (result != null ? result.getProductName() : "Product not found"));
    }
}
