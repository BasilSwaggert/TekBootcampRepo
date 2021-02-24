package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of digits in number 125 is " + sumDigits1(125));
        System.out.println("The sum of digits in number -125 is " + sumDigits1(-125));
        System.out.println("The sum of digits in number 4 is " + sumDigits1(4));
        System.out.println("The sum of digits in number 32123 is " + sumDigits1(32123));

    }

//    public static int sumDigit(int number) {
//
//        int sumOfDigits = 0;
//        int n = number;
//
//        if(n < 10) {
//            System.out.println(-1);
//            return -1;
//
//        } else {
//            while (true) {
//
//                sumOfDigits += n % 10;
//                n = n / 10;
//
//                if (n / 10 == 0) {
//                    sumOfDigits += n % 10;
//                    break;
//                }
//            }
//
//            System.out.println("Number " + number + " has the sum of digits = " + sumOfDigits);
//            return sumOfDigits;
//        }
//    }

    //Tim answer to question

    private static int sumDigits1(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least significant digit
            number /= 10; // same as number = number / 10
        }

        return sum;
    }
}
