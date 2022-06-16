package com.company;

public class Main {

    public static void main(String[] args) {

        int countdown = 0;
        for (int i = 2; i < 50; i++) {
            if (isPrime(i)) {
                countdown++;
                System.out.println(i + " is prime number");
            }
            if (countdown == 5) {
                System.out.println("loop exit");
                break;
            }
        }


    }

    public static boolean isPrime(int n) {
        if (n <= 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}

