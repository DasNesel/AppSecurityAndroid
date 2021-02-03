package com.example.secu_app.API;

public class User {

    private int id;
    private String name;
    private String lastname;
    private String utilisateur;
    private int password;

    public User() {
    }

    //GETTERS

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    //SETTERS

    public void setPassword(int password) {
        this.password = password;
    }

}
