package com.company;

public class Main {

    public static void main(String[] args) {

        evenDigitSum(12345);
    }

    public static int evenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
          if ( (number % 10) % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }
        System.out.println(sum);
        return sum;
    }

}
