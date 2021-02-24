import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;
        while(true) {
            boolean hasInt = scanner.hasNextInt();
            if(hasInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }

            average = Math.round((double)sum/count);
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
