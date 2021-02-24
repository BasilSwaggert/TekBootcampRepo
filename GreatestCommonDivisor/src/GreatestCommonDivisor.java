public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int num1, int num2) {

        if ((num1 < 10) || (num2 < 10)) {
            return -1;
        }
        int greatDivisor = 0;
        int smallestNumber = Math.min(num1, num2);
        if (num1 >= 10 && num2 >= 10) {
            for (int i = 1; i <= smallestNumber; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    greatDivisor = i;
                }
            }
            return greatDivisor;
        } else {
            return -1;
        }
    }

    //Another solution

    public static int getGreatestCommonDivisor1(int num1, int num2) {
        if(num1 >= 10 && num2 >= 10) {
            int tempNum1 = num1;
            int tempNum2 = num2;
            int rem = 0;

            while (tempNum2 != 0) {
                rem = tempNum1 % tempNum2;
                tempNum1 = tempNum2;
                tempNum2 = rem;
            }

            return tempNum1;
        }

        return -1;
    }
}
