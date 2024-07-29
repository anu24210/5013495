package com.librarymanager;

import java.util.List;

public class BinarySearch {

    public static Book binarySearchBooksByTitle(List<Book> books, String title) {
        int left = 0, right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);
            if (midBook.getTitle().equals(title)) {
                return midBook;
            }
            if (midBook.getTitle().compareTo(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
