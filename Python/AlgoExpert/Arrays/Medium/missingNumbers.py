def missingNumbers(nums):
    # Write your code here.
    sum = 0
    for num in nums:
        sum += num
    
    complete_sum = (len(nums) + 3) * (len(nums) + 2) / 2
    missing_sum = complete_sum - sum

    avg_missing_val = missing_sum // 2

    expected_first_half = (1 + avg_missing_val) * avg_missing_val / 2
    expected_second_half = (1 + avg_missing_val + len(nums) + 2) * (len(nums) + 2 - avg_missing_val) / 2

    found_first_half = 0
    found_second_half = 0
    for num in nums:
        if num <= avg_missing_val:
            found_first_half += num
        else:
            found_second_half += num
    
    first_missing = expected_first_half - found_first_half
    second_missing =expected_second_half - found_second_half
    
    return [first_missing, second_missing]

    
