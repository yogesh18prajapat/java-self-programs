package com.company;

public class VipCustomer {

    public String name;
    public double creditLimit;
    public String emailAddress;

    public VipCustomer(){
        this("defaultName", 1000, "killerbee@gail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this( name ,creditLimit , "badass@gmail.com");
    }
}
