public class Solution {
    public static void main(String[] args) {
        String s = "cbbd";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        int size = s.length();
        
        int maxLen = 1;
        int startingIndex = 0;
        for (int i =0; i< size; i++){

            for(int j = 0; j<=1; j++){
                int low = i;
                int high = i+j;

                while(low>=0 && high < size && s.charAt(low) == s.charAt(high)){
                    int currLen = high - low + 1;
                    if(currLen > maxLen){
                        maxLen = currLen;
                        startingIndex = low;
                    }
                    low--;
                    high++;
                }
            }
        }

        return s.substring(startingIndex, startingIndex+maxLen);
    }
}
