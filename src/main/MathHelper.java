package main;

public class MathHelper {

    /** Returns the sum of 1 + 2 + 3 + ... + n
     *
     * @param n
     * @return sum of elements from 1 to n
     */
    public static int arithmeticSeries(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }


    /** Takes three line segments (a, b, c) and checks if they can form a triangle.
     *  Three line segments can form a triangle if the sum of the lengths of any
     *  two line segments exceeds the length of the third line segment.
     *
     * @param a
     * @param b
     * @param c
     * @return true if these lines segments can form a triangle, and false otherwise
     */
    public static boolean validTriangle(int a, int b, int c) {
        boolean triangle = false;
        if (a+b>c || a+c>b || b+c>a) {
            triangle = true;
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(MathHelper.arithmeticSeries(10));
        System.out.println(MathHelper.validTriangle(3, 6, 8));
    }
}
