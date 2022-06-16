package com.company;

public class Item {
    private final String name;
    private final int quantity;
    private final double priceForEach;
    private final double total ;


    public Item(String name, int quantity, double priceForEach) {
        this.name = name;
        this.quantity = quantity;
        this.priceForEach = priceForEach;
        this.total = quantity*priceForEach;
    }

    public double getTotal() {
        return this.total;
    }
     public Item createItem(String name, int quantity, double priceForEach){
        return  new Item(name,quantity,priceForEach);
     }

    @Override
    public String toString() {
        return "@ "+name+" -> " + quantity +"*"+ priceForEach +" -> " + this.total ;
    }
}
