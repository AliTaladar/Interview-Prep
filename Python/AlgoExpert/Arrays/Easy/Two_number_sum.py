def twoNumberSum(array, targetSum):
    # Write your code here.
    my_set = set()
    for num in array:
        complement = targetSum - num
        if complement in my_set:
            return [num, complement]
        else:
            my_set.add(num)

    return []
