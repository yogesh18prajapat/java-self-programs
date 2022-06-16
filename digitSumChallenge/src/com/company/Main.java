package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args) {
        digitSum(125);
    }

    public static int digitSum(int number) {
        if (number < 10) {
            System.out.println("invalid number");
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        System.out.println("the digit sum  = " + sum);
        return sum;
    }
}
