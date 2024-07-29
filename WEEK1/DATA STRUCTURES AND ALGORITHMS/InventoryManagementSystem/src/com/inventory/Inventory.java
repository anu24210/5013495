package com.inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        if (products.containsKey(productId)) {
            products.put(productId, updatedProduct);
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }
}
