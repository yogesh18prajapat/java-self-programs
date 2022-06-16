package com.company;

public class Main {

    public static void main(String[] args) {
        isPerfectNumber(6);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum == number ? true : false;

    }
}
