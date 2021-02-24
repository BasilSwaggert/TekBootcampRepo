public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int r;
        int originalNumber = number;
        while (number > 0) {
            r = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + r;

        }
        if (number < 0) {
            number = number * -1;
            while (number > 0) {
                r = number % 10;
                number = number / 10;
                reverse = (reverse * 10) + r;

            }
            reverse = reverse * -1;
        }
        if (originalNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

