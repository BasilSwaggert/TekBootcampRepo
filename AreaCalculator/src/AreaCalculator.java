public class AreaCalculator {

    public static double area(double radius) {
        if(radius < 0) {
            return -1.0;
        }

        double areaOfACircle = (radius * radius * Math.PI);
            System.out.println("The area of the circle is " + areaOfACircle);
            return areaOfACircle;

    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        }

        double areaOfARectangle = (x * y);
        System.out.println("The area of the rectangle is " + areaOfARectangle);
        return areaOfARectangle;

    }

}
