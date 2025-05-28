public class Solution {

    public double myPow(double x, int n) {
        // Handle edge case when n is Integer.MIN_VALUE
        if (n == Integer.MIN_VALUE) {
            return 1 / (x * myPow(x, -(n + 1)));
        }

        // If exponent is negative, invert base and make exponent positive
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1;
        while (n > 0) {
            if ((n % 2) == 1) {  // If n is odd
                result *= x;
            }
            x *= x;
            n /= 2;
        }

        return result;
    }
    public static void main(String[]  args){
        Solution sol = new Solution();
        System.out.println(sol.myPow(2, 10));
        System.out.println(sol.myPow(Integer.MIN_VALUE, 2));
    }
}
