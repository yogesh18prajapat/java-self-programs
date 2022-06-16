package com.company;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(91117);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int digit = number%10;
      while (number >9){
      number/=10;
      }
      int sum = number + digit ;
        System.out.println(sum);

     return 1;
    }
}
