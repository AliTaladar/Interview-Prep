def findThreeLargestNumbers(array):
    # Write your code here.
    first, second, third = float('-inf'), float('-inf'), float('-inf')

    for num in array:
        if num >= first:
            third = second
            second = first
            first = num
        elif num >= second:
            third = second
            second = num
        elif num >= third:
            third = num

    return [third, second, first]
