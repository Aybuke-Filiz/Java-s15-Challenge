package com.workintech.Kutuphane;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private Member_Record memberRecord;
    private List<Book> borrowedBooks;

    public Reader(Member_Record memberRecord) {
        this.memberRecord = memberRecord;
        this.borrowedBooks = new ArrayList<>();
    }

    public void purchase_book(Book book, Kutuphane kutuphane) {
        kutuphane.add_new_book(book);
        System.out.println(book.getBook_name() + " başarıyla kütüphaneye eklendi.");
    }

    public void borrow_book(Book book, Kutuphane kutuphane) {
        if (borrowedBooks.size() < memberRecord.getMaxBookLimit()) {
            if (book.isAvailable()) {
                kutuphane.lend_book(memberRecord.getName(), book);
                borrowedBooks.add(book);
                memberRecord.inc_book_issued();
            } else {
                System.out.println(book.getBook_name() + " şu anda mevcut değil.");
            }
        } else {
            System.out.println("Maksimum kitap limitine ulaşıldı.");
        }
    }


    public void return_book(Book book, Kutuphane kutuphane) {
        if (borrowedBooks.contains(book)) {
            kutuphane.take_back_book(memberRecord.getName(), book);
            borrowedBooks.remove(book);
            memberRecord.dec_book_issued();
        } else {
            System.out.println("Bu kitap " + memberRecord.getName() + " tarafından ödünç alınmamış.");
        }
    }

    public void show_books() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Hiç ödünç alınmış kitap bulunmamaktadır.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }

    public void whoyouare() {
        System.out.println("Member ID: " + memberRecord.getMember_id());
        System.out.println("Name: " + memberRecord.getName());
        System.out.println("Address: " + memberRecord.getAddress());
        System.out.println("Phone No: " + memberRecord.getPhoneNo());
        System.out.println("Date of Membership: " + memberRecord.getDate_of_membership());
        System.out.println("Type: " + memberRecord.getType());
        System.out.println("No of Books Issued: " + memberRecord.getNoBooksIssued());
        System.out.println("Max Book Limit: " + memberRecord.getMaxBookLimit());
    }
}

