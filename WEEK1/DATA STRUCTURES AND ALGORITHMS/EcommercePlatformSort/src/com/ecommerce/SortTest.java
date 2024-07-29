package com.ecommerce;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.75),
            new Order("O002", "Bob", 150.50),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "Dave", 200.00),
            new Order("O005", "Eve", 350.20)
        };

        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sorted Orders by Total Price:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order.getOrderId() + ": " + order.getTotalPrice());
        }

        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sorted Orders by Total Price:");
        for (Order order : quickSortedOrders) {
            System.out.println(order.getOrderId() + ": " + order.getTotalPrice());
        }
    }
}
