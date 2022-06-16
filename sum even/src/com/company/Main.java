package com.company;

public class Main {

    public static void main(String[] args) {
        isEven(202);
        sumEven(1, 10);


    }

    public static boolean isEven(int number) {
        if (number < 0) {
            System.out.println("entered value is negative");
            return false;
        } else if (number % 2 != 0) {
            System.out.println(number + " is not a even number");
            return false;
        }
        System.out.println(number + " is a even number");
        return true;
    }

    public static int sumEven(int start, int end) {
        if (start < 0 || end < start) {
            System.out.println("Invalid Start or end value");
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0 && i > 1) {
                sum += i;
                System.out.println("sum = " + sum);
            }
        }
        return sum;
    }

}
