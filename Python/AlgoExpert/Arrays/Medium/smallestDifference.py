def smallestDifference(arrayOne, arrayTwo):
    # Write your code here.
    arrayOne.sort()
    arrayTwo.sort()

    smallest_pair = [arrayOne[0], arrayTwo[0]]
    smallest_diff = abs(smallest_pair[0] - smallest_pair[1])

    p1, p2 = 0, 0
    while p1 < len(arrayOne) and p2 < len(arrayTwo):
        num1, num2 = arrayOne[p1], arrayTwo[p2]

        if num1 > num2:
            curr_diff = num1 - num2
            p2 += 1
        elif num2 > num1:
            curr_diff = num2 - num1
            p1 += 1
        else:
            return [num1, num2]

        if curr_diff < smallest_diff:
            smallest_diff = curr_diff
            smallest_pair = [num1, num2]

    return smallest_pair
        