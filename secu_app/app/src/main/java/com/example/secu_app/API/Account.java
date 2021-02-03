package com.example.secu_app.API;

public class Account {

    private int id;
    private String account_name;
    private int amount;
    private String iban;
    private String currency;

    //GETTERS
    public int getId(){
        return id;
    }

    public int getAmount(){
        return amount;
    }

    public String getAccount_name(){
        return account_name;
    }

    public String getIban(){
        return iban;
    }

    public String getCurrency() {
        return currency;
    }

}
