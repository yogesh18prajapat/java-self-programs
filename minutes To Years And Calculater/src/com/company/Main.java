package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(-561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }else {
            long year = minutes / (365 * 24 * 60);
            long days = minutes / (60 * 24);
            long remainingDays = days % (365);
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
