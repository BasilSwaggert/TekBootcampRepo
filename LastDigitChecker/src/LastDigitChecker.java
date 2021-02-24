public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }
        while(num1 > 0) {
            int rem1;
            rem1 = num1 % 10;
            while(num2 > 0) {
                int rem2;
                rem2 = num2 % 10;
                while(num3 > 0) {
                    int rem3;
                    rem3 = num3 % 10;
                    if((rem1 == rem2) || (rem2 == rem3) || (rem3 == rem1)) {
                        System.out.println("True");
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int num) {

        if(num < 10 || num > 1000) {
            return false;
        }
        return true;
    }
}
