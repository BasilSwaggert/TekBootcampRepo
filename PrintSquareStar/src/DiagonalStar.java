public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number > 4) {
            for (int i = 0; i < number; i++) {
                if (i == 0 || i == number - 1) {
                    System.out.println(new String(new char[number]).replace("\0", "*"));
                    continue;
                }
                for (int j = 0; j < number; j++) {
                    if (i == j || j == number - i - 1 || j == 0) {
                        System.out.print("*");
                    } else if (j == number - 1) {
                        System.out.println("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        } else {
            System.out.println("Invalid Value");
        }

    }
} //This practice is freaking absurd. So pissed about this one ngl.
