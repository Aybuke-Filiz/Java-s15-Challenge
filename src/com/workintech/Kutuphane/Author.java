package com.workintech.Kutuphane;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void new_book(String bookName, String edition, double price, String dateOfPurchase, boolean isAvailable) {
        Book newBook = new Book(bookName, this.name, price, edition, this.name, dateOfPurchase, isAvailable);
        this.books.add(newBook);
        System.out.println("Yeni kitap eklendi: " + newBook);
    }


    public void show_book() {
        if (books.isEmpty()) {
            System.out.println("Bu yazarın henüz kitabı yok.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void whoyouare() {
        System.out.println("Yazar adı: " + name);
        if (books.isEmpty()) {
            System.out.println("Bu yazarın henüz kitabı yok.");
        } else {
            System.out.println("Bu yazarın kitapları:");
            for (Book book : books) {
                System.out.println("Kitap adı: " + book.getBook_name() + ", ID: " + book.getID());
            }
        }
    }
}
