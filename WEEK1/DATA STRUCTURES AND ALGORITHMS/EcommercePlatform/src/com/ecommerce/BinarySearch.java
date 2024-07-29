package com.ecommerce;

import java.util.Arrays;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String productId) {
       
        Arrays.sort(products, (a, b) -> a.getProductId().compareTo(b.getProductId()));
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(productId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }
}
