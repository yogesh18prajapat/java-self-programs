package com.company;

public class Main {

    public static void main(String[] args) {


        Bill bill = new Bill("BATMAN","10/05/2022");
        bill.addItem("pant",2,650);
        bill.addItem("shirt",2,380);
        bill.addItem("shoes",1,1500);
        bill.addItem("socks",4,40);
        bill.addItem("gloves",2,150);

        bill.printBill();

//        Item item = new Item("fhf",5,100);
//        System.out.println(item.getTotal());
//




    }
}
