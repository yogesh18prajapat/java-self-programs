package com.company;

public class Main {

    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12,30);
        getGreatestCommonDivisor(9,18);
        getGreatestCommonDivisor(81,153);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            System.out.println("input number is less than 10 ");
            return -1;
        }
       for (int i = Math.min(first,second); i >= 1 ; i--) {
            if (first % i == 0 && second % i == 0) {
                System.out.println("divisor is "  +i);
                return i;
            }
        }
        return -1;

    }
}



//    public static int getGreatestCommonDivisor(int first, int second) {
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//        while (first != second) {
//            if (first > second) {
//                first = first - second;
//            } else {
//                second = second - first;
//            }
//        }
//        System.out.println(first);
//        return first;
//    }
//
