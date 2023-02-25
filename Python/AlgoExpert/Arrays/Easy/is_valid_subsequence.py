def isValidSubsequence(array, sequence):
    # Write your code here.
    p_arr, p_seq = 0, 0

    while p_arr < len(array) and p_seq < len(sequence):
        num_arr = array[p_arr]
        num_seq = sequence[p_seq]
        if num_arr == num_seq:
            p_arr += 1
            p_seq += 1
        else:
            p_arr += 1

    return p_seq == len(sequence)
