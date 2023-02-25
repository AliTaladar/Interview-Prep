class Solution {
    public int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        
        for(int i = 0; i < nums.length; i++){
            if(firstMax == null || nums[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }else if(secondMax == null || nums[i] > secondMax){
                if(nums[i] == firstMax) continue;
                thirdMax = secondMax;
                secondMax = nums[i];
            }else if(thirdMax == null || nums[i] > thirdMax){
                if(nums[i] == secondMax) continue;
                thirdMax = nums[i];
            }
        }
        if(thirdMax != null)
            return thirdMax.intValue();
        else
            return firstMax.intValue();
    }
}