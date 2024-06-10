package com.workintech.Kutuphane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kutuphane {
    private List<Book> books;
    private Map<String, List<Book>> readers;

    public Kutuphane() {
        this.books = new ArrayList<>();
        this.readers = new HashMap<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String, List<Book>> getReaders() {
        return readers;
    }

    public void setReaders(Map<String, List<Book>> readers) {
        this.readers = readers;
    }


    public List<Book> get_books() {
        return this.books;
    }

    public List<Book> get_reader(String readerName) {
        return this.readers.get(readerName);
    }

    public void new_book(Book book) {
        this.books.add(book);
    }

    public void lend_book(String readerName, Book book) {
        if (!this.readers.containsKey(readerName)) {
            this.readers.put(readerName, new ArrayList<>());
        }
        if (this.books.contains(book)) {
            this.books.remove(book);
            this.readers.get(readerName).add(book);
            book.setStatus("Lent out");
            book.change_owner(readerName);
        }
    }

    public void take_back_book(String readerName, Book book) {
        if (this.readers.containsKey(readerName) && this.readers.get(readerName).contains(book)) {
            this.readers.get(readerName).remove(book);
            this.books.add(book);
            book.setStatus("Available");
            book.change_owner("Library");
        }
    }

    public void show_book(int bookID) {
        for (Book book : books) {
            if (book.getID() == bookID) {
                book.display();
                return;
            }
        }
        for (List<Book> readerBooks : readers.values()) {
            for (Book book : readerBooks) {
                if (book.getID() == bookID) {
                    book.display();
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }


}
