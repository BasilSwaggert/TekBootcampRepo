public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double calcBuckets = areaPerBucket * extraBuckets;

        double valueWithoutExtraB = area - calcBuckets;

        double roundNumber = Math.ceil(valueWithoutExtraB / areaPerBucket);

        return (int) roundNumber;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;

        double calcBuckets = Math.ceil(area / areaPerBucket);

        return (int) calcBuckets;

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        double calcBuckets = Math.ceil(area / areaPerBucket);

        return (int) calcBuckets;
    }

}
