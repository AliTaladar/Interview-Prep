def kadanesAlgorithm(array):
    # Write your code here.
    curr_sum = array[0]
    max_sum = array[0]

    for i in range(1, len(array)):
        num = array[i]
        curr_sum = max(num, curr_sum + num)
        max_sum = max(curr_sum, max_sum)
    
    return max_sum
