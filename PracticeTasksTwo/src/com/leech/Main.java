package com.leech;

public class Main {

    public static void main(String[] args) {

//        SwitchWithCharChallenge.charChecker('Q');
//        DayOfTheWeekChallenge.printDayOfTheWeek(6);
//        DayOfTheWeekChallengeWithIfElse.printDayOfTheWeek(-1);
//        NumberInWord.printNumberInWord(10);
//        System.out.println(NumberOfDayInTheMonth.getDaysInMonth(13, 2017));

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
/*
        for (int i=2; i<9; i++) {
            System.out.println(String.format("%.2f",calculateInterest(10000, i)));
        }

        System.out.println("=====================================================");


        // How would you modify the for loop above to do the same thing as

        // shown but to start from 8% and work back to 2%
        for (int i=8; i>1; i--) {
            System.out.println(String.format("%.2f",calculateInterest(10000, i)));

        }
*/
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting loop");
                    break;
                }
            }

        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            System.out.println("Looping " + i);
            if (n % 1 == 0) {
                return false;
            }

        }
        return true;
    }
}

