def hasSingleCycle(array):
    # Write your code here.
    num_of_visited = 0
    curr_idx = 0
    
    while num_of_visited < len(array):
        if num_of_visited > 0 and curr_idx == 0:
            return False
        num_of_visited += 1
        curr_idx = (curr_idx + array[curr_idx]) % len(array)

    return curr_idx == 0
    
