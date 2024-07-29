package com.librarymanager;

import java.util.List;

public class LinearSearch {

    public static Book linearSearchBooksByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}

