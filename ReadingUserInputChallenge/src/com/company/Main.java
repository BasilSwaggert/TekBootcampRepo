package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Tim Answer

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        scanner.close();

        sumUserInput();
    }

    public static void sumUserInput() {
        int sum = 0;
        int i = 1;
        while(i < 11) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number #" + i + ":");

            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                i++;
                sum += Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("Invalid Number.");
            }
        }
        System.out.println("Your final sum of 10 numbers is " + sum);
    }
}
