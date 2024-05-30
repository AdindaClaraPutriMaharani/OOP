package com.example;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {
    @JsonProperty("id")
    private int id;
    @JsonProperty("date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;
    @JsonProperty("idMember")
    private int idMember;
    @JsonProperty("idBook")
    private int idBook;
    @JsonProperty("status")
    private int status; // 1 = booked, 2 = finished

    public Transaction() {}

    public Transaction(int id, Date date, int idMember, int idBook, int status) {
        this.id = id;
        this.date = date;
        this.idMember = idMember;
        this.idBook = idBook;
        this.status = status;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", idMember=" + idMember +
                ", idBook=" + idBook +
                ", status=" + status +
                '}';
    }
}
