class Solution2_0 {
    public boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int idx = -1;

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                arr[++idx] = ch;
            }
            else{
                if(idx < 0){
                    return false;
                }
                else if(ch == ')' && arr[idx] != '(' || ch == '}' && arr[idx] != '{' || ch == ']' && arr[idx] != '['){
                    return false;
                }
                else{
                    idx--;
                }
            }
        }
        return idx == -1;
    }
}