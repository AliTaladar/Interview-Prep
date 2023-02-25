def longestPeak(array):
    # Write your code here.
    result = 0
    for i in range(1, len(array) - 1):
        is_peak = array[i - 1] < array[i] and array[i] > array[i + 1]
        if not is_peak:
            continue
        
        left = i - 1
        right = i + 1
        while left > 0 and array[left - 1] < array[left]:
            left -= 1
        while right < len(array) - 1 and array[right] > array[right + 1]:
            right += 1
            
        peak_length = right - left + 1
        if peak_length > result:
            result = peak_length
       
    return result



