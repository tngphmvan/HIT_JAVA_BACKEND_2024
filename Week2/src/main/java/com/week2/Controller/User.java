package com.week2;

public class User {
    private String ten;
    private short tuoi;

    public User() {
    }

    public User(String ten, short tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public short getTuoi() {
        return tuoi;
    }

    public void setTuoi(short tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
