class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        for(int i = 0; i < A.length; i++){
            int start = 0, end = A[i].length - 1;
            while(start <= end){
                int temp = (A[i][start] == 1 ? 0:1);
                A[i][start] = (A[i][end] == 1 ? 0:1);
                A[i][end] = temp;
                start++;
                end--;
            }
        }
        
        return A;
    }
}