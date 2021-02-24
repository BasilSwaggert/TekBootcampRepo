public class LargestPrime {

    public static int getLargestPrime(int number) {

        if(number < 2){
            return -1;
        }
        int largestPrime = 2;
        for(int i = 2; i <= number; i++) {
            if(number % i == 0){
                largestPrime = i;
                number = number / i;
                i = i - 1;
            }
        }
        return largestPrime;
    }
}
