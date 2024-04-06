package com.example.homeworkweek3.model;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public User(String userName, String passWord) {
        this.username = userName;
        this.password = passWord;
    }

    public User() {
    }
}
