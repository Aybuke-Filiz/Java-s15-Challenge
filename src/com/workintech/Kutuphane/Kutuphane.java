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

    public void add_new_book(Book book) {
        this.books.add(book);
        System.out.println("Kitap başarıyla eklendi: " + book);
    }


    public void lend_book(String readerName, Book book) {
        if (this.books.contains(book) && book.isAvailable()) {
            this.books.remove(book);
            this.readers.get(readerName).add(book);
            book.setAvailable(false);
            book.change_owner(readerName);
            System.out.println(book.getBook_name() + " kitabı " + readerName + " adlı okuyucuya ödünç verildi.");
        } else {
            System.out.println(book.getBook_name() + " kitabı şu anda mevcut değil.");
        }
    }

    public void take_back_book(String readerName, Book book) {
        if (this.readers.containsKey(readerName) && this.readers.get(readerName).contains(book)) {
            this.readers.get(readerName).remove(book);
            this.books.add(book);
            book.setAvailable(true);
            book.change_owner("Library");
            System.out.println(book.getBook_name() + " kitabı " + readerName + " adlı okuyucudan geri alındı.");
        } else {
            System.out.println(readerName + " adlı okuyucunun bu kitabı ödünç almadığı görünüyor.");
        }
    }

    public void show_book(int bookID) {
        for (Book book : books) {
            if (book.getID() == bookID) {
                System.out.println(book);
                return;
            }
        }
        for (List<Book> readerBooks : readers.values()) {
            for (Book book : readerBooks) {
                if (book.getID() == bookID) {
                    System.out.println(book);
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }


}
