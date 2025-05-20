public class Solution {
    public static void main(String[] args) {
        int []arr1 = {1, 2};
        int[] arr2 = {3, 4};
        Solution m = new Solution();
        float output= m.findMedianSortedArrays(arr1, arr2);

        System.out.println(output);
    }

    public float findMedianSortedArrays(int[]arr1, int [] arr2){
        int length1 = arr1.length, length2 = arr2.length;
        int size = arr1.length + arr2.length;
        int center = size/2;
        float median;
        int[] arr = new int[size];
        int i = 0;
        int num1 = 0, num2 = 0, index1 = 0, index2 = 0;
        boolean checked1 = false, checked2 = false;
        while (i < size){
            if (index1 < length1){
                num1 = arr1[index1];
                if(size == 1){
                    return num1;
                }
            }
            else{
                checked1 = true;
            }
            if(index2 < length2){
                num2 = arr2[index2];
                if(size == 1){
                    return num2;
                }
            }else{
                checked2 = true;
            }
            if (num1 < num2 && !checked1 || checked2){
                arr[i] = num1;
                index1++;
            }else if (num2 < num1 || !checked2 || checked1){
                arr[i]=  num2;
                index2++;
            }
            if(size % 2 == 0 && i == center){
                median = (float) ((arr[i] + arr[i-1])/2.0);
                return median;
            }else if(i == center){
                return arr[i];
            }
            i++;
            
        }
        return -1;
    }

}
