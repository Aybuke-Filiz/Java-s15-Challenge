package com.workintech.Kutuphane;

public class Librarian {
    String name;
    String password;

    public Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void searchBook(String book_name) {
        System.out.println("Searching for book: " + book_name);
    }

    public boolean verifyMember(String member_id){
        System.out.println("Verifying member: " + member_id);
        return true;
    }
    public void issueBook(String book_name, String member_id) {
        System.out.println("Issuing book: " + book_name + " to member: " + member_id);
    }
    public double calculateFine(int overdueDays) {
        double finePerDay = 1.5;
        double fine = overdueDays * finePerDay;
        System.out.println("Calculated fine: $" + fine);
        return fine;
    }
    public void createBill(String member_id, double price) {
        System.out.println("Creating bill for member: " + member_id + " Amount: $" + price);
    }
    public void returnBook(String book_name, String member_id) {
        System.out.println("Returning book: " + book_name + " from member: " + member_id);
    }


}
