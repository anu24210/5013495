package com.librarymanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibraryManagement {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(4, "The Catcher in the Rye", "J.D. Salinger"));
        books.add(new Book(5, "Pride and Prejudice", "Jane Austen"));

        // Linear Search
        System.out.println("Linear Search:");
        Book foundBook = LinearSearch.linearSearchBooksByTitle(books, "1984");
        System.out.println(foundBook != null ? "Found: " + foundBook : "Book not found.");

        // Binary Search
        System.out.println("\nBinary Search:");
        // Sort books by title
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        foundBook = BinarySearch.binarySearchBooksByTitle(books, "1984");
        System.out.println(foundBook != null ? "Found: " + foundBook : "Book not found.");
    }
}
