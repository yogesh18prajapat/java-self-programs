package com.company;

import java.util.ArrayList;

public class Bill{
    private final String name;
    private final String date;
    private  ArrayList<Item> items ;


    public Bill(String name, String date) {
        this.name = name;
        this.date = date;
        this.items = new ArrayList<Item>();
    }

    public void addItem(String name, int quantity, double price){
        items.add(new Item(name,quantity,price));
    }

    private double getTotalAmount(){
        double total = 0;
        for(int i=0;i< items.size();i++){
            Item  item = items.get(i);
            total += item.getTotal();
        }
        return total;

    }


    public void printBill(){
        System.out.println("NAME : "+this.name+"\nDATE : "+this.date);
        for(Item item : items){
            System.out.println(item.toString());
        }
        System.out.println("TOTAL AMOUNT : "+getTotalAmount());
    }




}
