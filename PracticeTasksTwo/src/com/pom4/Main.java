package com.pom4;

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
/*

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= (n / 2); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }



    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


*/

/*
Create a for statement using a range of numbers from 1 to 1000 inclusive.
Sum all the numbers that can be divided with both 3 and also with 5.
For those numbers that met the above conditions, print out the number.
break out of the loop once you find 5 numbers that met the above conditions.
After breaking out of the loop print the sum of the numbers that met the above conditions.
Note: Type all code in main method
*/
/*
        int count=0;
        int sum=0;
        for(int i=1; i<1001; i++) {
            if((i%3==0)&&(i%5==0)) {
                System.out.println("The number is: " + i);
                count++;
                sum+=i;
                if (count==5) {
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
        System.out.println("The sum of numbers is " + sum);
*/

//        System.out.println(SumOddRange.sumOdd(100,1000));
//        System.out.println(WhileDoWhileChallenge.isEvenNumber(-1));
//        WhileDoWhileChallenge.evenNumberFromRange(4,20);
//        System.out.println(DigitSumChallenge.sumDigits(120));
//        System.out.println(NumberPalindrome.isPalindrome(-112));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(10));
//        System.out.println(EvenDigitSum.getEvenDigitSum(-252));


    }
}
