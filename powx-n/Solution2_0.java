public class Solution2_0 {

    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }
    public static void main(String[]  args){
        Solution2_0 sol = new Solution2_0();
        System.out.println(sol.myPow(2, 10));
        System.out.println(sol.myPow(Integer.MIN_VALUE, 2));
    }
}
