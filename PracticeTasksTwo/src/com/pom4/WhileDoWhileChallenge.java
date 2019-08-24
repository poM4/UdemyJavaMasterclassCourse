package com.pom4;

public class WhileDoWhileChallenge {

    public static boolean isEvenNumber(int number) {
        if(number%2 == 0) {
            return true;
        } else {
            return false;
        }
    }



    public static void evenNumberFromRange (int start, int end) {

        int count = 0;
        int number = start;
        int sum = 0;


        while (number <= end) {
            number++;
            if(!isEvenNumber(number)) {
                continue;

            }
            System.out.println("Even number " + number);
            count++;
            if(count >=5) {
                break;
            }
        }
        System.out.println("Sum of even numbers is " + count);
    }

}
