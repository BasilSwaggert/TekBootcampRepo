package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while(true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int number = scanner.nextInt();

//                if(first) {
//                   first = false;
//                   min = number;
//                   max = number;
//                }

                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            } else {

                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("min = " + min + ", max = " + max);

        scanner.close();
    }
}


//        int min = 0;
//        int max = 0;
//        int count = 0;
//        int num = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while(true) {
//            System.out.println("Enter number: ");
//
//            boolean isInt = scanner.hasNextInt();
//
//            if(isInt) {
//                num = scanner.nextInt();
//                count++;
//                if(count == 1) {
//                    max = num;
//                    min = num;
//                }
//                if(num > max) {
//                    max = num;
//                }
//                if(num < min) {
//                    min = num;
//                }
//
//            }else {
//                break;
//            }
//            scanner.nextLine();
//        }
//        System.out.println("The Maximum is: " + max);
//        System.out.println("The Minimum is: " + max);
//
//            scanner.close();
