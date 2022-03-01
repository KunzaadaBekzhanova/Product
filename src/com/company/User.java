package com.company;

public class User {
    private String username;
    private String password;
    private Backet backet;

    public User(String username, String password, Backet backet) {
        this.username = username;
        this.password = password;
        this.backet = backet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Backet getBacket() {
        return backet;
    }

    public void setBacket(Backet backet) {
        this.backet = backet;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", backet=" + backet +
                '}';
    }
}
