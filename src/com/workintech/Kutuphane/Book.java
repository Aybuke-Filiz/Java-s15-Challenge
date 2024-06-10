package com.workintech.Kutuphane;

public class Book {
    private static int ID_counter=0;
    private int ID;
    private String book_name;
    private String author;
    private double price;
    private String  status;
    private String edition;
    private String date_of_purchase;
    private String owner;

    public Book(String book_name, String author, double price, String status, String edition, String date_of_purchase,String owner){
        this.book_name=book_name;
        this.author=author;
        this.price=price;
        this.status=status;
        this.edition=edition;
        this.date_of_purchase=date_of_purchase;
        this.owner = owner;
        ID_counter++;
        this.ID=ID_counter;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
    public String get_title() {
        return this.book_name;
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

    public void update_status(String new_status) {
        this.status = new_status;
    }

    public void display() {
        System.out.println("ID: " + this.ID);
        System.out.println("Book Name: " + this.book_name);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("Status: " + this.status);
        System.out.println("Edition: " + this.edition);
        System.out.println("Date of Purchase: " + this.date_of_purchase);
        System.out.println("Owner: " + this.owner);
    }


}
