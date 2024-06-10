package com.workintech.Kutuphane;

public class Member_Record {
    private int member_id;
    private String type;
    private String date_of_membership;
    private int noBooksIssued;
    private int maxBookLimit;
    private String name;
    private String address;
    private String phoneNo;

    public Member_Record(int member_id, String type, String date_of_membership, int noBooksIssued, int maxBookLimit, String name, String address, String phoneNo) {
        this.member_id = member_id;
        this.type = type;
        this.date_of_membership = date_of_membership;
        this.noBooksIssued =0;
        this.maxBookLimit = 5;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_of_membership() {
        return date_of_membership;
    }

    public void setDate_of_membership(String date_of_membership) {
        this.date_of_membership = date_of_membership;
    }

    public int getNoBooksIssued() {
        return noBooksIssued;
    }

    public void setNoBooksIssued(int noBooksIssued) {
        this.noBooksIssued = noBooksIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void inc_book_issued() {
        if (noBooksIssued < maxBookLimit) {
            noBooksIssued++;
            System.out.println("Kitap başarıyla eklendi. Toplam kitap sayısı: " + noBooksIssued);
        } else {
            System.out.println("Maksimum kitap limitine ulaşıldı.");
        }
    }
    public void dec_book_issued() {
        if (noBooksIssued > 0) {
            noBooksIssued--;
            System.out.println("Kitap başarıyla geri verildi. Toplam kitap sayısı: " + noBooksIssued);
        } else {
            System.out.println("Geri verilecek kitap yok.");
        }
    }
    public void pay_bill() {
        System.out.println(name + " adlı üyenin faturası ödendi.");
    }


}
