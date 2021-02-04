package com.example.secu_app.API;

public class Account {

    private int id;
    private String accountName;
    private int amount;
    private String iban;
    private String currency;

    //GETTERS
    public int getId(){
        return id;
    }

    //GETTER
    public int getAmount(){
        return amount;
    }

    public String getAccountName(){
        return accountName;
    }

    public String getIban(){
        return iban;
    }

    public String getCurrency() {
        return currency;
    }

}
