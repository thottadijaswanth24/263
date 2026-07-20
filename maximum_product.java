class Solution {
    static void maxProductTriplet(int[] arr) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x >= max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
            if (x <= min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }

        long product1 = 1L * max1 * max2 * max3;
        long product2 = 1L * max1 * min1 * min2;

        if (product1 >= product2) {
            System.out.println("Triplet: " + max1 + " " + max2 + " " + max3);
            System.out.println("Product: " + product1);
        } else {
            System.out.println("Triplet: " + max1 + " " + min1 + " " + min2);
            System.out.println("Product: " + product2);
        }
    }
}
