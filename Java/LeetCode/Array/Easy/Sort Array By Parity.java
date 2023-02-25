class Solution {
    public int[] sortArrayByParity(int[] A) {
        int start = 0, end = A.length - 1;
        
        while(start < end){
            if(A[start] % 2 == 1 && A[end] % 2 == 0){
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }
            
            if(A[start] % 2 == 0) start++;
            if(A[end] % 2 == 1) end--;
        }
        
        return A;
    }
}