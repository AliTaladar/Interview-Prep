def firstNonRepeatingCharacter(string):
    # Write your code here.
    freq = {}

    for c in string:
        if c in freq:
            freq[c] += 1
        else:
            freq[c] = 1
    
    for i in range(len(string)):
        if freq[string[i]] == 1:
            return i

    return -1
