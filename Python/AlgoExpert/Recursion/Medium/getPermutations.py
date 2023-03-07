def getPermutations(array):
    # Write your code here.
    perms = []
    helper(0, array, perms)
    return perms

def helper(i, array, perms):
    if i == len(array) - 1:
        perms.append(array.copy())
    else:
        for j in range(i, len(array)):
            array[i], array[j] = array[j], array[i]
            helper(i + 1, array, perms)
            array[i], array[j] = array[j], array[i]
            

