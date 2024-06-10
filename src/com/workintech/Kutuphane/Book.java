package com.workintech.Kutuphane;

public class Book {
    private static int ID_counter=0;
    private int ID;
    private String book_name;
    private String author;
    private double price;
    private String edition;
    private String date_of_purchase;
    private String owner;
    private boolean isAvailable;

    public Book( String book_name, String author, double price, String edition, String owner, String date_of_purchase, boolean isAvailable) {
        this.ID = ++ID_counter;
        this.book_name = book_name;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.owner = owner;
        this.date_of_purchase = date_of_purchase;
        this.isAvailable = isAvailable;
    }



    public int getID() {
        return ID;
    }


    public String getDate_of_purchase() {
        return date_of_purchase;
    }

    public void setDate_of_purchase(String date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }


    public String get_author() {
        return this.author;
    }

    public void change_owner(String new_owner) {
        this.owner = new_owner;
    }

    public String get_owner() {
        return this.owner;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Book Name: " + book_name + ", Author: " + author + ", Price: " + price + ", Available: " + isAvailable + "Edition: "+edition +"Owner: "+owner + "Date of purchase: " +date_of_purchase;
    }

}
