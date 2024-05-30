package com.example;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Member {
    @JsonProperty("idMember")
    private int idMember;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("address")
    private String address;

    public Member() {}

    public Member(int idMember, String name, String phone, String email, String address) {
        this.idMember = idMember;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Member{" +
                "idMember=" + idMember +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
