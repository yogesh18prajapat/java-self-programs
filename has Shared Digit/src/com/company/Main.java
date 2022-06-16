package com.company;

public class Main {

    public static void main(String[] args) {
hasSharedDigit(25,12);
    }
    public static boolean hasSharedDigit (int first , int second){
        if (first <10 || first >99 || second < 10 || second >99){
            return false;
        }return ((first/10 == second/10) || (first%10 == second%10) || (first/10==second%10) || (first%10==second/10) ) ? true :false;

    }
}
