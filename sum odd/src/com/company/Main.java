package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

    }

    static public boolean isOdd(int number) {
        if (number < 1) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        if ((end < start) || (start < 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start ; i <= end ; i++){
            if (isOdd(i)){
                sum +=i;
                System.out.println(sum);
            }
        }return sum;
    }
}
