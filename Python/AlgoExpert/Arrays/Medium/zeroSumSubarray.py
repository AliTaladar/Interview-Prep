def zeroSumSubarray(nums):
    # Write your code here.
    visited_sums = set([0])
    curr_sum = 0
    for num in nums:
        curr_sum += num
        if curr_sum in visited_sums:
            return True
        visited_sums.add(curr_sum)
    
    return False
