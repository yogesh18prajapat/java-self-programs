package com.company;

public class Main {

    public static void main(String[] args) {

     isPalindrome(121);
    }

    public static boolean isPalindrome(int number) {
        if (number <0){
            number *= -1;
        }
         int stored = number;
        int reverse = 0;
        while (stored > 0) {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;

        }
        if (number == reverse){
            System.out.println("palindrome");
            return true;
        }
        System.out.println("NOT Palindrome");
        return false;
    }
}
