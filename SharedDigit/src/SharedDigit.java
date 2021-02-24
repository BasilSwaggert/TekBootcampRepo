public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }
        int originalNumber = secondNumber; // 19, 29
        while(firstNumber > 0) {
            int rem1;
            rem1 = firstNumber % 10;
            while(secondNumber > 0) {
                int rem2;
                rem2 = secondNumber % 10;
                if(rem1 == rem2) {
                    System.out.println(rem1);
                    System.out.println(rem2);
                    return true;
                }
                secondNumber = secondNumber / 10;
            }
            secondNumber = originalNumber;
            firstNumber = firstNumber / 10;
            if(firstNumber == secondNumber) {
                System.out.println(firstNumber);
                System.out.println(secondNumber);
                return true;
            }
        }
        return false;
    }
}
