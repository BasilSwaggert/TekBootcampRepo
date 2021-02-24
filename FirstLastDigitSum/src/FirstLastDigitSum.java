public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) {
            return -1;
        }
        int firstNumber = number;
        int lastNumber = number % 10;
        int sum = 0;

        while(firstNumber >= 10) {
            firstNumber = firstNumber / 10;
        }

        sum = firstNumber + lastNumber;
        return sum;
    } // IN this instance, say number = 134, last number = number % 10, so that would make it 4. First number, while greater than or equal to 10, would be 13, which divided by 10 would make it 1.3, which since it is an int, would make it 1, so the sum would be 1 + 4, and the returned sum would be 5. BAM
}
