public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }
        int sum = 0;
        int rem = number;

        while (rem > 0) {
            number = rem % 10;
            rem = rem / 10;

            if (number % 2 == 0) {
                sum += number;
            }

        } return sum;
    }
}
