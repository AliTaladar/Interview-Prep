def longestPalindromicSubstring(string):
    # Write your code here.
    current_longest = [0, 1]
    
    for i in range(len(string)):
        start, end = i, i
        while end + 1 < len(string) and string[end] == string[end + 1]:
            end += 1
        
        while start - 1 >= 0 and end + 1 < len(string):
            if string[start - 1] == string[end + 1]:
                start -= 1
                end += 1
            else:
                break
        
        curr_length = end - start + 1
        curr_longest = current_longest[1] - current_longest[0]
        if curr_length > curr_longest:
            current_longest[0] = start
            current_longest[1] = end + 1

    return string[current_longest[0]:current_longest[1]]
