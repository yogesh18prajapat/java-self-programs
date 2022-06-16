package com.company;

public class Main {

    public static void main(String[] args) {
        getLargestPrime(217);
    }

    public static int getLargestPrime(int number) {
        if (number <= 0) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        System.out.println(number);
        return number;

    }
}

/* in for loop i = 2; i < number; means now  2 < number;
for example lets keep number = 45
        so,  2 < 45 which is true so it will enter the for loop

        first iteration 45 % 2 ==0 which is false
        so the condition will become true in following cases
        3 , 5 , 9 ,15 so

        1) if(45 % 3 == 0) true and
        number = 45 / 3
        number = 15
        where i value is  still 3
        then i-- will make i = 2 as it decrements
        then the i++ in the for loop again makes it 3
        and the number = number / i
        makes number value to be updated to 15
        now condition is checked with i = 3 and number =15

        2)if(3 < 15) true and
        if(15 % 3 == 0) true
        number = 15 / 3
        number = 5
        where i value is  still 3
        then i-- will make i = 2 as it decrements
        then the i++ in the for loop again makes it 3
        and the number = number / i
        makes number value to be updated to 5
        now condition is checked with i = 3 and number =5

        3)if(3 < 5) true and
        if(5 % 3 ==0) false
        the if condition doesn't run
        so when we return the number value which is  5 will be returned




        so generally i-- is used to keep the i value as minimum factor which can divide the number
         and we are reducing the number.*/
