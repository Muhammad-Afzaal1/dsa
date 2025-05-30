class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        char [] arr = new char[s.length()];
        int index = 0;
        int lastIndex = 0;
        if(s.charAt(0) == '-'){
            arr[index++] = '-';
            lastIndex++;
        }
        for(int i = s.length() -1; i >= lastIndex; i--){
            arr[index++] = s.charAt(i);
        }
        
        String ans = new String(arr);

        try {
            int a = Integer.parseInt(ans);
            return a;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(-123));         // -321
        System.out.println(solution.reverse(1534236469));
    }
}