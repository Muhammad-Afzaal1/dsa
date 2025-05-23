class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        for(int i =0; i < length; i++){
            for (int j = i+1; j<length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("matrix before rwo reverse");
        print(matrix);
        for (int i = 0; i < length; i++) {
            rowReverse(matrix[i]);
        }
        System.out.println("After row reverse");
        print(matrix);
    }

    public static void rowReverse(int[] row){
        int left = 0, right = row.length -1;
        while (left < right) {
            int temp= row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    public static void print(int[][] matrix){
        for(int[]row:matrix){
            for(int val:  row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println("Original matrix");
        print(matrix);
        Solution solution = new Solution();
        solution.rotate(matrix);
    }
}