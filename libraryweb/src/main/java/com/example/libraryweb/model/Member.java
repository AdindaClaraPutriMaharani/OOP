package com.example.libraryweb.model;

public class Member {
    private String name;
    private String email;
    private String idNumber;
    private String address;
    private String phone;

    // Konstruktor default
    public Member() {
    }

    // Konstruktor dengan parameter
    public Member(String name, String email, String idNumber, String address, String phone) {
        this.name = name;
        this.email = email;
        this.idNumber = idNumber;
        this.address = address;
        this.phone = phone;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}