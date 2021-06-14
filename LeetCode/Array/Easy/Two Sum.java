class Solution {
   public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> myMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){ // log n
            int complement = target - nums[i];

            if(myMap.containsKey(complement)){
                return new int[] {i, myMap.get(complement)};
            }
            myMap.put(nums[i], i);
            
        }

        return new int[] {};
}
}